class Solution {
    public String firstPalindrome(String[] words) {
        for(String word : words){
                int length = word.length() - 1;
                if(length + 1 == 1){
                        return word;
                }
                char[] wordArray  = word.toCharArray();
                for(int i = 0, j = length; i < j; i++, j--){
                        char temp = wordArray[i];
                        wordArray[i] = wordArray[j];
                        wordArray[j] = temp;
                }
                String reverse = new String(wordArray);
                if(word.equals(reverse)){
                        return word;
                }
        }
        return "";
    }
}