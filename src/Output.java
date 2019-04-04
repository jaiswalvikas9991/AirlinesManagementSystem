public class Output extends Matcher {
    public float totalCost;

    Output() {
        super();
        calculate();
    }

    private void calculate() {
        this.totalCost = (super.numberOfAdults * super.adultCost + super.numberOfChildren * super.childrenCost) * super.classCost;
    }
}