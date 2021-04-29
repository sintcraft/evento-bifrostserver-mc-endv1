package com.sint.summons;

public class EnderOnik {
    utilFunctions utilFunctions = new utilFunctions();

    public void singleEnderOnick(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            int[] cords = utilFunctions.singleCords();
            String single = "execute in minecraft:the_end run summon minecraft:zombie " + cords[0] + " 70 " + cords[1]
                    + " {CustomName:'[{%text%:%[%, %color%:%#ffffff%},{%text%:%Ender Onick%, %color%:%#ffff00%},{%text%:%]%, %color%:%#ffffff%}]',CustomNameVisible:1,FallFlying:1,ArmorItems:[{tag:{display:{Name:'{%text%:%a%}'},Enchantments:[{id:protection,lvl:4}]},id:%minecraft:diamond_boots%,Count:1},{tag:{display:{Name:'{%text%:%a%}'},Enchantments:[{id:protection,lvl:4}]},id:%minecraft:diamond_leggings%,Count:1},{id:%minecraft:elytra%,Count:1},{id:%minecraft:dragon_head%,Count:1}],CanPickUpLoot:0b,Health:255,Attributes:[{Name:%generic.maxHealth%,Base:255},{Name:%generic.movementSpeed%,Base:0.8f}],HandItems:[{id:%minecraft:netherite_sword%,tag:{display:{Name:'{%text%:%a%}'},Enchantments:[{id:sharpness,lvl:5}]},Count:1},{}],HandDropChances:[0.01F,0F]}";
            utilFunctions.sendCommandTrasn(single);
        }
    }
}
