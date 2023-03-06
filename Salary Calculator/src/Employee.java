
public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public double tax(){
        if(this.salary>1000){
            return this.salary*0.03;
        }
        else {
            return 0;
        }
    }
    public double bonus(){
        if(this.workHours > 40){
            return (this.workHours-40)*30;
        }
        else{
            return 0;
        }
    }
    public double raiseSalary(){

        if(2021-this.hireYear < 10){
            return this.salary*0.05;
        } else if (2021-this.hireYear>9 && 2021-this.hireYear<20) {
            return this.salary*0.1;
        } else if (2021-this.hireYear>19) {
            return this.salary*0.15;
        }
        return 0;
    }

    public void printInfo(){
        System.out.println("Name :" + this.name);
        System.out.println("Salary :" +this.salary);
        System.out.println("Working Hours :" +this.workHours);
        System.out.println("Hire Date :" +this.hireYear);
        System.out.println("Tax :"+this.tax());
        System.out.println("Bonus :" +this.bonus());
        System.out.println("Salary Raise :" +this.raiseSalary());
        System.out.println("Salary with Bonus and Tax:" +(this.salary+this.bonus() -this.tax()));
        System.out.println("Total Salary: "+(this.salary+this.bonus()-this.tax()+this.raiseSalary()));
    }
}
