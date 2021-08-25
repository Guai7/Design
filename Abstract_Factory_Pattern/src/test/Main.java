package test;

import color.Color;
import factory.AbstractFactory;
import factory.FactoryIF;
import factory.ShapeFactory;
import shape.Shape;

public class Main {
    public static void main(String[] args) {
        //获取图形工厂
        AbstractFactory shapeFactory = FactoryIF.getFactory("SHAPE");

        //获取方形
        Shape fang = shapeFactory.getShape("FANG");

        //获取圆形
        Shape yuan = shapeFactory.getShape("YUAN");

        //调用方形中的方法
        fang.draw();

        //调用圆形中的方法
        yuan.draw();

        //-----------------------------------------------------------------------

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryIF.getFactory("COLOR");

        //获取红色
        Color red = colorFactory.getColor("RED");

        //获取蓝色
        Color blue = colorFactory.getColor("BLUE");

        //调用红色中的方法
        red.fill();

        //调用蓝色中的方法
        blue.fill();
    }
}
