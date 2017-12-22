public class Main {
    public static void main(String[] args) {
        // make counters to check each constructor
        Counter countUnchecked = new Counter();
        Counter countChecked = new Counter(true);
        Counter countUncheckedOffset = new Counter(2);
        Counter countCheckedOffset = new Counter(2, true);
        
        // test code for increasing counters
        int index = 0;
        while (index < 2) {
            countUnchecked.increase();
            System.out.println("countUnchecked: " + countUnchecked.value());
            countChecked.increase();
            System.out.println("countChecked: " + countChecked.value());
            countUncheckedOffset.increase();
            System.out.println("countUncheckedOffset: " + countUncheckedOffset.value());
            countCheckedOffset.increase();
            System.out.println("countCheckedOffset: " + countCheckedOffset.value());
            index++;
        }
        
        // test code for decreasing counters
        index = 0;
        while (index < 5) {
            countUnchecked.decrease(2);
            System.out.println("countUnchecked: " + countUnchecked.value());
            countChecked.decrease(2);
            System.out.println("countChecked: " + countChecked.value());
            countUncheckedOffset.decrease(2);
            System.out.println("countUncheckedOffset: " + countUncheckedOffset.value());
            countCheckedOffset.decrease(2);
            System.out.println("countCheckedOffset: " + countCheckedOffset.value());
            index++;
        }
    }
}
