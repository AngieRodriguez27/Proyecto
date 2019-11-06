package Taller3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
/**
 *
 * @author angie
 */
@WebServlet(urlPatterns = {"/Taller3"})
public class Taller3 extends HttpServlet {

    public Taller3() {
   
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Informacion</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                Ifuncion1 f1;
        String pais = request.getParameter("paises");
        String palabra = request.getParameter("traduccion");
        float monedaCon = Float.parseFloat(request.getParameter("moneda"));
        
        String nombre;
        String gentilicio;
        String moneda;
        String idioma;
        String capital;
        
        Informacion pais1 = new Informacion("camerun", "Camerunes", "Franco CFA", "Frances", "Yaundé");
        Informacion pais2 = new Informacion("mali", "Malienses", "Franco CFA", "Frances", "Bamako");
        
        Informacion pais3 = new Informacion();
        pais3.setNombre("chad");
        pais3.setGentilicio("Chadiano");
        pais3.setMoneda("Franco CFA");
        pais3.setIdioma("Arabe");
        pais3.setCapital("Yamena");
                
        Informacion pais4 = new Informacion();
        pais4.setNombre("guinea");
        pais4.setGentilicio("Guineano");
        pais4.setMoneda("Franco guineano");
        pais4.setIdioma("Portugues");
        pais4.setCapital("Conakri");
        
        Informacion pais5 = new Informacion();
        pais5.setNombre("sudan");
        pais5.setGentilicio("Sudanes");
        pais5.setMoneda("Libra sudanesa");
        pais5.setIdioma("Arabe");
        pais5.setCapital("Jartum");
        
         ArrayList Lista = new ArrayList();
         
         Lista.add(pais1);
         Lista.add(pais2);
         Lista.add(pais3);
         Lista.add(pais4);
         Lista.add(pais5);
            
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
                out.println("<html>");
                out.println("<body>");
                out.println("<h2>Información del pais: </h2>");
                f1 = new Conversion();

                    if ("camerun".equals(request.getParameter("paises"))){
                        
                        out.println("Nombre del pais:  " +pais1.getNombre()+"<br>");
                        out.println("Gentilicio:  " +pais1.getGentilicio()+"<br>");
                        out.println("Moneda:  " +pais1.getMoneda()+"<br>");
                        out.println("Idioma:  " +pais1.getIdioma()+"<br>");
                        out.println("Capital:  " +pais1.getCapital()+"<br>");
                        
                        out.println(monedaCon+" pesos equivalen a: "+f1.operacion("camerun", monedaCon)+"<br>");
                        out.println("La traducion de la palabra  "+palabra+" es : "+f1.traductor("camerun",palabra)+"<br>");
                        
                    }else
                        if ("mali".equals(request.getParameter("paises"))){
                        out.println("Nombre del pais:" +pais2.getNombre()+"<br>");
                        out.println("Gentilicio:" +pais2.getGentilicio()+"<br>");
                        out.println("Moneda:" +pais2.getMoneda()+"<br>");
                        out.println("Idioma:" +pais2.getIdioma()+"<br>");
                        out.println("Capital:" +pais2.getCapital()+"<br>");
                        
                        out.println(monedaCon+" pesos equivalen a: "+f1.operacion("mali", monedaCon)+"<br>");
                        out.println("La traducion de la palabra  "+palabra+" es : "+f1.traductor("mali",palabra)+"<br>");
                            
                            
                        } else
                        if ("chad".equals(request.getParameter("paises"))){
                        out.println("Nombre del pais:" +pais3.getNombre()+"<br>");
                        out.println("Gentilicio:" +pais3.getGentilicio()+"<br>");
                        out.println("Moneda:" +pais3.getMoneda()+"<br>");
                        out.println("Idioma:" +pais3.getIdioma()+"<br>");
                        out.println("Capital:" +pais3.getCapital()+"<br>");
                        
                        out.println(monedaCon+" pesos equivalen a: "+f1.operacion("chad", monedaCon)+"<br>");
                        out.println("La traducion de la palabra  "+palabra+" es : "+f1.traductor("chad",palabra)+"<br>");
                            
                            
                        } else
                        if ("guinea".equals(request.getParameter("paises"))){
                        out.println("Nombre del pais:" +pais4.getNombre()+"<br>");
                        out.println("Gentilicio:" +pais4.getGentilicio()+"<br>");
                        out.println("Moneda:" +pais4.getMoneda()+"<br>");
                        out.println("Idioma:" +pais4.getIdioma()+"<br>");
                        out.println("Capital:" +pais4.getCapital()+"<br>");
                        
                        out.println(monedaCon+" pesos equivalen a: "+f1.operacion("guinea", monedaCon)+"<br>");
                        out.println("La traducion de la palabra "+palabra+" es : "+f1.traductor("guinea",palabra)+"<br>");
                            
                            
                        } else
                        if ("sudan".equals(request.getParameter("paises"))){
                        out.println("Nombre del pais:" +pais5.getNombre()+"<br>");
                        out.println("Gentilicio:" +pais5.getGentilicio()+"<br>");
                        out.println("Moneda:" +pais5.getMoneda()+"<br>");
                        out.println("Idioma:" +pais5.getIdioma()+"<br>");
                        out.println("Capital:" +pais5.getCapital()+"<br>");
                        
                        out.println(monedaCon+" pesos equivalen a: "+f1.operacion("sudan", monedaCon)+"<br>");
                        out.println("La traducion de la palabra "+palabra+" es : "+f1.traductor("sudan",palabra)+"<br>");                                                       
                        } 
                        
                        
                       
                
                out.println("</body>");
                out.println("</html>"); 
                }
       
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}

