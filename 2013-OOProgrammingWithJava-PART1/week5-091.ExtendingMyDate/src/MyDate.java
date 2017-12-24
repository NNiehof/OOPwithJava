
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        // Check whether the passed date is earlier than the current object's date
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        // Advance date by one day
        // (Note: months of 30 days assumed for this assignment)

        if (this.day < 30) {
            // Advance day by one
            this.day += 1;
        } else {
            // If last day of the month, set day to 0, advance month by one
            this.day = 1;
            if (this.month < 12) {
                this.month += 1;
            } else {
                // If last month of the year, set month to 0, advance year by one
                this.month = 1;
                this.year += 1;
            }
        }
    }
    
    public void advance(int numberOfDays) {
        for (int index = 0; index < numberOfDays; index++) {
            advance();
        }
    }
    
    public MyDate afterNumberOfDays(int days) {
        // Returns a copy of current MyDate object, advanced by passed number of days
        MyDate newDate = new MyDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }

}
