package com.sint.plugin;

import com.sint.summons.DarmekVerde;
import com.sint.summons.EnderOnik;
import com.sint.summons.bolitasFuego;
import com.sint.summons.creeper;
import com.sint.summons.enderCrystals;
import com.sint.summons.finalizar;
import com.sint.summons.perroInfernal;
import com.sint.summons.robinElJut;
import com.sint.summons.zombieKenshyn;
import com.sint.summons.ositos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    EnderOnik EnderOnik = new EnderOnik();
    DarmekVerde DarmekVerde = new DarmekVerde();
    perroInfernal perroInfernal = new perroInfernal();
    robinElJut robinElJut = new robinElJut();
    zombieKenshyn zombieKenshyn = new zombieKenshyn();
    ositos ositos = new ositos();
    creeper creeper = new creeper();
    enderCrystals enderCrystals = new enderCrystals();
    bolitasFuego bolitasFuego = new bolitasFuego();
    finalizar finalizar = new finalizar();

    @Override
    public void onEnable() {
        System.out.println("[EVENTO] Cargado");
    }

    @Override
    public void onDisable() {
        System.out.println("[EVENTO] Desabilitado");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (command.getName().equalsIgnoreCase("start-event")) {
                System.out.println("[EVENTO] Iniciando..");
                EnderOnik.singleEnderOnick(20);
                DarmekVerde.singleDarmekVerde(5);
                perroInfernal.singlePerroInfernal(30);
                robinElJut.singleRobinElJut(40);
                zombieKenshyn.singleZombieKenshyn(20);
                ositos.singleOsito(10);
                creeper.singleCreeper(10);
            } else if (command.getName().equalsIgnoreCase("event-spawn")) {
                if (args.length < 2) {
                    player.sendMessage("Faltan argumentos");
                } else if (args.length < 1) {
                    player.sendMessage("Falta cantidad");
                } else {
                    if (args[0].equalsIgnoreCase("enderonik")) {
                        EnderOnik.singleEnderOnick(Integer.parseInt(args[1]));
                    } else if (args[0].equalsIgnoreCase("darmekverde")) {
                        DarmekVerde.singleDarmekVerde(Integer.parseInt(args[1]));
                    } else if (args[0].equalsIgnoreCase("perroinfernal")) {
                        perroInfernal.singlePerroInfernal(Integer.parseInt(args[1]));
                    } else if (args[0].equalsIgnoreCase("robinelJut")) {
                        robinElJut.singleRobinElJut(Integer.parseInt(args[1]));
                    } else if (args[0].equalsIgnoreCase("zombiekenshyn")) {
                        zombieKenshyn.singleZombieKenshyn(Integer.parseInt(args[1]));
                    } else if (args[0].equalsIgnoreCase("creeper")) {
                        creeper.singleCreeper(Integer.parseInt(args[1]));
                    }
                }
            } else if (command.getName().equalsIgnoreCase("endcrystals")) {
                enderCrystals.allCrystals();
            } else if (command.getName().equalsIgnoreCase("bolitas")) {
                if (args.length < 1) {
                    player.sendMessage("Cuantas?");
                    return false;
                }
                bolitasFuego.bolitas(Integer.parseInt(args[0]));
            } else if (command.getName().equalsIgnoreCase("finevent")) {
                if (args.length < 1) {
                    player.sendMessage("Cuantos?");
                    return false;
                }
                finalizar.fuegos(Integer.parseInt(args[0]));
            }
        }
        return false;
    }
}
