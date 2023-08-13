package hello.org.singleton;

public class SingletonService {
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance(){
        return instance;
    }

    public void logic(){
        System.out.println("객체 호출");
    }
}
