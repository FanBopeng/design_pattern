package principle.openclose;

/**
 * @author: fanbopeng
 * @Date: 2019/1/27 10:55
 * @Description:
 */
public class JavaDiscountCourse extends  JavaCourse {



    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice(){

        return  super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
}
