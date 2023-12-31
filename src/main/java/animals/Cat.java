package animals;

import abstractAnimals.Animal;
import abstractAnimals.HomeAnimal;

import java.util.ArrayList;

public class Cat extends HomeAnimal {
    public Cat(String name, int birthday, int birthmonth, int birthyear) {
        super(name, birthday, birthmonth, birthyear);
    }

    public Cat(int id, String name, int birthday, int birthmonth, int birthyear, ArrayList<String> skills) {
        super(id, name, birthday, birthmonth, birthyear, skills);
    }

    @Override
    public String toString() {
        return "id:" + super.getId() + " Кошка: " + super.getName() + " Возраст: " + Animal.calcAge(super.getBirthday(), super.getBirthmonth(), super.getBirthyear());
    }

    @Override
    public String getTypeName() {
        return "Кошка";
    }
}