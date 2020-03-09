package cn.tedu.sp12;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

//@SpringBootTest
class Sp12ConfigApplicationTests {
	public static Map map = new HashMap();
	{
		map = new HashMap();
		map.put("1","2");
	}
	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	@Test
	void contextLoads() {
		Map tMap = map;
		tMap.put("1","t");
		System.out.println(tMap.get("1"));
		System.out.println(map.get("1"));
//		map.put();
	}

}
