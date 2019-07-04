/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;

public class RespostaDao {

    private Connection connection;

    public RespostaDao() {
        this.connection = new ConnectionFactory().getConnection();
    }
}
