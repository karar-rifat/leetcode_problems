// Runtime 0 ms Beats 100%
// Memory 42.6 MB Beats 21.78%

class Solution_58{

    // start from last of string. if space found before finding any character loop should continue.
    // if space found after finding a char then surely a word is found
    // program does work if there is no space meaning only one word is in the string
    // solved without using any string built-in methods
    public int lengthOfLastWord(String s) {
        char[] sentence = s.toCharArray();
        int endPoint = sentence.length-1;
        int counter = 0;
        boolean shouldContinue = true;

        while(endPoint>=0){
            if(sentence[endPoint]==' '){
                if(!shouldContinue){
                    return counter;
                }
            }else {
                shouldContinue = false;
                counter++;
            }
            endPoint--;
        }
        return counter;
    }

    public static void main(String[] args){
        Solution_58 s = new Solution_58();
        System.out.println(
                s.lengthOfLastWord("   fly me   to   the moon  ")
        );
    }
}