import java.util.Scanner;

public class CarWalaAssignment {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Type of car :");
        String car=sc.nextLine();
        if(car.equals("HatchBack")){
            HatchBack hb=new HatchBack(2000,5000,2000,1000,3000);
            Garage.park(hb);
            System.out.println("Total Bill = Rs "+hb.cost());
            if(hb.cost()>10000){
                System.out.print("You got free cleaning Service");
            }
        }
        else if(car.equals("Sedan")){
            Sedan sd=new Sedan(4000,8000,4000,1500,6000);
            Garage.park(sd);
            System.out.println("Total Bill = Rs "+sd.cost());
            if(sd.cost()>10000){
                System.out.print("You got free cleaning Service");
            }
        }
        else if(car.equals("SUV")){
            SUV suv=new SUV(5000,10000,6000,2500,8000);
            Garage.park(suv);
            System.out.println("Total Bill = Rs "+suv.cost());
            if(suv.cost()>10000){
                System.out.print("You got free cleaning Service");
            }
        }
    }
}
class Cars{
    int BS01,EF01,CF01,BF01,GF01;
    Cars(int BS01,int EF01,int CF01,int BF01,int GF01){
        this.BS01=BS01;
        this.EF01=EF01;
        this.CF01=CF01;
        this.BF01=BF01;
        this.GF01=GF01;
    }
    int sum=0;
    void BS01(){
        System.out.println("Charges for Basic Servicing = Rs "+BS01);
        sum+=BS01;
    }
    void EF01(){
        System.out.println("Charges for Engine Fixing = Rs "+EF01);
        sum+=EF01;
    }
    void CF01(){
        System.out.println("Charges for Clutch Fixing = Rs "+CF01);
        sum+=CF01;
    }
    void BF01(){
        System.out.println("Charges for Brake Fixing = Rs "+BF01);
        sum+=BF01;
    }
    void GF01(){
        System.out.println("Charges for Gear Fixing = Rs "+GF01);
        sum+=GF01;
    }
    int cost(){
        return sum;
    }
}
class HatchBack extends Cars{
    HatchBack(int BS01,int EF01,int CF01,int BF01,int GF01){
        super(BS01,EF01,CF01,BF01,GF01);
    }
}
class Sedan extends Cars{
    Sedan(int BS01,int EF01,int CF01,int BF01,int GF01){
        super(BS01,EF01,CF01,BF01,GF01);
    }
}
class SUV extends Cars{
    SUV(int BS01,int EF01,int CF01,int BF01,int GF01){
        super(BS01,EF01,CF01,BF01,GF01);
    }
}
class Garage{
    static void park(Cars car){
        Scanner sc=new Scanner(System.in);
        System.out.print("Service codes : ");
        String services=sc.nextLine();
        String code[]=services.split(",");
        for(int i=0;i<code.length;i++){
            if(code[i].equals("BS01")){
                car.BS01();
            }
            else if(code[i].equals("EF01")){
                car.EF01();
            }
            else if(code[i].equals("CF01")){
                car.CF01();
            }
            else if(code[i].equals("BF01")){
                car.BF01();
            }
            else if(code[i].equals("GF01")){
                car.GF01();
            }
            else{
                System.out.print("Please enter valid code");
            }
        }
    }
}




