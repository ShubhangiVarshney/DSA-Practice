package PracticeQuestions;
// Q14- Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string ""
public class Q4 {
    public String longestCommonPrefix(String[] arr) {
        String ans="";
        char c;
        String s1=arr[0];
        for (int i=0; i< s1.length();i++){
            c= s1.charAt(i);
            for(int j=1;j<arr.length; j++){
                if (arr[j].length()>i) {
                    if (arr[j].charAt(i) != c)
                        return ans;
                }
                else
                    return ans;
                }
            ans+=c;
            }
        return ans;
        }

        public static void main(String[] args){
        String[] arr={"dog","racecar","car"};
        Q4 obj3=new Q4();
        String st=obj3.longestCommonPrefix(arr);
        System.out.println(st);

        }
    }

