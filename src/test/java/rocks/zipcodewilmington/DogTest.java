package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void newDog(){
        String name = "Roxy";
        Date birthday = new Date();
        Integer id = 0;

        Dog dog = new Dog(name, birthday, id);

        String actualName = dog.getName();
        Date actualBirth = dog.getBirthDate();
        Integer actualId = dog.getId();

        Assert.assertEquals(name, actualName);
        Assert.assertEquals(birthday, actualBirth);
        Assert.assertEquals(id, actualId);
    }

    @Test
    public void speakTest(){

        Dog dog = new Dog("name", new Date(), 0);

        String expected = "bark!";
        String actual = dog.speak();

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void getBirthTest(){
        String name = "Roxy";
        Date birthday = new Date();
        Integer id = 0;

        Dog dog = new Dog(name, birthday, id);

        Date actualBirth = dog.getBirthDate();

        Assert.assertEquals(birthday, actualBirth);
    }

    @Test
    public void eatTest(){
        String name = "Roxy";
        Date birthday = new Date();
        Integer id = 0;

        Dog dog = new Dog(name, birthday, id);
        int actual = dog.getNumberOfMealsEaten();
        int expected = actual + 1;

        Food food = new Food();
        dog.eat(food);

        actual = dog.getNumberOfMealsEaten();


        Assert.assertEquals(expected, actual);
    }

    @Test
    public void implementMammalTest() {
        // given
        Dog dog = new Dog("", new Date(), 0);

        // when
        boolean outcome = dog instanceof Mammal;

        // then
        Assert.assertTrue(outcome);
    }

    @Test
    public void implementAnimalTest() {
        // given
        Dog dog = new Dog("", new Date(), 0);

        // when
        boolean outcome = dog instanceof Animal;

        // then
        Assert.assertTrue(outcome);
    }
}
