package patttern.factorymethod;

/**
 * @author: fanbopeng
 * @Date: 2019/2/15 15:27
 * @Description:
 */
public class JavaVideoFactory extends  VideoFactory {
    @Override
    public Video getVideo() {

        return  new JavaCourse();
    }
}
