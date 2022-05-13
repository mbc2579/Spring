package com.inhatc.service;
import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.inhatc.domain.BoardVO;
import com.inhatc.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Inject
	private BoardDAO dao;
	
	@Override
	public void regist(BoardVO vo) throws Exception {
		dao.create(vo);
	}
	public BoardVO read(Integer bno) throws Exception {
		return dao.read(bno);
	}
	public void modify(BoardVO vo) throws Exception {
		dao.update(vo);
	}
	public void remove(Integer bno) throws Exception {
		dao.delete(bno);
	}
	public List<BoardVO> listAll() throws Exception {
		return dao.listAll();
	}
}
