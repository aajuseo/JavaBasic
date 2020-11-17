package aajuseo;

/**
 *  파일명 : SungJukV2
 *  작성일 : 2020.11.17
 *
 *  프로그램 설명 : 성적 처리 프로그램v2
 *  이름, 국어, 영어, 수학점수를 키보드로 입력받아
 *  총점, 평균, 학점을 계산하고 결과 출력
 *
 *  단, 평균은 소수점 첫째 자리까지 출력하고
 *  학점 기준은 '수우미양가'로 하되
 *  switch문으로 학점을 계산하도록 함
 *  만점은 100점, 100~90, 89~80
 *  79~70, 69~60, 59~0 기준으로 학점부여
 *
 *  name, kor, eng, mat, sum, mean, grd
 *

 */

public class SungJukV2 {
    public static void main(String[] args) {
        //변수선언
        String name = "나연";
        System.out.print("입력하세요.");
        Scanner scanner = new Scanner(System.in);
        num=scanner.nextInt();


        int kor = 99;
        int eng = 98;
        int mat = 99;
        int sum = 0;
        double mean = 0.0;
        char grd;

        //처리
        sum = kor + eng + mat;
        //mean = (kor + eng + mat)/3;
        mean = (double) sum/3;

        switch(mean) {
            case mean>=90 : grd = '수';
                break;
            case mean>=80 : grd = '우';
                break;
            case mean>=70 : grd = '미';
                break;
            case mean>=60 : grd = '양';
                break;
            default:
                            grd = '가';
        }

        System.out.println("이름 :" + name );
        System.out.println("국어 :" + kor );
        System.out.println("영어 :" + eng );
        System.out.println("수학 :" + mat );
        System.out.println("------------");
        System.out.println("총점 :" + sum );
        System.out.println("평균 :" + mean );
        System.out.println("학점 :" + grd );



    }
}
