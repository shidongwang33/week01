package com.shidongwang.service;

import java.util.List;
import java.util.Map;

import com.shidongwang.beans.Hero;

public interface HeroService {

	public List<Hero> queryHero(Map<String,Object> map);
}
