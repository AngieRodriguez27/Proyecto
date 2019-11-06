package Taller3;

public class Conversion implements Ifuncion1{

    @Override
    public float operacion(String pais, float moneda){
        
        float con = 0;
        if (pais.equals("camerun") || pais.equals("mali") || pais.equals("chad")){
            con = (float) (moneda * 0.18);
        }else 
            if (pais.equals("guinea")){
                con = (float) (moneda * 2.74);
        }else 
                if (pais.equals("sudan")){
                    con = (float) (moneda * 0.013);
                    
                }
 return con;   
}

    @Override
    public String traductor(String pais, String palabra) {
        String palabras="";
        
        if (pais.equals("camerun") || pais.equals("mali") ){
            if (palabra.equals("hola")){
                palabras = "salut";
            }else 
                if(palabra.equals("adios")){
                    palabras = "atieu";
                }else
                    if(palabra.equals("buenos dias")){
                        palabras = "bonjour";
                    }else
                        if(palabra.equals("buenas tardes")){
                            palabras = "bonsoir";
                        }else 
                            if(palabra.equals("buenas noches")){
                                palabras = "bonne nuit";
                            }
        }else 
            if (pais.equals("chad") || pais.equals("sudan")){
                if (palabra.equals("hola")){
                     palabras = "مرحبا";
                }else 
                     if(palabra.equals("adios")){
                         palabras = "وداعا";
                     }else
                         if(palabra.equals("buenos dias")){
                             palabras = "صباح الخير";
                        }else
                            if(palabra.equals("buenas tardes")){
                                palabras = "مساء الخير";
                            }else 
                                if(palabra.equals("buenas noches")){
                                    palabras = "ليلة سعيدة";
                            }
        }else
            if (pais.equals("guinea")){
                if (palabra.equals("hola")){
                     palabras = "ola";
                }else 
                     if(palabra.equals("adios")){
                         palabras = "adeus";
                     }else
                         if(palabra.equals("buenos dias")){
                             palabras = "bom dia";
                        }else
                            if(palabra.equals("buenas tardes")){
                                palabras = "boa tarde";
                            }else 
                                if(palabra.equals("buenas noches")){
                                    palabras = "boa noite";
                            }    
            }
        return palabras;
        }
    
}
    


    
