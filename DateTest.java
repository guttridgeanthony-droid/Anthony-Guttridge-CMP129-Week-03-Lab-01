/*
 * Student Name:Anthony Guttridge
 * Course: CMP 129
*/

public class DateTest {
    public static void main(String[] args) {
        // Create Date objects
        Date date1 = new Date(12, 25, 2014);
        Date date2 = new Date(7, 4, 2020);

        System.out.println("--- Date 1 Formats ---");
        date1.displayNumeric();
        date1.displayMonthFirst();
        date1.displayDayFirst();

        System.out.println("\n--- Date 2 Formats ---");
        date2.displayNumeric();
        date2.displayMonthFirst();
        date2.displayDayFirst();

        System.out.println("\n--- Updating Date 1 ---");
        date1.setMonth(10);
        date1.setDay(31);
        date1.setYear(2023);
        date1.displayNumeric();

        // Test validation with invalid inputs
        System.out.println("\n--- Testing Invalid Values ---");
        date1.setMonth(15);
        date1.setDay(45);

        System.out.println("\n--- Using Getter Method ---");
        System.out.println("Retrieved Year: " + date1.getYear());
    }
}