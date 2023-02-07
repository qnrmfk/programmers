package programmers;

import java.util.Arrays;

public class _120833 {

    public static void main(String[] args) {
        _120833 obj = new _120833();
        int[] answer1 = obj.solution(new int[]{1,2,3,4,5}, 1, 3);
        int[] answer2 = obj.solution(new int[]{1,3,5}, 1, 2);
        System.out.println(answer1);
        System.out.println(Arrays.toString(answer2));

    }

    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        for(int i = 0; i < num2-num1+1; i++){
            answer[i] = numbers[num1+i];
        }
        return answer;
        
        //참고풀이
        /* return Arrays.copyOfRange(numbers, num1, num2 + 1); */
    }
}
