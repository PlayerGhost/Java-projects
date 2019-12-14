
package destinystats;

import java.io.Serializable;

public class WeaponExotic extends Weapon implements Catalyst, Serializable{
    private String exoticSpecialPerk;

    public WeaponExotic(String exoticSpecialPerk, String type, int impact, int range, int stability, int handling, int reloadSpeed, int roundsPerMinute, int magazine, String nome, String description) {
        super(type, impact, range, stability, handling, reloadSpeed, roundsPerMinute, magazine, nome, description);
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
                this.setImpact(this.getImpact() + 5);
                break;
            case 2:
                this.setRange(this.getRange() + 5);
                break;
            case 3:
                this.setStability(this.getStability() + 5);
                break;
            case 4:
                this.setHandling(this.getHandling() + 5);
                break;
            case 5:
                this.setReloadSpeed(this.getReloadSpeed() + 5);
                break;
            case 6:
                this.setRoundsPerMinute(this.getRoundsPerMinute() + 5);
                break;
            case 7:
                this.setMagazine(this.getMagazine() + 5);
                break;
        }
    }
}
