package com.skilldistillery.jdmengines.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.jdmengines.data.JdmEnginesDAO;
import com.skilldistillery.jdmengines.entities.JdmEngines;

@Controller
public class JdmEnginesController {
	@Autowired
	private JdmEnginesDAO jdmDAO;

	@GetMapping({ "", "/", "home.do" })
	public String index(Model model) {
		return "index";
	}

	@GetMapping("getJdmEngines.do")
	public String getEngineDetails(@RequestParam("Id") int engineId, Model model) {
		JdmEngines engine = jdmDAO.findById(engineId);
		model.addAttribute("engine", engine);
		return "displayEngines";
	}

	@PostMapping("updateEngine.do")
	public String updateEngine(@ModelAttribute JdmEngines updatedEngine, Model model) {
		JdmEngines engine = jdmDAO.update(updatedEngine.getId(), updatedEngine);
		model.addAttribute("engine", engine);
		return "updateEngine";
	}

    @PostMapping("addEngine.do")
    public String addEngine(@ModelAttribute JdmEngines newEngine, Model model) {
         JdmEngines managedEngine = jdmDAO.addNewJdmEngine(newEngine.getId(), newEngine.getName(), newEngine.getSize(), newEngine.getCylinders(), newEngine.getPower(), newEngine.getUnit());
        model.addAttribute("engine", managedEngine);
        return "newEngine"; 
    }


    @GetMapping("deleteEngine.do")
    public String deleteEngine(@RequestParam("id") int engineId, Model model) {
        boolean isDeleted = jdmDAO.deleteJdmEngine(engineId);
        model.addAttribute("isDeleted", isDeleted);
        model.addAttribute("engineId", engineId);
        return "deleteEngine"; 
    }
    
    @GetMapping("displayAllEngines.do")
    public String listAllEngines(Model model) {
        List<JdmEngines> engines = jdmDAO.findAll();
        model.addAttribute("engines", engines);
        return "displayAllEngines"; 
    }

}
