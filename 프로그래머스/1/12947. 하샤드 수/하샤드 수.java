class Solution {
    public boolean solution(int x) {
        int sum = 0;
        
        String s = Integer.toString(x);
        
            //자릿수의 합
        for (int i = 0; i < s.length(); i++ ){
            sum += s.charAt(i) - '0';
        }
            
        if(x % sum == 0) {
            return true;
        }else {
            return false;
        }
        
    }
}