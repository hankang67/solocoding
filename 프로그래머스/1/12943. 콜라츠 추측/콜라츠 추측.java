class Solution {
    public int solution(int num) {
        
        
        if  (num == 1){
            return 0;
        }
        
        int result = 0;

        while (num != 1 && result < 400) {
            
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }

            result++;
        }

        return (num == 1) ? result : -1;
    }
        
    
}