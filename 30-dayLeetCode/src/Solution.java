import java.util.*;

public class Solution {
    public int []unlucky(int []arr, int unluckyValue){
        ArrayList<Integer> nums = new ArrayList<>();

        for (int num: arr)
            nums.add(num);

        for (int i = 0; i < nums.size(); i++) {
            for (int j = i; j <nums.size(); j++) {
                if (nums.get(i)+nums.get(j)== unluckyValue)
                    if (nums.get(i)<nums.get(j))
                        nums.remove(nums.get(i));
                    else nums.remove(nums.get(j));
            }
        }
        int[] newArr = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++)
            newArr[i] = nums.get(i);

        return newArr;
    }

    /**
     * week 1 problem 1 single number
     *
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            var count = map.containsKey(nums[i]) ? map.get(nums[i]) : 0;
            map.put(nums[i], count + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i])==1)
                return nums[i];
        }

        return Integer.MIN_VALUE;
    }

    /**
     * week 1 problem 2 isHappy
     * @param n
     * @return
     */
    public  boolean isHappy(int n) {
        Set<Integer> numbers = new HashSet<Integer>();

        while (numbers.add(n)) {
            int squareSum = 0;
            while (n > 0) {
                squareSum += Math.pow(n % 10, 2);
                n /= 10;
            }
            n = squareSum;
        }

        return n == 1? true : false;
    }

    /**
     * week 1 problem 3 maxSubArray
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, sum = 0;

        for (int num : nums) {
            sum += num;

            if (sum > maxSum)
                maxSum = sum;

            if (sum < 0)
                sum = 0;
        }

        return maxSum;
    }

    /**
     * week 1 problem 4 moveZeroes
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        
        int index = 0;
        for(int i = 0; i < nums.length ; i++)
            if(nums[i]!=0)
                nums[index++] = nums[i];
        
        while(index < nums.length)
            nums[index++]=0;
    }

    /**
     * week 1 problem 5 Best Time To Buy and Sell Socks
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++)
            if(prices[i] > prices[i - 1])
                maxProfit += prices[i] - prices[i - 1];
        
        return maxProfit;
    }

    /**
     * week 1 problem 6 groupAnagrams
     * @param strs
     * @return
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groups = new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String sortedStr = sortString(strs[i]);
            if (map.containsKey(sortedStr))
                map.get(sortedStr).add(strs[i]);
            else {
                List<String> newWord = new ArrayList<>();
                newWord.add(strs[i]);
                map.put(sortedStr, newWord);
            }
        }

        groups.addAll(map.values());
        return groups;
    }

    /**
     * week 1 problem 7 countElements
     * @param arr
     * @return
     */
    public int countElements(int[] arr) {
        HashMap<Integer, Integer> elements = new HashMap();

        for (int element : arr){
            var count = elements.containsKey(element) ? elements.get(element) : 0;
            elements.put(element, count + 1);
    }
        int count = 0;
        for (int element : elements.keySet()) {
            if (elements.containsKey(element + 1))
                count += elements.get(element);
        }

        return count;
    }


    /**
     * private methods
     */
    private String sortString(String str){
        char []letters = str.toCharArray();
        Arrays.sort(letters);

        return new String(letters);
    }
}
