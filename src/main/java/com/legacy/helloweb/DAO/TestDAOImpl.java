package com.legacy.helloweb.DAO;

import java.util.List;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.legacy.helloweb.VO.TestVo;

@Repository
public class TestDAOImpl implements TestDAO{
	private static final String namespace="com.legacy.helloweb.testMapper";
	//사용할 mapper의 namespace명

	@Inject                 //DB 커넥션과 close()를 자동으로 해주는 SqlSession
	private SqlSession sqlSession;

	@Override
	public List<TestVo> test() throws Exception{
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".test");
          //row가 1개 이상인 select문을 구동시키는 메서드
	}
}
