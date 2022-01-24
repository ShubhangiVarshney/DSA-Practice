public class BinarySearchAlgo {
    public boolean BinarySearch(int n, int[] arr){
        int length=arr.length;
        int left=0, right=length-1;
        while(left<right) {
            int middleIndex = ((left + right) / 2) +1;
            int number = arr[middleIndex];
            if(number==n)
                return true;
            else if(n<number){
                right=middleIndex-1;
                System.out.println("right="+right);}
                else {
                 left=middleIndex+1;
                System.out.println("left="+left);}

            }
        return false;
    }

    public static void main (String[] args){
        int[] array={1,23,45,67,78,79,84,89,101,156,187,276,333,390,401,455,491,506,528,735,936};
        int n=528;
        BinarySearchAlgo bs=new BinarySearchAlgo();
        boolean ans=bs.BinarySearch(n,array);
        System.out.println(ans);

    }



}
