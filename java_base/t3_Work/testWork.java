package t3_Work;

public class testWork
{
    public static void main(String[] args)
    {
        Manager manager = new Manager("张三","123",15000,6000);
        Coder coder = new Coder("李四","135",10000);
        manager.work();
        coder.work();
    }
}
