package by.htp.rentStation.logic;



import by.htp.rentStation.dao.FileCatalogDAOImpl;
import by.htp.rentStation.domen.Catalog;

public interface StationLogic {
	
	Catalog readCatalog();
	
}
