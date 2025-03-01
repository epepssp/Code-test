package lv1;

public class 자릿수더하기 {

    /*
     * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요. 
     * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
     */
    
    
    public int solution(int n) {
        int answer = 0;
        
        while (n > 0) {
            answer += n % 10; // 10으로 나눈 나머지 더하기 -> 정수 n의 마지막 자리 숫자 더하기 
            n /= 10; // 정수 n을 10으로 나눈 몫만 다시 정수 n값에 저장 -> 정수 n의 마지막 자리 숫자 제거
        }
        
        return answer;
    }
}
