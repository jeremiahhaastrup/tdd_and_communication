package org.example;

public class HuntTheCheese {

    public String huntForTheCheese(String input, int catSpeed, int mouseSpeed) {

        int cat = input.indexOf("K");
        int mouse = input.indexOf("M");
        int cheese = input.indexOf("C");

        int catToMouse = mouse - cat;
        int mouseToCheese = cheese - mouse;

        int catStepsToMouse = (int) Math.ceil((double) catToMouse / catSpeed);
        int mouseStepsToCheese = (int) Math.ceil((double) mouseToCheese / mouseSpeed);

        if (catStepsToMouse < mouseStepsToCheese) {
            return "No Cheese";
        } else if (catStepsToMouse > mouseStepsToCheese) {
            return "Cheese";
        } else {
            return "Cheese Party!";
        }
    }

}
