package patttern.strategy.strategy2;

/**
 * @author: fanbopeng
 * @Date: 2019/3/10 19:40
 * @Description:
 */
public class StudentQuery implements Query {

    private int qStuNo;
    private  String qName;


    @Override
    public String getSql() {


        return "自己所需要的sql";
    }
}
