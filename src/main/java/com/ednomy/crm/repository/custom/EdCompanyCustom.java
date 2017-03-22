package com.ednomy.crm.repository.custom;

import java.util.List;
import java.util.Map;

import com.ednomy.crm.entity.EdCompanyEntity;

public interface EdCompanyCustom {

	public List<EdCompanyEntity> list(Map<String, String> queryMap);

	public long count(Map<String, String> queryMap);

}
