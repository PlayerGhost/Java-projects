
package destinystats;

import java.io.Serializable;
import java.util.ArrayList;

public class Exotics implements Serializable{
    private ArrayList<ArmorExotic> armorExotic;
    private ArrayList<WeaponExotic> weaponExotic; 

    public Exotics() {
        this.armorExotic = new ArrayList<ArmorExotic>();
        this.weaponExotic = new ArrayList<WeaponExotic>();
    }

    public ArrayList<ArmorExotic> getArmorExotic() {
        return armorExotic;
    }

    public void setArmorExotic(ArrayList<ArmorExotic> armorExotic) {
        this.armorExotic = armorExotic;
    }

    public ArrayList<WeaponExotic> getWeaponExotic() {
        return weaponExotic;
    }

    public void setWeaponExotic(ArrayList<WeaponExotic> weaponExotic) {
        this.weaponExotic = weaponExotic;
    }
    
    public void addArmorExotic(ArmorExotic armor){
        this.armorExotic.add(armor);
    }
            
    public void addWeaponExotic(WeaponExotic weapon){
        this.weaponExotic.add(weapon);
    }
}
