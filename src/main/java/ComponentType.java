import java.util.HashMap;

public abstract class ComponentType {



    private HashMap<String, AttributeType> attributes;
    private HashMap<String, ComponentType> components;


    public ComponentType(String name, AttributeType... attribute){

    }

    public AttributeType getAttribute(String name){
        return attributes.get(name);
    }


}
