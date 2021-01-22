package com.company;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

class HomeAppLiancesStore{


    public    class  Fridge extends   HomeAppLiancesStore {
        private int with=setter(112);
        private int height=setter(11);
        private int vathos=setter(51);
        private String katasteasti=getter("---");
        private  String montelos=getter("redmi_-6ta");
        private String tupos=getter("Fringe");
        private  int tpd=setter(110);
        private int kg=setter(151);
        private int xoritikotita=setter(51);
        private  int max=setter(451);
        private int low=setter(01);
        private int price=2199;
        int count=1;
    }

    public   class washiMachine extends HomeAppLiancesStore {
        private int with=setter(124);
        private int height=setter(1);
        private int vathos=setter(5);
        private String katasteasti=getter("pitsos");
        private  String montelos=getter("plus4");
        private String tupos=getter("washmachine");
        private  int tpd=setter(2000);
        private int kg=setter(155);
        private int xoritikotita=setter(55);
        private  int max=setter(451);
        private int low=setter(10);
        private int price=599;
        int count=1;
    }
    public   class Oven extends HomeAppLiancesStore{
        private int with=setter(122);
        private int height=setter(21);
        private int vathos=setter(52);
        private String katasteasti=getter("1352");
        private  String montelos=getter("redmi fafa");
        private String tupos=getter("oven");
        private  int tpd=setter(1344);
        private int kg=setter(152);
        private int xoritikotita=setter(15);
        private  int max=setter(435);
        private int low=setter(90);
        private int price=499;
        int count=1;

    }
    public class AirCondition extends HomeAppLiancesStore{
        private int with=setter(12);
        private int height=setter(1);
        private int vathos=setter(5);
        private String katasteasti=getter("xiaomi");
        private  String montelos=getter("redmi plus");
        private String tupos=getter("AirCondition");
        private  int tpd=setter(1000);
        private int kg=setter(15);
        private int xoritikotita=setter(5);
        private  int max=setter(45);
        private int low=setter(0);
        private int price=299;
        int count=1;

    }

    interface DeviceBasic {
        boolean powenon(int i);
        void poweroff();
        int peridicMantainance();
        boolean status(int i);
    }
    public abstract class Device implements DeviceBasic{
        int statuson=1;
        int statusoff=0;
        private int with= Integer.parseInt(poweron(1));
        private int height=Integer.parseInt(poweron(1));
        private int vathos=Integer.parseInt(poweroff(1));

        protected abstract String poweroff(int i);
        private String katasteasti=poweron(1);
        private  String montelos=poweron(1);

        protected abstract String poweron(String on);

        private String tupos=poweron(1);

        protected abstract String poweron(int i);

        private  int tpd=Integer.parseInt(poweron(1));
        private int kg=Integer.parseInt(poweron(1));
        private int xoritikotita=Integer.parseInt(poweron(1));
        private  int max=Integer.parseInt(poweron(1));
        private int low=Integer.parseInt(poweron(1));
        private int price=Integer.parseInt(poweron(1));
        int count=1;
        int Status=1;



    }



    int x;
    String name;
    String address;
    int y;
    String name2;
    int p;

    File fringe= new File("ask6.txt","fringe" );
    public static String readfile(String Fringe)
    {
      return Fringe;
    }

    public static String getter(String name2) {

        return name2; //arxikopoiei ena string
    }
    public static int setter(int y) {

        return y; //arxikopoiei ena int
    }

    public static int setX(int x) {

        return x; //arxikopoiei thn metavlitis employees meso parametros eisoudou
    }

    public static String setName(String name) {

        return name; //arxikopoiei thn metavlitis name meso parametros eisoudou
    }
    public static String setAddress(String address) {

        return address; //arxikopoiei thn metavlitis address meso parametros eisoudou
    }
    public static int Devicestatus(int p){
        // dn eixa polu xrono na to veltioso
        return p;
    }

    public static void main (String[]args ) throws IOException {

        // write your code here

        String name=setName(args[0]);
        String addres=setAddress(args[1]);
        String suskeues=readfile(args[2]); // dn einai arg[2] to sosto
        BufferedReader in = null;
        String c = in.readLine();
        try{
            int x=setX(Integer.parseInt(args[2]));
            System.out.println( "oi employee einai:" + x);
        }
        catch(Exception e){
            System.out.println("Min apodekto  parametron eisosou");
            int x=0;
        }

        try{
            System.out.println(name);
        }
        catch(Exception e){
            System.out.println("Den uparxei parametron eisosou");
        }
        try{
            System.out.println(addres);
        }
        catch(Exception e){
            System.out.println("Den uparxei parametron eisosou");
        }
        try{
            System.out.println(args[2]);

        }
        catch(Exception e){
            System.out.println("Den uparxei parametron eisosou");
        }



    }




}
