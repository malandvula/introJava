
// Java code to show the implementation of 
// addAll method in list interface 
import java.util.*; 
public class GfG { 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        // Initializing a list of type arraylist 
        List<Integer> l = new ArrayList<>(); 
        l.add(10); 
        l.add(15); 
        l.add(20); 
        System.out.println(l); 
  
        // Initializing a collection to be appended to list 
        ArrayList<Integer> arr = new ArrayList<Integer>(); 
        arr.add(100); 
        arr.add(200); 
        arr.add(300); 
        System.out.println(arr); 
  
        l.addAll(arr); 
  
        System.out.println(l); 
    } 
} 
