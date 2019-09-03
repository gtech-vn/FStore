package org.fstore.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.fstore.Entity.BussinessStaff;
import org.fstore.Lib.HibernateUtil;
import org.fstore.Lib.Utils;
import org.fstore.Model.FStoreHibernateDao;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
	@Autowired
	SessionFactory sessionFactory;
	
	FStoreHibernateDao<BussinessStaff> staffDAO;
	
	/**
	 * Check authentication
	 * @param username
	 * @param password
	 * @return
	 */
	public String auth(String username, String password) {
		String token = "";
		
		Criteria cr = staffDAO.find();
		cr.add(Restrictions.eq("username", username));
		cr.add(Restrictions.eq("password", Utils.generatePassword(password)));
		
		BussinessStaff staff = null;
		List staffs = cr.list();
        for (Iterator iterator = staffs.iterator(); iterator.hasNext();){
        	staff = (BussinessStaff) iterator.next(); 
        	break;
        }
        
        if(staff != null) {
        	token = Utils.generateToken();
        }
        return token;
    }

	@Autowired
	private void setHibernateDao()  {
		this.staffDAO = new FStoreHibernateDao();
		this.staffDAO.setClazz(BussinessStaff.class);
		this.staffDAO.setSessionFactory(HibernateUtil.getSessionFactory());
	}
}
