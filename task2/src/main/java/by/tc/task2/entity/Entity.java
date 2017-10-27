package by.tc.task2.entity;

import java.io.PrintStream;
import java.util.List;
import java.util.Map;

public class Entity {
    private String name = null;
    private String value = null;
    private List<Entity> children;
    private Entity parent = null;
    private Map<String, String> attributes;

    public Entity() {
    }

    public Entity(List<Entity> children, Map<String, String> attributes) {
        this.children = children;
        this.attributes = attributes;
    }

    public List<Entity> getChildren() {
        return children;
    }

    public void setChildren(List<Entity> children) {
        this.children = children;
    }

    public Entity getParent() {
        return parent;
    }

    public void setParent(Entity parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entity entity = (Entity) o;

        if (children != null ? !children.equals(entity.children) : entity.children != null) return false;
        if (parent != null ? !parent.equals(entity.parent) : entity.parent != null) return false;
        if (name != null ? !name.equals(entity.name) : entity.name != null) return false;
        if (value != null ? !value.equals(entity.value) : entity.value != null) return false;
        return attributes != null ? attributes.equals(entity.attributes) : entity.attributes == null;
    }

    @Override
    public int hashCode() {
        int result = children != null ? children.hashCode() : 0;
        result = 31 * result + (parent != null ? parent.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (attributes != null ? attributes.hashCode() : 0);
        return result;
    }


    public void print(PrintStream printStream, String tab) {
        if (!attributes.isEmpty()){
            for (Map.Entry attribute:attributes.entrySet()){
                printStream.print(attribute.getKey()+" = "+attribute.getValue()+" ");
            }
            printStream.println();
        }
        if(!children.isEmpty()){
            tab+="   ";
            for (Entity child:children){
                child.print(printStream,tab);
            }
        }
        if(value!=null){
            printStream.println(tab+name+" = "+value);
        }
    }
}
