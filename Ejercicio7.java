    public class Ejercicio7{
        public static void main(String[] args){
            int a = 0, b = 0, c = 0, suma1 = 0, suma2 = 0, suma3 = 0;
            double porcentajecero, porcentajeimpar, porcentajepar;
            for(int i = 1; i <= 15; i++){
                int aleatorio = (int)(Math.random()*36);
                System.out.println(aleatorio + " ");
                if(aleatorio % 2 == 0){
                    suma1 = suma1+ aleatorio;
                    a = a+1;
                }
                if(aleatorio == 0){
                    suma2 = suma2 + aleatorio;
                    b = b+1;
                } else{
                    suma3 = suma3 + aleatorio;
                    c = c+1;
                }

            }
            porcentajepar = (suma1*15)/100;
             porcentajecero = (suma2*15)/100;
            porcentajeimpar = (suma3*15)/100;
            System.out.println("El número de pares generados es = " + a);
            System.out.println("El número de ceros generados es = " + b);
            System.out.println("El número de impares generados es = " + c);

            System.out.println("El porcentaje de pares es = " + porcentajepar);
            System.out.println("El porcentaje de ceros es = " + porcentajecero);
            System.out.println("El porcentaje de impares es = " + porcentajeimpar);
        }
    }