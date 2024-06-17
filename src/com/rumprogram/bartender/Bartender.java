package com.rumprogram.bartender;

import java.util.Scanner;

public class Bartender {

    private final Menu menu;
    private final Scanner scanner = new Scanner(System.in);
    private final Tab tab = new Tab();

    public void execute() {
      welcome();
      boolean anotherDrink = true;

      while (anotherDrink) {
        offerMenu();
        String drinkChoice = promptForDrinkChoice();
        makeDrink();
        updateTab();
        // collectRating(); * nice to have
        anotherDrink = askIfTheyWantAnotherDrink(); // update anotherDrink
      }
      closeTab();
    }

/*    private boolean askIfTheyWantAnotherDrink() {
      boolean another;
      if (max > MAX) {
        another = false;
      }
      else if (they say yes) {
        another = true;
      }
      else {
        another = false;
      }
      return another;
    }*/

}
