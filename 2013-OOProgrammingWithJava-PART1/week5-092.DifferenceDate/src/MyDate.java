
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
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

    public int differenceInYears(MyDate comparedDate) {
        // Difference in years between the later date and the earlier date.
        // Only full years are counted, thus the date in day and month of the
        // earlier date object must be before the date of the later date object.
        // The absolute difference in years is returned.
        
        // Check which date is earlier, assign to 'earlier' and 'later'
        // references accordingly.
        MyDate earlier;
        MyDate later;
        if (earlier(comparedDate)) {
           earlier = this;
           later = comparedDate;
        } else {
            earlier = comparedDate;
            later = this;
        }
        
        if (later.month > earlier.month) {
            // if earlier date is earlier in months, count all years
            return later.year - earlier.year;
        } else if (later.month == earlier.month && earlier.day <= later.day) {
            // if earlier date is in the same month as the later date,
            // and earlier date is earlier in days, count all years
            return later.year - earlier.year;
        } else {
            // if earlier date is later in day and month than the later date,
            // this incomplete year is excluded from the count
            int difference = later.year - earlier.year;
            if (difference > 0) {
            return (later.year - earlier.year) - 1;
            } else {
                return 0;
            }
        }
    }

}
