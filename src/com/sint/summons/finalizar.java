package com.sint.summons;

public class finalizar {
    utilFunctions utilFunctions = new utilFunctions();

    public void fuegos(int cantidad) {

        for (int i = 0; i < cantidad; i++) {
            int[] cords = utilFunctions.singleCords();
            String single = "execute in minecraft:the_end run summon firework_rocket " + cords[0] + " 90 " + cords[1]
                    + " {LifeTime:1,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Flight:1,Explosions:[{Type:1,Flicker:1,Trail:1,Colors:[I;3887386,2651799,14188952,4312372,14602026,6719955,12801229,15435844,15790320],FadeColors:[I;3887386,2651799,14188952,4312372,14602026,6719955,12801229,15435844,15790320]},{Type:1,Flicker:0,Trail:0,Colors:[I;3887386,2651799,14188952,4312372,14602026,6719955,12801229,15435844,15790320],FadeColors:[I;3887386,2651799,14188952,4312372,14602026,6719955,12801229,15435844,15790320]}]}}}}";
            utilFunctions.sendCommandTrasn(single);
        }
    }
}
