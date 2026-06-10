public class WelcomeCard {
    public static void main(String[] args) {
        String name = "Ravi";
        int age = 22;
        char rank = 'A';
        double salary = 50000.0;
        float membershipFee = 1500.50f;

        double bonus = salary * 0.12;

        int annualBonus = (int) bonus;
        
        System.out.println("WELCOME");
        System.out.println("___________________________________\n");
        
      
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Rank           : " + rank);
        System.out.println("Salary         : " + salary);
        System.out.println("Membership Fee : " + membershipFee);
        System.out.println("Annual Bonus   : " + annualBonus);

        System.out.println("___________________________________\n");
        System.out.println("Welcome to GLA PVT LTD");
        System.out.println("___________________________________\n");
    }
}