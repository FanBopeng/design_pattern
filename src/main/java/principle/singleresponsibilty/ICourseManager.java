package principle.singleresponsibilty;

/**
 * @author: fanbopeng
 * @Date: 2019/2/14 10:54
 * @Description:
 */
public interface ICourseManager extends ICourse {

    @Override
    void studyCourse();

    @Override
    void refundCourse();
}
