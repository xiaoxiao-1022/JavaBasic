package singleton;

/**
 * @NAME:Singleton
 * @Desc:
 * @author: wupei
 * @date: 2024/4/17
 */
public class Singleton {

    public static Singleton instance = null;

    public Singleton() {
    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
