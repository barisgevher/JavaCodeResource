public class HourlyEmployee extends Employee{
    private double hourlyPayRate;


    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;
    }

    double getDoublePay(){
       return  2 * collectPay();
    }

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }
}
