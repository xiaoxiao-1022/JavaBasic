package singleton;

/**
 * @NAME:Singleton
 * @Desc:
 * @author: wupei
 * @date: 2024/4/17
 */
public class Singleton5 {

    public volatile static  Singleton5 instance = null;

    public Singleton5() {
    }

    public  static Singleton5 getInstance(){
        if (instance == null){
            synchronized (Singleton5.class){
                if (instance == null){
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}
