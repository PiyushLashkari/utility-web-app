package com.learn.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.learn.util.Util;

/**
*
*
* @author plashkar
* @version 1.0
* @date Jun 16, 2015
*/

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView model = new ModelAndView("home");
		
		return model;
	}
	
	@RequestMapping(value = "/encryption", method = RequestMethod.GET)
	public ModelAndView encryption() {
		ModelAndView model = new ModelAndView("encryption");
		
		return model;
	}
	
	@RequestMapping(value = "/decryption", method = RequestMethod.GET)
	public ModelAndView decryption() {
		ModelAndView model = new ModelAndView("decryption");
		
		return model;
	}
	
	@RequestMapping(value = "/result/encrypt", method = RequestMethod.POST)
	public ModelAndView resultEncrypt(HttpServletResponse httpServletResponse, HttpServletRequest httpServletRequest) {
		ModelAndView model = new ModelAndView("result");
		
		model.addObject("password", Util.encrypt(httpServletRequest.getParameter("password"), httpServletRequest.getParameter("key")));
		model.addObject("resultText", "Encrypted Password");
		return model;
	}
	
	@RequestMapping(value = "/result/decrypt", method = RequestMethod.POST)
	public ModelAndView resultDecrypt(HttpServletResponse httpServletResponse, HttpServletRequest httpServletRequest) {
		ModelAndView model = new ModelAndView("result");
		
		model.addObject("password", Util.decrypt(httpServletRequest.getParameter("password"), httpServletRequest.getParameter("key")));
		model.addObject("resultText", "Decrypted Password");
		return model;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(HttpServletResponse httpServletResponse, HttpServletRequest httpServletRequest) {
		ModelAndView model = new ModelAndView("home");
    	
		return model;
	}
}
