package singleton;

/**
 * @NAME:Singleton
 * @Desc:
 * @author: wupei
 * @date: 2024/4/17
 */
public class Singleton2 {

    public static Singleton2 instance = null;

    public Singleton2() {
    }

    public synchronized static Singleton2 getInstance(){
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
