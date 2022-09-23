public class assignment03 {
    public static void main(String[] args) {
        while (true) {      //밑의 조건식이 true 경우 계속 반복
            int a = (int) (Math.random() * 6) + 1; //실수 a는 6안에서 뽑아내는 랜덤함수에 정수화 선언, 0부터 시작이니 +1
            int b = (int) (Math.random() * 6) + 1; //실수 b는 6안에서 뽑아내는 랜덤함수에 정수화 선언, 0부터 시작이니 +1
            System.out.println("(" + a + "," + b + ")");  //(a,b)형태로 출력
            if ((a + b) == 5) {
                break;         //a + b 값이 5면 반복 멈춤
            }
        }
    }
}