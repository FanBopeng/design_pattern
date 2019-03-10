package patttern.singleton;

/**
 * @author: fanbopeng
 * @Date: 2019/2/15 19:43
 * @Description:
 */
public class T implements  Runnable {
    @Override
    public void run() {

        LasySingleton instance = LasySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+instance);

    }
}
