package PracticeQuestions;

public class Q125ValidPalindrome {
    public boolean isPalindrome(String s) {
        String reverse="";
        String lowerS = s.toLowerCase();
        String word=removeCharacters(lowerS);

        if (word.isEmpty())
            return true;
        else {
            reverse= reverseWord(word);
        }

        if (word.equals(reverse))
            return true;
        else
            return false;

    }


    public static String removeCharacters(String lowerS){
        String word = "";
            for (int i = 0; i < lowerS.length(); i++) {
                char wordCharacter = lowerS.charAt(i);
                byte wordByte = (byte) lowerS.charAt(i);
                int wordInteger = (int) wordByte;
                if ((wordInteger > 47 && wordInteger < 58) || (wordInteger > 64 && wordInteger < 91) || (wordInteger > 96 && wordInteger < 123)) {
                    word = word + wordCharacter;
                }
            }
          return word;
        }

        public static String reverseWord(String word){
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            return reverseWord;
        }

    public static void main(String[] args){
        String s="race a car";
        Q125ValidPalindrome vp=new Q125ValidPalindrome();
        boolean res=vp.isPalindrome(s);
        System.out.println(res);
    }
}
