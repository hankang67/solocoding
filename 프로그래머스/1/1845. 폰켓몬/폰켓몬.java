import java.util.*;

class Solution {
    public int solution(int[] nums) {
        //중복제외 있는 포켓몬 수
        int[] newArr = Arrays.stream(nums).distinct().toArray();
        int len = newArr.length;
        int len2 = nums.length/2;
        
        if (len2>len){
            return len;
        } else {
            return len2;
        }
        

    }
}