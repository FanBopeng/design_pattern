package patttern.singleton;

/**
 * @author: fanbopeng
 * @Date: 2019/2/15 20:05
 * @Description: 在类的初始化阶段
 *      class对象的初始化锁
 *   jvm会获取锁
 */
public class StaticInnerSingleton {


    private static class InnerClass{
            private  static  StaticInnerSingleton staticInnerSingleton=StaticInnerSingleton.getInstance();

    }

    public static  StaticInnerSingleton getInstance(){

        return InnerClass.staticInnerSingleton;

    }
}
