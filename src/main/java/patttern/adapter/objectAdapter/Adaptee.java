package patttern.adapter.objectAdapter;


import patttern.adapter.classadapter.Target;

/**
 * @author: fanbopeng
 * @Date: 2019/2/28 18:14
 * @Description:
 */
public class Adaptee  implements  Target {

    private  Adapter adapter=new Adapter();

    @Override
    public void request() {
        adapter.adapterRequest();
    }
}
