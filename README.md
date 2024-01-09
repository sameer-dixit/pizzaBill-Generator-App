# pizzaBill-Generator-App

## Overview

This simple Java application, Pizza Bill Generator, allows users to create and calculate bills for different types of pizzas. It includes a basic pizza class and a deluxe pizza class with specific functionalities.

## How to Use

## 1. Clone the repository to your local machine.

## 2. git clone https://github.com/sameer-dixit/pizza-bill-generator.git
## 3. Open the project in your preferred Java IDE.

## 4. Run the Main class to see a demonstration of the Pizza Bill Generator in action.

## Functionality
Basic Pizza
Creates a basic pizza with the option to add extra cheese and extra toppings.
Generates a bill for the pizza.
Supports takeaway functionality.
Deluxe Pizza
Extends the basic pizza functionality.
Limited modification options: no support for adding extra cheese or toppings.
Supports takeaway functionality.
Generates a bill for the deluxe pizza.
##  Example Usage
public class Main {

    public static void main(String[] args) {

        // Create a basic pizza
        Pizza basePizza = new Pizza(false);
        basePizza.addExtraCheese();
        basePizza.extraToppings();
        basePizza.takeaway();
        basePizza.getBill();

        // Create a deluxe pizza
        DeluxePizza deluxePizza = new DeluxePizza(false);
        // Does not have functionality to modify or add extra cheese and toppings
        deluxePizza.takeaway();
        deluxePizza.getBill();
    }
}
