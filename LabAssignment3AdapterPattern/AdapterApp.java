
public class AdapterApp {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartPhoneCharger smartPhoneCharger = new SmartPhoneCharger();

        PowerOutlet laPowerOutlet = new LaptopAdapter(laptop);
        PowerOutlet RefPowerOutlet = new RefrigeratorAdapter(refrigerator);
        PowerOutlet SPCPowerOutlet = new SmartPhoneAdapter(smartPhoneCharger);

        System.out.println(laPowerOutlet.plugIn());
        System.out.println(RefPowerOutlet.plugIn());
        System.out.println(SPCPowerOutlet.plugIn());
    }
}