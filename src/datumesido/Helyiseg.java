/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datumesido;

/**
 *
 * @author Tanar
 */
public class Helyiseg {
    //a Helyisegek egyed egy előfordulása
    //int az; //amennyiben akár több milliárd helyiségről lehet szó
    //short az; //amennyiben nincs több, mint 32000 helyiségünk
    byte az; //ha legfeljebb 100 körüli helyiségünk van
    String megnevezes;
    short szelesseg; //cm-ben adjuk meg így az előbbiek szerint 320
    short magassag; //méteres lehet a legnagyobb érték
    short melyseg;
}
