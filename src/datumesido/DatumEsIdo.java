package datumesido;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 
@author Fülöp Ervin*/
public class DatumEsIdo {

    public static void main(String[] args) {

        LocalDate ma = LocalDate.now();
        LocalTime most = LocalTime.now();

        long soknap = (long) Math.pow(2, 31);
        ma = ma.plusDays(soknap);
        System.out.println(ma + " " + most);

        Helyisegek tabla1 = new Helyisegek();
        tabla1.felveszHelyisegeket();

        tabla1.kiirHelyisegek();
    }
}