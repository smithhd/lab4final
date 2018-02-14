package lab4final;
public class Employee implements Rules{
    public String name;
    public double salary;

    /**
     * constructor for employee
     * @param inName - employees name
     * @param inSalary - employees salary
     */
    public Employee(String inName, double inSalary){
        name = inName;
        salary = inSalary;
    }

    /**
     * default constructor for employee
     */
    public Employee(){
        name = "No Name";
        salary = 0;
    }

    /**
     *
     * @return name
     */
    public String getName(){return name;}

    /**
     *
     * @return the salary
     */
    public double getSalary(){return salary;}

    /**
     *
     * @return information about the employee
     */
    public String toString(){
        String EmployeeInfo =  name + "'s salary is " + salary + ".";
        return EmployeeInfo;
    }

    /**
     * set the name
     * @param name - name to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * set the salary to the employee
     * @param salary
     */
    public void setSalary(double salary){
        this.salary = salary;
    }
}
