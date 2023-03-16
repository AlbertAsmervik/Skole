public class EmployeeDemo {
    public static void main(String[] args) {
        Employeeterritory obj=new Employeeterritory();
        obj.setId(101);
        obj.setSalary(2000);
        obj.setTerritoryNum(10);

        System.out.print(obj.getId());
        System.out.print(obj.getSalary());
        System.out.print(obj.getTerritoryNum());
        obj.Hobby();

    }
}
