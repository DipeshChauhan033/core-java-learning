import java.util.Scanner;

class components{
    String sc = "GJ";
    int rc=04,n=5799;
    String letters = "ABCDEFCHIJKLMNOPQRSTUVWXYZ";
    char ch1 = letters.charAt((int)(Math.random() * letters.length()));
    char ch2 = letters.charAt((int)(Math.random() * letters.length()));

    String StateCode(){
        return sc; 
    }

    int RtoCode(){
        return rc;
    }

    String series(){
        return ""+ch1+ch2;
    }

    int number(){
        return n;
    }
  
}

class dis{
    dis(){
        components obj = new components();
        System.out.println(obj.StateCode()+obj.RtoCode()+obj.series()+obj.number());

    }
}

public class numberPlate{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        components obj1 = new components();
        
        int i = 1;
        while(i!=0){
            System.out.println();
            System.out.print("Enter 1 to change your StateCode \nEnter 2 to change your RtoCode \nEnter 3 to change your series \nEnter 4 to change your vehical number\nEnter 5 to display:");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter your state code: ");
                    String str = sc.nextLine();
                    String str2 = str.toUpperCase();
                    obj1.sc = str2;
                    break;
                
                case 2:
                    System.out.print("Enter your RTOCODE: ");
                    int rtc = sc.nextInt();
                    obj1.rc = rtc;
                    break;

                case 3:
                    System.out.print("Enter your series: ");
                    String ses = sc.nextLine();
                    String ses2 = ses.toUpperCase();
                    if(ses.length()<=2){
                        obj1.ch1 = ses2.charAt(0);
                        obj1.ch2 = ses2.charAt(1);
                    }
                    else{
                        System.out.print("Invalid series");
                    }
                    break;

                case 4:
                    System.out.print("Enter your choice Number: ");
                    int num = sc.nextInt();
                    if(num<9999){
                        obj1.n = num;
                    }
                    else{
                        System.out.println("Vehical Number Not Valid !");
                    }
                    break;

                case 5:
                    System.out.println("vehical Number Plate: "+obj1.StateCode()+obj1.RtoCode()+obj1.series()+obj1.number());
                    break;
            }
        }
    }
}