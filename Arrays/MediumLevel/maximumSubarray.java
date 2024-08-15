package Arrays.MediumLevel;
// Kadane algorithm 
public class maximumSubarray {
  public static void main(String[] args) {
    int arr[] = { -2, -3, 4, -1, -2, 1, 5, 3 };
    int sum = 0 ;
    int maxsum = arr[0];

    for(int i=0;i<arr.length;i++){
      if(sum<0){sum=0;}
      sum=sum+arr[i];
      maxsum=Math.max(sum,maxsum);
    }
    System.out.println(maxsum);
    
  }
}
