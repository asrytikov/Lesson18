package main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "main")
public class ProjectConfig {

  /*  @Bean
    public People people(){
        People p = new People();
        p.setName("Alex");
        p.setDog(dog());
        return p;
    }*/
 /* @Bean
  public People people(Dog dog){
      People p = new People();
      p.setName("Alex");
      p.setDog(dog);
      return p;
  }


    @Bean
    public Dog dog(){
        Dog dog = new Dog();
        dog.setName("Tuzik");
        return dog;
    }
*/


}
