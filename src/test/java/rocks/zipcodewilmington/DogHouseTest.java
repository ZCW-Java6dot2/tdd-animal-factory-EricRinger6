package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void addTest() {
        // given
        DogHouse.clear();

        String name = "Roxy";
        Date birthday = new Date();

        Dog dog = AnimalFactory.createDog(name, birthday);
        DogHouse.add(dog);

        String expected = dog.getName();
        String actual = DogHouse.getDogById(dog.getId()).getName();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeTest() {
        DogHouse.clear();

        Dog roxy = AnimalFactory.createDog("Roxy", new Date());
        DogHouse.remove(roxy);

        Integer expected = roxy.getId();
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getDogsByIdTest() {
        DogHouse.clear();

        Dog roxy = AnimalFactory.createDog("Roxy", new Date());
        DogHouse.remove(roxy);

        Integer expected = roxy.getId();
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getNumberOfCatsTest() {

        Dog dog = new Dog("", new Date(), 0);


        int numberOfDogsBeforeAdd = DogHouse.getNumberOfDogs();


        int expected = numberOfDogsBeforeAdd + 1;


        DogHouse.add(dog);

        int actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);


    }

}
