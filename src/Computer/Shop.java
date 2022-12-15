package Computer;
import java.util.*;
public class Shop implements enter
{
    Computer[] computers = new Computer[2];
   public void addcomp()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("1 - MSI, 2 - MAC, 3 - HP");
       for (int i = 0; i < 2; i++)
       {
           double price = 10.0;
           models m = models.MSI;

           int n = sc.nextInt();
           switch (n)
           {
               case 1:
                   m = models.MSI;
                   price = 14.3;
                   break;
               case 2:
                   m = models.MAC;
                   price = 20.5;
                   break;
               case 3:
                   m = models.HP;
                   price = 24.6;
                   break;
           }
           Computer comp = new Computer(m, price);
           System.out.println("Computer: model - " + m.toString() + " price -" + price);
       }
   }
   public void deletecomp(Computer obj)
   {
       for (int i = 0; i < 2; i++)
       {
            if(computers[i] == obj)
            {
                computers[i] = null;
            }

       }
       System.out.println("Computer " + obj.model.toString() + "deleted");
   }
   public Computer findcomp(models model)
   {
       for (int i = 0; i < 2; i++)
       {
           if(computers[i].model == model)
           {
               System.out.println("Computer " + model.toString() + "found");
               return computers[i];
           }

       }
       return null;
   }
}
