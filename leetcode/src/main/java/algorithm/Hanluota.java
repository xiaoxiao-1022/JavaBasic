package algorithm;

/**
 * @NAME:Hanluota
 * @Desc:汉诺塔问题是由很多放置在三个塔座上的盘子组成的一个古老的难题，
 * 如下图所示，所有的盘子的直径是不同的。并且盘子中央都有一个洞使得它刚好可以放在塔座上，
 * 所有的盘子刚开始都是在a座上，这个难题的目标是将左右的盘子都从塔座a，移到塔座c上
 * 每次只可以移动一个盘子，并且任何一个盘子都不可以放置在比它小的盘子上，
 * @author: wupei
 * @date: 2023/3/23
 */
public class Hanluota {

    /**
     * 所以无论多少盘子，我们都将其看做只有两个盘子，假设n个盘子在a的上面，我们将其看做只有两个盘子，只有（n-1）和n这两个盘子，
     * @param dish
     * @param from
     * @param temp
     * @param to
     */
    public static void function(int dish,String from,String temp,String to){
            if (dish == 1){
                System.out.println("将盘子"+dish+"从"+from+"移动到"+to);
            }else{
                //from 为初始底座 temp未目标底座，to为中间座
                function(dish-1,from,to,temp);
                System.out.println("将盘子"+dish+"从"+from+"移动到"+to);
                function(dish-1,temp,from,to);
            }
    }

    public static void main(String[] args) {
        function(2,"A","B","C");
    }
}
