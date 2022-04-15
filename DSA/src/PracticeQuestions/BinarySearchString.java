package PracticeQuestions;



public class BinarySearchString {

        public boolean binarySearch(String n, String[] arr){
            int length=arr.length;
            int left=0, right=length-1;
            while(left<=right) {
                int middleIndex = ((left + right) / 2) ;
                String name = arr[middleIndex];
                int compare=n.compareTo(name);
                if(compare==0)
                    return true;
                else if(compare<=-1){
                    right=middleIndex-1;
                    System.out.println("right="+right);
                }
                else {
                    left=middleIndex+1;
                    System.out.println("left="+left);
                }
            }
            return false;
        }

        public static void main (String[] args){
            String[] array={"Aakash","Reema","Sanjay","Shivam","Shivani", "Shubham", "Shubhangi","Siddharth"};
            String n="Mary";
            BinarySearchString bss=new BinarySearchString();
            boolean ans=bss.binarySearch(n,array);
            System.out.println(ans);

        }



    }

