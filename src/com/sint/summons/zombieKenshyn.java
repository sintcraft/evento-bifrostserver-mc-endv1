package com.sint.summons;

public class zombieKenshyn {
    utilFunctions utilFunctions = new utilFunctions();

    public void singleZombieKenshyn(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            int[] cords = utilFunctions.singleCords();
            String single = "execute in minecraft:the_end run summon minecraft:zombie " + cords[0] + " 70 " + cords[1]
                    + " {Health:10,CanPickUpLoot:1b,ActiveEffects:[{Id:1,Duration:9999,Amplifier:10,ShowParticles:0b}],HandItems:[{id:netherite_sword,Count:1}],ArmorItems:[{id:netherite_boots,Count:1},{id:netherite_leggings,Count:1},{id:netherite_chestplate,Count:1},{id:netherite_helmet,Count:1}],Attributes:[{Name:%generic.armor%,Base:200f},{Name:%generic.attack_damage%,Base:5f},{Name:%generic.max_health%,Base:10F}],HandDropChances:[0F],ArmorDropChances:[0F,0F,0F,0F]}";
            utilFunctions.sendCommandTrasn(single);
        }
    }
}
