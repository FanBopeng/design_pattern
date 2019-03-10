package patttern.adapter.classadapter;

/**
 * @author: fanbopeng
 * @Date: 2019/2/28 18:16
 * @Description:
 */
public class Test {


    public static void main(String[] args) {

        Target target =new TargetImpl();
        target.request();

        Target adaTarget=new Adaptee();
         adaTarget.request();
    }
}
