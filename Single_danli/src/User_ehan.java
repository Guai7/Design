public class User_ehan {

    private static User_ehan ehan = new User_ehan();

    private User_ehan() {

    }
    /**
     * 饿汉式单例
     * @return
     */
    public static User_ehan getInstance() {
        return ehan;
    }


    public void show(){
        System.out.println("My name is User_ehan");
    }
}
