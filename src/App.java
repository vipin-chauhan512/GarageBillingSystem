import entity.Customer;
import service.BillingService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws SQLException {
        Scanner sc=new Scanner(System.in);
        BillingService service=new BillingService();

        while (true)
        {
            System.out.println("1. Add Customer with Vehicle \n2. Generate Invoice\n3. Show Invoice\n4. Exit \n5. Choice number :");
            int ch= sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.print("Customer name: ");
                    String name = sc.next();
                    System.out.print("phone:");
                    String phone = sc.next();
                    service.customerService.addCustomer(new Customer(0,name,phone));
                    System.out.println("Enter Vehicle number (e.g UP32AU4563):");
                    String Vehiclenum=sc.next();
                    System.out.println("Enter Vehicle model: ");
                    String model=sc.next();
                    Customer customerBasedOnNum = service.customerService.getCustomerBasedOnNum(phone);

                    break;

                case 2:
                    System.out.println("Enter customer ID: ");
                    int cid=sc.nextInt();
                    System.out.println("Enter vehicle Id:");
                    int vid = sc.nextInt();
                    System.out.println("Enter number of services:");
                    int n = sc.nextInt();
                    List<Integer> sids=new ArrayList<>();
                    for (int i=0;i<n;i++)
                    {
                        System.out.println("enter the service id:");
                        sids.add(sc.nextInt());
                    }
                    service.createInvoice(cid,vid,sids);
                    break;

                case 3:
                    service.showAllInvoices();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Not a valid choice");
                    break;

            }
        }
    }
}
