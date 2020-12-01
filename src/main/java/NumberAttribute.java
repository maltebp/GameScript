public class NumberAttribute extends Attribute {

    private double value;

    public NumberAttribute(String name) {
        super(name, Types.NUMBER);
    }


    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public NumberAttribute copy(){
        NumberAttribute newAttribute = new NumberAttribute(name);
        newAttribute.value = value;
        return newAttribute;
    }
}
