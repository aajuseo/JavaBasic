package aajuseo;

import java.util.Scanner;

/**
 *  파일명 : SungJukV3
 *  작성일 : 2020.11.17
 *
 *  프로그램 설명 : 성적 처리 프로그램 v3
 *  학생 3명의 성적 데이터를 키보드로 입력받아
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
 * 단, 성적 처리 결과 출력시 출력문을 하나만 사용
 *
 */

public class SungJukV3 {
    public static void main(String[] args) {
        //변수선언
        String name;
        int kor ;
        int eng ;
        int mat ;
        int sum ;
        double mean ;
        char grd ;
        int num = 0;
        String fmt =
                "이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n합계 : %d\n평균 : %,.1f\n학점 : %c";
        String result;

//처리
        Scanner sc = new Scanner(System.in);

            System.out.println(num + "번째 학생 성적 입력중...");
            System.out.print("이름을 입력하세요 : ");
            name = sc.nextLine();
            System.out.print("국어 점수를 입력하세요 : ");
            kor = sc.nextInt();
            System.out.print("영어 점수를 입력하세요 : ");
            eng = sc.nextInt();
            System.out.print("수학 점수를 입력하세요 : ");
            mat = sc.nextInt();

        sum = kor + eng + mat;
        mean = (double) sum/3;

        switch((int)(mean/10)) {
            case 10:
            case 9 : grd = '수'; break;
            case 8 : grd = '우'; break;
            case 7 : grd = '미'; break;
            case 6 : grd = '양'; break;
            default : grd = '가';

        }

            System.out.printf(fmt,
                    name, kor, eng, mat, sum, mean, grd);

        System.out.println(num + "번째 학생 성적 입력중...");
        System.out.print("이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.print("국어 점수를 입력하세요 : ");
        kor = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        eng = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        mat = sc.nextInt();

        sum = kor + eng + mat;
        mean = (double) sum/3;

        switch((int)(mean/10)) {
            case 10:
            case 9 : grd = '수'; break;
            case 8 : grd = '우'; break;
            case 7 : grd = '미'; break;
            case 6 : grd = '양'; break;
            default : grd = '가';

        }

        System.out.printf(fmt,
                name, kor, eng, mat, sum, mean, grd);

        System.out.println(num + "번째 학생 성적 입력중...");
        System.out.print("이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.print("국어 점수를 입력하세요 : ");
        kor = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        eng = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        mat = sc.nextInt();

        sum = kor + eng + mat;
        mean = (double) sum/3;

        switch((int)(mean/10)) {
            case 10:
            case 9 : grd = '수'; break;
            case 8 : grd = '우'; break;
            case 7 : grd = '미'; break;
            case 6 : grd = '양'; break;
            default : grd = '가';

        }

        System.out.printf(fmt,
                name, kor, eng, mat, sum, mean, grd);

    }



    }
}
