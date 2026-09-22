/*
 * Student Name:Anthony Guttridge
 * Course: CMP 129
 */

public class Date {
    private int month = 1;
    private int day = 1;
    private int year = 2000;

    // Array for converting numeric month to name
    private static final String[] MONTH_NAMES = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    public Date(int month, int day, int year) {
        setMonth(month);
        setDay(day);
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    // Validate month before updating
    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Error: Month must be between 1 and 12.");
        }
    }

    public int getDay() {
        return day;
    }

    // Validate day before updating
    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Error: Day must be between 1 and 31.");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayNumeric() {
        System.out.println(month + "/" + day + "/" + year);
    }

    public void displayMonthFirst() {
        System.out.println(MONTH_NAMES[month] + " " + day + ", " + year);
    }

    public void displayDayFirst() {
        System.out.println(day + " " + MONTH_NAMES[month] + " " + year);
    }
}