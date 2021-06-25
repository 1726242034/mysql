import com.xu.Aspectj.AopTest;
import com.xu.dao.User;
import com.xu.mapper.UserTest;
import com.xu.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test {

	@Test
	public void transactionTest(){
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
		UserService userService = (UserService) ac.getBean("userServiceImpl");

		userService.transactionTest();

	}


	@Test
	public void MybatisTest(){
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
		UserTest userTest = (UserTest) ac.getBean("userTest");
		User user = userTest.selectUser();
		System.out.println(user);

	}

	@Test
	public void m1(){
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
		AopTest aopTestImpl = (AopTest) ac.getBean("aopTestImpl");
		aopTestImpl.AopT("a");

	}

}
