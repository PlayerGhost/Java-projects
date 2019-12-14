
package destinystats;

import java.io.Serializable;

public class Ability implements Serializable{
    private String name;
    private String description;

    public Ability(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
