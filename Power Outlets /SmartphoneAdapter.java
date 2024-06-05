public class SmartphoneAdapter implements PowerOutlet {

	 private SmartphoneCharger cp;
	 public SmartphoneAdapter(SmartphoneCharger cp){
	        this.cp = cp;
	    }

	    @Override
	    public String plugIn() {
	        return cp.chargePhone();
	    }
	
	
}
