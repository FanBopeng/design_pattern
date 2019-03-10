package principle.singleresponsibilty;

/**
 * @author: fanbopeng
 * @Date: 2019/2/14 10:54
 * @Description:
 */
public interface ICourseContent extends ICourse {


    @Override
    String getCourseName();
    @Override
    byte[]  getCourseVideo();



}
