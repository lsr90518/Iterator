package Iterator;

import java.util.*;

/**
 * Created by Lsr on 10/13/14.
 */
public class Warehouse implements Aggregate {

    private ArrayList<Component> components;
    private int last = 0;

    public Warehouse(){
        this.components = new ArrayList<Component>();
    }
    public Component getComponentAt(int index){
        return components.get(index);
    }

    public int getLength(){
        return components.size();
    }

    public void appendComponent(Component component){
        this.components.add(component);
        this.last++;
    }

    @Override
    public Iterator iterator() {
        return new WarehouseIterator(this);
    }
}
