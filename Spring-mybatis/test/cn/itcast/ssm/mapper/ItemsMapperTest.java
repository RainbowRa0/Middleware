package cn.itcast.ssm.mapper;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.ssm.po.Items;
import cn.itcast.ssm.po.ItemsExample;
import cn.itcast.ssm.po.ItemsExample.Criteria;

public class ItemsMapperTest {

	private ApplicationContext applicationContext;
	private ItemsMapper itemsMapper;

	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		itemsMapper = (ItemsMapper) applicationContext.getBean("itemsMapper");
	}

	@Test
	public void testInsert() {
		Items items = new Items();
		items.setName("addsda");
		items.setPrice(3233f);
		itemsMapper.insert(items);
	}

	@Test
	public void testSelectByExample() {
		ItemsExample example = new ItemsExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo("笔记本");
		itemsMapper.selectByExample(example);
	}

	@Test
	public void testUpdateByExample() {
		Items items = new Items();
		items.setId(4);
		items.setName("电脑");
		items.setPrice(3233f);
		items.setCreatetime(new Date());
		items.setDetail("32222222");
		
		ItemsExample example = new ItemsExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo("笔记本");
		itemsMapper.updateByExample(items, example);
	}

}
