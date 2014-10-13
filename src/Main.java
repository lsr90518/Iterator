import Iterator.*;
public class Main {

    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        warehouse.appendComponent(new Component("安全弁","SafeValve"));
        warehouse.appendComponent(new Component("危険弁","DangerValve"));
        warehouse.appendComponent(new Component("自動弁","ATValve"));
        warehouse.appendComponent(new Component("部品","Part"));

        Iterator iterator = warehouse.iterator();
        while(iterator.hasNext()){
            Component component = (Component)iterator.next();
            System.out.println(component.getId()+"  "+component.getName()+"  "+component.getType());
        }
    }
}
