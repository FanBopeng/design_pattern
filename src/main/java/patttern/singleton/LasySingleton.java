package patttern.singleton;

/**
 * @author: fanbopeng
 * @Date: 2019/2/15 19:20
 * @Description:
 */
public class LasySingleton {


    private static  LasySingleton lasySingleton;

    private  LasySingleton(){
         if (lasySingleton!=null){

        throw  new RuntimeException("对象已经存在");
  }


    }


    public  static  LasySingleton  getInstance(){
    if (lasySingleton==null) {

        return   new LasySingleton();

    }
     return  lasySingleton;
    }
}
