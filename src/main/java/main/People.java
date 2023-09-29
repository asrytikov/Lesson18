package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class People {

    private String name = "Alex";
   // @Autowired
    private final Dog dog;

    @Autowired
    public People(Dog dog) {
        this.dog = dog;
    }

    public Dog getDog() {
        return dog;
    }

    /*@Autowired
    public void setDog(Dog dog) {
        this.dog = dog;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
