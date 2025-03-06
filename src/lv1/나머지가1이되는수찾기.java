package lv1;

public class 나머지가1이되는수찾기 {

    /*
     * 자연수 n이 매개변수로 주어집니다. 
     * n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요. 
     * 답이 항상 존재함은 증명될 수 있습니다.
     */
    
    class Solution {
        public int solution(int n) {
            
            int answer = 2; // 1을 넣어도 되지만, 어차피 최소 x는 2부터 만족하므로 2부터 시작 가능
            
            while (n % answer != 1) {
                
                answer++; //정수n 을 answer로 나눈 나머지가 1이 아닐 경우, answer 값을 1 증가시켜 다시 루프 돌리기 위함
            }
            
            return answer;
        }
    }
}
