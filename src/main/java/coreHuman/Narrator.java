package coreHuman;

import utility.Speakable;

public class Narrator implements Speakable {
    @Override
    public void speak() {
        System.out.println("Малыш и Карлсон решили поиграть в консоль");
    }
}
