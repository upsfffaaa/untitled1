package org.example;

public class Program {
    public static void main(String[] args) {
        String words = "apple banana cherry";
        StringManipulation manipulation = new StringManipulation();
        String result = manipulation.getFirstLettersInUpperCase(words);
        System.out.println(result);
    }
}
