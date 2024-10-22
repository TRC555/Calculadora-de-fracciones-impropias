
package calculadorafraccion;

import javax.swing.JOptionPane;

public class Mixto {
    private int parteEntera;
    private Fraccion f;
    
    /**
    * Constructor por defecto no recibe parámetros crea 
    * el Mixto por defecto 1 0/1 
    */
    public Mixto()
    {
        f = new Fraccion(0,1);
        parteEntera = 1;
    }
    
    /**
    * Constructor alternativo recibe como parámetros pent y la fraccion f,
    * inicializa los atributos con los valores de los parámetros 
    */
    public Mixto(int Pent, Fraccion f)
    {
        if(Pent == 0)
        {
            f.setNum(0);
            f.setDen(1);        //Si el coeficiente de la fraccion es 0, la fraccion se convierte en 1*0/1
            Pent = 1;
        }
        
        if(f.getDen() == 0)
        {
            f.setNum(0);        //Si el denominador de la fraccion es 0, la fraccion se convierte en 1*0/1
            f.setDen(1);
            Pent = 1;
        }
        
        this.f = f;
        this.parteEntera = Pent;
      
    }
    
    /**
    * Constructor alternativo recibe como parámetros pent y los enteros 
    * num y den inicializa los atributos con los valores de los parámetros 
    * creando una fracción con los parametros num y den
    */
    public Mixto(int Pent, int num, int den)
    {
        
        f = new Fraccion (num, den);    //Declaramos la fraccion f, y convertimos el numerador y denominador en una fraccion, el resto es lo mismo que el constructor anterior.
        
        if(Pent == 0)
        {
            f.setNum(0);
            f.setDen(1);        //Si el coeficiente de la fraccion es 0, la fraccion se convierte en 1*0/1.
            Pent = 1;
        }
        
        if(f.getDen() == 0)
        {
            f.setNum(0);        //Si el denominador de la fraccion es 0, la fraccion se convierte en 1*0/1.
            f.setDen(1);
            Pent = 1;
        }
        
        this.parteEntera = Pent;       //La variable global se iguala a la local para aplicar el metodo "to.string".
    }

    

    public void setParteEntera(int parteEntera) {
        this.parteEntera = parteEntera;
    }
    
    public void setF(Fraccion f) {
        this.f = f;
    }

    public Fraccion getF() {
        return f;
    }
    public int getParteEntera() {
        return parteEntera;
    }
    
    @Override
    public String toString() {
        return parteEntera+" "+f.toString(); //3 1/2
    }
        
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
