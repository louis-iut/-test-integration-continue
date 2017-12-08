package fr.iut.iem.marvelcomics.data.model;

/**
 * Created by Guillaume Colletaz on 05/12/2017.
 */

public class Creator {

    private String name;
    private String role;

    public Creator(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
