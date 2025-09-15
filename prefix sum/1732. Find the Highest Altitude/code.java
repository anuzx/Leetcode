class Solution {
    public int largestAltitude(int[] gain) {
        int currAltitude =0;
        int maxAltitude =0;
        for(int g: gain){
            currAltitude +=g;
            maxAltitude = Math.max(currAltitude , maxAltitude);
        }
        return maxAltitude;
    }
}
