package com.multi.mvc700;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class MovieDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public int insert(MovieVO bag) {
		int result = my.insert("movie.create",bag);
		return result;
	}
	
	public int update(MovieVO bag) {
		int result = my.update("movie.update", bag);
		return result;
	}
	
	public int delete(int id) {
		int result = my.delete("movie.delete", id);
		return result;
	}
	
	public MovieVO one(int id) {
		MovieVO bag = my.selectOne("movie.one", id);
		return bag;
	}
	
	public List<MovieVO> list() {
		List<MovieVO> list = my.selectList("movie.all");
		return list;
	}
	
}
