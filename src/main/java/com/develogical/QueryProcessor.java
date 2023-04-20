package com.develogical;

import java.util.Arrays;

public class QueryProcessor {

    public String process(String query) {

        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an "
                    + "English poet, playwright, and actor, widely regarded as the greatest "
                    + "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("plato")) {
            return "Plato was an ancient Greek philosopher born in Athens during the " +
                    "Classical period in Ancient Greece. In Athens, Plato founded the Academy," +
                    " a philosophical school where he taught the philosophical doctrines that" +
                    " would later became known as Platonism. ";
        }
        if (query.toLowerCase().contains("name")) {
            return "late-snow-2938";
        }
        if (query.toLowerCase().contains("largest")) {
            int result;
            String str = query.replaceAll("[^0-9]", " ");
            str = str.replaceAll(" +", " ");
            System.out.println(str);
            String[] testArray = str.split(" ");
            System.out.println(Arrays.toString(testArray));

            int max = Integer.MIN_VALUE, maxIndex = 0;

            for (int i = 0; i < testArray.length; i++) {
                if(testArray[i]==""){
                    continue;
                }
                if (Integer.parseInt(testArray[i]) > max) {
                    max = Integer.parseInt(testArray[i]);
                    maxIndex = i;
                }

            }
            return String.valueOf(max);

        }
        return "";

    }
}
