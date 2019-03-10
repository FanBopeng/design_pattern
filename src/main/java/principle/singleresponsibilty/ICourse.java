package principle.singleresponsibilty;

/**
 * @author: fanbopeng
 * @Date: 2019/2/14 10:51
 * @Description:
 */
public interface ICourse {

    String getCourseName();
    byte[]  getCourseVideo();


    void studyCourse();
    void refundCourse();
}
