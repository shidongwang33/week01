package com.shidongwang.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shidongwang.beans.Hero;
import com.shidongwang.mapper.HeroMapper;

@Service
public class HeroServiceImp implements HeroService {

	@Autowired
	private HeroMapper hMapper;
	
	public List<Hero> queryHero(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return hMapper.selectHero(map);
	}

}
