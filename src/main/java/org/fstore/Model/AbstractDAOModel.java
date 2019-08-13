package org.fstore.Model;

import java.io.Serializable;
import java.util.List;

import org.fstore.Lib.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDAOModel <T extends Serializable> {
	private Class<T> entityClass;
	  
    @Autowired
    SessionFactory sessionFactory;
  
    /**
     * Inject entity class
     * @param entityClass
     */
    public void setClazz(Class< T > entityClass){
       this.entityClass = entityClass;
    }
  
    /**
     * Find one method
     * @param id
     * @return Entity Object
     */
    public T findOne(long id){
      return (T) getCurrentSession().get(entityClass, id);
    }
 
    /**
     * Find All
     * @return List Entity Object
     */
    public List findAll() {
        return getCurrentSession().createQuery("from " + entityClass.getName()).list();
    }
    
    /**
     * Insert Row
     * @param entity
     * @return
     */
    public T create(T entity) {
    	Transaction tx = null;
    	Session session = getCurrentSession();
    	try {
            tx = session.beginTransaction();
            session.save(entity);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        
        return entity;
    }
 
    /**
     * Update Row
     * @param entity
     * @return
     */
    public T update(T entity) {
        return (T) getCurrentSession().merge(entity);
    }
 
    /**
     * Delete Row
     * @param entity
     */
    public void delete(T entity) {
        getCurrentSession().delete(entity);
    }
 
    /**
     * Delete Row by ID
     * @param entityId
     */
    public void deleteById(long entityId) {
        T entity = findOne(entityId);
        delete(entity);
    }
 
    /**
     * Get current session of Hibernate
     * @return
     */
    protected Session getCurrentSession() {
    	sessionFactory = HibernateUtil.getSessionFactory();
        return sessionFactory.openSession();
    }
}
