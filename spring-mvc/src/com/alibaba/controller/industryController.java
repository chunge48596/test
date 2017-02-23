package com.alibaba.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.alibaba.entity.industry;
import com.alibaba.service.industryService;

@Controller
@RequestMapping("/industry")
public class industryController {
	private static Logger logger = Logger.getLogger(industryController.class); 
	private industry indu;
	@Resource 
	private industryService iservice;
	
	@RequestMapping("/queryIndustry")
	public String queryIndustryById(HttpServletRequest request,String id){
		/*接收前台传过来的参数，可以直接接收，不需要任何多余的代码，就直接在方法的参数里面定义好就行，牛逼思密达*/
		/*这里需要注意，如果参数只有一个，url传过来的参数名称和controller方法里面的参数名称不对应也能接收到值;如果是多个参数,那就必须一一对应，不然会接收不到值*/
		indu = iservice.selectByPrimaryKey(Integer.parseInt(id));
		request.getSession().setAttribute("industry", indu);
		return "showIndustry";
	}
}
