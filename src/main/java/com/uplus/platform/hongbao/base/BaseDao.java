package com.uplus.platform.hongbao.base;

import javax.annotation.Resource;

import com.uplus.platform.dao.bases.JdbcTemplateWrapper;

public class BaseDao {
	
	/**
	 * 基于jq简单处理后的JdbcTempleWrapper
	 */
	@Resource protected JdbcTemplateWrapper jdbcTemplate;
}
