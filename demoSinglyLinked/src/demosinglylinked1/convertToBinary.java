/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demosinglylinked1;

/**
 *
 * @author Admin
 */
public class convertToBinary {
    public static String convertToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static void main(String[] args) {
        int decimalNumber = 42;
        String binary = convertToBinary(decimalNumber);
        System.out.println("Binary representation of " + decimalNumber + " is: " + binary);
    }
}
