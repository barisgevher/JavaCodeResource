package dev.lpa;

//public class Player implements ISaveable{
//
//    private String name;
//    private String weapon;
//    private int hitPoints;
//    private int strength;
//
//    public Player(String name, int hitPoints, int strength) {
//        this.name = name;
//        this.hitPoints = hitPoints;
//        this.strength = strength;
//        this.weapon = "Sword";
//    }
//
//
//
//    public String getName() {
//        return name;
//    }
//
//    public String getWeapon() {
//        return weapon;
//    }
//
//    public int getHitPoints() {
//        return hitPoints;
//    }
//
//    public int getStrength() {
//        return strength;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setWeapon(String weapon) {
//        this.weapon = weapon;
//    }
//
//    public void setHitPoints(int hitPoints) {
//        this.hitPoints = hitPoints;
//    }
//
//    public void setStrength(int strength) {
//        this.strength = strength;
//    }
//
//    @Override
//    public List<String> write() {
//        return List.of();
//    }
//
//    @Override
//    public void read(List<String> list) {
//
//    }
//
//    @Override
//    public String toString() {
//        return "Player{name= '%s', hitPoints=%s,  strength=%s, weapon='%s'}".formatted(name, hitPoints, strength, weapon);
//    }
//}

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    public List<String> write() {

        List<String> values = new ArrayList<String>();
        values.add(0, name);
        values.add(1, "" + hitPoints);
        values.add(2, "" + strength);
        values.add(3, weapon);
        return values;
    }

    public void read(List<String> savedValues) {

        if (savedValues == null)
            return;
        if (savedValues.size() <= 0)
            return;
        name = savedValues.get(0);
        hitPoints = Integer.parseInt(savedValues.get(1));
        strength = Integer.parseInt(savedValues.get(2));
        weapon = savedValues.get(3);
    }
}
