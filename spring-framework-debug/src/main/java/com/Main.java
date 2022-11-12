package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		//AnnotationConfigApplicationContext acc = new AnnotationConfigApplicationContext(AppConfig.class);


		/*User user =  acc.getBean(User.class);
		System.out.println(user.getName()+ " --" + user.getAge());*/
		ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("application.xml");

		//MyClassPathXmlApplicationContext cac = new MyClassPathXmlApplicationContext("application.xml");

		System.out.println("******开始输出Environment属性啦*******");
		System.out.println(cac.getEnvironment().getSystemProperties().get("user.name"));
		//Person person = cac.getBean(Person.class);

		/*Object student = cac.getBean("studentFactoryBean");
		StudentFactoryBean studentFactoryBean = (StudentFactoryBean)cac.getBean("&studentFactoryBean");

		System.out.println(student.getClass().getName());
		System.out.println(studentFactoryBean.getClass().getName());

		System.out.println( person.getName() + "--" + person.getAge());

		A aa = cac.getBean(A.class);
		System.out.println( aa.getClass().getName());
		System.out.println(aa.getB());
		B bb = cac.getBean(B.class);
		System.out.println(bb.getClass().getName());
		System.out.println(bb.getA());*/
		//System.out.println(Person.class.getName());

	}
}
