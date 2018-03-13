package signleton.enumerator;

public enum EnumTree {
    INSTANCE;
    String name;
    public void setTreeName(String name){
        this.name = name;
    }
    public void printEnumTree(){
        System.out.println("Enum Tree's Name is " + name);
    }
}
