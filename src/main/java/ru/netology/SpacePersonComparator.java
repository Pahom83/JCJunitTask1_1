package ru.netology;

import java.util.Comparator;

public class SpacePersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getExperience() > o2.getExperience()){
            return -1;
        } else if (o1.getExperience() < o2.getExperience()) {
            return 1;
        } else {
            int count1 = charCount(o1.getName().toLowerCase(), 's');
            int count2 = charCount(o2.getName().toLowerCase(), 's');
            if (count1 < count2){
                return 1;
            } else if (count1 > count2) {
                return -1;
            } else {
                return (o1.getName().length() < o2.getName().length()) ? 1 : -1;
            }
        }
    }

    static int charCount(String s, char ch){
        int count = 0;
        for (int i=0; i < s.length(); i++){
            if (s.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
}