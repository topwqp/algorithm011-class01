import java.util.List;
class Solution {
    public List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        if(nums.length == 0){
            return result;
        }
        allPermutation(nums,new LinkedList<Integer>());
        return result;
    }
    //这里就是我们回溯的框架
    public void allPermutation(int[] nums, LinkedList<Integer> trace){
        //结束条件：组合的深度等于所以元素的数量
        if(trace.size() == nums.length){
            result.add(new LinkedList(trace));
            return ;
        }
        //在选择列表中选出
        for(int i = 0; i<nums.length; i++){
            //进行剪枝操作，如果当前元素已经在组合当中了，那么我们就跳过这步
            if(trace.contains(nums[i])){
                continue;
            }
            //做出当前选择
            trace.add(nums[i]);
            allPermutation(nums,trace);
            //撤销当前选择
            trace.removeLast();
        }
    }

}