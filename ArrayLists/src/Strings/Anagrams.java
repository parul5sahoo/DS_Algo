
package Strings;
import java.util.*;
public class Anagrams {
    public static void main(String[] args){
        String a = "aab#123";
        String b = "ab#123a^";
        boolean isAnagram = true;
        /*boolean visited[] = new boolean[b.length()];
        if(a.length() == b.length()){
            for(int i=0; i<a.length(); i++){
              char c = a.charAt(i);
           
               for(int j=0; j<b.length(); j++){
                  if(b.charAt(j) == c && !visited[j]){
                      visited[j] = true;
                      isAnagram = true;
                      break;
                    
                    }
                }
               if(!isAnagram){
                  break;
                }
            
           }
        }
        */
        /*
            
        int al[] = new int[256];
        int bl[] = new int[256];
        
        for(char c: a.toCharArray()){
            int index = (int) c;
            al[index]++;
        }
        for(char c: b.toCharArray()){
            int index = (int) c;
            bl[index]++;
        }
         for(int i=0; i<256; i++){
             if(al[i] != bl[i]){
                 isAnagram = false;
             }
         }*/
             
        int al[] = new int[256];
        
        
        for(char c: a.toCharArray()){
            int index = (int) c;
            al[index]++;
        }
        for(char c: b.toCharArray()){
            int index = (int) c;
            al[index]--;
        }
         for(int i=0; i<256; i++){
             if(al[i] != 0){
                 isAnagram = false;
             }
         }
         
        
        if(isAnagram){
            System.out.println("is Anagram");
          }else{
            System.out.println("is not Anagram");
        }
    }
}
