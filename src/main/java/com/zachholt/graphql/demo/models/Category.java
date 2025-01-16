package com.zachholt.graphql.demo.models;

public class Category {
    private String type;
    private String description;

    public String getType() {
        return type;
    }

    public Category setType(String type) {
        this.type = type;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Category setDescription(String description) {
        this.description = description;
        return this;
    }
}
