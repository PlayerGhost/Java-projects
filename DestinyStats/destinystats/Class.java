
package destinystats;

import java.io.Serializable;

public class Class implements Serializable{
    private String name;
    private String race;

    public Class(String name, String race) {
        this.name = name;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }
}
