package movies;

public class MovieMain {
    public static void main(String[] args) {
        String[] genre = {"드라마"};
        String[] dirtor = {"스콧 플랭크", "앨런 스코트"};
        String[] actor = {"애니아 테일러조이", "토머스 브로디생스터", "해리 멜링"};
        String summary = "1950년대 한 보육원, 체스에 천재적인 재능을 보이는 소녀. " +
                "점점 더 넓은 세계로 향하며, 체스 스타의 여정을 이어간다. " +
                "하지만 더 이기고 싶다면 중독부터 극복해야 한다.";
        String desc = "";


        Movie queenscombat = new Movie(
                "퀸즈컴벳","2020", 350,
                "넷플릭스", genre, dirtor,
                actor, summary, desc);

        System.out.println(queenscombat.getTitle());
        System.out.println(queenscombat.getYear());
        System.out.println(queenscombat.getRuntime());
        System.out.println(queenscombat.getPrdtin());

        System.out.println(queenscombat.getGenre());
        // 참조형 변수이므로 배열의 내용대신
        // 내용이 저장된 위치가 출력 : 반복문으로 이용해서 처리

        for(int i = 0 ; i < genre.length ; ++i )
            System.out.println(queenscombat.getGenre()[i]);


    }
}
