package dao;

import jpa.business.Prof;


public class ProfDao extends AbstractJpaDao<Long, Prof> {

    public ProfDao() {
        super(Prof.class);
    }
}
