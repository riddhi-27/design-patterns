
class Demo {
    public static void main(String[] args) {

        System.out.println("program started ");

        // AppleCharger charger = new ChargerXYZ();

        AppleCharger charger = new AdapterCharger(new OneplusCharger());

        Iphone13 iphone13 = new Iphone13(charger);

        iphone13.chargeIphone();










        

    }
}