package bean;

import java.util.ArrayList;

import impl.PropertiesImpl;
import util.Propertie;

/**
 * 排班人员的配置文件
 * @author Administrator
 *
 */
public class Personnel implements PropertiesImpl{
	public static final String PATH="src/resources/personnel.xml";
	/**
	 * 返回人员的配置文件
	 */
	public ArrayList<String> draw() {
		return Propertie.getProperties(this.PATH);
	}

}
