package com.zachholt.graphql.demo.controllers;

import com.zachholt.graphql.demo.models.Author;
import com.zachholt.graphql.demo.models.Category;
import com.zachholt.graphql.demo.models.Recipe;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
public class GraphqlController {
    private List<Author> authors = new ArrayList<>();
    private List<Recipe> recipes = new ArrayList<>();

    @QueryMapping
    public List<Author> getAuthors() {
        return authors;
    }

    @QueryMapping
    public Author getAuthorById(@Argument UUID authorId) {
        return authors.stream().filter(author -> author.getId().equals(authorId)).findFirst().orElse(null);
    }

    @MutationMapping
    public void deleteAuthorById(@Argument UUID authorId) {
        authors = authors.stream().filter(author -> !author.getId().equals(authorId)).toList();
    }

    @QueryMapping
    public List<Recipe> getRecipes() {
        return recipes;
    }

    @QueryMapping
    public Recipe getRecipeByID(@Argument UUID recipeId) {
        return recipes.stream().filter(recipe -> recipeId.equals(recipe.getId())).findFirst().orElse(null);
    }

    @MutationMapping
    public Author createAuthor(@Argument String firstName, @Argument String lastName, @Argument String dateOfBirth, @Argument String userName) {
        Author author = new Author();
        author.setFirstName(firstName);
        author.setLastName(lastName);
        author.setDateOfBirth(dateOfBirth);
        author.setUserName(userName);
        author.setId(UUID.randomUUID());

        authors.add(author);
        return author;
    }

    @MutationMapping
    public Recipe createRecipe(@Argument String title, @Argument String[] ingredients, @Argument String[] instructions, @Argument Category category) {
        Recipe recipe = new Recipe();
        recipe.setTitle(title);
        recipe.setIngredients(ingredients);
        recipe.setInstructions(instructions);
        recipe.setCategory(category);
        recipe.setId(UUID.randomUUID());


        recipes.add(recipe);
        return recipe;
    }
}
