package dev.lpa;

//public class Monster implements ISaveable{
//
//    private String name;
//    private int hitPoints;
//    private int strength;
//
//    public Monster(String name, int hitPoints, int strength) {
//        this.name = name;
//        this.hitPoints = hitPoints;
//        this.strength = strength;
//    }
//
//    public String getName() {
//        return name;
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
//        return "Monster{name= '%s', hitPoints=%s,  strength=%s}".formatted(name, hitPoints, strength);
//    }
//}
import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public List<String> write() {

        ArrayList<String> values = new ArrayList<String>();
        values.add(0, name);
        values.add(1, "" + hitPoints);
        values.add(2, "" + strength);
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
    }

    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}

