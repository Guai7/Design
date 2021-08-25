public class User_shuangchong {
    private volatile static User_shuangchong shuangchong;

    private User_shuangchong() {
    }

    /**
     * 双重单例模式
     * 用于防止不同线程new不同对象
     * @return 本类实例
     */
    public static synchronized User_shuangchong getInstance() {
        if (shuangchong ==null){
            synchronized (User_shuangchong.class){
                //同步区
                if (shuangchong ==null){
                    shuangchong = new User_shuangchong();
                }
            }
        }
        return shuangchong;
    }


    public void show(){
        System.out.println("My name is User_shuangchong");
    }
}
