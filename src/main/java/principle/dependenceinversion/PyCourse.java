package principle.dependenceinversion;

/**
 * @author: fanbopeng
 * @Date: 2019/2/14 10:00
 * @Description:
 */
public class PyCourse implements ICourse {


    @Override
    public void studyCourse() {


        System.out.println("study py");
    }
}
