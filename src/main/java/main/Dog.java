package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String name = "Tuzik";

    //private People people;

    public Dog() {
        System.out.println("Dog created");
    }

  /*  @Autowired
    public Dog(People people) {
        this.people = people;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog: name=" + name;
    }
}
