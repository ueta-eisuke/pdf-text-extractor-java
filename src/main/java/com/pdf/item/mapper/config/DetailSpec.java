package com.pdf.item.mapper.config;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class DetailSpec {

	@NonNull
	private Integer startPage = 0;
	private Integer endPage;
	@NonNull
	private Boolean sortByPosition = Boolean.TRUE;

	@NonNull
	private DetailPageRule defaultPageRule;
	@NonNull
	private List<DetailPageRule> pageRules = new ArrayList<DetailPageRule>();

}