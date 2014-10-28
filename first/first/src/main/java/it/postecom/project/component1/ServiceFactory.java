package it.postecom.project.component1;

/**
 *
 * @author filippo.campegiani
 */
public class ServiceFactory {
    
    public IService getService() {
        return new ServiceImpl();
    }
    
}
