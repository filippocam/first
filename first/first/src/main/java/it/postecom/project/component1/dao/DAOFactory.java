package it.postecom.project.component1.dao;

/**
 *
 * @author filippo.campegiani
 */
public class DAOFactory {
    
    public IDAO getDao() {
        return new DAOImpl();
    }
    
}
