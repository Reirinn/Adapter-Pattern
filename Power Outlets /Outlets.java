public class Outlets {

    public static void main(String[] args){

        Laptop laptop = new Laptop();
        PowerOutlet lpPo = new LaptopAdapter(laptop);

        Refrigerator ref = new Refrigerator();
        PowerOutlet refPo = new RefrigeratorAdapter(ref);

        SmartphoneCharger charger = new SmartphoneCharger();
        PowerOutlet chargerPo = new SmartphoneAdapter(charger);

        
        System.out.println(lpPo.plugIn());
        System.out.println(refPo.plugIn());
        System.out.println(chargerPo.plugIn());

        System.out.println();

     

    }
}
