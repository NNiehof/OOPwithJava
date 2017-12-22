public class Reformatory {
    private int totalWeightsMeasured;
    
    public Reformatory(){
        this.totalWeightsMeasured = 0;
    }
    
    public int weight(Person person) {
        this.totalWeightsMeasured++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(weight(person) + 1);
    }
    
    public int totalWeightsMeasured() {
        return this.totalWeightsMeasured;
    }

}
