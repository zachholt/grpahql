package com.zachholt.graphql.demo.models;

import java.util.UUID;

public class Recipe {
    private UUID id;
    private UUID authorId;
    private String title;
    private String[] ingredients;
    private String[] instructions;
    private Category category;

    public UUID getId() {
        return id;
    }

    public Recipe setId(UUID id) {
        this.id = id;
        return this;
    }

    public UUID getAuthorId() {
        return authorId;
    }

    public Recipe setAuthorId(UUID authorId) {
        this.authorId = authorId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Recipe setTitle(String title) {
        this.title = title;
        return this;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public Recipe setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    public String[] getInstructions() {
        return instructions;
    }

    public Recipe setInstructions(String[] instructions) {
        this.instructions = instructions;
        return this;
    }

    public Category getCategory() {
        return category;
    }

    public Recipe setCategory(Category category) {
        this.category = category;
        return this;
    }
}
