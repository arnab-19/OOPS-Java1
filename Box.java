import java.util.*;
public class Box{
public int wdh=0;
public int hght=0;
public int dth=0;
public int vme=0;
public void details(){
System.out.print("A box with dimensions" + wdh +", " + hght + ", " + dth + " is " + vme);
}
public Box(int w,int h,int d){
int wdh=w;
int hght=h;
int dth=d;
}
public Box(){
wdh=4;
hght=3;
dth=6;
vme = wdh*hght*dth;
}
public void calcvol(){
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter the width,height and depth of the box:");
int wh = sc.nextInt();
int ht = sc.nextInt();
int dh = sc.nextInt();
int v2 = wh*ht*dh; 
System.out.println("The volume of the box of width=" + wh + ", height=" + ht+ " and depth=" + dh + " is: " + v2);
}
public static void main(String []args) {
Box b1=new Box();
Box b2=new Box();
b1.details();
b2.calcvol();
}
}


