class Solution {
   public String mergeAlternately(String word1, String word2) {
    String newString = "";
    int counter = 0;
    for (int i = 0; i < word1.length() && i < word2.length(); i++) {
        newString += word1.charAt(i);
        newString += word2.charAt(i);
        counter++;


    }
    if (word1.length() != word2.length()) {
        if (word1.length() > word2.length()) {
            // counter = word1.length() - counter;
            for (int i = counter; i < word1.length(); i++) {
                newString += word1.charAt(i);
            }
        } else {
            // counter = word2.length() - counter;
            for (int i = counter; i < word2.length(); i++) {
                newString += word2.charAt(i);
            }
        }

    }
    return newString;
}

}

