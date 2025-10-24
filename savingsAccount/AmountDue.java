package savingsAccount;

class AmountDue {
    
    public double computeAmountDue(double price) {
        return price * 1.12;
    }

    public double computeAmountDue(double price, int quantity) {
        double total = price * quantity;
        return total * 1.12;
    }

    public double computeAmountDue(double price, int quantity, double discount) {
        double total = (price * quantity) - discount;
        return total * 1.12;
    }
}