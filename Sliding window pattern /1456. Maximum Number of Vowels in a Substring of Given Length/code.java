class Solution {
    public int maxVowels(String s, int k) {
        int currVowels = 0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))) {currVowels++;}
        }
        int maxVowels = currVowels ;
        for(int i=k ; i<s.length() ; i++){
            if(isVowel(s.charAt(i))) currVowels ++;
            if(isVowel(s.charAt(i-k))) currVowels--;
            maxVowels = Math.max(currVowels , maxVowels);}
        return maxVowels;
    }
    boolean isVowel(char v){
        if(v=='a' || v== 'e' || v=='i' || v=='o' || v=='u') return true ;
        return false;
    }
}
