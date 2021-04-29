package com.sint.summons;

import java.util.Random;

import org.bukkit.Bukkit;

public class utilFunctions {
    public int[] singleCords() {
        Random rand = new Random();
        int x = rand.nextInt(61) - 30;
        int z = rand.nextInt(61) - 30;
        int[] y = { x, z };
        return y;
    }

    public void sendCommand(String cmd) {
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), cmd);
    }

    public void sendCommandTrasn(String cmdRaw) {
        for (int i = 0; i < cmdRaw.length(); i++) {
            cmdRaw = cmdRaw.replace('%', '"');
        }
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), cmdRaw);
    }
}
