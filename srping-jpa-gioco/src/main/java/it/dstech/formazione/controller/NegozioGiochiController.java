package it.dstech.formazione.controller;



import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import it.dstech.formazione.model.NegozioGiochi;

import it.dstech.formazione.service.NegozioGiochiService;

@Controller
public class NegozioGiochiController {
	
	@Autowired
      private NegozioGiochiService negozioGiochiService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("listNegozio", negozioGiochiService.listAll());
		return mav;
	}
	
	@RequestMapping("/new")
	public String newNegozioGiocoForm(Map<String, Object> model) {
		NegozioGiochi negozioGiochi = new NegozioGiochi();
		model.put("negozioGiochi", negozioGiochi);
		return "new_negozio";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveGioco(@ModelAttribute("gioco") NegozioGiochi gioco) {
		negozioGiochiService.save(gioco);
		return "redirect:/";
	}
	
	
	@RequestMapping("/edit")
	public ModelAndView editNegozioForm(@RequestParam int id) {
		ModelAndView mav = new ModelAndView("edit_gioco");
		NegozioGiochi negozioGiochi = negozioGiochiService.get(id);
		mav.addObject("negozioGiochi", negozioGiochi);
		
		return mav;
	}
	
	@RequestMapping("/delete")
	public String deleteNegozioForm(@RequestParam int id) {
		negozioGiochiService.delete(id);
		return "redirect:/";		
	}
	
	

	@RequestMapping("/search")
	public ModelAndView search(@RequestParam String keyword) {
		List<NegozioGiochi> result = negozioGiochiService.search(keyword);
		ModelAndView mav = new ModelAndView("search");
		mav.addObject("result", result);
		
		return mav;		
	}
	
	@RequestMapping("/paginainiziale")
	public ModelAndView paginaIniziale() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("listNegozio", negozioGiochiService.listAll());
		return mav;
		
	}
/////

	@RequestMapping(value = "/ordinamento", method = RequestMethod.POST)
	public ModelAndView oridnaBox(@RequestParam("command") int command) {
		List<NegozioGiochi> lista = negozioGiochiService.listAll();
		System.out.println("command "+ command);

		switch (command) {
		case 0: {
			ModelAndView mav = new ModelAndView("risultato");
			mav.addObject("lista", negozioGiochiService.sortByTitoloAsc());
			return mav;
			
		}
	
		default:
			ModelAndView mav = new ModelAndView("index");
			mav.addObject("lista", lista);
			return mav;
		}
		
	}

	
}
