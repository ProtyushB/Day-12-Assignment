import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Citizen Name: ");
        String name = sc.next();

        System.out.print("Enter Citizen Mobile Number: ");
        String mobile = sc.next();

        System.out.print("Enter Citizen Aadhar Number: ");
        String aadhar = sc.next();;


        Demo demo = new Demo();

        if(demo.validate(name,mobile,aadhar)){
            Citizen citizen = new Citizen(name,mobile,aadhar);

            System.out.println("\n----------------------------------");
            System.out.println("Citizen Name: "+citizen.getName());
            System.out.println("Citizen Mobile Number: "+citizen.getMobileNumber());
            System.out.println("Citizen Aadhar Number: "+citizen.getAadharNumber());
        }
        else{
            System.out.println("Invalid Citizen Credentials");
        }
    }

    public boolean validate(String name, String mobileNum, String aadharCard){

        //For Aadhar Card Number The Number Should be starts with any of these -> 1289
        //valid aadhar = 128945638745
        //invalid aadhar = 456371289654

        if(name.matches("[a-zA-Z[\s]]*") && mobileNum.matches("[6789][0-9]{9}") && aadharCard.matches("[1289][0-9]{11}")){
            return true;
        }
        else{
            return false;
        }
    }
}
