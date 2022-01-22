public class StringManipulate {

    boolean startsWith(String actualString, String initialString) {
        char[] charArrayOfActualString = actualString.toCharArray();
        char[] charArrayOfInitialString = initialString.toCharArray();
        int lengthOfInitialString = initialString.length();
        int lengthOfActualString = actualString.length();
        System.out.println("Length  of initial string is: " + lengthOfInitialString);
        System.out.println("Length  of actual string is: " + lengthOfActualString);
        if (lengthOfActualString == 0) {
            if (lengthOfActualString == lengthOfInitialString) {
                System.out.println("Both the strings are empty");
                return true;
            } else
                return false;
        }
        if (lengthOfInitialString != 0 && lengthOfInitialString <= lengthOfActualString) {
            for (int i = 0; i < lengthOfInitialString; i++) {
                if (charArrayOfActualString[i] != charArrayOfInitialString[i])
                    return false;
            }
            return true;
        } else
            return false;
    }

    void replaceString() {
        String s1 = "Java is a programming language. Java is a platform. Java is an Island.";
        String replaceString = s1.replace("Java", "Kava");//replaces all occurrences of "Java" to "Kava"
        System.out.println(replaceString);
    }

    public static void main(String[] args) {
        StringManipulate stringManipulate = new StringManipulate();
        String gg = "abcdef";
        boolean r = stringManipulate.startsWith("abcdef", "a");
        System.out.println(r);
        stringManipulate.replaceString();


    }
}
