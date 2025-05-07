package project3; //checked 5/5/2025 - 92/100
import java.util.Scanner;
public class Project3 {
    public static void main(String[] args) {
        
        double GE9 = 0;
        double CCS2115 = 0;
        double CCS2111 = 0;
        double CCS2205 = 0;
        double CCS2209 = 0;
        double WEB2 = 0;
        double ITE2 = 0;
        double PE4 = 0;
        double gwa = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Your grades in The Life and Works of Jose Rizal: ");
        GE9 = scanner.nextDouble();
        
        System.out.print("Your grades in Financial Management: ");
        CCS2115 = scanner.nextDouble();
        
        System.out.print("Your grades in System Integration and Architecture 1: ");
        CCS2111 = scanner.nextDouble();
        
        System.out.print("Your grades in Information Management: ");
        CCS2205 = scanner.nextDouble();
        
        System.out.print("Your grades in Networking 2: ");
        CCS2209 = scanner.nextDouble();
        
        System.out.print("Your grades in Web Development (Advance Web / Platform): ");
        WEB2 = scanner.nextDouble();
        
        System.out.print("Your grades in IT ELECTIVE 2 (Advance Javaor OOP): ");
        ITE2 = scanner.nextDouble();
        
        System.out.print("Your grades in Team Sports: ");
        PE4 = scanner.nextDouble();
        
        gwa = (GE9 + CCS2115 + CCS2111 + CCS2205 + CCS2209 + WEB2 + ITE2 + PE4) /8;
        
        System.out.printf("Your General Weighted Average is %.2f ", gwa);
        }
}
