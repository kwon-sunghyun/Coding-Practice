package Test;

//정수 num1과 num2가 매개변수로 주어집니다.
// 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
public class Solution3 {
    public static void main(String[] args) {
        int answer = 0;
        int num1 = 11;
        int num2 = 11;
        if(num1 == num2) {
            answer = 1;
        }else {
            answer = -1;
        }
        System.out.println(answer);
    }
}
