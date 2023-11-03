package org.example;

public class StringManipulation {
    public static String getFirstLettersInUpperCase(String words) {
        String[] wordsArray = words.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : wordsArray) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        return result.toString();
    }
}
