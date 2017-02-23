package com.alibaba.controller;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.entity.IndustryTable;
import com.alibaba.service.IndustryService;

@Controller
@RequestMapping("/industry")
public class industryController {
	private static Logger logger = Logger.getLogger(industryController.class); 
	@Resource 
	private IndustryService industryService;
	
	@RequestMapping("/queryIndustry")
	public String queryIndustryList(HttpServletRequest request,String orderCode,String abc){
		List<IndustryTable> listIndustry = new ArrayList<IndustryTable>();
		//接收前台传过来的参数，可以直接接收，不需要任何多余的代码，就直接在方法的参数里面定义好就行，牛逼思密达
		//这里需要注意，如果参数只有一个，url传过来的参数名称和controller方法里面的参数名称不对应也能接收到值;如果是多个参数,那就必须一一对应，不然会接收不到值
		if(orderCode != "" && orderCode != null) {
			System.out.println("orderCode:"+orderCode);
			System.out.println("abc:"+abc);
			listIndustry = industryService.queryIndustryByOrderCode(orderCode,abc);
		} else {
			listIndustry = industryService.queryIndustry();
		}
		request.getSession().setAttribute("listIndustry", listIndustry);
		return "showIndustry";
	}
	
	//新增行业
	@RequestMapping("/saveIndustry")
	public String saveIndustry(HttpServletRequest request,IndustryTable industry) throws ParseException{
		IndustryTable ind = new IndustryTable();
		ind.setParentId(548);//父级Id
		ind.setCategoryLevel((short)4);//级别
		ind.setProfitMargin(new BigDecimal("0.12"));//利润率
		ind.setCategoryName(industry.getCategoryName());//类别名称
		ind.setCategoryExplain(industry.getCategoryExplain());//类别说明
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String sdate = sdf.format(date);
		java.util.Date nowDate = sdf.parse(sdate);
		ind.setCreateDate(nowDate);
		ind.setUpdateDate(nowDate);
		industryService.saveIndustry(ind);
		//直接返回查询方法
		return "redirect:/industry/queryIndustry.do";
	}
	
	//删除行业
	@RequestMapping("/delIndustry")
	public String deleteByPrimaryKey(HttpServletRequest request,int id){
		industryService.delIndustry(id);
		//直接返回查询方法
		return "redirect:/industry/queryIndustry.do";
	}
	
}
