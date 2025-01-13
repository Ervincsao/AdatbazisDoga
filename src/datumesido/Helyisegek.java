package datumesido;

import java.util.List;
import java.util.ArrayList;

/**
 *
 
@author Fülöp Ervin*/
public class Helyisegek {

    List<Helyiseg> sorok;

    public Helyisegek() {
        sorok = new ArrayList<Helyiseg>();
    }


    public void felveszHelyisegeket() {
        String[] megnevezesek = new String[]{
            "Iroda",
            "Hűtőház",
            "Üzem",
            "Titkárság",
            "Porta"
        };


        for (int db = 1; db <= 5; db++) {
            Helyiseg helyiseg = new Helyiseg();
            helyiseg.az = (byte) db;
            helyiseg.megnevezes = megnevezesek[(int) Math.floor(Math.random() * megnevezesek.length)];
            helyiseg.szelesseg = (short) (Math.floor(Math.random() * 290 + 3) * 100);
            helyiseg.magassag = (short) (Math.floor(Math.random() * 290 + 3) * 100);
            helyiseg.melyseg = (short) (Math.floor(Math.random() * 290 + 3) * 100); 

            sorok.add(helyiseg);
        }
    }

    public void kiirHelyisegek() {
        for (Helyiseg h : sorok) {
            System.out.println("Azonosító: " + h.az + ", Helyíség: " + h.megnevezes +
                               ", Szélesség: " + h.szelesseg + " cm, Magasság: " + h.magassag +
                               " cm, Mélység: " + h.melyseg + " cm");
        }
    }
}