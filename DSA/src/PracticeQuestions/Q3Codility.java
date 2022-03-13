package PracticeQuestions;

// plate digits= max 6 min=2 consist alphanumeric
// O & 0  can be same
// same number or character not together

public class Q3Codility {
    public boolean[] solution(String[] plates) {
        // write your code in Java 11
        if (plates == null)
            return null;
        boolean[] res = new boolean[plates.length];
        for (int i = 0; i < plates.length; i++) {
            String plate = plates[i];
            boolean isValid = true;
            if (plate == null)
                isValid = false;
            else if (plate.length() == 6) {
                int numberCount = 0;
                char prevChar = ' ';
                for (int j = 0; j < plate.length(); j++) {
                    char c = plate.charAt(j);
                    if ((c >= 48 && c <= 57) || (c >= 65 && c <= 90)) {
                        if (c >= 48 && c <= 57) {
                            numberCount++;
                        }
                    } else
                        isValid = false;

                    if (c == prevChar) {
                        isValid = false;
                    }
                    if (c == '0' || c == 'o' || c == 'O') {
                        isValid = false;
                    }
                    prevChar = c;
                }
                isValid = isValid && numberCount >= 2;
            } else {
                isValid = false;
            }
            res[i] = isValid;

        }
        return res;
    }
}
