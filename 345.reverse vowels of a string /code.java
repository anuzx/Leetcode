class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] word = s.toCharArray();
        String vowels = "aeiouAEIOU";

        while (start < end) {
            while (start <= end && vowels.indexOf(word[start]) == -1) {
                start++;
            }
            while (start <= end && vowels.indexOf(word[end]) == -1) {
                end--;
            }
            // Swap vowels
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;

            start++;
            end--;
        }

        return new String(word);
    }
}
