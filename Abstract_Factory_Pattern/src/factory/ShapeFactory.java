package factory;

import color.Color;
import shape.Fang;
import shape.Shape;
import shape.Yuan;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    /**
     * 使用字符串判别返回什么形状
     * @param shape
     * @return
     */
    @Override
    public Shape getShape(String shape) {
        if (shape.equalsIgnoreCase("YUAN")){
            return new Yuan();
        }else if (shape.equalsIgnoreCase("FANG")){
            return new Fang();
        }
        return null;
    }
}
