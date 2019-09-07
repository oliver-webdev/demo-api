package demp.api.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import demo.api.dao.SearchDao;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SearchDaoTest {

	@Autowired
	private SearchDao searchDao;

	@Test
	public void searchTest() {
		String accountNumber = "11111111";
//		System.out.println(searchDao.selectAccountInfo(accountNumber));
	}
}
