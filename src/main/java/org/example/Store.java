package org.example;

public class Store {
    private String name;


    public Store(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){

        return "Store{Название : " + getName() +"}";
    }
}
