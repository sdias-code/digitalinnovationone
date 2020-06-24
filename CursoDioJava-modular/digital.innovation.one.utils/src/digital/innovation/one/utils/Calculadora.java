package digital.innovation.one.utils;

import digital.innovation.one.utils.internal.MultiHelper;
import digital.innovation.one.utils.internal.SubHelper;
import digital.innovation.one.utils.internal.SumHelper;
import digital.innovation.one.utils.internal.DiviHelper;

public class Calculadora {
    private DiviHelper diviHelper;
    private MultiHelper multiHelper;
    private SumHelper sumHelper;
    private SubHelper subHelper;

    public Calculadora(){
        diviHelper = new DiviHelper();
        multiHelper = new MultiHelper();
        sumHelper = new SumHelper();
        subHelper = new SubHelper();
    }
    public int sum(int a, int b){
        return sumHelper.execute(a,b);
    }
    public int sub(int a, int b){
        return subHelper.execute(a,b);
    }
    public int div(int a, int b){
        return diviHelper.execute(a,b);
    }
    public int multi(int a, int b){
        return multiHelper.execute(a,b);
    }

}
