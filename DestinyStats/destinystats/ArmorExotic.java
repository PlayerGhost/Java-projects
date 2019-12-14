
package destinystats;

import java.io.Serializable;

public class ArmorExotic extends Armor implements Catalyst, Serializable{
    private String exoticSpecialPerk;

    public ArmorExotic(String exoticSpecialPerk, String gearClass, double mobility, double resilience, double recovery, double discipline, double intelect, double strength, String nome, String description) {
        super(gearClass, mobility, resilience, recovery, discipline, intelect, strength, nome, description);
        this.exoticSpecialPerk = exoticSpecialPerk;
    }
    
    public String getExoticSpecialPerk() {
        return exoticSpecialPerk;
    }

    public void setExoticSpecialPerk(String exoticSpecialPerk) {
        this.exoticSpecialPerk = exoticSpecialPerk;
    }

    @Override
    public void catalyst(int statsToIncremment) {
        switch(statsToIncremment) {
            case 1:
                this.setMobility(this.getMobility() + 5);
                break;
            case 2:
                this.setResilience(this.getResilience() + 5);
                break;
            case 3:
                this.setRecovery(this.getRecovery() + 5);
                break;
            case 4:
                this.setDiscipline(this.getDiscipline() + 5);
                break;
            case 5:
                this.setIntelect(this.getIntelect() + 5);
                break;
            case 6:
                this.setStrength(this.getStrength() + 5);
                break;
        }
    }
}
