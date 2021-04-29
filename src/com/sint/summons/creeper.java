package com.sint.summons;

public class creeper {
    utilFunctions utilFunctions = new utilFunctions();

    public void singleCreeper(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            int[] cords = utilFunctions.singleCords();
            String single = "execute in minecraft:the_end run summon minecraft:creeper " + cords[0] + " 70 " + cords[1]
                    + " {Fuse:1,ExplosionRadius:10,CustomName:'[{%text%:%bum%}]',CustomNameVisible:1b,Health:100,ActiveEffects:[{Id:1,Duration:99999,Amplifier:3,ShowParticles:0b}],Attributes:[{Name:%generic.max_health%,Base:100f}]}";
            utilFunctions.sendCommandTrasn(single);
        }
    }
}
