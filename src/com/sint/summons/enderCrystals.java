package com.sint.summons;

import org.bukkit.Bukkit;

public class enderCrystals {
    utilFunctions utilFunctions = new utilFunctions();

    public void allCrystals() {
        String listaCords[] = { "-12 100 39", "-33 83 24", "-41 97 0", "-33 79 -24", "-12 94 -39", "12 89 -39",
                "33 92 -24", "42 77 0", "33 104 24", "12 86 39" };

        for (int i = 0; i < 10; i++) {
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(),
                    "execute in minecraft:the_end run summon end_crystal " + listaCords[i]);
        }
    }
}
