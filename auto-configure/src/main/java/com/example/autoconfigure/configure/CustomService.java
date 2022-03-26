package com.example.autoconfigure.configure;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;


@Slf4j
@RequiredArgsConstructor
public class CustomService implements InitializingBean {

	private final CustomProperties customProperties;

	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("CustomService init");
		log.info("message : {}", customProperties.getMessage());
		log.info("url : {}", customProperties.getUrl());
	}
}
