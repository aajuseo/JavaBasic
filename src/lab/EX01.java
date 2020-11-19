package lab;

import javax.security.auth.Subject;

public class EX01 {
    public static void main (String[] args) {
        //학생 클래스를 이용해서 객체 생성
        Student kim = new Student();
        Student song = new Student();
        Student jeon = new Student();
        Student bae = new Student();
        Student lee = new Student();

        kim.num = 201350050;
        kim.name = "김태희";
        kim.add = "경기도고양시";
        kim.birth = "1985.3.22";
        kim.major = "컴퓨터";
        kim.professor = 504;

        song.num = 201250006;
        song.name = "송혜교";
        song.add = "서울영등포구";
        song.birth = "1988.9.17";
        song.major = "컴퓨터";
        song.professor = 301;

        jeon.num = 201252110;
        jeon.name = "전지현";
        jeon.add = "경기도의정부시";
        jeon.birth = "1986.4.30";
        jeon.major = "의상디자인";
        jeon.professor = 445;

        bae.num = 201351010;
        bae.name = "수  지";
        bae.add = "서울 성북구";
        bae.birth = "1988.7.13";
        bae.major = "식품영양";
        bae.professor = 556;

        lee.num = 201353011;
        lee.name = "아이유";
        lee.add = "경기도천안시";
        lee.birth = "1987.2.25";
        lee.major = "철학";
        lee.professor = 504;

        Major compute = new Major();
        Major clothDesign = new Major();
        Major foodNutrition = new Major();
        Major philosophy = new Major();

        compute.majorName = "컴퓨터공학";
        compute.elevenNum = "123-4567-8901";
        compute.officeAdd = "E동 2층";
        compute.dean = 504;

        clothDesign.majorName = "의상디자인";
        clothDesign.elevenNum = "234-5678-9012";
        clothDesign.officeAdd = "A동 1층";
        clothDesign.dean = 301;

        foodNutrition.majorName = "식품영양";
        foodNutrition.elevenNum = "345-6789-0123";
        foodNutrition.officeAdd = "F동 8층";
        foodNutrition.dean = 556;

        philosophy.majorName = "철학";
        philosophy.elevenNum = "456-7890-1234";
        philosophy.officeAdd = "Z동 25층";
        philosophy.dean = 504;

        Lesson programing = new Lesson();
        Lesson dressCode= new Lesson();
        Lesson living = new Lesson();
        Lesson devil = new Lesson();

        //학과 클래스를 이용해서 객체 생성
        //과목 클래스를 이용해서 객체 생성
        //교수 클래스를 이용해서 객체 생성

        //각 객체의 변수에 값 대입

        //객체에 저장된 값 출력
    }
}

