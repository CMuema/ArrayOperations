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
public class ParallelSort {
    public static void main(String[] args){int[] largeArray = {5,2,8,1,3,4,5,6,5,
        6,67,8,9,1,23,45,54,65,77,87,34,56,89,100
    };
    Arrays.parallelSort(largeArray);
        System.out.println(Arrays.toString(largeArray));
}
};
