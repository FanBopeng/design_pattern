package patttern.factorymethod;

/**
 * @author: fanbopeng
 * @Date: 2019/2/15 15:28
 * @Description:
 */
public class PyVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return  new PyCourse();
    }
}
