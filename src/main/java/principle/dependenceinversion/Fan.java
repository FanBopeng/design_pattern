package principle.dependenceinversion;

/**
 * @author: fanbopeng
 * @Date: 2019/2/14 10:02
 * @Description:
 */
public class Fan {




    public void study(ICourse course){

        course.studyCourse();

    }

}
