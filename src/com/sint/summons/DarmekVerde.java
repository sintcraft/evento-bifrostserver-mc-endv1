package com.sint.summons;

public class DarmekVerde {
    utilFunctions utilFunctions = new utilFunctions();

    public void singleDarmekVerde(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            int[] cords = utilFunctions.singleCords();
            String single = "execute in minecraft:the_end run summon minecraft:slime " + cords[0] + " 70 " + cords[1]
                    + " {Size:5,CustomName:'[{%text%:%Darmek pero verde%,%color%:%green%}]',Health:100,ActiveEffects:[{Id:5,Duration:6000,Amplifier:5,ShowParticles:0b},{Id:10,Duration:2000,Amplifier:2,ShowParticles:0b}],Attributes:[{Name:%generic.max_health%,Base:100F}]}";
            utilFunctions.sendCommandTrasn(single);
        }
    }
}
