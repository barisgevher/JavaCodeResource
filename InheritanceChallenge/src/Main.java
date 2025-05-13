public class Main {
    public static void main(String[] args) {
//        SalariedEmployee salariedEmployee = new SalariedEmployee("Barış", "31/05/2001",
//                "28/11/2024",1122334455,"14/05/2024", 2545.43,false);
//
//        salariedEmployee.getAge();
//        salariedEmployee.collectPay();
//        salariedEmployee.toString();
//        salariedEmployee.retire();
//
//
//        HourlyEmployee hourlyEmployee = new HourlyEmployee("Barış", "03/05/2003", "23/10/2024",
//                998877665, "17/0/2024", 20.5);
//
//        hourlyEmployee.getDoublePay();


        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());


        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990", "03/03/2020", 35000);
        System.out.println(joe);
        System.out.println("Age = " + joe.getAge());
        System.out.println("Joe's paycheck  = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());



        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }
}
