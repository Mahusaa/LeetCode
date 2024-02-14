class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        ArrayList<Integer> mix = new ArrayList<>();

        for(int num: nums) {
            if(num > 0) {
                positive.add(num);
            } else if(num < 0) {
                negative.add(num);
            }
        }

        int positiveIndex = 0;
        int negativeIndex = 0;

        while(positiveIndex < positive.size() || negativeIndex < negative.size()) {
            if(positiveIndex < positive.size()) {
                mix.add(positive.get(positiveIndex++));
            }
            if(negativeIndex < negative.size()) {
                mix.add(negative.get(negativeIndex++));
            }
        }

        int[] myArray = mix.stream().mapToInt(Integer::intValue).toArray();
        return myArray; 
    }
}

