public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // Create BoundedCounter with appropriate upper limits
        this.hours = new BoundedCounter(23);
        this.minutes = new BoundedCounter(59);
        this.seconds = new BoundedCounter(59);
        
        // Set the constructor arguments as the counter starting values
        this.hours.setValue(hoursAtBeginning);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds.setValue(secondsAtBeginning);
    }
    
    public void tick() {
        // Clock advances by one second
        this.seconds.next();
        
        // if seconds wrap around to zero, advance minutes
        if (this.seconds.getValue() == 0) {
            this.minutes.next();
            
            // if minutes wrap around to zero, advance hours
            if (this.minutes.getValue() == 0) {
                this.hours.next();
            }
        }
    }
    
    public String toString() {
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
