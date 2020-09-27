package client;

import AnimalFacotry.CatFactory;
import AnimalFacotry.DogFactory;
import AnimalFacotry.factory;

public class Client {
    public static void main(String[] args) {
        new factory( new DogFactory());
    }
}
