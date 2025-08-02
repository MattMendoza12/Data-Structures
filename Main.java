import java.util.*;
    class Main {
       public static void main(String[] args) {
         String[] names = {"jm", "pm", "dm", "rm", "ym", "em", "hm", "jm", "mm", "sm"};
         
         for(int i = 0; i < names.length; i++) {
         System.out.println(names[i]);
         }
         
         int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
         int sum = 0;
         
         for(int i = 0; i < arr.length; i++) {
             sum += arr [i];
         }
             System.out.println(sum);
        
         
            
        }
    }