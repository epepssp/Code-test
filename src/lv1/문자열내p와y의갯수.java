package lv1;

public class 문자열내p와y의갯수 {

    /*
     * 문제 설명
     * 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. 
     * s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 
     * 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 
     * 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
     * 
     * 문자열 s의 길이 : 50 이하의 자연수,
     * 문자열 s는 알파벳으로만 이루어져 있습니다.
     * 
     */
    
     boolean solution(String s) {
      
        // s.chars(): 문자열의 문자 하나하나를 int 값(유니코드)으로 변환하여 반환하는 IntStream
        // count(): long 타입을 반환하는 함수. 
        // 형 변환: 개수를 비교하기 위해서 long 타입 리턴값을 int 타입으로 변환한다.
         
        int pCount = (int) s.chars().filter(c -> c == 'p' || c == 'P').count();
        int yCount = (int) s.chars().filter(c -> c == 'y' || c == 'Y').count();

        
        
       boolean answer = true; 
       
    
       // p와 y의 개수가 같으면: 초기화(true) 되어있는 상태 그대로 리턴
       
       // p와 y의 개수가 다르면: 변수에 false 저장. 변수값 변경 후 리턴    
  
       
       if ( pCount != yCount ) {  // 개수가 다르면
            
           answer = false;  // 변수값에 false 저장.
           
        } 
        
       
       
        
        return answer;
    }
}
