package Arithmetic;

public class Arithmetic <T extends Number,U extends Number>{
   // private T object;

    Number a;
    Number b;

    public Arithmetic(T aGen,U bGen){
        this.a=aGen;
        this.b=bGen;
    }

    public Number add(){
        double sum;
        sum=a.doubleValue()+b.doubleValue();

        return sum;
    }

    public Number subtract(){
        double diff;
        diff=a.doubleValue()-b.doubleValue();
        return diff;
    }

    public Number multiply(){
        double mult;
        mult=a.doubleValue()-b.doubleValue();
        return mult;
    }

    public Number divide(){
        double div;
        div=a.doubleValue()-b.doubleValue();
        return div;
    }

    public Number getMin(){
      return  Math.min(a.doubleValue(), b.doubleValue());
    }
    public Number getMax(){
        return  Math.max(a.doubleValue(), b.doubleValue());
    }
}
