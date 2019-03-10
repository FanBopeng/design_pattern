package patttern.strategy;

/**
 * @author: fanbopeng
 * @Date: 2019/3/10 19:05
 * @Description:
 */
public class DzqCD implements  CD {

    private CD cd;


    @Override
    public void sing() {

        System.out.println("泡沫啊");

    }
}
