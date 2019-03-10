package principle.dependenceinversion;

/**
 * @author: fanbopeng
 * @Date: 2019/2/14 10:02
 * @Description:
 */
public class Fan2 {

  private      ICourse iCourse;

    public Fan2(ICourse iCourse){

        this.iCourse=iCourse;
    }

    

    public void study(){

        iCourse.studyCourse();

    }

}
