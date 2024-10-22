
package calculadorafraccion;

import javax.swing.JOptionPane;

public class Fraccion 
{
    private int num;
    private int den;
    
    public Fraccion()
    {
        num = 0;        //forma basica de la fraccion, 0/1.
        den = 1;   
    }
    
    /**
    * Constructor alternativo recibe como parámetros num y den,
    * inicializa los atributos con los valores de los parámetros 
    * el parametro den no puede ser cero 
    * En caso que den sea cero, se inicializan los atributos 
    * a la fraccion por defecto 0/1
    */

    public Fraccion(int num, int den)
    {
        if(den == 0)
        {
            num = 0;    //Si una fraccion tiene denominador 0, sera automaticamente fraccion 0/1
            den = 1;
        }
        
        this.num = num;
        this.den = den; //La variable global se iguala a la local para que el metodo simplificar tenga efecto.
        
        simplificar();  //uso del metodo simplificar para simplificar la fraccion.
        
    }
    
    public void setDen(int den) {
        this.den = den;
    }

    public void setNum(int num) {
        this.num = num;
    }    

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }
    
    @Override
    public String toString() {
        return num+"/"+den; 
    }
    
    /* Metodo simplificar 
       Para simplificar una fracción primero hay que hallar 
       el mcd del numerador y del denominador. 
       Una vez hallado se divide el numerador y el denominador
       por este número
    */
    private void simplificar()
    {
        int a;    //variable a que tomara el valor del mcd
        
        a = mcd();
        
        if(a!=0)        // evitar la division entre un posible caso de 0 para que no quede 0/0
        {
            num=num/a;  //Division de las variables globales entre su mcd
            den=den/a;
        }
        
    }
    
    private int mcd(){
      int u=Math.abs (num); 
      int v=Math.abs (den) ;
        if (v==0) {
            return u;
        } //end if
      int r;
        while (v!=0) {
            r=u%v;
            u=v;
            v=r;
        } //end while
      return u;
      
    } //end mcd
    
/************************************************************************
Palabra de honor:
* No he discutido ni mostrado el código de mi programa con alguien que no sea mi compañero,
* Profesor o con el monitor asignado a este curso.
*
* No he utilizado código obtenido de otro u otros estudiantes,
* O cualquier otra fuente no autorizada, ya sea modificado o sin modificar.
*
* Si cualquier código o documentación utilizada en mi programa
* Fue obtenido de otra fuente, tal como un libro de texto o notas del curso
* debe ser claramente señalado con una cita apropiada en
* los comentarios de mi programa.
*
* <Camilo gallego leon – 0222220005>*
************************************************** *********************/
    
}
