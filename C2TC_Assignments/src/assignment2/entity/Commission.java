package assignment2.entity;

// Commission class
class Commission {
    String name,address,phone;
    double sales_amount;

    // Method to accept details
    void acceptDetails(String n, String a, String p, double s) {
        name = n;
        address = a;
        phone = p;
        sales_amount = s;
    }

    // Method to calculate commission
    void calculateCommission() {
        double commission = 0;

        if (sales_amount >= 100000) {
            commission = sales_amount * 0.10;
        } else if (sales_amount >= 50000) {
            commission = sales_amount * 0.05;
        } else if (sales_amount >= 30000) {
            commission = sales_amount * 0.03;
        } else {
            commission = 0;
        }

        System.out.println("Commission for " + name + " is: " + commission);
    }

}
