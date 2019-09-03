package org.fstore.Test;

import java.time.LocalTime;
import java.util.Date;

import org.fstore.Entity.Customer;
import org.fstore.Entity.CustomerCountry;
import org.fstore.Model.FStoreHibernateDao;
import org.fstore.Model.IGenericDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		System.out.print(1111);
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
 
        Room room = (Room) context.getBean("room");
        
        if (room.getTable() != null) {
            System.out.println(1234);
        }
	}
}
