package com.sint.summons;

public class perroInfernal {
    utilFunctions utilFunctions = new utilFunctions();

    public void singlePerroInfernal(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            int[] cords = utilFunctions.singleCords();
            String single = "execute in minecraft:the_end run summon minecraft:wolf " + cords[0] + " 70 " + cords[1]
                    + " {Angry:1,CollarColor:14,CustomName:'[{%text%:%Perro%,%color%:%gray%},{%text%:% Infernal%,%color%:%red%,%bold%:true}]',Health:255,ActiveEffects:[{Id:24,Duration:18000,Amplifier:3,ShowParticles:0b},{Id:1,Duration:9000,Amplifier:4,ShowParticles:0b},{Id:6,Duration:800,Amplifier:6,ShowParticles:0b},{Id:5,Duration:18000,Amplifier:6,ShowParticles:0b}],Attributes:[{Name:%generic.max_health%,Base:255F}]}";
            utilFunctions.sendCommandTrasn(single);
        }
    }
}
