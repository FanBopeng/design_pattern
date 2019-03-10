package patttern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author: fanbopeng
 * @Date: 2019/2/15 19:23
 * @Description:
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
    /*    Thread  t1=new Thread(new T());
        Thread t2=new Thread(new T());

        t1.start();
        t2.start();
        System.out.println("end");*/

    Class objectClass=LasySingleton.class;


        try {
            Constructor constructor = objectClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            LasySingleton instance = LasySingleton.getInstance();
            LasySingleton   newInstance = (LasySingleton)constructor.newInstance();

            System.out.println(instance==newInstance);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }


}
