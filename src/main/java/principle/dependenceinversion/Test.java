package principle.dependenceinversion;

/**
 * @author: fanbopeng
 * @Date: 2019/2/14 10:03
 * @Description:
 */
public class Test {


    public static void main(String[] args) {

        Fan fan =new Fan();
        fan.study(new JavaCourse());

        Fan2 fan2 =new Fan2(new CCourse());
        fan2.study();


    }


}
