package lab;
import java.util.Scanner;


//25. 다음 조건을 만족하는 복권 발행 프로그램을 작성하세요. (Lotto)
//
//        가. 사용자로부터 복권 숫자 3자리를 입력 받으세요 (yourkey)
//        나. 변수에 임의의 복권 숫자 3자리를 초기화합니다 (lottokey)
//        다. 사용자가 입력한 복권 숫자가 모두 일치 : 상금 1백만 지급
//        라. 일치하지 않는 경우 : “아쉽지만, 다음 기회를!” 라고 출력
//
public class Q26_Lotto {

    public static void main(String[] args) {

        // 변수 설정
        int yourkey[] = new int [3];
        int lottokey[] = new int [3];
        int i=0;
        int j=0;

        //번호 입력받기
        Scanner sc = new Scanner(System.in);

        for ( i = 0; i < 3; ++i) {
            System.out.println((i + 1) + "번째 숫자를 입력하세요 : ");
            yourkey[i] = sc.nextInt();

            if ( yourkey[i]<1 || yourkey[i] >45 ){
                System.out.println("번호는 1이상 45 이하입니다.\n");
                System.out.println((i + 1) + "번째 숫자를 입력하세요 : ");
                yourkey[i] = sc.nextInt();
            }

        sc.skip("\r\n|[\n\r]");

        } //for문/ 번호 입력을 받는 프린트문


        //로또 번호 생성
        for ( i = 0; i < 3; ++i) {
            lottokey[i] = (int)(Math.random()*45)+1;

            System.out.println(lottokey[i]);
        }


    } //main


} //class
