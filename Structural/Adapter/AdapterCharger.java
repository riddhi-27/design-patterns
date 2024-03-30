public class AdapterCharger implements AppleCharger {

    private AndroidCharger androidCharger;

    public AdapterCharger(AndroidCharger charger) {
        this.androidCharger = charger;
    }

    @Override
    public void chargeIphone() {
       androidCharger.chargeAndroidPhone();
       System.out.print("your phone is charging with Adapter.");
    }
    
}
