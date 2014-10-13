package Iterator;
/**
 * Created by Lsr on 10/13/14.
 */
public class WarehouseIterator implements Iterator {

    private Warehouse warehouse;
    private int index;

    public WarehouseIterator(Warehouse warehouse){
        this.warehouse = warehouse;
        this.index = 0;
    }

    public boolean hasNext(){
        if(index < warehouse.getLength()){
            return true;
        } else {
            return false;
        }
    }

    public Object next(){
        Component component = warehouse.getComponentAt(index);
        index++;
        return component;
    }
}
