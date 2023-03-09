package Palindrome;

import java.util.LinkedList;
import java.util.ListIterator;

public class Palindrome {


    public static void main(String[] args) {
        String pol = "madam";
        boolean isPalindrome = true;
        LinkedList<Character> charPol = new LinkedList<>();

        for (char ch : pol.toCharArray()) {
            charPol.add(ch);
        }
        ;
        ListIterator<Character> headIter = charPol.listIterator();
        ListIterator<Character> tailIter = charPol.listIterator(charPol.size());

        for (int i = 0; i<charPol.size()/2;i++) {
            while (headIter.hasNext() && tailIter.hasPrevious()) {
                if (headIter.next() != tailIter.previous()) {
                    isPalindrome = false;
                    break;
                }
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome true");
        } else {
            System.out.println("Not Palindrome");
        }

    }

}
