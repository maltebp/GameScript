public abstract class Attribute {

    protected String name;
    protected Types type;

    public Attribute(String name, Types type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Types getType() {
        return type;
    }
}
