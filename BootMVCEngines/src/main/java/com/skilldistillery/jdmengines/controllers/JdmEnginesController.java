package com.skilldistillery.jdmengines.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.jdmengines.data.JdmEnginesDAO;
import com.skilldistillery.jdmengines.entities.JdmEngines;

@Controller
public class JdmEnginesController {
	@Autowired
	private JdmEnginesDAO jdmDAO;

	@RequestMapping({ "", "/", "home.do" })
	public String index(Model model) {
		return "index";
	}

    @GetMapping("getJdmEngines.do")
    public String getEngineDetails(@RequestParam("Id") int engineId, Model model) {
        JdmEngines engine = jdmDAO.findById(engineId); 
        model.addAttribute("engine", engine);
        return "displayEngines"; 
    }
	
}
