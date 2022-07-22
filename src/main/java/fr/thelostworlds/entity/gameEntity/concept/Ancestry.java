package fr.thelostworlds.entity.gameEntity.concept;

import java.util.concurrent.atomic.AtomicInteger;

public class Ancestry {

    private static final AtomicInteger count = new AtomicInteger(0);

    private int id;

    private String name;

    private String description;

    private int attack;

    private int armorClass;

    private int speed;

    private int health;

    private int movement;

    public Ancestry() {
    }

    public Ancestry(String name, String description, int attack, int armorClass, int speed, int health, int movement) {
        this.id = count.getAndIncrement();
        this.name = name;
        this.description = description;
        this.attack = attack;
        this.armorClass = armorClass;
        this.speed = speed;
        this.health = health;
        this.movement = movement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMovement() {
        return movement;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }
}
