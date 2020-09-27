package AnimalFacotry;


import Animal.Cat;

public class CatFactory implements AnimalFactory {

    @Override
    public void createSound() {
        new Cat().sound();
    }
}
