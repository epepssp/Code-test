package lv1;

public class 두정수사이의합 {

    /*
     * 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요. 
     * 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
     */
    
    class Solution {
        public long solution(int a, int b) {
            long answer = 0;
            
            int start = Math.min(a, b);   // 자바에서 기본으로 제공하는 Math 클래스 이용 -> 둘 중에 작은 정수를 리턴
            int end = Math.max(a, b);   // 자바에서 기본으로 제공하는 Math 클래스 이용 -> 둘 중에 큰 정수를 리턴
            
            for (int i = start; i <= end; i++) {
                answer += i;
            }
            
            return answer;
        }
    }
}
