package Calculator;

import java.util.HashMap;
import java.util.Map;
import java.math.*;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Program {
    public static void main(String ... args){
        Calculator calc = new Calculator();
        System.out.println(calc.calculate("√",27,3));
    }
}

class Calculator{
    Map<String,Calculable> map= new HashMap<>();
    public Calculator(){
        fill();
    }
    private void fill(){
        map.put("+",(b)-> b[0]+b[1]);
        map.put("-",(b)-> b[0]-b[1]);
        map.put("*",(b)-> b[0]*b[1]);
        map.put("/",(b)-> b[0]/b[1]);
        map.put("^",(b)->pow(b[0],b[1]));
        map.put("2√",(b)->sqrt(b[0]));//В принципе не нужен, просто для практики
        map.put("√",(b)->pow(b[0],1/b[1]));
    }

    public double calculate(String operator,int a, int b){
        return map.get(operator).calculate(a,b);
    }
}


interface Calculable{
    double calculate(double ... args);//double ... args==String[] args
}