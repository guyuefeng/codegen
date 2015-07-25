package com.swirebev.codegen.util;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

import freemarker.template.Configuration;

public class ConfigurationHelper {

	private static Configuration cfg = null;

	//ftl文件也统一UFT-8
	public static Configuration getConfiguration(String templateDir)throws IOException {
		if (null == cfg) {
			cfg = new Configuration();
			File templateDirFile = new File(templateDir);
			cfg.setDirectoryForTemplateLoading(templateDirFile);
			cfg.setLocale(Locale.CHINA);
			cfg.setDefaultEncoding("utf-8");
		}
		return cfg;
	}
}
