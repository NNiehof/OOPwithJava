public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(2);

        counter.printValue();
        
        counter.decrease();
        counter.printValue();
        
        counter.decrease();
        counter.printValue();
        
        counter.decrease();
        counter.printValue();
        
        counter.reset();
        counter.printValue();
        
        counter.setInitial();
        counter.printValue();
    }
}
