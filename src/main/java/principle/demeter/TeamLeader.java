package principle.demeter;

import java.util.List;

/**
 * @author: fanbopeng
 * @Date: 2019/2/14 18:43
 * @Description:
 */
public class TeamLeader {

    public void checkNumberOfCourse(List<Course> courseList){


        System.out.println("在线课程数量"+courseList.size());
    }

}
