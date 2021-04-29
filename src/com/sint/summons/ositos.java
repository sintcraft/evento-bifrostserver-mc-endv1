package com.sint.summons;

public class ositos {
    utilFunctions utilFunctions = new utilFunctions();

    public void singleOsito(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            int[] cords = utilFunctions.singleCords();
            String single = "execute in minecraft:the_end run summon minecraft:ravager " + cords[0] + " 70 " + cords[1]
                    + " {CustomName:'[{%text%:%Osito%,%bold%:true,%color%:%gray%},{%text%:%C%,%color%:%red%},{%text%:%a%,%color%:%red%},{%text%:%r%,%color%:%yellow%},{%text%:%i%,%color%:%dark_green%},{%text%:%ñ%,%color%:%green%},{%text%:%o%,%color%:%aqua%},{%text%:%s%,%color%:%dark_aqua%},{%text%:%i%,%color%:%dark_blue%},{%text%:%t%,%color%:%dark_purple%},{%text%:%o%,%color%:%dark_purple%}]',Health:80,Attributes:[{Name:%generic.attack_speed%,Base:10f},{Name:%generic.attack_damage%,Base:10f},{Name:%generic.max_health%,Base:80F}]}";
            utilFunctions.sendCommandTrasn(single);
        }
    }
}
