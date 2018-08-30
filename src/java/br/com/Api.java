/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author souzafelipea
 */
public class Api extends HttpServlet {

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
        response.setContentType("application/xml;charset=UTF-8");
        response.addHeader("Access-Control-Allow-Origin", "*");

        StringBuilder retorno = new StringBuilder("");
        retorno.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>")
                .append("<servicos>")
                .append("    <servico nome=\"usuarios\" metodo=\"GET\" url=\"").append(request.getRequestURL()).append("/usuarios\"")
                .append(" descricao=\"Retorna um JSON contendo a lista de usuários.\" />")
                .append("    <servico nome=\"mensagens\" metodo=\"GET\" url=\"").append(request.getRequestURL()).append("/chat/${codusuario}\"")
                .append(" descricao=\"Retorna um JSON contendo as mensagens trocadas com o usuário informado.\" />")
                .append("</servicos>");

        try (PrintWriter out = response.getWriter()) {
            out.println(retorno.toString());
        }
    }
}
