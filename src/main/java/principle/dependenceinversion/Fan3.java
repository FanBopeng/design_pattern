package principle.dependenceinversion;

/**
 * @author: fanbopeng
 * @Date: 2019/2/14 10:02
 * @Description:
 */
public class Fan3 {

  private      ICourse iCourse;

    public Fan3(ICourse iCourse){

        this.iCourse=iCourse;
    }

    

    public void study(){

        iCourse.studyCourse();

    }

}
