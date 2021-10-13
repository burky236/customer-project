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
public class Quiz4 {

    public static void main(String[] args) {
        
        Stack<Object> stack = new Stack<>();//object olusturuldu
        
        //5 tane Customer yaratildi
        Customer musteri1 = new Customer("34", "Ozlem Tufekci");
        Customer musteri2 = new Customer("35", "Burak Kacmaz");
        Customer musteri3 = new Customer("25", "Zeki Kaynarca");
        Customer musteri4 = new Customer("58", "Emre Ulubas");
        Customer musteri5 = new Customer("19", "Tugba Ozcan");
        
        //Yaratilan Customer nesneleri stack'e eklendi
        stack.push(musteri1);
        stack.push(musteri2);
        stack.push(musteri3);
        stack.push(musteri4);
        stack.push(musteri5);
        
        //Stack'in ici bosalana kadaar yazdirilma islemi yapildi
        while (!stack.isEmpty()) {
            Object s = stack.pop();
            System.out.println(s);
        }

    }

}
