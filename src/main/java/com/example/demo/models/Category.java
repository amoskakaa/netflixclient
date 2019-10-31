package com.example.demo.models;

public class Category {
    private Long id;
    private String CategoryName;

    public Category(String categoryName) {
        CategoryName = categoryName;
    }

    public Category(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", CategoryName='" + CategoryName + '\'' +
                '}';
    }
}
