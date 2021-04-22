package github;

public class Operadores {

    
    public static void main(String[] args) 
    {
     int A=20,B=10,C=0,D=20,E=40,F=30;
     boolean condition=true;
     
     //operador pre-incremento
     //A=A+1 enontes C=A
     C=++A;
     System.out.println("valor de C(++A)-" +C);
     
     //Operador de post-incremneto
     //C=B entonces B=B+1
        System.out.println("valor de C(++):" +C);
        
     //oprerador de preincrementando 
     //D=D-1 entonces c=d
     C=-D;
        System.out.println("valor de C(-D):" +C);
        
     //operador de postdrecremento 
     // C=0 enotonces C=E-1 
     C=-E;
        System.out.println("valor de C(E-)=" +C);   
        
     //operador logico not
        System.out.println("valor de !condition="+ !condition);
     
    }
    
}
