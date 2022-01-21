/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import entities.Place;
import entities.Section;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Clock;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.PLaceService;
import service.SectionService;


/**
 *
 * @author dell
 */
@WebServlet(name = "SectionController", urlPatterns = {"/SectionController"})
public class SectionController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      SectionService ss = new SectionService();
        
        if (request.getParameter("op") != null) {
            if (request.getParameter("op").equals("load")) {
                response.setContentType("application/json");
                List<Section> Sections = ss.findAll();
                System.out.println("vhvvvvvv");
                Gson json = new Gson();
                response.getWriter().write(json.toJson(Sections));

            } else if (request.getParameter("op").equals("delete")) {
                int id = Integer.parseInt(request.getParameter("id"));
                ss.delete(ss.findById(id));
                response.setContentType("application/json");
                List<Section> Sections = ss.findAll();
                Gson json = new Gson();
                response.getWriter().write(json.toJson(Sections));
                
            }else if (request.getParameter("op").equals("update")) {
                int id = Integer.parseInt(request.getParameter("id"));
                ss.update(ss.findById(id));
                response.setContentType("application/json");
                List<Section> Sections = ss.findAll();
                Gson json = new Gson();
                response.getWriter().write(json.toJson(Sections));
                
            }else if (request.getParameter("op").equals("addPlace")){
                PLaceService ps=new PLaceService(); 
                ps.create(new Place(5,"occupe","voiture",1));
                response.setContentType("application/json");
                List<Place> places = ps.findAll();
                Gson json = new Gson();
                response.getWriter().write(json.toJson(places));
            }

        } else {    
           
            String code = request.getParameter("code");
            ss.create(new Section(  code));
            response.setContentType("application/json");
            List<Section> sections = ss.findAll();
            Gson json = new Gson();

            response.getWriter().write(json.toJson(sections));
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
