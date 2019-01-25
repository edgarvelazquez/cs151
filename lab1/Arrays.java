public class Arrays
{
   public static void swapLargestAndSmallest(int[] a)
   {
      int smallest=a[0];
      int largest=a[0];
      int smallestPosition=0;
      int largestPosition=0;
      for(int i=1; i< a.length;i++){
         if(smallest<a[i]){
            smallest=a[i];
            smallestPosition=i;
         }
         if(largest>a[i]){
            largest=a[i];
            largestPosition=i;
         }
      }
      a[smallestPosition]=largest;
      a[largestPosition]=smallest;
      
      
   }
}