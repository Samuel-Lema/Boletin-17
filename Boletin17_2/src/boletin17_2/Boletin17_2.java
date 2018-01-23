package boletin17_2;

public class Boletin17_2 {

    public static void main(String[] args) {
        
        int[] notas = {3, 7, 9, 3, 1 };
        
        int aprobados = 0, suspensos = 0, max = 0;
        float media = 0;
        
        for (int nota: notas){
            
            if(5 <= nota) {
                aprobados += 1;
            } else {
                suspensos += 1;
            }
            
            media += nota;
            
            if(nota > max){
                max = nota;
            }
        }
        
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspensos: " + suspensos);
        
        System.out.println("Media: " + (media / notas.length));
        
        System.out.println("Mellor Nota: " + max);
    }
    
}
