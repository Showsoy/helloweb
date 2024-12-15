package com.legacy.helloweb.SERVICE;
import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.legacy.helloweb.DAO.TestDAO;
import com.legacy.helloweb.VO.TestVo;

@Service
public class TestServiceImpl implements TestService{
	@Inject
	private TestDAO dao;

	@Override
	public List<TestVo> test() throws Exception {
		// TODO Auto-generated method stub
		return dao.test();
	}
}
