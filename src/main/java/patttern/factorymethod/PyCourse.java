package patttern.factorymethod;

/**
 * @author: fanbopeng
 * @Date: 2019/2/14 20:42
 * @Description:
 */
public class PyCourse extends Video {
    @Override
    public void produce() {
        System.out.println("py 课程生产了");
    }
}
