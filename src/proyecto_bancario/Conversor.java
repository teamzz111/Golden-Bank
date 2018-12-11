package proyecto_bancario;

public class Conversor {
    
    String[] Numeros = {"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","--","once","doce","trece","catorce","quince"};
    String[] Decimas = {"--","diez","veinte","treinta","cuarenta","cincuenta","sesenta","setenta","ochenta","noventa"};
    String[] Centesimas = {"cien","ciento","doscientos","trescientos","cuatrocientos","quinientos","seiscientos","setecientos","ochocientos","novecientos"};
    String[] MilesMillones = {"","","mil","millones","mil","billones","mil","trillones"};
    String[] Otros = {"--","mil","un millon","mil millones","un billon","mil billones","un trillon"};
   
    
    public String Ingresa(String numero){
        long t = Long.parseLong(numero);
        return Inicio(t);
    }
    
    public String Inicio(long numero){
        if((int)(Long.toString(numero).length() / 3) == 0){
            return(Completa((int)numero));
        }
        else{
            String NumeroString = String.valueOf(numero);
            String Terna = "";
            String Resultado = "";
            String ResultadoAux = "";
            int CantidadTerna = 0;
            int ExisteTerna = 0;
            for(int i = NumeroString.length() - 1; i >= 0; i--){
                Terna = NumeroString.charAt(i) + Terna;
                ExisteTerna++;
                if((ExisteTerna % 3) == 0){
                    CantidadTerna++;
                    if(Integer.parseInt(Terna) != 0){
                        ResultadoAux = Resultado;
                        Resultado = "";
                        if(String.valueOf(Integer.parseInt(Terna)).length() == 3){
                            if(String.valueOf(Terna.charAt(0)).equals("1") && Integer.parseInt(String.valueOf(Terna.charAt(1)) + String.valueOf(Terna.charAt(2))) == 0){
                                Resultado = Centesimas[0];
                            }
                            else{
                                Resultado = Centesimas[Integer.parseInt(String.valueOf(Terna.charAt(0)))];   
                            }
                        }
                        if(Integer.parseInt(String.valueOf(Terna.charAt(1)) + String.valueOf(Terna.charAt(2))) != 0){
                            Resultado += " " + Completa(Integer.parseInt(String.valueOf(Terna.charAt(1)) + String.valueOf(Terna.charAt(2))));
                            if(Terna.charAt(2) == '1' && CantidadTerna != 1){
                                Resultado = Resultado.substring(0, Resultado.length() - 1);
                            }
                        }
                        Resultado += " " + MilesMillones[CantidadTerna] + " " + ResultadoAux;
                    }
                    Terna = "";
                }
            }
            if(!Terna.isEmpty()){
                if(Integer.parseInt(Terna) == 1){
                    Resultado = Otros[CantidadTerna] + " " + Resultado;
                }
                else{
                    if(Terna.length() == 2 && Integer.parseInt(String.valueOf(Terna.charAt(1))) == 1){
                        String Quita = Completa(Integer.parseInt(Terna));
                        Resultado = Quita.substring(0, Quita.length() - 1) + " " + MilesMillones[CantidadTerna + 1] + " " + Resultado;
                    }
                    else{
                        Resultado = Completa(Integer.parseInt(Terna)) + " " + MilesMillones[CantidadTerna + 1] + " " + Resultado;
                    }
                }
            }
            return(Resultado);
        }
    }
    
    public String Completa(int numero){
        if(Integer.toString(numero).length() == 1){
            return(Numeros[numero]);
        }
        else{
            if(Integer.toString(numero).charAt(0) == '1'){
                if(Integer.toString(numero).charAt(1) == '0'){
                    return(Decimas[1]);
                }
                else if(Integer.parseInt(String.valueOf(Integer.toString(numero).charAt(1))) <= 5){
                    return(Numeros[numero]);
                }
                else{
                    return("dieci" + Numeros[Integer.parseInt(String.valueOf(Integer.toString(numero).charAt(1)))]);
                }
            }
            else if(Integer.toString(numero).charAt(0) == '2'){
                if(Integer.toString(numero).charAt(1) == '0'){
                    return(Decimas[2]);
                }
                else{
                    return("veinti" + Numeros[Integer.parseInt(String.valueOf(Integer.toString(numero).charAt(1)))]);
                }
            }
            else{
                if(Integer.toString(numero).charAt(1) == '0'){
                    return(Decimas[Integer.parseInt(String.valueOf(Integer.toString(numero).charAt(0)))]);
                }
                else{
                    return(Decimas[Integer.parseInt(String.valueOf(Integer.toString(numero).charAt(0)))] + " y " + Numeros[Integer.parseInt(String.valueOf(Integer.toString(numero).charAt(1)))]);
                }
            }
        }
    }
}
