package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import bean.HolidayOnWork;
import bean.WorkOnHoliday;

/**
 * 返回符合条件的日期
 * @author Administrator
 *
 */
public class ReturnDate {
	private Calendar calendar=null;
	private static ReturnDate r=null;
	private static ArrayList<String> dates=null;//当月日期集合
	private static Factory factory=null;
	private int countday=0;//当月天数
	private int m=0;//当天月份
	private SimpleDateFormat format2=null;
	
	public ArrayList<String> getDate(){
		dates=new ArrayList<>();
		factory=new Factory();
		r=new ReturnDate();
		r.workDate();
		r.holidayOnWork();
		return dates;
	 }
	
	 //返回过滤后当月工作日的日期集合
	 private void workDate(){
		 format2 = new SimpleDateFormat("yyyy-MM-dd");
		 calendar= Calendar.getInstance();
		 //得到当月月份
		 m=calendar.get(Calendar.MONTH)+1;
		 //得到当月的天数
		 countday=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		 for(int i=1;i<=countday;i++){
			 //设置日期
			 calendar.set(Calendar.DATE,i);
			 //获取星期天
			 int holiday=calendar.get(Calendar.DAY_OF_WEEK)-1;
			 if(holiday!=6&&holiday!=0){
				 dates.add(format2.format(calendar.getTime()));
			 }else{
				 //判断休息期工作的配置文件中是否存在该日期，存在则添加
				 String date=format2.format(calendar.getTime());
				 if(r.workOnHoliday().contains(date)){
					 dates.add(date);
				 };
			 }
		 }
	 }
	 
	 //返回过滤后当月工作日休息的日期集合
	 private void holidayOnWork(){
		 HolidayOnWork p=(HolidayOnWork)factory.getProperties("holidayOnWork");
		 ArrayList<String> day=r.printArr(p.draw());
//		 System.out.println(day.toString());
		 for(int i=0;i<dates.size();i++){
			 for(int j=0;j<day.size();j++){
				 if(dates.get(i).equals(day.get(j))){
					 dates.remove(dates.get(i));
				 }
			 }
		 }
//		 System.out.println(dates.toString());
	 }
	//返回当月休息日工作的日期集合
	 private ArrayList<String> workOnHoliday(){
		 WorkOnHoliday w=(WorkOnHoliday) factory.getProperties("workOnHoliday");
		 ArrayList<String> day=r.printArr(w.draw());
		return day;
	 }
	 //将配置文件的字符串转换成集合
	 private ArrayList<String> printArr(ArrayList<String> arr){
		 String startDay=null;
		 String endDay=null;
		 for(String s:arr){
			 if(s.startsWith("from")){
				 startDay=s.substring(s.indexOf(":")+1, s.indexOf("to:")-1);
				 endDay=s.substring(s.lastIndexOf(":")+1);
			 };
		 }
		 ArrayList<String> dat=new ArrayList<>();
		 int start=Integer.parseInt(startDay.split("-")[2]);
		 int end=Integer.parseInt(endDay.split("-")[2]);
		//判断日期是否是本月
		 if(Integer.parseInt(endDay.split("-")[1])>m){
			 end=countday;
		 }
		 if(Integer.parseInt(endDay.split("-")[1])<m){
			 end=0;
		 }
		 if(Integer.parseInt(startDay.split("-")[1])>m){
			 start=countday+1;
		 }
		 if(Integer.parseInt(startDay.split("-")[1])<m){
			 start=1;
		 }
		 if(start>countday)return null;//日期超出本月最大天数
		 while (true) {
			 calendar.set(Calendar.DATE,start);
			 String day=format2.format(calendar.getTime());
			 if(start<=end){
				 dat.add(day);
				 start++;
			 }else{
				 break;
			 }
		}
		 return dat;
	 }
}
