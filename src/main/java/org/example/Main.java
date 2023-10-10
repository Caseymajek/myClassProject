package org.example;
import java.awt.*;
import java.util.Objects;
import java.util.Objects;
import java.math.BigDecimal;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       User jumia = new User();
       jumia.setName ("JUMIA");
        System.out.println("The name of the platform is :" + jumia.getName());
        Product versaceShoe = new Product();
        versaceShoe.setName( "VERSACEShoe");
        versaceShoe.setColour (Color.RED);
        versaceShoe.setSize(34);
        versaceShoe.setWeight(3.00F);
        versaceShoe.setPrice(100000L);
        Product versaceShoe1 = new Product();
        versaceShoe.setName( "VERSACEShoe");
        versaceShoe.setColour (Color.RED);
        versaceShoe.setSize(34);
        versaceShoe.setWeight(3.00F);
        versaceShoe.setPrice(100000L);
        //versaceShoe1.addProduct(versaceShoe1);
        System.out.println("Are they equal:" + Objects.equals(versaceShoe, versaceShoe1));
        System.out.println("My name is:" + versaceShoe.getName());

        System.out.println("Come and pick up your : " + versaceShoe.getName());

    }
}