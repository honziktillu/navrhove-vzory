package com.spsmb.builder;

public class Main {
    public static void main(String[] args) {
        Player player = new Player.Builder().setName("John").setDmg(12).setHp(5).setMana(1).build();
        System.out.println(player);
    }
}