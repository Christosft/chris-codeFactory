package gr.aueb.cf1.ch2;

public class DateApp {


    public static void main(String[] args) {
        int day = 10;
        int month = 7;
        int year = 2024;


        System.out.println("Η ημερομηνια ειναι: " + day + "/" + month + "/" + year);
        System.out.printf("Η ημερομηνια ειναι: %02d/%02d/%d", day, month, year);

    }
}