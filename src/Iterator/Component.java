package Iterator;

import java.util.Date;

/**
 * Created by Lsr on 10/13/14.
 */
public class Component {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String id;
    public String name;
    public String type;

    public Component(String name, String type){
        Date date = new Date();
        this.id = date.getTime() + "";
        this.name = name;
        this.type = type;
    }
}
