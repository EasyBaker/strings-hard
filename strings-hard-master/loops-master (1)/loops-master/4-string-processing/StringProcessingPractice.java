/*
 * APCS-A - Strings and Loops
 *
 * This program is to give you practice writing methods that use for loops. Each
 * problem requires logic similar to what may be required on AP Exam FRQs.  
 *
 * Choose any 5 of the 7 problems to complete. Doing more will not result in 
 * extra credit. Each problem will be graded on a 1-4 scale. Strive for simple
 * solutions and do not do anything more than meet problem specifications. You 
 * will receive a one point deduction for extraneous code that has an effect 
 * (for example, prints something.) Overly complex, working code or code with 
 * logic masked by non-descriptive variable names may also receive a one point
 * deduction. 
 * 
 * 
 * 1. The function testGrader works by comparing two strings, answers and key. 
 *    answers will be a string of letters and possibly ? characters which represent 
 *    unanswered questions. key is the corresponding string of correct answers. 
 *    Grades are calculated by awarding 1 point for correct answers, no points for 
 *    unanswered questions, and deducting 0.25 points for incorrect answers. For 
 *    example, the answer sheet with DA?BCA graded against the key DBCBCA would be
 *    given a score of 3.75.
 *    
 *          public __________ testGrader(String answers, String key) { }
 *  
 *  
 * 2. The function letterSwapper takes a string str as input and returning a new 
 *    string with each pair of letters swapped. In the case of an odd number of 
 *    characters in the string, the last character is simply appended to the end. 
 *    For example passing a string of loops would return a string of olpos. 
 *      
 *          public __________ letterSwapper(String str) { }
 *      
 *      
 * 3. The function caseComparer returns true if the input string contains the same 
 *    number of lowercase letters as it does uppercase and false otherwise. The 
 *    string may contain non-alphabetic characters. (Uppercase letters have ASCII 
 *    values in the range 65 to 90 and lowercase letters values in the range 
 *    97 to 122.)
 *    
 *          public __________ caseComparer(String str) { }
 *      
 *      
 *  4. A charFilter takes a string str and returns a new string which contains only 
 *     the characters in str that also appear in allowed. For example, a call of 
 *     charFilter(“computers”, “osmgur”) would return omr.
 *      
 *          public __________ charFilter(String str, String allowed) { }
 *     
 *     
 * 5. A trimmedRepeater takes a string str and returns a new string which contains
 *    the the whole string, followed by all characters except the first, all characters
 *    except the second, and so on. For example, a call of charRepeater(“apple”) would 
 *    return appleppleplelee.
 *    
 *          public __________ trimmedRepeater(String str) { }
 *     
 *     
 * 6. A patternCounter takes a string str and returns a count of the number of times 
 *    pattern occurs in the string. For example, a call of charRepeater(“yyyyaddyycyyy”, “yyy”)
 *    would return 3.
 *    
 *          public __________ patternCounter(String str, String pattern) { }
 *          
 *          
 * 7. A starChecker takes a string str and returns true if for each occurrence of a * character, 
 *    the characters on either side of the star are the same and false otherwise. If a * happens
 *    to be at the end of the string, then it should return false.
 *    
 *          public __________ starChecker(String str) { }
 *
 *
 *  ------------------------------------------------------------------------------
 *
 * @author  your name 
 * @version date
 */
 
 public class StringProcessingPractice
 {
    public static double testGrader(String answers, String key) {
        int i = 0;
        double score = 0;
        int length = key.length();
        
        while (i < length) {
            String answer = answers.substring(i, i+1);
            String kanswer = key.substring(i, i+1);
            
            if (answer.equals("?")) {
                score = score;
            } else if (answer.equals(kanswer)) {
                score += 1;
            } else {
                score -= .25;
            }
            i++;
        }
        return score;
    }
    
    public static String letterSwapper(String str) {
        int i = 0;
        int length = str.length();
        int stuff = 0;
        String result = " ";
        if (length % 2 == 0) {
            stuff = length;
        } else {
            stuff = length - 1;
        }
        
        while (i<stuff) {
            String first = str.substring(i, i+1);
            String second = str.substring(i+1,i+2);
            result = result + second + first;
            i+=2;
        }
        
        if (length % 2 != 0) {
            result = result + str.substring(length-1, length);
        }
        return result;
    }
    
    public static boolean caseComparer(String str) {
        int i = 0;
        int uppercase = 0;
        int lowercase = 0;
        int length = str.length();
        
        while (i < length) {
            char character = str.charAt(i);
            int ascii = (int) character;
            
            if (ascii >= 65 && ascii <= 90) {
                uppercase++;
            } else if (ascii >= 97 && ascii <= 122) {
                lowercase++;
            }
            i++;
        }
        return (uppercase == lowercase);
    }
    
    public static String charFilter(String str, String allowed) {
        int i = 0;
        String result = " ";
        int length = str.length();
        
        while (i<length) {
            String character = str.substring(i, i+1);
            if (allowed.contains(character)) {
                result += character;
            }
            i++;
        }
        return result;
    }
    
    public static String trimmedRepeated(String str) {
        int i = 0;
        String result = " ";
        int length = str.length();
        
        while (i<length) {
            String portion = str.substring(i);
            result += portion;
            
            i++;
        }
        return result;
    }
    
    public static int patternCounter(String str, String pattern) {
        int i = 0;
        int count = 0;
        int patternlength = pattern.length();
        int length = str.length()-patternlength;
        
        while (i<length+1) {
            if (str.substring(i, i+patternlength).equals(pattern)) {
                count++;
            }
            i++;
        }
        return count;
    }
    
    public static boolean starChecker(String str) {
        int i = 0;
        boolean checked = false;
        int length = str.length();
        
        while (i<length-1) {
            if (str.substring(i, i+1).equals("*")) {
                if (str.substring(i-1,i).equals(str.substring(i+1,i+2))) {
                    checked = true;
                } else {
                    checked = false;
                }
            }
            i++;
        }
        if (str.substring(length-1, length).equals("*")) {
            checked = false;
        }
        return checked;
    }
    
    public static void main(String[] args)
    {
        testGrader("BAD?CB", "BCDABB");
        letterSwapper("noodles");
        caseComparer("aBcDef'[]DH");
        charFilter("abcdef", "acdf");
        trimmedRepeated("apple");
        patternCounter("aaaaddccaaa", "aa");
        starChecker("a*ab*b*c*c");
    }
 }
 
