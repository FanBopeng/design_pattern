package patttern.singleton;

/**
 * @author: fanbopeng
 * @Date: 2019/2/16 13:46
 * @Description:
 */
public enum  EnumInstance {

    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){


        return  INSTANCE;
    }

}
