package com.hxzy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wy
 * @date 2019-08-15 10:28
 * @comment 员工类
 */
public class Staff implements Serializable {
    /**
     * 员工编号
     */
    private Integer id;

    /**
     * 员工姓名
     */
    private String name;

    /**
     * 英文名
     */
    private String ename;

    /**
     * 员工性别0代表男  1代表女
     */
    private String sex;

    /**
     * 出生日期
     */
    private Date borthday;
    private Integer  age;

    /**
     * 政治面貌
     */
    private Integer politic;
    //private DataDictionary   politicData; 政治面貌对象(规范的，但是痛苦的)
    private String politicName;

    /**
     * 部门
     */
    private Integer department;
    private String departmentName;

    /**
     * 单位
     */
    private Integer company;
    private String companyName;

    /**
     * 岗位
     */
    private Integer jobs;
    private String jobsName;


    /**
     * 民族
     */
    private Integer nation;
    private String nationName;

    /**
     * 婚姻1代表未婚 2代表已婚
     */
    private Integer marriage;
    private String marriageName;



    /**
     * 籍贯
     */
    private String nativee;

    /**
     * 身份证号码
     */
    private String identityid;

    /**
     * 职务
     */
    private Integer position;
    private String positionName;

    /**
     * 职务级别
     */
    private Integer positionlevel;
    private String positionlevelName;

    /**
     * 职称
     */
    private Integer positiontitle;
    private String positiontitleName;

    /**
     * 职称级别
     */
    private Integer positiontitlelevel;
    private String positiontitlelevelName;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 用工类别
     */
    private Integer coemployment;
    private String coemploymentName;



    /**
     * 档案编号
     */
    private String filenumber;

    /**
     * 档案所在地
     */
    private String filelocation;


    /**
     * 身高
     */
    private Float height;

    /**
     * 体重
     */
    private Float weight;

    /**
     * 血型
     */
    private Integer bloodtype;

    /**
     * 个人特长
     */
    private String strengths;

    /**
     * 兴趣爱好
     */
    private String hobbies;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBorthday() {
        return borthday;
    }

    public void setBorthday(Date borthday) {
        this.borthday = borthday;
    }

    public Integer getPolitic() {
        return politic;
    }

    public void setPolitic(Integer politic) {
        this.politic = politic;
    }

    public String getPoliticName() {
        return politicName;
    }

    public void setPoliticName(String politicName) {
        this.politicName = politicName;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getCompany() {
        return company;
    }

    public void setCompany(Integer company) {
        this.company = company;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getJobs() {
        return jobs;
    }

    public void setJobs(Integer jobs) {
        this.jobs = jobs;
    }

    public String getJobsName() {
        return jobsName;
    }

    public void setJobsName(String jobsName) {
        this.jobsName = jobsName;
    }

    public Integer getNation() {
        return nation;
    }

    public void setNation(Integer nation) {
        this.nation = nation;
    }

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName;
    }

    public Integer getMarriage() {
        return marriage;
    }

    public void setMarriage(Integer marriage) {
        this.marriage = marriage;
    }

    public String getMarriageName() {
        return marriageName;
    }

    public void setMarriageName(String marriageName) {
        this.marriageName = marriageName;
    }

    public String getNativee() {
        return nativee;
    }

    public void setNativee(String nativee) {
        this.nativee = nativee;
    }

    public String getIdentityid() {
        return identityid;
    }

    public void setIdentityid(String identityid) {
        this.identityid = identityid;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Integer getPositionlevel() {
        return positionlevel;
    }

    public void setPositionlevel(Integer positionlevel) {
        this.positionlevel = positionlevel;
    }

    public String getPositionlevelName() {
        return positionlevelName;
    }

    public void setPositionlevelName(String positionlevelName) {
        this.positionlevelName = positionlevelName;
    }

    public Integer getPositiontitle() {
        return positiontitle;
    }

    public void setPositiontitle(Integer positiontitle) {
        this.positiontitle = positiontitle;
    }

    public String getPositiontitleName() {
        return positiontitleName;
    }

    public void setPositiontitleName(String positiontitleName) {
        this.positiontitleName = positiontitleName;
    }

    public Integer getPositiontitlelevel() {
        return positiontitlelevel;
    }

    public void setPositiontitlelevel(Integer positiontitlelevel) {
        this.positiontitlelevel = positiontitlelevel;
    }

    public String getPositiontitlelevelName() {
        return positiontitlelevelName;
    }

    public void setPositiontitlelevelName(String positiontitlelevelName) {
        this.positiontitlelevelName = positiontitlelevelName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCoemployment() {
        return coemployment;
    }

    public void setCoemployment(Integer coemployment) {
        this.coemployment = coemployment;
    }

    public String getCoemploymentName() {
        return coemploymentName;
    }

    public void setCoemploymentName(String coemploymentName) {
        this.coemploymentName = coemploymentName;
    }

    public String getFilenumber() {
        return filenumber;
    }

    public void setFilenumber(String filenumber) {
        this.filenumber = filenumber;
    }

    public String getFilelocation() {
        return filelocation;
    }

    public void setFilelocation(String filelocation) {
        this.filelocation = filelocation;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(Integer bloodtype) {
        this.bloodtype = bloodtype;
    }

    public String getStrengths() {
        return strengths;
    }

    public void setStrengths(String strengths) {
        this.strengths = strengths;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ename='" + ename + '\'' +
                ", sex='" + sex + '\'' +
                ", borthday=" + borthday +
                ", age=" + age +
                ", politic=" + politic +
                ", politicName='" + politicName + '\'' +
                ", department=" + department +
                ", departmentName='" + departmentName + '\'' +
                ", company=" + company +
                ", companyName='" + companyName + '\'' +
                ", jobs=" + jobs +
                ", jobsName='" + jobsName + '\'' +
                ", nation=" + nation +
                ", nationName='" + nationName + '\'' +
                ", marriage=" + marriage +
                ", marriageName='" + marriageName + '\'' +
                ", nativee='" + nativee + '\'' +
                ", identityid='" + identityid + '\'' +
                ", position=" + position +
                ", positionName='" + positionName + '\'' +
                ", positionlevel=" + positionlevel +
                ", positionlevelName='" + positionlevelName + '\'' +
                ", positiontitle=" + positiontitle +
                ", positiontitleName='" + positiontitleName + '\'' +
                ", positiontitlelevel=" + positiontitlelevel +
                ", positiontitlelevelName='" + positiontitlelevelName + '\'' +
                ", status=" + status +
                ", coemployment=" + coemployment +
                ", coemploymentName='" + coemploymentName + '\'' +
                ", filenumber='" + filenumber + '\'' +
                ", filelocation='" + filelocation + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", bloodtype=" + bloodtype +
                ", strengths='" + strengths + '\'' +
                ", hobbies='" + hobbies + '\'' +
                '}';
    }
}