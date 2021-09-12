public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        //设置并输出
        student.setName("王益德");
        student.setType("一班","1501A");
        System.out.println(student.toString());

        //拷贝出来的
        Student student1 = student.clone();
        //设置一手
        student1.setType("二班","1111A");
        //输出一手
        System.out.println(student1);
    }
}
