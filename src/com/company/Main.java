package com.company;

public class Main {
    //Mubarik Abdi 1/20/2020

    public static void main(String[] args) {

        String city = "Columbus";
        int zipCode = 43215;
        int[] highTemps = {32, 25, 27, 40, 45};   // remember to put brackets on the type then curly brackets on elements.

        float avgTemp = (highTemps[0] + highTemps[1] + highTemps[2] + highTemps[3] + highTemps[4]) / 5;
        // if the value avgTemp is given type integer then when displaying it will not show decimal point.
        // if the avgTemp is given float type then it will show decimal point when displaying.

        System.out.println("City: " + city + " Zip Code: " + zipCode + " Average High Temperature: " + avgTemp);

    }
}
