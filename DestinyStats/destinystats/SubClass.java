
package destinystats;

import java.io.Serializable;

public class SubClass extends Class implements Serializable{
    private Ability type;
    private Ability superAbility;
    private Ability jumpingAbility;
    private Ability grenadeAbility;
    private Ability classAbility;

    public SubClass(Ability type, Ability superAbility, Ability jumpingAbility, Ability grenadeAbility, Ability classAbility, String name, String race) {
        super(name, race);
        this.type = type;
        this.superAbility = superAbility;
        this.jumpingAbility = jumpingAbility;
        this.grenadeAbility = grenadeAbility;
        this.classAbility = classAbility;
    }

    public Ability getType() {
        return type;
    }

    public Ability getSuperAbility() {
        return superAbility;
    }

    public Ability getJumpingAbility() {
        return jumpingAbility;
    }

    public Ability getGrenadeAbility() {
        return grenadeAbility;
    }

    public Ability getClassAbility() {
        return classAbility;
    }
}
