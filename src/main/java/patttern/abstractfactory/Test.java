package patttern.abstractfactory;

/**
 * @author: fanbopeng
 * @Date: 2019/2/15 15:50
 * @Description:
 */
public class Test {


    public static void main(String[] args) {
        
        
        CourseFactory factory =new JavaCourseFactory();
        Video video = factory.getVideo();
        Article article = factory.getArticle();
        video.produce();
        article.produce();
    }


}
