public class assignment02 {

    public static void main(String[] args) {
        int x = 10;     //변수 x을 선언하고 10을 저장
        int y = 20;     //변수 y을 선언하고 20을 저장
        int z = (++x) + (y--);      //변수 z를 선언하고 (x값을 1증가하고 연산) + (연산을 하고 y값을 1감소)
        System.out.println(z);      //println(z) 메소드 호출  ---x는 1 증가된 값(11) + y는 기존값 (20) = 31


    }
}



