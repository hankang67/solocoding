class Solution {
    public int[] solution(int n, int m) {
        int gcdValue = gcd(n, m);  // 최대공약수 계산
        int lcmValue = (n * m) / gcdValue;  // 최소공배수 계산
        return new int[]{gcdValue, lcmValue};  // 배열로 반환
    }

    // gcd 메서드를 클래스 내에 별도로 정의
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;  // 재귀 종료 조건: b가 0이면 a가 최대공약수
        }
        return gcd(b, a % b);  // 재귀 호출: b와 a % b로 gcd를 계산
    }
}
