public class prob22 {
    public static void main(String[] args) {
        var meu = new MyEmployeeUtil<Emp>();

        var aEmp1 = new CompAEmp(100);
        var aEmp2 = new CompAEmp(200);

        System.out.println(meu.compare(aEmp1, aEmp2));
    }
}

class MyEmployeeUtil<T extends Emp> {

    public <T extends Emp> int compare(T emp1, T emp2) {
        if (emp1.salary == emp2.salary)
            return 0;
        else if (emp1.salary > emp2.salary)
            return 1;
        else
            return -1;
    }

}

class Emp {
    public float salary = 0;

    Emp(float salary) {
        this.salary = salary;
    }
}

class CompAEmp extends Emp {

    CompAEmp(float salary) {
        super(salary);
    }

}

class CompBEmp extends Emp {
    CompBEmp(float salary) {
        super(salary);
    }
}
