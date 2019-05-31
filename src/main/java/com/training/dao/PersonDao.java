package com.training.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PersonDao extends IPersonDao {
    @PersistenceContext
    private EntityManager em;

}
