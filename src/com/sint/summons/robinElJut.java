package com.sint.summons;

public class robinElJut {
    utilFunctions utilFunctions = new utilFunctions();

    public void singleRobinElJut(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            int[] cords = utilFunctions.singleCords();
            String single = "execute in minecraft:the_end run summon skeleton " + cords[0] + " 70 " + cords[1]
                    + " {HandItems:[{Count:1,id:bow,tag:{Enchantments:[{id:unbreaking,lvl:10},{id:power,lvl:15},{id:punch,lvl:3}]}},{}],ArmorItems:[{Count:1,id:netherite_boots,tag:{display:{Name:%Pigi%},Enchantments:[{id:protection,lvl:10},{id:feather_falling,lvl:10},{id:thorns,lvl:5},{id:unbreaking,lvl:10}]}},{Count:1,id:netherite_leggings,tag:{display:{Name:%PigiLeg%},Enchantments:[{id:protection,lvl:10},{id:thorns,lvl:5},{id:unbreaking,lvl:10}]}},{Count:1,id:netherite_chestplate,tag:{display:{Name:%PigiBody%},Enchantments:[{id:protection,lvl:10},{id:thorns,lvl:5},{id:unbreaking,lvl:10}]}},{Count:1,id:netherite_helmet,tag:{display:{Name:%PigiHead%},Enchantments:[{id:protection,lvl:10},{id:thorns,lvl:5},{id:unbreaking,lvl:10}]}}],CustomName:%robin el jut%,ArmorDropChances:[0.0001f,0.00001f,0.000001f,0.00001f]}";
            utilFunctions.sendCommandTrasn(single);
        }
    }
}
