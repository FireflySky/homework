package util;

import impl.PropertiesImpl;
import bean.HolidayOnWork;
import bean.Personnel;
import bean.WorkOnHoliday;

/**
 * 配置文件工厂类
 */
public class Factory {
	public PropertiesImpl getProperties(String name) {
		if (name == null)
			return null;

		switch (name) {
		case "holidayOnWork":
			return new HolidayOnWork();
		case "personnel":
			return new Personnel();
		case "workOnHoliday":
			return new WorkOnHoliday();
		}
		return null;
	}
}
