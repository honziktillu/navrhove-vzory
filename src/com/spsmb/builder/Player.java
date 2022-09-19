package com.spsmb.builder;

public class Player {

    private String name;
    private double hp;
    private double mana;
    private double dmg;

    private Player(String name, double hp, double mana, double dmg) {
        this.name = name;
        this.hp = hp;
        this.mana = mana;
        this.dmg = dmg;
    }

    public static class Builder {
        private String name = "Steve";
        private double hp = 100;
        private double mana = 100;
        private double dmg = 2;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setHp(double hp) {
            this.hp = hp;
            return this;
        }

        public Builder setMana(double mana) {
            this.mana = mana;
            return this;
        }

        public Builder setDmg(double dmg) {
            this.dmg = dmg;
            return this;
        }

        public Player build() {
            return new Player(name, hp, mana, dmg);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public double getDmg() {
        return dmg;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }

    @Override
    public String toString() {
        return "com.spsmb.builder.Player{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", mana=" + mana +
                ", dmg=" + dmg +
                '}';
    }
}
