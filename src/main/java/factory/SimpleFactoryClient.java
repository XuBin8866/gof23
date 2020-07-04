package factory;

public class SimpleFactoryClient {
    public static void main(String[] args) {
        SimpleFactory sf=new SimpleFactory();
        sf.callMasterYi().skill();
        sf.callRiven().skill();
    }

}
