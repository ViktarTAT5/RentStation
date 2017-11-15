package by.htp.rentStation.logic;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import by.htp.rentStation.dao.CatalogDAO;
import by.htp.rentStation.dao.FactoryRentUnit;
import by.htp.rentStation.dao.FileCatalogDAOImpl;
import by.htp.rentStation.dao.ReaderFile;
import by.htp.rentStation.domen.Catalog;

public class FileStationLogicImpl implements StationLogic {
	private CatalogDAO dao = new FileCatalogDAOImpl();
	
	@Override
	public Catalog readCatalog() {
		Catalog catalog = new Catalog();
		
		return catalog;
	}

}
