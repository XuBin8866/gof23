package adapter;

/**
 * @author xxbb
 */
public class PowerAdapter implements DC5{
    private AC220 ac220;
    public PowerAdapter(AC220 ac220){
        this.ac220=ac220;
    }

    @Override
    public int outputDC5() {
        int adapterInput=ac220.outputAC220V();
        //变压
        int adapterOutput=adapterInput/44;
        System.out.println("输入电流："+adapterInput+",输出电流"+adapterOutput);
        return adapterOutput;
    }
}
