/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.UsuarioDao;

public class UsuarioController {

    UsuarioDao dao;

    public String validaLogin(String usuario, String senha) {
        dao = new UsuarioDao();
        return dao.VerificarUsuario(usuario, senha);
    }
}
