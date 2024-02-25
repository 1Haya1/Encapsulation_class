public class Employee {


    private String id;
    private String name;
    private int salary;

    // Constructor
    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // get
    public String getID() {
        return id;
    }
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }



    //set
    public void setId(String id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }


    // حساب الراتب السنوي
    public int getAnnualSalary() {
        return salary * 12;// السنه
    }

    // رفع الراتب بنسبه معينه وترجع الراتب الجديد
    public int raiseSalary(int percent) {
        double raiseFactor = 1 + (percent / 100.0);
        salary = (int) (salary * raiseFactor);
        return salary;
    }


    public String toString() {
        return "Employee[id=" + id + ", name=" + name + ", salary=" + salary+"]";
}
}




