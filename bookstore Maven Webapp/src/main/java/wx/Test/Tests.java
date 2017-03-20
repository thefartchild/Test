package wx.Test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import wx.userManage.entity.user;
import wx.userManage.service.IuserService;

import com.alibaba.fastjson.JSON;



import org.springframework.context.support.FileSystemXmlApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class Tests {
	private static Logger logger = Logger.getLogger(Tests.class);
	 private ApplicationContext ac = null;
	@Resource
	private IuserService userService = null;

	 @Before
	 public void before() {
	 ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	 userService = (IuserService) ac.getBean("userService");
	 }

	@Test
	public void test1() {
		user user = userService.getUserById(1);
		 System.out.println(user.getUserName());
		 logger.info("值："+user.getUserName());
		logger.info(JSON.toJSONString(user));
	}
}
