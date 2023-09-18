package dao;

import jpa.business.Rdv;


public class RdvDao extends AbstractJpaDao<Long, Rdv> {

    public RdvDao() {
        super(Rdv.class);
    }
}
