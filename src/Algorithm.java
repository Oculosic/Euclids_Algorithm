import java.util.ArrayList;

public  class Algorithm {
    static int r = 1;
    static int s = 0;
    static int t = 0;
    static boolean swap = false;
    public static void calculate(int a, int b){
        if(a < b) {
            a = a + b;
            b = a - b;
            a = a - b;
            swap = true;
        }
        else{
            swap = false;
        }
        ArrayList<Integer> qValues = new ArrayList();
        int origA = a;
        int origB = b;
        if(a % b != 0) {
            while (a % b != 0) {
                r = a % b;
                int q = (a - r) / b;
                qValues.add(-q);
                a = b;
                b = r;
            }
            System.out.println("qsize: "+qValues.size());
            System.out.println("qValues: " + qValues);
            int c = 1;
            for(int i = qValues.size() - 1; i > 1; i--) {
                qValues.add(i - 1, qValues.get(i) * qValues.get(i - 1) + c);
                c = qValues.get(i + 1) * c;
            }
            if(qValues.size() == 1 && qValues.get(0) == -1){
                s = -1;
            }
            else{
                s = qValues.get(1);
            }
            System.out.println("qsize: "+qValues.size());
            System.out.println("qvalues: "+qValues);

        }
        else{
            System.out.println("ELSE");
            r = b;
            s = 1;
        }

        t = r-origA*s;
        t = t/origB;
        System.out.println("Swap: "+swap);
        if(swap == true){
            s = s + t;
            t = s - t;
            s = s - t;
        }
    
        System.out.println("qsize: "+qValues.size());
    }
    
    public static int getR(){
        System.out.println("r: "+r);
        return r;
    }
    public static int getS(){
        System.out.println("s: "+s);
        return s;
    }
    public static int getT(){
        System.out.println("t: "+t);
        return t;
    }
}