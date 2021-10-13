/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz4;

/**
 *
 * @author Burak Kacmaz
 */
public class Customer {
    
    //tanimlanmasi istenen ID ve adSoyad Stringleri
    private String ID;
    private String adSoyad;

    public Customer(String theID, String theadSoyad) {//Constructor
        ID = theID;
        adSoyad = theadSoyad;
    }

    /**
     * @return the ID
     */
    public String getID() {//ID icin get
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {//ID icin set
        this.ID = ID;
    }

    /**
     * @return the adSoyad
     */
    public String getAdSoyad() {//Adsoyad icin get
        return adSoyad;
    }

    /**
     * @param adSoyad the adSoyad to set
     */
    public void setAdSoyad(String adSoyad) {//Adsoyad icin set
        this.adSoyad = adSoyad;
    }

    @Override
    public String toString() {//Çıktıların yazdırılmasını duzenlemek icin
        return ("ID: " + ID + " Ad Soyad: " + adSoyad);
    }
}
