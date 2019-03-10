package patttern.adapter.classadapter;

/**
 * @author: fanbopeng
 * @Date: 2019/2/28 18:14
 * @Description:
 */
public class Adaptee extends  Adapter implements  Target {


    @Override
    public void request() {
            super.adapterRequest();
    }
}
