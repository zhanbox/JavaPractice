public class FifthApp {

    public static float CalcInterest() {
        int noMonths = 12;
        float interest = 0.05f;
        float originalAmount = 200f;
        float totalMoney;

        totalMoney = originalAmount + originalAmount * (interest * noMonths);

        // System.out.println("[Within CalcInterest function] You will owe " + totalMoney);

        return totalMoney;
    }

    public static void main(String[] args) {
        float totalAmount;
        totalAmount = CalcInterest();
        System.out.println("You will owe " + totalAmount);
    }
}