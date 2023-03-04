package org.example.exemple1;

import java.util.HashSet;

public class StringUtilities {
    HashSet<Character> lowerCaseValue=new HashSet<>();
    HashSet<Character> upperCaseValue=new HashSet<>();
    public StringUtilities(){
        lowerCaseValue.add('a');
        lowerCaseValue.add('b');
        upperCaseValue.add('c');
        upperCaseValue.add('d');
    }
    public int vowelCount(String s){
        int count=0;
        if (s==null) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            if (lowerCaseValue.contains(s.charAt(i))) {
                count++;
            } else if (upperCaseValue.contains(s.charAt(i))) {
                count++;
            }
        }

        return count;
    }
    public boolean isCapitalized(String s){
        if (s==null || s.length()==0){
            return false;
        }
        else return (upperCaseValue.contains(s.charAt(0)));

    }
}
