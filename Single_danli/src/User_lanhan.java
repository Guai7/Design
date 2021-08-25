public class User_lanhan {

    private static User_lanhan lanhan;

    private User_lanhan() {
    }

    /**
     * 懒汉式单例
     * @return
     */
    public static User_lanhan getInstance() {
        if (lanhan==null){
            lanhan = new User_lanhan();
        }
        return lanhan;
    }


    public void show(){
        System.out.println("My name is User_lanhan");
    }
}
