package boletin17_4;

public class Boletin17_4 {

    public static void main(String[] args) {
        
        String[] dnis = { "39454198", "12345678" };
            
        for(String dni: dnis){
            int temp = Integer.parseInt(dni);
            String temp2 = String.valueOf(temp/23);
            
            switch(temp2.substring(0,2)){
                case "0": dni = dni + "T"; break;
                case "1": dni = dni + "R"; break;
                case "2": dni = dni + "W"; break;
                case "3": dni = dni + "A"; break;
                case "4": dni = dni + "G"; break;
                case "5": dni = dni + "M"; break;
                case "6": dni = dni + "Y"; break;
                case "7": dni = dni + "F"; break;
                case "8": dni = dni + "P"; break;
                case "9": dni = dni + "D"; break;
                case "10": dni = dni + "X"; break;
                case "11": dni = dni + "B"; break;
                case "12": dni = dni + "N"; break;
                case "13": dni = dni + "J"; break;
                case "14": dni = dni + "Z"; break;
                case "15": dni = dni + "S"; break;
                case "16": dni = dni + "Q"; break;
                case "17": dni = dni + "V"; break;
                case "18": dni = dni + "H"; break;
                case "19": dni = dni + "L"; break;
                case "20": dni = dni + "C"; break;
                case "21": dni = dni + "K"; break;
                case "22": dni = dni + "E"; break;
                default: dni = dni + " # " + temp2.substring(0,2);
            }             
            
            System.out.println("Dni: " + dni);
        }
    }
    
}
