package lab;

class Student {
    int stdno;
    String name;
    String add;
    String birth;
    String dept;
    int prof;

    public Student() {
        stdno = 201250006;
        name = "송혜교";
        add = "서울영등포구";
        birth = "1988.9.17";
        dept = "컴퓨터";
        prof = 301;
    }

        // 매개변수를 포함하는 생성자
    public Student(int stdno, String name, String add,
                String birth, String dept, int prof){
            this.stdno = stdno;
            this.name = name;
            this.add = add;
            this.birth = birth;
            this.dept = dept;
            this.prof = prof;
    }

}