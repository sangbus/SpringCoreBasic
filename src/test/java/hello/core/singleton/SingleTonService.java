package hello.core.singleton;

public class SingleTonService {

    //1. static 영역에 객체를 1개만 생성한다.
    private static final SingleTonService instance = new SingleTonService();

    //2. public으로 열어서 객체 인스턴스가 필요하면 이 static 메소드를 통해서만 조회하도록 허용한다.
    public static SingleTonService getInstance(){
        return instance;
    }

    //3. 생성자를 private으로 선언해서 외부에서 new로 생성 못하도록 막는다.
    private SingleTonService(){

    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
