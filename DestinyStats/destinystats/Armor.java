
package destinystats;

import java.io.Serializable;

public class Armor extends Gear implements Serializable{
    private String gearClass;
    private double mobility;
    private double resilience;
    private double recovery;
    private double discipline;
    private double intelect;
    private double strength;

    public Armor(String gearClass, double mobility, double resilience, double recovery, double discipline, double intelect, double strength, String nome, String description) {
        super(nome, description);
        this.gearClass = gearClass;
        this.mobility = mobility;
        this.resilience = resilience;
        this.recovery = recovery;
        this.discipline = discipline;
        this.intelect = intelect;
        this.strength = strength;
    }

    public String getGearClass() {
        return gearClass;
    }

    public void setGearClass(String gearClass) {
        this.gearClass = gearClass;
    }

    public double getMobility() {
        return mobility;
    }

    public void setMobility(double mobility) {
        this.mobility = mobility;
    }

    public double getResilience() {
        return resilience;
    }

    public void setResilience(double resilience) {
        this.resilience = resilience;
    }

    public double getRecovery() {
        return recovery;
    }

    public void setRecovery(double recovery) {
        this.recovery = recovery;
    }

    public double getDiscipline() {
        return discipline;
    }

    public void setDiscipline(double discipline) {
        this.discipline = discipline;
    }

    public double getIntelect() {
        return intelect;
    }

    public void setIntelect(double intelect) {
        this.intelect = intelect;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }
    
    @Override
    public void mod(int statsToIncremment){
        switch(statsToIncremment) {
            case 1:
                this.mobility += 10;
                break;
            case 2:
                this.resilience += 10;
                break;
            case 3:
                this.recovery += 10;
                break;
            case 4:
                this.discipline += 10;
                break;
            case 5:
                this.intelect += 10;
                break;
            case 6:
                this.strength += 10;
                break;
        }
    }

    @Override
    public void mod(int statsToIncremment, double porcentagem){
        switch(statsToIncremment) {
            case 1:
                this.mobility += this.mobility * (porcentagem/100);
                break;
            case 2:
                this.resilience += this.resilience * (porcentagem/100);
                break;
            case 3:
                this.recovery += this.recovery * (porcentagem/100);
                break;
            case 4:
                this.discipline += this.discipline * (porcentagem/100);
                break;
            case 5:
                this.intelect += this.intelect * (porcentagem/100);
                break;
            case 6:
                this.strength += this.strength * (porcentagem/100);
                break;
        }
    }
}
