package bean;

import java.util.ArrayList;

import impl.PropertiesImpl;
import util.Propertie;

public class WorkOnHoliday implements PropertiesImpl{
	final String PATH="src/resources/workOnHoliday.xml";
	/**
	 * 返回休息日却要工作的日期的配置文件
	 */
	public ArrayList draw() {
		return Propertie.getProperties(this.PATH);
	}

}
