class Program1{
    public static void main(String[] args){
     int[] arr={1,2,3,4,5};
      //int[] arr={1,2,3,4,5};
     int n=arr.length;
     int sum=0;
     int[] newarr=new int[n];
     int index=0;
     for (int  i=0; i<n; i++){
         sum+=arr[i];
     }
     for(int i=0; i<n; i++){
        sum-=arr[i];
        newarr[index++]=sum;
     }
     for(int i=0; i<n; i++){
        System.out.print(newarr[i]+" ");
     }

    }
}
//14 12 9 5 0