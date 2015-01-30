package com.uplus.platform.hongbao.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.uplus.platform.hongbao.base.BaseAction;
import com.uplus.platform.hongbao.service.CreateHongBaoService;

/**
 * 红包
 */
@Controller
@RequestMapping("/hongbao")
public class HongBaoController extends BaseAction{
	
	@Resource private CreateHongBaoService createHongBaoService;

	@RequestMapping(value="/create", method= RequestMethod.POST)
	public void close(HttpServletRequest request 
			,HttpServletResponse response
			,Integer lot
			,Integer coin
			,String say
			,String to) {
		
	}

}
