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
public class Usuarios extends HttpServlet {

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
        response.setContentType("application/json;charset=UTF-8");
        response.addHeader("Access-Control-Allow-Origin", "*");

        StringBuilder retorno = new StringBuilder("");
        retorno.append("{")
                .append("    \"usuarios\": [{")
                .append("            \"usuario\": \"cr001\",")
                .append("            \"nome\": \"Celeste Rebouças\",")
                .append("            \"status\": \"online\",")
                .append("            \"frase\": \"O sucesso é a pequena soma de esforços, repetidos dia após dia.\",")
                .append("            \"aniversario\": false")
                .append("        },{")
                .append("            \"usuario\": \"gr002\",")
                .append("            \"nome\": \"Glauco Rijo\",")
                .append("            \"status\": \"ausente\",")
                .append("            \"frase\": \"Certas pessoas permanecerão no seu coração, mas não na sua vida!\",")
                .append("            \"aniversario\": false")
                .append("        },{")
                .append("            \"usuario\": \"gf003\",")
                .append("            \"nome\": \"Godofredo Frois\",")
                .append("            \"status\": \"online\",")
                .append("            \"frase\": \"Agora na minha versão 2.2!!\",")
                .append("            \"aniversario\": true")
                .append("        },{")
                .append("            \"usuario\": \"ha004\",")
                .append("            \"nome\": \"Henriqueta Almeyda\",")
                .append("            \"status\": \"online\",")
                .append("            \"frase\": \"A experiência é o que você ganha quando você não consegue o que quer.\",")
                .append("            \"aniversario\": false")
                .append("        },{")
                .append("            \"usuario\": \"no005\",")
                .append("            \"nome\": \"Noé Otero\",")
                .append("            \"status\": \"offline\",")
                .append("            \"frase\": \"O pensamento é ação em ensaio.\",")
                .append("            \"aniversario\": false")
                .append("        },{")
                .append("            \"usuario\": \"qn006\",")
                .append("            \"nome\": \"Quirino Nolasco\",")
                .append("            \"status\": \"offline\",")
                .append("            \"frase\": \"O maior sucesso é a auto-aceitação de sucesso.\",")
                .append("            \"aniversario\": false")
                .append("        },{")
                .append("            \"usuario\": \"rg007\",")
                .append("            \"nome\": \"Raquel Guedes\",")
                .append("            \"status\": \"ausente\",")
                .append("            \"frase\": \"Não tenham medo de crescer lentamente, tenha medo de apenas de ficar parado.\",")
                .append("            \"aniversario\": false")
                .append("        },{")
                .append("            \"usuario\": \"ss008\",")
                .append("            \"nome\": \"Sofia Serpa\",")
                .append("            \"status\": \"online\",")
                .append("            \"frase\": \"Os erros são a ponte habitual entre a inexperiência e a sabedoria.\",")
                .append("            \"aniversario\": false")
                .append("        },{")
                .append("            \"usuario\": \"zm009\",")
                .append("            \"nome\": \"Zidane Matos\",")
                .append("            \"status\": \"offline\",")
                .append("            \"frase\": \"Parabéns pra mim!!\",")
                .append("            \"aniversario\": true")
                .append("        },{")
                .append("            \"usuario\": \"av010\",")
                .append("            \"nome\": \"Átila Villela\",")
                .append("            \"status\": \"ausente\",")
                .append("            \"frase\": \"Nunca é tarde demais para ser o que você poderia ter sido.\",")
                .append("            \"aniversario\": false")
                .append("        }")
                .append("    ]")
                .append("}");

        try (PrintWriter out = response.getWriter()) {
            out.println(retorno.toString());
        }
    }
}
