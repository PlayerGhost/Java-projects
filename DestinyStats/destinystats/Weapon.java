
package destinystats;

import java.io.Serializable;

public class Weapon extends Gear implements Serializable{
    private String type;
    private int impact;
    private int range;
    private int stability;
    private int handling;
    private int reloadSpeed;
    private int roundsPerMinute;
    private int magazine;

    public Weapon(String type, int impact, int range, int stability, int handling, int reloadSpeed, int roundsPerMinute, int magazine, String nome, String description) {
        super(nome, description);
        this.type = type;
        this.impact = impact;
        this.range = range;
        this.stability = stability;
        this.handling = handling;
        this.reloadSpeed = reloadSpeed;
        this.roundsPerMinute = roundsPerMinute;
        this.magazine = magazine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getImpact() {
        return impact;
    }

    public void setImpact(int impact) {
        this.impact = impact;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getStability() {
        return stability;
    }

    public void setStability(int stability) {
        this.stability = stability;
    }

    public int getHandling() {
        return handling;
    }

    public void setHandling(int handling) {
        this.handling = handling;
    }

    public int getReloadSpeed() {
        return reloadSpeed;
    }

    public void setReloadSpeed(int reloadSpeed) {
        this.reloadSpeed = reloadSpeed;
    }

    public int getRoundsPerMinute() {
        return roundsPerMinute;
    }

    public void setRoundsPerMinute(int roundsPerMinute) {
        this.roundsPerMinute = roundsPerMinute;
    }

    public int getMagazine() {
        return magazine;
    }

    public void setMagazine(int magazine) {
        this.magazine = magazine;
    }
    
    @Override
    public void mod(int statsToIncremment){
        switch(statsToIncremment) {
            case 1:
                this.impact += 10;
                break;
            case 2:
                this.range += 10;
                break;
            case 3:
                this.stability += 10;
                break;
            case 4:
                this.handling += 10;
                break;
            case 5:
                this.reloadSpeed += 10;
                break;
            case 6:
                this.roundsPerMinute += 10;
                break;
            case 7:
                this.magazine += 10;
                break;
        }
    }
    
    @Override
    public void mod(int statsToIncremment, double porcentagem){
        switch(statsToIncremment) {
            case 1:
                this.impact += this.impact * (porcentagem/100);
                break;
            case 2:
                this.range += this.range * (porcentagem/100);
                break;
            case 3:
                this.stability += this.stability * (porcentagem/100);
                break;
            case 4:
                this.handling += this.handling * (porcentagem/100);
                break;
            case 5:
                this.reloadSpeed += this.reloadSpeed * (porcentagem/100);
                break;
            case 6:
                this.roundsPerMinute += this.roundsPerMinute * (porcentagem/100);
                break;
            case 7:
                this.magazine += this.magazine * (porcentagem/100);
                break;
        }
    }
}
