package com.educare.admin.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.educare.admin.model.Adminofflinedatapojo;

public class OfflineQuestiondataMapper implements RowMapper<Adminofflinedatapojo> {

	@Override
	public Adminofflinedatapojo mapRow(ResultSet rs, int arg1) throws SQLException {
		Adminofflinedatapojo adm=new Adminofflinedatapojo();
		adm.setQuestionid(rs.getInt("question_id"));
		adm.setSelected_answer(rs.getString("selected_keys"));
		return adm;
	}

}
