/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa171674;
import java.util.Arrays;
/**
 *
 * @author muema
 */
public class SortingArrays {
    public static void main(String[] args){
        int[] myArray = {5,2,8,3,1,6,4};
        Arrays.sort(myArray);
        System.out.println("Sorted array: ");
        for (int i:myArray){
            System.out.println(i + "");
        }
    }
}
