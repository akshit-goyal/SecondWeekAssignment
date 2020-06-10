package second;

public class Employee {
    public float salary;
    private int hours;

    void getInfo(float salary,int hours)
    {
        this.salary=salary;
        this.hours=hours;
    }

    public void addSal(){
        if(salary<500)
            salary+=10;
    }
    public void addWork(){
        if(hours>6)
            salary+=5;
    }

}
