public class Program2 {
    public static void main(String[] args){
        int[] arr={3,-3,5,0,-6};
        int n=arr.length;
        int[] newarr=new int[n];
       int sum=arr[0];
       int index=1;
       newarr[0]=arr[0];
       for(int i=1; i<n; i++){
        sum=sum+arr[i];
        newarr[index++]=sum;
       }
       for(int i=0; i<n; i++){
        System.out.print(newarr[i]+" ");
       }
    }
}
//3 0 5 5 -1
