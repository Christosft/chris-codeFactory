package gr.aueb.cf1.ch7;

/**
 *
 * Τα strings ειναι immutable και δεν
 * επηρεαζει το αντιγραφο αναφορας.
 * Οποτε εχουμε εγκυρο copy με αντιγραφη
 * της αναφορας.
 */

public class StrCopy {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = s1;

        System.out.println(s2);
    }
}