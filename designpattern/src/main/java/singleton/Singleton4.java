package singleton;

/**
 * @NAME:Singleton
 * @Desc:懒汉式|双重校验锁
 * @author: wupei
 * @date: 2024/4/17
 */
public class Singleton4 {

    public static Singleton4 instance = null;

    public Singleton4() {
    }

    public  static Singleton4 getInstance(){
        if (instance == null){
            synchronized (Singleton4.class){
                if (instance == null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
