/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset;

import java.util.HashMap;

/**
 *
 * @author Daniel Viktor Isaac
 */
public  class PeliTehdas {

    HashMap<String, Pelattava> mappi;

    public PeliTehdas() {
        mappi = new HashMap<String, Pelattava>();
        mappi.put("a", new KPSPelaajaVsPelaaja());
        mappi.put("b", new KPSTekoaly());
        mappi.put("c", new KPSParempiTekoaly());
    }

    public  Pelattava valitsePeli(String k) {
        if (mappi.containsKey(k)) {

            return mappi.get(k);
        }
        
        return null;
    }
}
