import java.util.Scanner;;
public class Program {
    public static void main(String ... a){
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("1.Flat,2.House,3.Exit");
            switch (input.nextInt()) {
                case 1:
                    Flat f=new Flat();
                    f.accept();
                    break;
                case 2:
                    House h = new House();
                    h.accept(); 
                    case 3:
                    System.exit(0);   
    }
            }while(true);
        }
    
    }

