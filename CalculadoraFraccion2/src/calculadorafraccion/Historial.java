
package calculadorafraccion;

public class Historial 
{
    int tipo;
    Fraccion fra1,fra2,fra3;
    Mixto mix1,mix2,mix3;
    String operacion;
    
    public Historial(int slot,int tipo,Fraccion fra1,Fraccion fra2,Fraccion fra3)
    {
        this.fra1 = fra1;
        this.fra2 = fra2;
        this.fra3 = fra3;
        this.tipo = tipo;
    }
    public Historial(int slot,int tipo,Fraccion fra1,Mixto fra2, Fraccion fra3)
    {
        
    }
    public Historial(int slot,int tipo,Mixto fra1,Fraccion fra2, Fraccion fra3)
    {
        
    }
    public Historial(int slot,int tipo,Mixto fra1,Mixto fra2,Mixto fra3)
    {
        
    }
    @Override
    public String toString() 
    {
    
        if(tipo == 1)
        {
            operacion = "+";
        }
        else
        {
            if(tipo == 2)
            {
                operacion = "-";
            }
            else
            {
                if(tipo == 3)
                {
                    operacion = "*";
                }
                else
                {
                    if(tipo == 4)
                    {
                        operacion = "/";
                    }
                }
            }
        }
        
        return fra1+operacion+fra2+"="+fra3;
        
    }
}
