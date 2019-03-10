package patttern.abstractfactory;

/**
 * @author: fanbopeng
 * @Date: 2019/2/15 15:52
 * @Description:
 */
public class JavaCourseFactory implements  CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
