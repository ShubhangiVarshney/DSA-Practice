package PracticeQuestions;

public class Q58LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int len = s.length();
        int l=len-1;

        for (int i =l; i >= 0; i--) {

            if (s.charAt(i) != ' ')
               count++;
            if (i > 0 && count!=0) {
                if (s.charAt(i - 1) == ' ')
                    return count;

            } else if(i==0)
                return count;

            if(s.isEmpty())
                return 0;
        }
        return count;
    }



    public static void main (String[] args){
        String s="luffy is still joyboy";
        Q58LengthOfLastWord obj4=new Q58LengthOfLastWord();
        int count=obj4.lengthOfLastWord(s);
        System.out.println(count);

    }
}
