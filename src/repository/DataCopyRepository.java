/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import data_access.DataCopyDAO;
import model.FileData;

/**
 *
 * @author GoldCandy
 */
public class DataCopyRepository implements IDataCopyRepository {

    @Override
    public void dataCopy(FileData data) {
        DataCopyDAO.Instance().dataCopy(data);
    }
}
