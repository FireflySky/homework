package com.hxzy.util;


import com.hxzy.vo.DirectoryTypeVo;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.Document;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author yuanpeng
 * @date 2019-08-14 下午 3:22
 * @comment 自定义数据工具类
 */
public class CustomerDataUtil {

    private static Map<String,List<DirectoryTypeVo>> cache=new ConcurrentHashMap<>();
    private final static Object obj=new Object();
    private final static String DIRECTORYTYPE_KEY="directoryType";
    /**
     * 得到所有的分类(有缓存的)
     * @return
     */
    public static List getListDirectoryType(){
        List<DirectoryTypeVo> arr=new ArrayList<>();

        if(cache.get(DIRECTORYTYPE_KEY) !=null){
            arr=cache.get(DIRECTORYTYPE_KEY);
        }else{
            synchronized (obj){
                if(cache.get(DIRECTORYTYPE_KEY) != null){
                    arr=cache.get(DIRECTORYTYPE_KEY);
                }else {
                    arr=readDirectoryType();
                    cache.put(DIRECTORYTYPE_KEY,arr);
                }
            }
        }
        return arr;
    }
    //读取XML
    private static List<DirectoryTypeVo> readDirectoryType(){
        List<DirectoryTypeVo> arr=new ArrayList<>();
        try {
            //读取XML
            Document document=null;
            SAXReader saxReder=new SAXReader();
            document=saxReder.read(CustomerDataUtil.class.getResourceAsStream("/DirectoryType.xml"));
            //得到根节点
            Element root=document.getRootElement();
            //得到子节点
            List<Element> itme = root.elements("item");
            //遍历节点
            for(Element el:itme){
                String text=el.elementTextTrim("text");
                int typeId=Integer.parseInt(el.elementTextTrim("typeId"));
                arr.add(new DirectoryTypeVo(text,typeId));
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return arr;
    }
}
