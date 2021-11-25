package Fecha;

import javax.swing.JOptionPane;

/*Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. 
Suponiendo que todos los meses son de 30 dias.*/

public class Fecha {
    public static void main(String[] args) {
        int dia, mes, anio;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
        anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año: "));
        
        
        if (dia >= 1 && dia <= 30 ){
            if (mes >= 1 && mes <=12){
                if (anio != 0){
                    JOptionPane.showMessageDialog(null, " Fecha Correcta");
                }
                else{
                    JOptionPane.showMessageDialog(null, " Fecha Incorrecta, Año incorrecto");
                }
            }
            else {
                JOptionPane.showMessageDialog(null, " Fecha Incorrecta, mes incorrecto");
            }
        } 
        else {
            JOptionPane.showMessageDialog(null, " Fecha Incorrecta, dia incorrecto");
        }
        
       
    }
    
}
