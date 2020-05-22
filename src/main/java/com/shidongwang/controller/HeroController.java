package com.shidongwang.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shidongwang.beans.Hero;
import com.shidongwang.service.HeroService;

@Controller
public class HeroController {

	@Autowired
	private HeroService hs;
	@RequestMapping("selectFindAll")
	public String sayList(Model model,@RequestParam(defaultValue = "1")Integer pageNum){
		
		PageHelper.startPage(pageNum, 3);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		List<Hero> slist = hs.queryHero(map);
		
		PageInfo<Hero> plist = new PageInfo<Hero>(slist);
		
		model.addAttribute("plist",plist);
		
		return "list";
		
	}
}
