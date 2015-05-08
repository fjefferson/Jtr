package br.com.ivy.core.model.service.abstraction;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.hibernate.metadata.ClassMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import br.com.ivy.core.model.entity.abstraction.AbstractEntity;

@Transactional
public abstract class AbstractPersistence<T extends AbstractEntity>{
	
	private Class<T> entityClass;
	
	private final String METHOD_PREFIX = "get";

	@Autowired
	private SessionFactory sessionFactory;
	
	@PersistenceContext
	EntityManager em;

	public AbstractPersistence(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	public T save(T e){
		try{
			getSession().saveOrUpdate(e);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return e;
	}

	public void remove(T entity) {
		getSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public T find(T e) {
		return (T) getSession().get(entityClass, this.idEntityResolver(e));
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
	    Criteria criteria = getSession().createCriteria( entityClass );
		List<T> entities = (List<T>) criteria.list();
        return entities;
	}

	public List<T> findRange(int[] range) {
		return null;
	}

	public int count() {
		return 0;	
	}

	public List<T> findByExample(T obj){
		try {
	
	        Criteria criteria = getSession().createCriteria(entityClass);
	        Example example = Example.create(obj).ignoreCase();
	        criteria.add(example);

	        @SuppressWarnings("unchecked")
			List<T> list = criteria.list();
	        return list;
	    } catch (HibernateException he) {
	    	he.printStackTrace();
	        return null;
	    }
	}
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	protected Session getSession(){
		return getSessionFactory().getCurrentSession();
	}

	
	private Integer idEntityResolver(T entidade){
		
		String identifierPropertyName = METHOD_PREFIX+getNamePropertyId();
		Method method = getMethodByName(identifierPropertyName);
		
		Integer id = null;
		try {
			id = (Integer) method.invoke(entidade, new Object[] {});
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return id;
	}
	
	private Method getMethodByName(String methodName){
		Objects.requireNonNull(methodName);
		Method method = null;
		try{
			method = entityClass.getMethod(methodName, new Class[] {});
		}catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		return method;
	}

	private String getNamePropertyId(){
		ClassMetadata classMetadata = getSessionFactory().getClassMetadata(entityClass);
		String propertyID = classMetadata.getIdentifierPropertyName();
		return Character.toString(propertyID.charAt(0)).toUpperCase()+propertyID.substring(1);
	}
	

}
