public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    // TODO 5: Create constructor using super()
    public CommissionEmployee(String firstName, String lastName,
            String socialSecurityNumber,
            double grossSales, double commissionRate) {

        super(firstName, lastName, socialSecurityNumber);
        this.setGrossSales(grossSales);
        this.setCommissionRate(commissionRate);
    }

    // TODO 6: Create getters and setters with validation
    public double getCommissionRate() {
        return this.commissionRate;
    }

    public double getGrossSales() {
        return this.grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate > 0 && commissionRate < 1) {
            this.commissionRate = commissionRate;
        } else {
            throw new IllegalArgumentException(
                    "Commission rate must be between 0 and 1");
        }
    }

    public void setGrossSales(double grossSales) {
        if (grossSales > 0.0) {
            this.grossSales = grossSales;
        } else {
            throw new IllegalArgumentException(
                    "Gross Sales must be greater than 0");
        }
    }

    @Override
    public double earnings() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'earnings'");
    }

}
