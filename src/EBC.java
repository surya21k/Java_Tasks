public class EBC {

    int salary;
    int bonus;
    int totalSalary;

    public  EBC(int salary){
        this.salary = salary;
    }
    public void checkBonus(){
        if(salary >= 50000){
            bonus = salary * 15 /100;
        } else if (salary >= 30000 && salary < 50000) {
            bonus = salary * 10 /100;
        }else if(salary < 30000){
            bonus = salary * 5/100;
        }else{
            if(salary < 0){
                System.out.println("Salary cannot be negative");
            }
        }
        System.out.println("Bonus: " + bonus);
    }
    public void totalSalary(){
        totalSalary = salary + bonus;
        System.out.println("totalSalary = " + totalSalary);
    }

}
