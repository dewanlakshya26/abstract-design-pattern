package AnimalFacotry;


import Animal.Dog;

public class DogFactory implements AnimalFactory {

    @Override
    public void createSound() {
        new Dog().sound();
    }
}
