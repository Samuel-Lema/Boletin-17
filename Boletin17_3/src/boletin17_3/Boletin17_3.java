package boletin17_3;

import javax.swing.JOptionPane;

public class Boletin17_3 {

    public static void main(String[] args) {
        
        int[] notas = {3, 7, 9, 3, 6 };
        String[] alumnos = { "Samuel", "Jose", "Dani", "Pepe", "Alberto" };
        
        // Alumnos Aprobados
        
        System.out.println("Alumnos aprobados: ");
        
        for (int i = 0; i < alumnos.length; i++){
            
            if(5 <= notas[i]) {
                System.out.println(alumnos[i]);
            }
            
        }
        
        // Notas y Alumnos ordenados
        
        System.out.println("Notas ordenadas: ");
        ordenDesc(notas, alumnos);
        
        for (int i = 0; i < alumnos.length; i++){
            
            System.out.println(alumnos[i] + ": " + notas[i]);
        }
        
        // Mostrar nota do alumno a buscar
        
        String busqueda = JOptionPane.showInputDialog("Nome da persoa a buscar: ");
        
        for (int i = 0; i < alumnos.length; i++){
            
            if (busqueda.equals(alumnos[i])){
                System.out.println("Alumno: " + alumnos[i] + ", Nota: " + notas[i]); break;
            }
        }
    }
    
    static void ordenDesc(int[] orden, String[] alumnos) {
        
        for (int i = 0 ; i < orden.length - 1 ; i++) {
            int max = i;
 
            for (int j = i + 1 ; j < orden.length ; j++) {
                if (orden[j] > orden[max]) {
                    max = j;
                    
                }
            }
 
            if (i != max) {
                
                int aux = orden[i];
                orden[i] = orden[max];
                orden[max] = aux;
                
                String aux2 = alumnos[i];
                alumnos[i] = alumnos[max];
                alumnos[max] = aux2;
            }
        }
    }
    
}
