package lab;

public class Book {
    // 멤버변수 선언
    String name;
    String writer;
    String pubname;
    String pubdate;
    int price;
    double discount;
    String bkimg;   //java png

    //기본 생성자

    //매개변수 생성자

    public Book(String name, String writer, String pubname, String pubdate, int price, double discount, String bkimg) {
        this.name = name;
        this.writer = writer;
        this.pubname = pubname;
        this.pubdate = pubdate;
        this.price = price;
        this.discount = discount;
        this.bkimg = bkimg;
    }


//알트 인서트 컨스트럭쳐
}
