package fr.thelostworlds.entity.archetype.weaponArchetype;

import java.util.concurrent.atomic.AtomicInteger;

public class WeaponArchetype {

    private static final AtomicInteger count = new AtomicInteger(0);

    private int id;

    private int minRange;

    private int maxRange;

    private int baseDamage;

    private int speed;

    private int weight;

    private boolean twoHanded;

    public WeaponArchetype() {
    }

    public WeaponArchetype(int minRange, int maxRange, int baseDamage, int speed, int weight, boolean twoHanded) {
        this.id = count.getAndIncrement();
        this.minRange = minRange;
        this.maxRange = maxRange;
        this.baseDamage = baseDamage;
        this.speed = speed;
        this.weight = weight;
        this.twoHanded = twoHanded;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMinRange() {
        return minRange;
    }

    public void setMinRange(int minRange) {
        this.minRange = minRange;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isTwoHanded() {
        return twoHanded;
    }

    public void setTwoHanded(boolean twoHanded) {
        this.twoHanded = twoHanded;
    }
}
