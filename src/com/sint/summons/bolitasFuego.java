package com.sint.summons;

public class bolitasFuego {
    utilFunctions utilFunctions = new utilFunctions();

    public void bolitas(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            int[] cords = utilFunctions.singleCords();
            String single = "execute in minecraft:the_end run summon fireball " + cords[0] + " 70 " + cords[1]
                    + " {ExplosionPower:5,Motion:[0.0,-3.0,0.0]}";
            utilFunctions.sendCommandTrasn(single);
        }
    }
}
