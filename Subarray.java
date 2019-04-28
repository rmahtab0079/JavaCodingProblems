package byte50;

//Subarray wrapper class
public class Subarray {
 private int[] underlying;
 private int start;
 private int size;
     
 // Get a new subarray that is backed by the input array
 public static Subarray fromArray(int[] arr) {
     Subarray s = new Subarray();
     s.underlying = arr;
     s.start = 0;
     s.size = arr.length;
     return s;
 }
     
 // Return the subarray from i to j, including i and excluding j
 public Subarray subarray(int i, int j) {
     if (i > j) throw new IllegalArgumentException();
     if (j > this.size) throw new IndexOutOfBoundsException();
     Subarray s = new Subarray();
     s.underlying = this.underlying;
     s.start = start + i;
     s.size = j - i;
     return s;
 }
     
 // Get the size of the subarray
 public int getSize() {
     return size;
 }
     
 // Get the first element of the subarray
 public int getFirst() {
     return underlying[start];
 }
     
 // Get the last element of the subarray
 public int getLast() {
     return underlying[start + size - 1];
 }
     
 // Get the median of the subarray
 public double getMedian() {
     // If it is even length, average the middle elements
     if (size % 2 == 0) 
         return (underlying[start + size / 2 - 1] + 
                 underlying[start + size / 2]) / 2.;
     return underlying[start + size / 2];
 }
}
