/**
 * 静态内部类式单例
 */
public class User_wanmei {

    private User_wanmei() {
    }

    /**
     * 获取实例
     * @return
     */
    public static final User_wanmei getInstance(){
        return SingletonHolder.INSTANCE;
    }

    /**
     * 利用内部类 实例化本类
     */
    private static class SingletonHolder{
        private static final User_wanmei INSTANCE = new User_wanmei();
    }

    public void show(){
        System.out.println("My name is User_wanmei");
    }
}
