package color;

import color.Color;

/**
 * 实现颜色的实体类
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("红色");
    }
}
