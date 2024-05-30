/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa171674;

/**
 *
 * @author muema
 */
public class CopyingArrays {
  public static void main(String[] args){
      String[] copyFrom = {
          "Affogato","Americano","Cappuccino","Corretto","Coritado","Doppio","Espresso","Frappucino",
          "Freddo","Lungo","Macchiato","Marocchino","Ristretto"
      };
      String[] copyTo=new String[7];
      System.arraycopy(copyFrom, 3, copyTo, 0, 7);
      for (String coffee : copyTo){
          System.out.println(coffee + "");
      }
  }  
}
