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

/**************************************************************************
 **********************    WEEk 1      ************************************
 *************************************************************************/

    /**
     * week 1 problem 1 single number
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

    /**************************************************************************
     **********************    WEEk 2      ************************************
     *************************************************************************/

    /**
     * week 2 problem 1  Middle of the Linked List
     * @param //head
     * @return
     */
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode middleNode(ListNode head) {
        var first = head;
        var second = head;
        while (second != null && second.next != null){
            first = first.next;
            second = second.next.next;
        }

        return first;
    }

    /**
     * week 2 problem 2  backspace Compare
     * @param S
     * @param T
     * @return
     */
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> str1 = new Stack<>();
        Stack<Character> str2 = new Stack<>();

        for (char ch : S.toCharArray()) {
            if (ch == '#' && !str1.isEmpty())
                str1.pop();
            else if (ch == '#' && str1.isEmpty())
                continue;
            else str1.push(ch);
        }

        for (char ch : T.toCharArray()) {
            if (ch == '#' && !str2.isEmpty())
                str2.pop();
            else if (ch == '#' && str2.isEmpty())
                continue;
            else str2.push(ch);
        }

        System.out.println(str1+" "+str2);
        if(str1.size() != str2.size())
            return false;

        while (str1.size()!=0 && str2.size() !=0)
            if (str1.pop() != str2.pop())
                return false;

        return true;
    }

    /**
     * week 2 problem 3  Min Stack
     */
    public class MinStack {

    Stack<Integer> stack, minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        
        if (minStack.empty())
            minStack.push(x);
        else if (x <= minStack.peek())
            minStack.push(x);
    }

    public void pop() {
          if (stack.isEmpty())
            throw new IllegalStateException();
        
        int top = stack.pop();
        if (!minStack.empty() && minStack.peek() == top) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}   

    /**
     * week 2 problem 4 diameter Of BinaryTree
     * @param //root
     * @return
     */
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    private int count;
    public int diameterOfBinaryTree(TreeNode root) {
       count = 0;
       depth(root);
        
       return count ; 
    }

    /**
     * week 2 problem 5 Last Stone Weight
     * @param stones
     * @return
     */
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priorityStones = new PriorityQueue<>(
                                                    Comparator.reverseOrder());
        for (int stone : stones)
            priorityStones.add(stone);

        while (priorityStones.size() > 1){
            int first = priorityStones.remove();
            int second = priorityStones.remove();
            if (first != second)
                priorityStones.add(first-second);
        }
        return priorityStones.size() == 1 ? priorityStones.remove() : 0;
    }

    /**
     * week 2 problem 6 Find Max Length
     * @param nums
     * @return
     */
    public int findMaxLength(int[] nums) {
        if (nums.length <= 1)
            return 0;

        HashMap<Integer, Integer> cacheMap = new HashMap<>();
        cacheMap.put(0, -1);

        int max = 0, i = 0, count = 0;
        for (int num : nums) {
            count = num == 1 ? count+1 : count-1;

            if (cacheMap.containsKey(count))
                max = Math.max(max, i - cacheMap.get(count));
            else
                cacheMap.put(count, i);

            i++;
        }

        return max;
    }

    /**
     * week 2 problem 7 Perform String Shifts
     * @param s
     * @param shift
     * @return
     */
    public String stringShift(String s, int[][] shift) {
        String newStr = "";
        for (var item : shift) {
            if (item[0]==0)
                s = leftRotate(s, item[1]);
            else
                s = rightRotate(s, item[1]);
        }

        return s;
    }

    /**************************************************************************
     **********************    WEEk 3      ************************************
     *************************************************************************/

    /**
     * week 3 problem 1 Product of Array Except Self
     * @param nums
     * @return
     */
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        result[nums.length-1]=1;
        for(int i=nums.length-2; i>=0; i--){
            result[i]=result[i+1]*nums[i+1];
        }

        int left=1;
        for(int i=0; i<nums.length; i++){
            result[i]=result[i]*left;
            left = left*nums[i];
        }

        return result;
    }

    /**
     * week 3 problem 2 check Valid String
     * @param s
     * @return
     */
    private final List<Character> leftBrackets = Arrays.asList('(');
    private final List<Character> rightBrackets = Arrays.asList(')');
    public boolean checkValidString(String s) {
        int maxLeft = 0, minLeft = 0;
        for(char ch: s.toCharArray()){
            if(isLeftBracket(ch)) minLeft++; else minLeft--;
            if(!isRightBracket(ch)) maxLeft++; else maxLeft--;

            if(maxLeft < 0) return false;

            minLeft = Math.max(0, minLeft);
        }

        return minLeft == 0 ? true : false;
    }

    /**
     * ************************ I Didn't solve it *************************
     * week 3 problem 3 Number of Islands
     * @param grid
     * @return
     */
    public int numIslands(char[][] grid) {

        return 0;
    }

    /**
     * week 3 problem 4 Min Path Sum
     * @param grid
     * @return
     */
    public int minPathSum(int[][] grid) {
        if (grid.length == 0) return 0;

        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 1; i < rows; i++) {
            grid[i][0] += grid[i-1][0];
        }

        for (int j = 1; j < cols; j++) {
            grid[0][j] += grid[0][j-1];
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }

        return grid[rows-1][cols-1];
    }

    /**
     * week 3 problem 5 Search in Rotated Sorted Array
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
    	return binarySearch(nums, 0, nums.length-1, target);
    }

    /**
     * ************************ I Didn't solve it *************************
     * week 3 problem 6 Construct Binary Search Tree from Preorder Traversal
     * @param preorder
     * @return
    */
    public TreeNode bstFromPreorder(int[] preorder) {
        return null;
    }

    /**
     * week 3 problem 7 Leftmost Column with at Least a One
     * @param //binaryMatrix
     * @return
     */
     // This is the BinaryMatrix's API interface.
     // You should not implement it, or speculate about its implementation
     interface BinaryMatrix {
    	public int get(int x, int y);
    	public List<Integer> dimensions();
     };
     public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> dimensions = binaryMatrix.dimensions();
        int rows = dimensions.get(0), cols = dimensions.get(1);

        if (rows == 0 || cols == 0)
            return -1;

        int res = -1, r = 0, c = cols - 1;
        while (cols >= 0 && rows > r){
            if (binaryMatrix.get(r, c) == 1){
                res = c;
                c--;
            }else
                r++;
        }

        return res;
    }
 
    /**************************************************************************
    **********************    private methods      ***************************
    *************************************************************************/

    private String sortString(String str){
        char []letters = str.toCharArray();
        Arrays.sort(letters);

        return new String(letters);
    }

    private int depth(TreeNode root) {
       if (root == null)
         return 0;

       if (isLeaf(root))
         return 1; 
        
       int left = depth(root.left);
       int right = depth(root.right);
       count = Math.max(count, left + right);
       return 1 + Math.max(left, right);
    }

    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    private String leftRotate(String str, int d) {
        String ans = str.substring(d) + str.substring(0, d);
        return ans;
    }

    private String rightRotate(String str, int d) {
        return leftRotate(str, str.length() - d);
    }

    private boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
    }

    private boolean isLeftBracket(char ch){
        return leftBrackets.contains(ch);
    }

    private boolean isBracketsMatch(char left, char right){
        return leftBrackets.contains(left) && rightBrackets.contains(right);
    }

    private int binarySearch(int[] nums, int left, int right, int target){
        if(left>right) 
            return -1;
 
        int mid = left + (right-left)/2;
 
        if(target == nums[mid])
            return mid;
 
        if(nums[left] <= nums[mid]){
            if(nums[left]<=target && target<nums[mid])
                return binarySearch(nums,left, mid-1, target);
            else
                return  binarySearch(nums, mid+1, right, target);
                
            }else {
                if(nums[mid]<target&& target<=nums[right])
                    return  binarySearch(nums,mid+1, right, target);
                else
                    return  binarySearch(nums, left, mid-1, target);
        }
    }
}
