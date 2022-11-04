public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(double salary) {
        if (salary<1000) return salary;
        else return salary - (salary * 0.97);
    }

    public double bonus(double workHours) {
        if (workHours <= 40) return 0.0;
        else return (workHours - 40) * 30;
    }

    public double raiseSalary(int hireYear) {
        if ((2021 - hireYear) < 10) return this.salary * 0.05;
        else if (2021 - hireYear < 20) return this.salary * 0.10;
        else return this.salary * 0.15;
    }

    public String toString() {
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Working Hour : " + this.workHours);
        System.out.println("Hire Year : " + this.hireYear);

        System.out.println("Tax : " + tax(this.salary));
        System.out.println("Bonus : " + bonus(this.workHours));
        System.out.println("Raise amount : " + raiseSalary(this.hireYear));
        System.out.println("Total salary with tax and bonus  : " + (this.salary - tax(this.salary) + bonus(this.workHours)));
        System.out.println("Raised total salary with tax and bonus  : " + (this.salary - tax(this.salary) + bonus(this.workHours) + raiseSalary(this.hireYear)));

        return null;
    }
}
