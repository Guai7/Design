package factory;

/**
 * 用于识别使用什么工厂
 */
public class FactoryIF {

    /**
     * 利用字符串判别返回什么工厂
     * @param fac
     * @return
     */
    public static AbstractFactory getFactory(String fac){
        if (fac.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if (fac.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }

        return null;
    }
}
