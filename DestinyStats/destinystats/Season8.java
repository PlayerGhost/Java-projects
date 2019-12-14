
package destinystats;

import java.io.Serializable;
import java.util.ArrayList;

public class Season8 implements Serializable{
    private ArrayList <Armor> armors;
    private ArrayList <Weapon> weapons;
    private Exotics exotics;
    private ArrayList <Class> classes;
    private ArrayList <SubClass> subclasses;
    private ArrayList <Ornament> ornaments;

    public Season8() {
        this.armors = new ArrayList<Armor>();
        this.weapons = new ArrayList<Weapon>();
        this.exotics = new Exotics();
        this.classes = new ArrayList<Class>();
        this.subclasses = new ArrayList<SubClass>();
        this.ornaments = new ArrayList<Ornament>();
    }

    public Exotics getExotics() {
        return exotics;
    }

    public void setExotics(Exotics exotics) {
        this.exotics = exotics;
    }

    public ArrayList <Armor> getArmors() {
        return armors;
    }

    public void setArmors(ArrayList <Armor> armors) {
        this.armors = armors;
    }

    public ArrayList <Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList <Weapon> weapons) {
        this.weapons = weapons;
    }

    public ArrayList<Class> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Class> classes) {
        this.classes = classes;
    }

    public ArrayList<SubClass> getSubclasses() {
        return subclasses;
    }

    public void setSubclasses(ArrayList<SubClass> subclasses) {
        this.subclasses = subclasses;
    }

    public ArrayList<Ornament> getOrnaments() {
        return ornaments;
    }

    public void setOrnaments(ArrayList<Ornament> ornaments) {
        this.ornaments = ornaments;
    }
    
    public void addArmor(Armor armor){
        this.armors.add(armor);
    }
            
    public void addWeapon(Weapon weapon){
        this.weapons.add(weapon);
    }
    
    public void addArmorExotic(ArmorExotic armor){
        this.exotics.addArmorExotic(armor);
    }
            
    public void addWeaponExotic(WeaponExotic weapon){
        this.exotics.addWeaponExotic(weapon);
    }
    
    public void addClass(Class classs){
        this.classes.add(classs);
    }
    
    public void addSubclasses(SubClass subClass){
        this.subclasses.add(subClass);
    }
    
    public void addOrnament(Ornament ornament){
        this.ornaments.add(ornament);
    }
}
