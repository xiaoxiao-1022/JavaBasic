package singleton;

/**
 * @NAME:Singleton
 * @Desc:
 * @author: wupei
 * @date: 2024/4/17
 */
public class Singleton3 {

    public static Singleton3 instance = null;

    public Singleton3() {
    }

    public  static Singleton3 getInstance(){
        if (instance == null){
            synchronized (Singleton3.class){
                instance = new Singleton3();
            }
        }
        return instance;
    }
}
