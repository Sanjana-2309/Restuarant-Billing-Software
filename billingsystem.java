import java.util.Scanner;

public class billingsystem {
    public static void main(String[] args) {
        //name of the person
        System.out.println("Enter the name of the person:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        //numer of items ordered
        System.out.println("Enter the number of the Item's:");
        Scanner It = new Scanner(System.in);
        int ITEM = It.nextInt();
       //name of the item
        System.out.println("Enter the name of the Item:");
        Scanner Nm1 = new Scanner(System.in);
        String Nameofitem1 = Nm1.next();
        String it1= Nameofitem1;
        Scanner Nm2 = new Scanner(System.in);
        String Nameofitem2 = Nm2.next();
        String it2=Nameofitem2;
        System.out.println("Enter the Quantity:");
        Scanner QN1 = new Scanner(System.in);
        int QUANTITY1= QN1.nextInt();
        int e=QUANTITY1;
        Scanner QN2 = new Scanner(System.in);
        int QUANTITY2 = QN2.nextInt();
        int s = QUANTITY2;
        //price of the item
        System.out.println("price of the item is:");
        Scanner pr1 = new Scanner(System.in);
        int price1 = pr1.nextInt();
        int a = price1;
        Scanner pr2 = new Scanner(System.in);
        int price2 = pr2.nextInt();
        int b= price2;
        //total price
        System.out.println("Total:");
        int p1 = (a*e);
        int p2 = (b*s);
        System.out.println(p1);
        System.out.println(p2);
        //the total bill is
        System.out.print("total price:");
        int total =p1+p2;
        System.out.println(total);


        System.out.print("name of the customer:");
        System.out.println(name.toUpperCase());
        System.out.println("name of item" +'\t'+"price of item"+'\t'+"Qty"+'\t'+'\t'+'\t'+"Total price");
        System.out.println(it1 + '\t' +'\t'+'\t'+  a  +'\t'+'\t'+ '\t'+'\t'+ e + '\t'+'\t'+'\t'+    p1  );
        System.out.println(it2 + '\t' +'\t'+'\t'+  b  + '\t'+'\t'+ '\t' +'\t'+s+'\t'+'\t'+'\t'+     p2   );
        System.out.print("Total:");
        System.out.println(total);
    }
}
