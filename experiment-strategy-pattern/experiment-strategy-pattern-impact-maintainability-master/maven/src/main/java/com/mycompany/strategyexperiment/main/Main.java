package com.mycompany.strategyexperiment.main;

import java.sql.SQLException;
import com.mycompany.strategyexperiment.dao.control.AnexoDAO;
import com.mycompany.strategyexperiment.model.Anexo;

public class Main {
    public static void main(String[] args) {
        Anexo anexo = new Anexo();
        anexo.setIdAnexo(0); // 0 indicates a new record
        //anexo.setAta(new Ata(1)); // Assume 1 is a valid idAta in the database
        anexo.setOrdem(1);
        anexo.setDescricao("Test Description");
        anexo.setArquivo("Test File Content".getBytes());

        try {
            int id = new AnexoDAO().salvar(anexo);
            System.out.println("Anexo saved with ID: " + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
