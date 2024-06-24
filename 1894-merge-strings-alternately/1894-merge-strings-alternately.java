class Solution {
   public String mergeAlternately(String word1, String word2) {
    String newString = "";
    String longerWord;
    String shorterWord;
    int counter = 0;
    for (int i = 0; i < word1.length() && i < word2.length(); i++) {
        newString += word1.charAt(i);
        newString += word2.charAt(i);
        counter++;


    }
    if (word1.length() != word2.length()) {
        if (word1.length() > word2.length()) {
            longerWord = word1;
            shorterWord = word2;
        } else {
            longerWord = word2;
            shorterWord = word1;
        }
        for (int i = counter; i < longerWord.length(); i++) {
                newString += longerWord.charAt(i);
            }

    }
    return newString;
}

}

