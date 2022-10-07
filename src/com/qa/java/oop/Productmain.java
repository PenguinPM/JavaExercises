package com.qa.java.oop;



public class Productmain {

    public static void main(String[] args) {

        {
            Product product1 = new Product();
            Product product2 = new Product();
            Product product3 = new Product();
            //Product product4 = new Product(1,"book", 100, "food", 4, 10, true);
            Product product4 = new Product(4, "shweta", 100, "books", (byte)10,20,true);
            System.out.println("Product 4 id is :" + product4.id);


      /*      product1.id = 111;
            product1.name = "toy";
            product1.price = 20;
            product1.category = "children";
            product1.rating = 8;
            product1.discountPercentage = 9;
            product1.isAvailable = true;
            product2.id = 112;
            product2.name = "book";
            product2.price = 120;
            product2.category = "Science";
            product2.rating = 5;
            product2.discountPercentage = 10;
            product2.isAvailable = true;
            product3.id = 113;
            product3.name = "pen";
            product3.price = 10;
            product3.category = "Accessories";
            product3.rating = 6;
            product3.discountPercentage = 1;
            product3.isAvailable = false;*/
            System.out.println("Product 1 id is :" + product1.id);
            System.out.println("Product 1 name is :" + product1.name);
            // System.out.println("Product 1 Price


        }


    }
}

