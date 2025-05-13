package com.belajar.utility;

public class StringToPascalCase {
    public static String convertToPascalCase(String input) {
        if (input == null || input.isBlank()) return "";

        String[] words = input.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            result.append(
                Character.toUpperCase(word.charAt(0))
            ).append(
                word.substring(1).toLowerCase()
            );

            // Tambahkan spasi kecuali untuk kata terakhir
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
