package com.duguyuan;

import java.util.*;

public class CharacterMostTimes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Map<Character, Integer> charTimes = new HashMap<Character, Integer>();
        List<Character> mostTimesChar = new ArrayList<Character>();
        int length = input.length();
        char ch = ' ';
        for (int i = 0; i < length; i++) {
            ch = input.charAt(i);
            if (charTimes.containsKey(ch)) {
                charTimes.put(ch, charTimes.get(ch) + 1);
            }else {
                charTimes.put(ch, 1);
            }
        }
        int mostTimes = 0;
        for (Map.Entry<Character, Integer> charTime : charTimes.entrySet()) {
            if (charTime.getValue() > mostTimes) {
                mostTimesChar.clear();
                mostTimes = charTime.getValue();
                mostTimesChar.add(charTime.getKey());
            }else if (charTime.getValue() == mostTimes) {
                mostTimesChar.add(charTime.getKey());
            }
        }
        for (Character character : mostTimesChar) {
            input = input.replaceAll(character.toString(), "");
        }
        System.out.println(input);
    }

}
