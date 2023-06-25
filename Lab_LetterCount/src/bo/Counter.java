/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import java.util.TreeMap;
import java.util.StringTokenizer;

/**
 *
 * @author khami
 */
public class Counter {

    public static TreeMap countLetter(String str) {
        StringTokenizer subStr = new StringTokenizer(str);
        TreeMap<String, Integer> letters = new TreeMap<>();
        while (subStr.hasMoreTokens()) {
            String word = subStr.nextToken();
            if (letters.containsKey(word)) {
                letters.replace(word, letters.get(word) + 1);
            } else {
                letters.put(word, 1);
            }
        }
        return letters;
    }

    public static TreeMap countCharacter(String content) {
        content = content.replaceAll("\\s+", "");
        TreeMap<Character, Integer> characters = new TreeMap<>();
        for (char c : content.toCharArray()) {
            if (characters.containsKey(c)) {
                characters.replace(c, characters.get(c) + 1);
            } else {
                characters.put(c, 1);
            }
        }
        return characters;
    }
}
