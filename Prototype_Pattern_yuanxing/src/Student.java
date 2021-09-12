public class Student implements Cloneable{
    private String name;

    private Type type = new Type();

    public Student(String name) {
        this.name = name;
    }

    public Student() {
        System.out.println("执行构造函数");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String typeName,String typeInt){
        type.typeName = typeName;
        type.typeInt = typeInt;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    /**
     * 原型模式拷贝方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Student clone() throws CloneNotSupportedException {
        System.out.println("clone时，不执行构造方法");
        //------------------【推荐使用】改造方法(实现深拷贝)-----------------------
        Student newStudent = (Student) super.clone();
        newStudent.type = type.clone();
        //------------------------------------------------------------

        //-----------------【不推荐使用】浅拷贝-------------------------------------
//        Student newStudent1 = (Student) super.clone();
//        newStudent1.type = this.type;
        //--------------------------------------------------------
        return newStudent;
    }

    public class Type implements Cloneable{
        private String typeName;
        private String typeInt;

        public Type(String typeName, String typeInt) {
            this.typeName = typeName;
            this.typeInt = typeInt;
        }

        public Type() {
        }

        public String getTypeName() {
            return typeName;
        }

        public void setTypeName(String typeName) {
            this.typeName = typeName;
        }

        public String getTypeInt() {
            return typeInt;
        }

        public void setTypeInt(String typeInt) {
            this.typeInt = typeInt;
        }

        @Override
        public String toString() {
            return "Type{" +
                    "typeName='" + typeName + '\'' +
                    ", typeInt='" + typeInt + '\'' +
                    '}';
        }

        @Override
        protected Type clone() throws CloneNotSupportedException {
            return (Type) super.clone();
        }

    }
}
