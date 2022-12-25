package com.nowcoder.community.community.dao;

import org.springframework.stereotype.Repository;

/**Spring @Repository annotation is used to indicate that the class provides the mechanism
 * for storage,retrieval, search, update and delete operation on objects.
**/
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{

    @Override
    public String select() {
        return  "Hibernate";
    }
}
