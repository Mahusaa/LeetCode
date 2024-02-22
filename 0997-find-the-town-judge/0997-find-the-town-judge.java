class Solution {
    public int findJudge(int n, int[][] trust) {
            if(n == 1){
                    return 1;
            }
		int maxKey = 0;
		int maxFreq = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int[] peopleWithLabel : trust){
			map.put(peopleWithLabel[1],map.getOrDefault(peopleWithLabel[1],0) + 1);
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int key = entry.getKey();
			int freq = entry.getValue();

			if (freq > maxFreq) {
			maxKey = key;
			maxFreq = freq;
			}
		}
		if(maxFreq < n - 1){
			return -1;
		}
		for(int[] pWB : trust){
			if(maxKey == pWB[0]){
				return -1;
			}
		}
		return maxKey;

    }
}