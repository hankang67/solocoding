class Solution {
    public long solution(int price, int money, int count) {
         // 등차수열의 합 공식을 사용하여 총 비용 계산
        long totalCost = (long) price * count * (count + 1) / 2;

        // 가지고 있는 금액에서 총 비용을 뺀다
        long shortage = totalCost - money;

        // 부족한 금액이 0보다 작으면 0을 반환, 그렇지 않으면 부족한 금액을 반환
        return shortage > 0 ? shortage : 0;
    

    }
}