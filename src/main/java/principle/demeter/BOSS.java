package principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: fanbopeng
 * @Date: 2019/2/14 18:43
 * @Description:
 */
public class BOSS {

    public void checkNumber(TeamLeader leader){

        List<Course> list =new ArrayList<>();
        for (int i=0;i<20;i++){

                list.add(new Course());
        }
        leader.checkNumberOfCourse(list);

    }
}
