package com.skilldistillery.jdmengines.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.jdmengines.data.JdmEnginesDAO;

@Controller
public class JdmEnginesController {
	@Autowired
	private JdmEnginesDAO jdmDAO;

	@RequestMapping({ "", "/", "home.do" })
	public String index(Model model) {
		return "index";
	}

}
