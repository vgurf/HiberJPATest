package Entity;

public class Baker {
    private String name;
    private byte age;
    private float salary;

    public Baker(){}
    public Baker(String name, byte age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Baker: "+name + "Age: "+ age + "Salary: " + salary;
    }
}
