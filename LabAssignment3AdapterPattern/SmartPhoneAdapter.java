public class SmartPhoneAdapter implements PowerOutlet {
    private SmartPhoneCharger smartPhoneCharger;

    public SmartPhoneAdapter(SmartPhoneCharger smartPhoneCharger) {
        this.smartPhoneCharger = smartPhoneCharger;
    }
    @Override
    public String plugIn() {
        return smartPhoneCharger.chargePhone();
    }
}