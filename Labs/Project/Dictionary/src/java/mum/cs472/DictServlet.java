/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.cs472;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 610522
 */
@WebServlet("/search")
public class DictServlet extends HttpServlet {

    private Entry processRequest(String word)
            throws ServletException, IOException {
        Entry wordEntry = null;
        DbConnection db = new DbConnection();
        try {
            Connection con = db.getConnection();
            Statement st = con.createStatement();
            ResultSet result = st.executeQuery("SELECT * FROM ENTRIES WHERE word = '" + word + "'");
            wordEntry = new Entry(word);
            while (result.next()) {
                String type = result.getString("wordtype");
                String def = result.getString("definition");
                wordEntry.addDefinition(new Definition(type, def));
            }

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
        return wordEntry;
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // doPost(request, response);
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
        String searchWord = request.getParameter("search");
        System.out.print("AQUIII|");
        if (searchWord != null && !searchWord.isEmpty()) {
            Entry e = processRequest(searchWord);
            String entryJson = new Gson().toJson(e);
            PrintWriter out = response.getWriter();
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            out.print(entryJson);
            out.flush();
        }
        
        return;
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
