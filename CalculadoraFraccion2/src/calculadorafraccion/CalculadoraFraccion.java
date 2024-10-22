
package calculadorafraccion;

import javax.swing.JOptionPane;

public class CalculadoraFraccion 
{

    public static void main(String[] args) 
    {
        
        Fraccion f1 = new Fraccion(1,4);        //CODIGO BASE
        Fraccion f2 = new Fraccion(2,4);        //CODIGO BASE
        Fraccion f3 = new Fraccion();                   //CODIGO BASE
        Fraccion f4 = new Fraccion (4,1);       //CODIGO BASE
        
        Fraccion suma = sumar(f1,f2);                   //CODIGO BASE
        Fraccion resta = restar(f1,f3);              //CODIGO BASE
        Fraccion producto = multiplicar(f1,f4);      //CODIGO BASE
        Fraccion cociente = dividir (f1,f2);            //CODIGO BASE
                                                        
        JOptionPane.showMessageDialog(null, f1+"+"+f2+"="+suma);        //CODIGO BASE
        JOptionPane.showMessageDialog(null, f1+"-"+f3+"="+resta);       //CODIGO BASE
        JOptionPane.showMessageDialog(null, f1+"*"+f4+"="+producto);    //CODIGO BASE
        JOptionPane.showMessageDialog(null, f1+"/"+f2+"="+cociente);    //CODIGO BASE
        
        Mixto m1 = new Mixto (2,f1);                    //CODIGO BASE
        Mixto m2 = new Mixto (3,1,4);             //CODIGO BASE
        Mixto m3 = new Mixto (1,f2);                    //CODIGO BASE
        Mixto suma2 = sumar(m1,m2);                            //CODIGO BASE
 
        int menu=0,menu2=0,tipofraccion1=0,tipofraccion2=0,ID=0;                                //Declaracion de las variables menu, Guardan todas las elecciones que se hacen
        int numerador=0,numerador2=0,denominador=0,denominador2=0,coeficiente=0,coeficiente2=0; //Declaracion de las variables que tienen la informacion de las fracciones.
        Historial his1=null,his2=null;
        //Sistema ID = Las fracciones mixtas y normales tendran un orden especifico, ese orden tendra un id, las cuatro posibles situaciones tienen uno de los 4 posibles id (1,2,3,4).
        //Sistem implementado con el objetivo de identificar el tipo de variables a inicializar.
        
        //INICIO DE LA INTERFAZ DEL MENU PRINCIPAL (menu).
        
        for(int i=1,j=2; i<j; i++,j++) //Menu como ciclo, esto permitira volver al inicio sin problema.
        {
        
            for(int i1=0; i1<1;)
            {
                menu = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el tipo de fraccion a operar o abrir el historial de operaciones: \n \n "   //Peticion del valor de menu.
                                      + "1)Operaciones de fracciones. \n "
                                      + "2)Historial de operaciones. \n"
                                      + "3)Cerrar aplicacion."));
                
                
                if(menu!=1 & menu!=2 & menu!=3 & menu!=4 & menu!=5 & menu!=6)
                {
                    JOptionPane.showMessageDialog(null, "Comando no valido");  //Validacion, si ingresan un dato que no existe en el menu reinicia el menu.
                }
                else
                {
                    i1=1;
                }
            
            }
            
            //FINAL DE LA INTERFAZ DEL MENU PRICIPAL (menu).

            //INICIO DE SWITCH CASE DEL MENU PRINCIPAL.    
            
            switch(menu)
            {
                
                case 1:
                    
                    
                    tipofraccion1 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el tipo de fraccion de la fraccion 1: \n"
                                                                                      +"1)Fraccion normal. \n "       
                                                                                      +"2)Fraccion mixta. \n\n"));                          //Seleccion del tipo de fraccion 1 y 2 de los que se va a hace- 
                    tipofraccion2 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el tipo de fraccion de la fraccion 2: \n"    //-r la operacion.
                                                                                      +"1)Fraccion normal. \n "
                                                                                      +"2)Fraccion mixta. \n\n"));       
                           
                    if(tipofraccion1 == 1)
                    {
                            
                    numerador=Integer.parseInt(JOptionPane.showInputDialog("Construccion de la fraccion: \n"
                                                                           +"Fraccion 1: "+numerador+"/"+denominador+"\n"
                                                                           +"Ingrese el valor del numerador de la fraccion 1: "));              //caso fraccion 1 normal
                            
                    denominador=Integer.parseInt(JOptionPane.showInputDialog("Construccion de la fraccion: \n"
                                                                           +"Fraccion 1: "+numerador+"/"+denominador+"\n"
                                                                           +"Ingrese el valor del denominador de la fraccion 1: "));
                            
                    }
                        
                    if(tipofraccion1 == 2)
                    {
                            
                    coeficiente=Integer.parseInt(JOptionPane.showInputDialog("Construccion de la fraccion: \n"
                                                                           +"Fraccion 1: "+coeficiente+"("+numerador+"/"+denominador+")"+"\n"
                                                                           +"Ingrese el valor del numerador de la fraccion 1: "));
                            
                    numerador=Integer.parseInt(JOptionPane.showInputDialog("Construccion de la fraccion: \n"                                    //Caso fraccion 1 mixta
                                                                           +"Fraccion 1: "+coeficiente+"("+numerador+"/"+denominador+")"+"\n"
                                                                           +"Ingrese el valor del numerador de la fraccion 1: "));
                            
                    denominador=Integer.parseInt(JOptionPane.showInputDialog("Construccion de la fraccion: \n"
                                                                           +"Fraccion 1: "+coeficiente+"("+numerador+"/"+denominador+")"+"\n"
                                                                           +"Ingrese el valor del numerador de la fraccion 1: "));
                    ID=ID+2;  //Respectiva suma al id para identificar el orden.      
                    }
                        
                    if(tipofraccion2 == 1)
                    {
                            
                    numerador2=Integer.parseInt(JOptionPane.showInputDialog("Construccion de la fraccion: \n"
                                                                           +"Fraccion 2: "+numerador2+"/"+denominador2+"\n"
                                                                           +"Ingrese el valor del numerador de la fraccion 2: "));
                                                                                                                                                //Caso fraccion 2 normal
                    denominador2=Integer.parseInt(JOptionPane.showInputDialog("Construccion de la fraccion: \n"
                                                                           +"Fraccion 2: "+numerador2+"/"+denominador2+"\n"
                                                                           +"Ingrese el valor del denominador de la fraccion 2: "));
                    ID=ID+1;
                    }
                        
                    if(tipofraccion2 == 2)
                    {
                            
                    coeficiente2=Integer.parseInt(JOptionPane.showInputDialog("Construccion de la fraccion: \n"
                                                                           +"Fraccion 2: "+coeficiente2+"("+numerador2+"/"+denominador2+")"+"\n"
                                                                           +"Ingrese el valor del numerador de la fraccion 2: "));
                            
                    numerador2=Integer.parseInt(JOptionPane.showInputDialog("Construccion de la fraccion: \n"                                       //Caso fraccion 2 mixta
                                                                           +"Fraccion 2: "+coeficiente2+"("+numerador2+"/"+denominador2+")"+"\n"
                                                                           +"Ingrese el valor del numerador de la fraccion 2: "));
                            
                    denominador2=Integer.parseInt(JOptionPane.showInputDialog("Construccion de la fraccion: \n"
                                                                           +"Fraccion 2: "+coeficiente2+"("+numerador2+"/"+denominador2+")"+"\n"
                                                                           +"Ingrese el valor del numerador de la fraccion 2: "));
                    ID=ID+2;    //Respectiva suma al id para identificar el orden. 
                    }
                break;
                
                case 2:
                    
                    if(his1==null & his2==null)
                    {
                        JOptionPane.showMessageDialog(null, "Aun no se realizan movimientos");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Ultimos dos movimientos: \n"
                                                                    +his1+"\n"
                                                                    +his2);
                    }
                    
                    i=i-1;
                    j=j-1;
                    
                break;    
                
                case 3:
                    
                    i=j;
                
                break;    
                    
            }   
         
            //FINAL DEL SWITCH CASE DEL MENU PRINCIPAL.
            
            Fraccion fra11,fra12,fra21,fra32;     //Declaracion de las fracciones normales y mixtas que se van a usar para las operaciones y muestra de resultador.
            Mixto mix22,mix31,mix41,mix42;
            
            //Sistema de identificacion de los objetos, cada objeto tiene una palabra clave y dos digitos de identificaion, la palabra clave "fra" o "mix" identifica si se trata de una fraccion mix-
            //-ta o normal, el primer digito identifica a que id pertenece, este digito sera el id mas uno, el segundo digito indica el orden, uno o dos, para identificar si es el que resta o es el-
            //-restado, si divide o es dividido, ademas se encuentra una extension "_fra", esta indica que es una fraccion mixta convertida a fraccion normal.
            
            if(ID==1)
            {
                //INICIO DEL CASO OPERACION (FRACCION NORMAL)(FRACCION NORMAL)
                
                fra11 = new Fraccion(numerador,denominador);     //Declaracion de las fracciones necesarias para las operaciones.
                fra12 = new Fraccion(numerador2,denominador2);   
                
                menu2 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el tipo de operacion a realizar: \n"
                                                                      +"1)Suma \n"
                                                                      +"2)resta \n"
                                                                      +"3)multiplicacion \n"
                                                                      +"4)division \n"));
                
                switch(menu2)
                {
                    case 1:
                        
                        Fraccion suma1 = sumar(fra11,fra12);                                          //Suma de las fracciones
                        JOptionPane.showMessageDialog(null, fra11+"+"+fra12+"="+suma1);       //Interfaz de la suma de las fracciones
                        
                        if(i%2==1)
                        {
                            his1 = new Historial(i,1,fra11,fra12,suma1);
                        }
                        else
                        {
                            his2 = new Historial(i,1,fra11,fra12,suma1);
                        }
                        
                    break;

                    case 2:
                        
                        Fraccion resta1 = restar(fra11,fra12);                                        //Resta de las fracciones
                        JOptionPane.showMessageDialog(null, fra11+"-"+fra12+"="+resta1);          //Interfaz de la resta de las fracciones

                    break;

                    case 3:
                        
                        Fraccion multiplicar1 = multiplicar(fra11,fra12);                             //Multiplicacion de las fracciones
                        JOptionPane.showMessageDialog(null, fra11+"*"+fra12+"="+multiplicar1);    //Interfaz de la multiplicacion de las fracciones

                    break;

                    case 4:

                        Fraccion dividir1 = dividir(fra11,fra12);                                     //Division de las fracciones
                        JOptionPane.showMessageDialog(null, fra11+"/"+fra12+"="+dividir1);        //Interfaz de la division de las fracciones

                    break;    
                }
                
                //FIN DEL CASO (FRACCION NORMAL)(FRACCION NORMAL)
                
            }
            else
            {
                if(ID==2)
                {
                    
                    //INICIO DEL CASO (FRACCION NORMAL)(FRACCION MIXTA)
                    
                    fra21 = new Fraccion(numerador,denominador);                        //Declaracion de las fracciones necesarias para las operaciones.
                    mix22 = new Mixto(coeficiente2,numerador2,denominador2);
                    
                    Fraccion mix2_fra = convertirMixtoFraccion(mix22);                          //Conversion de la fraccion mixta "mix22" a fraccion normal "mix22_fra".
                    menu2 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el tipo de operacion a realizar: \n"
                                                                      +"1)Suma \n"
                                                                      +"2)resta \n"
                                                                      +"3)multiplicacion \n"
                                                                      +"4)division \n"));
                
                    switch(menu2)
                    {
                        case 1:

                            Fraccion suma1 = sumar(fra21,mix2_fra);                                          //Suma de las fracciones
                            JOptionPane.showMessageDialog(null, fra21+"+"+mix22+"="+suma1);       //Interfaz de la suma de las fracciones

                        break;

                        case 2:

                            Fraccion resta1 = restar(fra21,mix2_fra);                                        //Resta de las fracciones
                            JOptionPane.showMessageDialog(null, fra21+"-"+mix22+"="+resta1);          //Interfaz de la resta de las fracciones

                        break;

                        case 3:

                            Fraccion multiplicar1 = multiplicar(fra21,mix2_fra);                             //Multiplicacion de las fracciones
                            JOptionPane.showMessageDialog(null, fra21+"*"+mix22+"="+multiplicar1);    //Interfaz de la multiplicacion de las fracciones

                        break;

                        case 4:

                            Fraccion dividir1 = dividir(fra21,mix2_fra);                                     //Division de las fracciones
                            JOptionPane.showMessageDialog(null, fra21+"/"+mix22+"="+dividir1);        //Interfaz de la division de las fracciones

                        break;    
                    }
                    
                    //FINAL DEL CASO (FRACCION NORMAL)(FRACCION MIXTA)
                    
                }
                else
                {
                    if(ID==3)
                    {
                        
                        //INICIO DEL CASO (FRACCION MIXTA)(FRACCION NORMAL)
                        
                        mix31 = new Mixto(coeficiente,numerador,denominador);           //Declaracion de las fracciones necesarias para las operaciones.
                        fra32 = new Fraccion(numerador2,denominador2);
                    
                        Fraccion mix31_fra = convertirMixtoFraccion(mix31);                         //Conversion de la fraccion mixta "mix31" a fraccion normal "mix31_fra".
                        menu2 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el tipo de operacion a realizar: \n"
                                                                      +"1)Suma \n"
                                                                      +"2)resta \n"
                                                                      +"3)multiplicacion \n"
                                                                      +"4)division \n"));
                
                        switch(menu2)
                        {
                            case 1:

                                Fraccion suma1 = sumar(fra32,mix31_fra);                                          //Suma de las fracciones
                                JOptionPane.showMessageDialog(null, fra32+"+"+mix31+"="+suma1);       //Interfaz de la suma de las fracciones

                            break;

                            case 2:

                                Fraccion resta1 = restar(fra32,mix31_fra);                                        //Resta de las fracciones
                                JOptionPane.showMessageDialog(null, fra32+"-"+mix31+"="+resta1);          //Interfaz de la resta de las fracciones

                            break;

                            case 3:

                                Fraccion multiplicar1 = multiplicar(fra32,mix31_fra);                             //Multiplicacion de las fracciones
                                JOptionPane.showMessageDialog(null, fra32+"*"+mix31+"="+multiplicar1);    //Interfaz de la multiplicacion de las fracciones

                            break;

                            case 4:

                                Fraccion dividir1 = dividir(fra32,mix31_fra);                                     //Division de las fracciones
                                JOptionPane.showMessageDialog(null, fra32+"/"+mix31+"="+dividir1);        //Interfaz de la division de las fracciones

                            break;    
                        }
                        
                        //FINAL DEL CASO (FRACCION MIXTA)(FRACCION NORMAL)
                        
                    }
                    else
                    {
                        if(ID==4)
                        {
                            
                            //INICIO DEL CASO (FRACCION MIXTA)(FRACCION MIXTA)
                            
                            mix41 = new Mixto(coeficiente,numerador,denominador);               //Declaracion de las fracciones necesarias para las operaciones.
                            mix42 = new Mixto(coeficiente2,numerador2,denominador2);
                            
                            Fraccion mix41_fra = convertirMixtoFraccion(mix41);                             //Declaracion de las fracciones mixtas "mix41" y mix42" a fracciones normales, esto con el-
                            Fraccion mix42_fra = convertirMixtoFraccion(mix42);                             //-objetivo de poder hacer las operaciones de multiplicacion y division.
                            
                            menu2 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el tipo de operacion a realizar: \n"
                                                                      +"1)Suma \n"
                                                                      +"2)resta \n"
                                                                      +"3)multiplicacion \n"
                                                                      +"4)division \n"));
                
                            switch(menu2)
                            {
                                case 1:

                                    Mixto suma1 = sumar(mix41,mix42);                                          //Suma de las fracciones
                                    JOptionPane.showMessageDialog(null, mix41+"+"+mix42+"="+suma1);       //Interfaz de la suma de las fracciones

                                break;

                                case 2:

                                    Mixto resta1 = restar(mix41,mix42);                                        //Resta de las fracciones
                                    JOptionPane.showMessageDialog(null, mix41+"-"+mix42+"="+resta1);          //Interfaz de la resta de las fracciones

                                break;

                                case 3:

                                    Fraccion multiplicar1 = multiplicar(mix41_fra,mix42_fra);                             //Multiplicacion de las fracciones
                                    JOptionPane.showMessageDialog(null, mix41+"*"+mix42+"="+multiplicar1);    //Interfaz de la multiplicacion de las fracciones

                                break;

                                case 4:

                                    Fraccion dividir1 = dividir(mix41_fra,mix42_fra);                                     //Division de las fracciones
                                    JOptionPane.showMessageDialog(null, mix41+"/"+mix42+"="+dividir1);        //Interfaz de la division de las fracciones
                                    
                                    
                                    
                                break;   
                                
                                //FINAL DEL CASO (FRACCION MIXTA)(FRACCION MIXTA)
                                
                            }   
                        }
                    }
                }
            }
            numerador = 0;
            denominador = 0;        //Reinicio de las variables para reinicializar el menu desde cero
            numerador2 = 0;
            denominador2 = 0;
            coeficiente = 0;
            coeficiente2 = 0;
            ID=0;
        }
    }
    
    /*Método convertir mixto a fraccion, recibe como parametro un
      Mixto y devuelve la fracción f, que corresponde al 
      numero mixto m1
    */
    public static Fraccion convertirMixtoFraccion(Mixto m1)
    {
        Fraccion f=null;
        
        int a = 1, b = 1;
        
        a = m1.getParteEntera();        //Declaramos a como la parte entera de la fraccion mixta con el objetivo de unirla a la fraccion realizando la respectiva multiplicacion.
        a = a*m1.getF().getNum();       //Multiplicacion del coeficiente por el numerador de la fraccion.
        
        f = new Fraccion(a,m1.getF().getDen()); 
                                                        //Devolvemos a (que es el producto del numerador de la fraccion y el coeficiente de la fraccion) y devolvemos tambien el denominador de la fraccion.
        return f;
    } 
    
    /*Método sumar fraccionarios, recibe como parametros dos
      fracciones f1 y f2 y devuelve la fracción f3, con el resultado de 
      la suma. f3 = f1+f2
    */
    public static Fraccion sumar(Fraccion f1, Fraccion f2)
    {
        
        Fraccion f3=null;
        
        int a=1,b=1,c=1,d=1;
        
        a=f1.getDen();      //Obtenemos los valores de los denominadores de las fracciones f1 y f2.
        b=f2.getDen();      
        
        c=f1.getNum()*(b);     //multiplicamos la fraccion f1 por el denominador de la fraccion f2 y viceversa para obtener el mismo denominador en ambas fracciones y asi poder sumarlas.
        d=f2.getNum()*(a);
                
        f3 = new Fraccion(c+d,a*b); //Enviamos la suma de los numeradores(al tener el mismo denominador simplemente se suman) y enviamos la multiplicacion de ambos denominadores (pues ahora tienen el mismo)
        
        return f3;
    }
    
    /*Método sumar mixtos, recibe como parametros dos
      mixtos m1 y m2 y devuelve el mixto m3, con el resultado de 
      la suma. m3 = m1+m2
    */
    public static Mixto sumar(Mixto m1, Mixto m2)
    {
        Mixto m3=null;
        
        int a=1;
        
        Fraccion f1 = convertirMixtoFraccion(m1);           //Convertimos los mixtos m1 y m2 en fracciones.
        Fraccion f2 = convertirMixtoFraccion(m2);
        
        Fraccion suma2 = sumar(f1,f2);                      //Sumamos los mixtos m1 y m2 aprovechando el metodo sumar para fracciones ya establecido
           
        a = suma2.getNum();                                 //Convertimos la fraccion resultante de la suma en mixto nuevamente, A sera el coeficiente de la nueva fraccion mixta.
        
        m3 = new Mixto(a, 1, suma2.getDen());  //Retornamos m3 con: a(coeficiente), 1(numerador, que resulta de la conversion de fraccion normal a mixta), suma2.getDen(El denominador result-
                                                            //-ante del metodo sumar, el cual es el denominador de las fracciones sumadas).
        return m3;
    }
    
    /*Método restar fraccionarios, recibe como parametros dos
      fracciones f1 y f2 y devuelve la fraccion f3, con el resultado de 
      la resta. f3 = f1-f2
    */
    public static Fraccion restar(Fraccion f1, Fraccion f2)
    {
        Fraccion f3=null;
        
        int a=1,b=1,c=1,d=1;
        
        a=f1.getDen();      //Obtenemos los valores de los denominadores de las fracciones f1 y f2.
        b=f2.getDen();      
        
        c=f1.getNum()*(b);     //multiplicamos la fraccion f1 por el denominador de la fraccion f2 y viceversa para obtener el mismo denominador en ambas fracciones y asi poder restarlas.
        d=f2.getNum()*(a);
                
        f3 = new Fraccion(c-d,a*b); //Enviamos la resta de los numeradores(al tener el mismo denominador simplemente se restan) y enviamos la multiplicacion de ambos denominadores (pues ahora tienen el mismo)
        
        return f3;
    }
    
    public static Mixto restar(Mixto m1, Mixto m2){
        Mixto m3=null;
        
        int a=1;
        
        Fraccion f1 = convertirMixtoFraccion(m1);           //Convertimos los mixtos m1 y m2 en fracciones.
        Fraccion f2 = convertirMixtoFraccion(m2);
        
        Fraccion resta2 = restar(f1,f2);                    //Restamos los mixtos m1 y m2 aprovechando el metodo restar para fracciones ya establecido
           
        a = resta2.getNum();                                //Convertimos la fraccion resultante de la resta en mixto nuevamente, A sera el coeficiente de la nueva fraccion mixta.
        
        m3 = new Mixto(a, 1, resta2.getDen()); //Retornamos m3 con: a(coeficiente), 1(numerador, que resulta de la conversion de fraccion normal a mixta), resta2.getDen(El denominador resul-
                                                            //-tante del metodo restar, el cual es el denominador de las fracciones restadas)
        return m3;
    }
    
    /*Método multiplicar fraccionarios, recibe como parametros dos
      fracciones f1 y f2 y devuelve la fraccion f3, con el resultado de 
      la multiplicación. f3 = f1*f2
    */
    public static Fraccion multiplicar(Fraccion f1, Fraccion f2)
    {
        Fraccion f3=null;
        
        int a=1,b=1;                //declaracion de las variables que seran el producto de las fracciones, denominador y numerador.
        
        a = f1.getNum();
        a = a * f2.getNum();       //Multiplicacion de los numeradores de las fracciones f1 y f2.
        
        b = f1.getDen();            
        b = b * f2.getDen();        //Multiplicacion de los denominadores de las fracciones f1 y f2.
        
        f3 = new Fraccion(a, b);    
                                            //Devolvemos los valores a(producto de los numeradores) y b(producto de los denominadores).
        return f3;
    }
    
    /*Método dividir fraccionarios, recibe como parametros dos
      fracciones f1 y f2 y devuelve la fraccion f3, con el resultado de 
      la división. f3 = f1*f2
    */
    public static Fraccion dividir(Fraccion f1, Fraccion f2)
    {
        
        Fraccion f3=null;
        
        int a=1,b=1;                    //La division de fracciones es basicamente la multiplicacion del numerador de la primera por el denominador de la segunda y el denominador de la primera 
                                        //por el numerador de la segunda
        a = f1.getNum();             
        a = a*f2.getDen();              //Numerador de la primera fraccion por el denominador de la segunda, se va a llamar a y es el numerador. 
        
        b = f2.getNum();                    
        b = b*f1.getDen();              //Numerador de la segunda fraccion por el denominador de la primera, se va a llamar b y es el denominador.
        
        f3 = new Fraccion(a,b);   //Fraccion completa, devolvemos f3 con el resultado de la division de fracciones. (Inspirado en el metodo de "la oreja" de division de fracciones)
        
        return f3;
        
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
