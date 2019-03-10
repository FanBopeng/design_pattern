package patttern.abstractfactory;

/**
 * @author: fanbopeng
 * @Date: 2019/2/15 15:55
 * @Description:
 */
public class PyArticle extends Article {
    @Override
    public void produce() {
        System.out.println("py手记");
    }
}
