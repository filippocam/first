package it.postecom.project.component1;

import it.postecom.project.component1.dao.IDAO;

/**
 *
 * @author filippo.campegiani
 */
class ServiceImpl implements IService {

    public void setDao(IDAO dao) {
        this.dao = dao;
    }
    
    private IDAO dao;
    
}
