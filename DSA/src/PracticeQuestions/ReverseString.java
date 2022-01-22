package PracticeQuestions;

public class ReverseString {

    boolean Reverse(String s){
        String st="";
        char[] ch= s.toCharArray();

        for (int i=ch.length-1; i>=0;i--){
            st=st+ch[i];
            }
        System.out.println(st);
        if (st.equals(s)){
        System.out.println("true");
        return true;
        }
        else{
        System.out.println("false");
        return false;
        }
    }
    public static void main(String[] args){
        String s="1234321";
        ReverseString rs=new ReverseString();
        rs.Reverse(s);
    }
}
