/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.FileData;
import repository.DataCopyRepository;

/**
 *
 * @author GoldCandy
 */
public class DataCopyController {

    protected DataCopyRepository repo;
    protected FileData data;

    public DataCopyController() {
        repo = new DataCopyRepository();
        data = new FileData();
    }

    public void run() {
        System.out.println("======= Copy Program =======");
        repo.dataCopy(data);
    }
}
