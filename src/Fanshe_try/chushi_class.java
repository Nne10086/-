package Fanshe_try;

public class chushi_class {
    public String name = "public属性";
    private String name1 = "private属性";


    public chushi_class(){
        System.out.println("调用public无参构造器");
    }

    private chushi_class(int a){
        System.out.println("调用private无参构造器,传入int a");
    }


    private void fangfa1(int a){
        System.out.println("private方法，传入int a");
    }
}
