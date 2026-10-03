import java.util.Scanner;

 class HouseholdDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int familyMembers = sc.nextInt();
        double waterConsumed = sc.nextDouble();
        int houseNumber = sc.nextInt();
        char usageStatus = sc.next().charAt(0);

        System.out.println("Family Members: " + familyMembers);
        System.out.println("Water Consumed: " + waterConsumed + " litres");
        System.out.println("House Number: " + houseNumber);
        System.out.println("Water Usage Status: " + usageStatus);
    }
}