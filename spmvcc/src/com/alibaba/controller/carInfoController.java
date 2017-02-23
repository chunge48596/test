package com.alibaba.controller;

import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.alibaba.entity.CarInfoTable;
import com.alibaba.service.CarInfoService;

@Controller
@RequestMapping("/carInfo")
public class carInfoController {
	private static Logger logger = Logger.getLogger(carInfoController.class); 
	private List<CarInfoTable> listCarInfo;
	@Resource 
	private CarInfoService cservice;
	
	@RequestMapping("/queryCarInfo")
	public String queryIndustryList(HttpServletRequest request,String orderCode,String abc){
		//接收前台传过来的参数，可以直接接收，不需要任何多余的代码，就直接在方法的参数里面定义好就行，牛逼思密达
		//这里需要注意，如果参数只有一个，url传过来的参数名称和controller方法里面的参数名称不对应也能接收到值;如果是多个参数,那就必须一一对应，不然会接收不到值
		if(orderCode != "" && orderCode != null) {
			System.out.println("orderCode:"+orderCode);
			System.out.println("abc:"+abc);
			listCarInfo = cservice.queryCarInfoByOrderCode(orderCode,abc);
		} else {
			listCarInfo = cservice.queryCarInfo();
		}
		request.getSession().setAttribute("listCarInfo", listCarInfo);
		return "showCarInfo";
	}
	
	@RequestMapping("/editCarInfoById")
	public String editCarInfoById(HttpServletRequest request,Integer id){
		CarInfoTable carInfo = new CarInfoTable();
		carInfo = cservice.editCarInfoById(id);
		request.getSession().setAttribute("carInfo", carInfo);
		return "editCarInfo";
	}
	
}
