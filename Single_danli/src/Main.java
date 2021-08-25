public class Main {
    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {

        /*
        饿汉式
         */
        User_ehan.getInstance().show();

        /*
        懒汉式
         */
        User_lanhan.getInstance().show();

        /*
        双重校验锁
         */
        User_shuangchong.getInstance().show();

        /*
        静态内部类式单例
         */
        User_wanmei.getInstance().show();

    }
}
