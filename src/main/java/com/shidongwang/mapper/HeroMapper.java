package com.shidongwang.mapper;

import java.util.List;
import java.util.Map;

import com.shidongwang.beans.Hero;

public interface HeroMapper {

	public List<Hero> selectHero(Map<String,Object> map);
}
