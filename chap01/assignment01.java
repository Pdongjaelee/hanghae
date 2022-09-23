public class assignment01 {

    public static void main(String[] args) {
    int var1=5;  //실수 var1을 선언하고 5를 저장
    double var2=2;  //변수 var2을 선언하고 2를 저장    -----------계산을 소수점까지 하기위해서는 (double)/(int)로 해야한다.
    double var3=var1/var2; //실수(double)를 저장할 수 있는 변수 var3=var1-var2 선언
    int var4=(int)(var3*var2); //변수 var4을 선언하고 2를 저장
System.out.println(var4);  //println(var4) 메소드 호출
 }
}
