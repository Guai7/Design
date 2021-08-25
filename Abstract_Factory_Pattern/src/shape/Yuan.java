package shape;

import shape.Shape;

/**
 * 实现画画的实体类
 */
public class Yuan implements Shape {

    @Override
    public void draw() {
        System.out.println("画一个圆");
    }
}
