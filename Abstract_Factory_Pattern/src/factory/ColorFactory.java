package factory;

import color.Blue;
import color.Color;
import color.Red;
import shape.Shape;

public class ColorFactory extends AbstractFactory{

    /**
     * 使用字符串判别返回什么颜色
     * @param color
     * @return
     */
    @Override
    public Color getColor(String color) {

        if (color.equalsIgnoreCase("RED")){
            return new Red();
        }else if (color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
