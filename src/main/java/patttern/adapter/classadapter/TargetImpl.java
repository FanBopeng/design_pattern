package patttern.adapter.classadapter;

/**
 * @author: fanbopeng
 * @Date: 2019/2/28 18:12
 * @Description:
 */
public class TargetImpl implements Target {
    @Override
    public void request() {
        System.out.println("目标方法");
    }
}
