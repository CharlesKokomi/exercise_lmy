package t3_Work;

public class Manager
{
    private String name;
    private String id;
    private double salary;
    private double bonus;

    public Manager(){}
    public Manager(String name,String id,double salary,double bonus)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    public String getName()
    {
        return name;
    }
    public String getId()
    {
        return id;
    }
    public double getSalary()
    {
        return salary;
    }
    public double getBonus()
    {
        return bonus;
    }

    public void work()
    {
        System.out.println("工号为"+id+"基本工资为"+salary+"奖金为"+bonus+"的项目经理"+name+"正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }
}
