package builder;

/**
 * @NAME:Item
 * @Desc:创建一个表示食物条目和食物包装的接口
 * @author: Hugo
 * @date: 2024/4/19
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
