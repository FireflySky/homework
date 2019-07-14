package bean;

import java.util.ArrayList;
import java.util.List;

import impl.PropertiesImpl;
import util.Propertie;

public class HolidayOnWork implements PropertiesImpl{
	final String PATH="src/resources/holidayOnWork.xml";
	/**
	 * 返回工作日休息的配置文件
	 */
	public ArrayList<String> draw() {
		return Propertie.getProperties(this.PATH);
	}
}
