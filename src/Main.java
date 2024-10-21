// Lab 3 - Brute-Force String Matching Algorithm
// Your Name: Manbir S Kheira 

public class Main {
    public static void main(String[] args) {
      // The string we searching through
      String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
      
      // Best-case scenario
      String bestCase = "A";  // best-case pattern: just one character that matches first one
      long startTimeBest = System.nanoTime();  // * Initialize startTime here
      int index = match(text, bestCase);
      long endTimeBest = System.nanoTime();  // * Initialize endTime here
      long elapsedTimeBest = endTimeBest - startTimeBest;  // * Calculate elapsedTime here
  
      if (index >= 0)
        System.out.println("Best-case input matched at index " + index);
      else
        System.out.println("Best-case input unmatched");   
      System.out.println("Best-case elapsed time: " + elapsedTimeBest + " nanoseconds");
  
      // Worst-case scenario
      String worstCase = "9";  // worst-case pattern, matches at the end of text
      long startTimeWorst = System.nanoTime();  // * Initialize startTime here
      index = match(text, worstCase);
      long endTimeWorst = System.nanoTime();  // * Initialize endTime here
      long elapsedTimeWorst = endTimeWorst - startTimeWorst;  // * Calculate elapsedTime here
  
      if (index >= 0)
        System.out.println("Worst-case input matched at index " + index);
      else
        System.out.println("Worst-case input unmatched");  
      System.out.println("Worst-case elapsed time: " + elapsedTimeWorst + " nanoseconds");
    }
  
    // Return the index of first match, or -1 if no match.
    public static int match(String text, String pattern) {
      for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
        if (isMatched(i, text, pattern))
          return i;  
      }
  
      return -1;  
    }
    
    // Test if pattern matches starting at index i
    private static boolean isMatched(int i, String text, String pattern) {
      for (int k = 0; k < pattern.length(); k++) {
        if (pattern.charAt(k) != text.charAt(i + k)) {
          return false; 
        }
      }
      return true; 
    }
}
