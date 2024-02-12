import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        int length = nums.length;
        HashMap<Integer, Integer> majorMap = new HashMap<>();

        for(int num : nums){
            majorMap.put(num, majorMap.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : majorMap.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(value > length/2){  
                return key;
            }
        }
        throw new IllegalArgumentException("No majority element found");
    }
}

    