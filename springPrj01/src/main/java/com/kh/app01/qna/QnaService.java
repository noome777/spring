package com.kh.app01.qna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QnaService {
	
	@Autowired
	private QnaDao dao;

	/**
	 * 문의 작성 진행
	 * @param vo
	 * @return
	 */
	public int write(QnaVo vo) {
		int result = dao.write(vo);
		return result;
	}

}
