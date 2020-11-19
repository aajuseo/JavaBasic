package lab;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class EX01 {
    public static void main (String[] args) {
        //학생 클래스를 이용해서 객체 생성
        Student kim = new Student();
        Student song = new Student();
        Student jeon = new Student();
        Student bae = new Student();
        Student lee = new Student();


        //학과 클래스를 이용해서 객체 생성
        Department compute = new Department();
        Department clothDesign = new Department();
        Department foodNutrition = new Department();
        Department philosophy = new Department();


        //과목 클래스를 이용해서 객체 생성
        Subject subj = new Subject();

        //교수 클래스를 이용해서 객체 생성
        Professor prof = new Professor();

        //기본 생성자를 이용해 값 출력

        //각 객체의 변수에 값 대입
        //학생
        kim.stdno = 201350050;
        kim.name = "김태희";
        kim.add = "경기도고양시";
        kim.birth = "1985.3.22";
        kim.dept = "컴퓨터";
        kim.prof = 504;

        song.stdno = 201250006;
        song.name = "송혜교";
        song.add = "서울영등포구";
        song.birth = "1988.9.17";
        song.dept = "컴퓨터";
        song.prof = 301;

        jeon.stdno = 201252110;
        jeon.name = "전지현";
        jeon.add = "경기도의정부시";
        jeon.birth = "1986.4.30";
        jeon.dept = "의상디자인";
        jeon.prof = 445;

        bae.stdno = 201351010;
        bae.name = "수  지";
        bae.add = "서울 성북구";
        bae.birth = "1988.7.13";
        bae.dept = "식품영양";
        bae.prof = 556;

        lee.stdno = 201353011;
        lee.name = "아이유";
        lee.add = "경기도천안시";
        lee.birth = "1987.2.25";
        lee.dept = "철학";
        lee.prof = 504;

        //학과
        compute.dname = "컴퓨터공학";
        compute.phone = "123-4567-8901";
        compute.office = "E동 2층";
        compute.chief = "504";

        clothDesign.dname = "의상디자인";
        clothDesign.phone = "234-5678-9012";
        clothDesign.office = "A동 1층";
        clothDesign.chief = "301";

        foodNutrition.dname = "식품영양";
        foodNutrition.phone = "345-6789-0123";
        foodNutrition.office = "F동 8층";
        foodNutrition.chief = "556";

        philosophy.dname = "철학";
        philosophy.phone = "456-7890-1234";
        philosophy.office = "Z동 25층";
        philosophy.chief = "504";



        //과목
        subj.no = "0205";
        subj.subjname = "프로그래밍";
        subj.subjdesc = "301";


        //교수
        prof.no = "301";
        prof.name = "이순신";
        prof.mjfield = "프로그래밍";

        // 매개변수를 사용하는 생성자로 객체 생성
        Student kim3 = new Student(201252110, "전지현",
                "경기도의정부시", "1986.4.30", "의상디자인",
                 445 );


        //객체에 저장된 값 출력

        //학생
        System.out.println("학생");
        System.out.println("");
        System.out.println(kim.stdno);
        System.out.println(kim.name);
        System.out.println(kim.add);
        System.out.println(kim.birth);
        System.out.println(kim.dept);
        System.out.println(kim.prof);
        System.out.println("");

        System.out.println(song.stdno);
        System.out.println(song.name);
        System.out.println(song.add);
        System.out.println(song.birth);
        System.out.println(song.dept);
        System.out.println(song.prof);
        System.out.println("");

        System.out.println(jeon.stdno);
        System.out.println(jeon.name);
        System.out.println(jeon.add);
        System.out.println(jeon.birth);
        System.out.println(jeon.dept);
        System.out.println(jeon.prof);
        System.out.println("");

        System.out.println(bae.stdno);
        System.out.println(bae.name);
        System.out.println(bae.add);
        System.out.println(bae.birth);
        System.out.println(bae.dept);
        System.out.println(bae.prof);
        System.out.println("");

        System.out.println(lee.stdno);
        System.out.println(lee.name);
        System.out.println(lee.add);
        System.out.println(lee.birth);
        System.out.println(lee.dept);
        System.out.println(lee.prof);
        System.out.println("");
        System.out.println("");

        //학과
        System.out.println("학과");
        System.out.println("");
        System.out.println(compute.dname);
        System.out.println(compute.phone);
        System.out.println(compute.office);
        System.out.println(compute.chief);
        System.out.println("");

        System.out.println(clothDesign.dname);
        System.out.println(clothDesign.phone);
        System.out.println(clothDesign.office);
        System.out.println(clothDesign.chief);
        System.out.println("");

        System.out.println(foodNutrition.dname);
        System.out.println(foodNutrition.phone);
        System.out.println(foodNutrition.office);
        System.out.println(foodNutrition.chief);
        System.out.println("");

        System.out.println(philosophy.dname);
        System.out.println(philosophy.phone);
        System.out.println(philosophy.office);
        System.out.println(philosophy.chief);
        System.out.println("");
        System.out.println("");

        //과목
        System.out.println("과목");
        System.out.println("");
        System.out.println(subj.no);
        System.out.println(subj.subjname);
        System.out.println(subj.subjdesc);
        System.out.println("");
        System.out.println("");

        //교수
        System.out.println("교수");
        System.out.println("");
        System.out.println(prof.no);
        System.out.println(prof.name);
        System.out.println(prof.mjfield);
        System.out.println("");
        System.out.println("");

    }


}

