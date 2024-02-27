package Calculator;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String ... args){
        Calculator calc = new Calculator();
        System.out.println(calc.calculate("/",4,7));
    }
}

class Calculator{
    Map<String,Calculable> map= new HashMap<>();
    public Calculator(){
        fill();
    }
    private void fill(){
        map.put("+", new Addition());
        map.put("-",(b)-> b[0]-b[1]);
        map.put("*",(b)-> b[0]*b[1]);
    }
    public double add(int a, int b){
        return a+b;
    }
    public double subtract(int a, int b){
        return a-b;
    }
    public double multiply(int a, int b){
        return a*b;
    }
    public double calculate(String operator,int a, int b){
        return map.get(operator).calculate(a,b);
    }
}

class Addition implements Calculable{

    @Override
    public double calculate(double... args) {
        if (args.length<2){
            throw new RuntimeException("Мало аргументов");
        }
        return args[0]+args[1];
    }
}
interface Calculable{
    double calculate(double ... args);//double ... args==String[] args
}