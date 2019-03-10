package patttern.singleton;

/**
 * @author: fanbopeng
 * @Date: 2019/2/15 19:20
 * @Description:
 */
public class DoubleCheckLasySingleton {


    private static  volatile DoubleCheckLasySingleton doubleCheckLasySingleton;

    private DoubleCheckLasySingleton(){



    }


    public  static DoubleCheckLasySingleton getInstance(){
    if (doubleCheckLasySingleton==null) {

        synchronized (DoubleCheckLasySingleton.class) {
                if (doubleCheckLasySingleton==null){

                    doubleCheckLasySingleton = new DoubleCheckLasySingleton();
                    //1 分配内存
                    //2初始化对象
                    // 3doubleCheckLasySingleton 指向内存
                     //如果在对象没有分配完成的时候 有别的线程进来 那么对象还是null 就会产生问题
                      //使用volatile 禁止指令重排序  保证内存可见性


                }
        }

    }
     return  doubleCheckLasySingleton;
    }
}
