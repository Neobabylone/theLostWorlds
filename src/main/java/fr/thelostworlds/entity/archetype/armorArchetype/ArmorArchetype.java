package fr.thelostworlds.entity.archetype.armorArchetype;

import fr.thelostworlds.entity.fix.enumeration.ArmorEnum;

import java.util.concurrent.atomic.AtomicInteger;

public class ArmorArchetype {

    private static final AtomicInteger count = new AtomicInteger(0);

    private int id;

    private String name;

    private Enum<ArmorEnum> armorArchetype;

    private int armorClass;

    private int weight;

    public ArmorArchetype() {
    }

    public ArmorArchetype(String name, Enum<ArmorEnum> armorArchetype, int armorClass, int weight) {
        this.id = count.getAndIncrement();
        this.name = name;
        this.armorArchetype = armorArchetype;
        this.armorClass = armorClass;
        this.weight = weight;
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

    public Enum<ArmorEnum> getArmorArchetype() {
        return armorArchetype;
    }

    public void setArmorArchetype(Enum<ArmorEnum> armorArchetype) {
        this.armorArchetype = armorArchetype;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
