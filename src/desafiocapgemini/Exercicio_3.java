package desafiocapgemini;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

class Exercicio_3{
 public static void main(String[] args) {
	 
	 Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("digite uma palavra: ");
		String palavra = sc.nextLine();
     System.out.println(sherlockAndAnagrams(palavra)); 
 }

 static int sherlockAndAnagrams(String s) {

 	HashMap<String, Integer> map = new HashMap<>();
     int totalCount = 0;

     // Generate all substrings (N^2)
     for(int i = 0 ; i < s.length(); i++){
         for(int j=i+1 ; j <= s.length(); j++){
             
         	String currentSubString = s.substring(i,j);

             // Sort all strings
             char[] chars = currentSubString.toCharArray();
             Arrays.sort(chars);
             currentSubString = String.valueOf(chars);
             
             // If sorted substring has been seen before
             if(map.containsKey(currentSubString)) {
                 // Check how many times we've seen it and add that amount to the count
             	int value = map.getOrDefault(currentSubString, 0);
                 totalCount += value;
                 map.merge(currentSubString, 1, Integer::sum);
             } else {
                 // Never seen it before = insert and set to 1 to indicate we've now seen it
                 map.put(currentSubString, 1);
             }
         }
     }
     return totalCount;
 }
}
