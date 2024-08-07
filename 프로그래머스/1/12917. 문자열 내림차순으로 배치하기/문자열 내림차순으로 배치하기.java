import java.util.*;


class Solution {
    public String solution(String s) {
        //문자열을 문자 배열로 변환하기
        
        Character[] charArray = new Character[s.length()];
        
        for (int i=0;i<s.length();i++){
            charArray[i] = s.charAt(i);
        }
        
        //내림차순 정렬
        Arrays.sort(charArray, Collections.reverseOrder());
        
        //정렬된 문자 배열을 다시 문자열로 변환
        StringBuilder sortedString = new StringBuilder(charArray.length);
        for (char c : charArray) {
            sortedString.append(c);
        }
        
        return sortedString.toString();
    }
}