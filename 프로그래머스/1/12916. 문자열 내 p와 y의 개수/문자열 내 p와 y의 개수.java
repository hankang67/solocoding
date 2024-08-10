class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
       
        String A = s.toUpperCase();
        
        for ( int i = 0 ; i <A.length() ; i++){
            char B = A.charAt(i);
            
            if (B == 'P'){
                 pCount++;
            } else if (B == 'Y'){
                 yCount++;
            } else {
                continue;
            }
        }
        
        if (pCount == 0 && yCount ==0){
            return true;
        } else {
            return pCount == yCount;
        }
}
}