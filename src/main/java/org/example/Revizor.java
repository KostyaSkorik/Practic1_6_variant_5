package org.example;

import java.util.Objects;

public class Revizor {
    String revizorName;

    public Revizor(String revizorName) {
        this.revizorName = revizorName;
    }

    public void closeStore(Store store){
        if (Objects.equals(store.getName(), "IKEA")){
            store.setName(null);
        }
    }

    public void rebrand(Store store){
        if (store.getName()!=null){
            if (Objects.equals(store.getName(), "MacDonalds")){
                store.setName("Вкусно и точка");
            }else{
                StringBuilder newName = new StringBuilder(store.getName());
                newName.deleteCharAt(0);
                String resultNewName = newName.toString();
                store.setName(resultNewName);
            }
        }

    }
}
