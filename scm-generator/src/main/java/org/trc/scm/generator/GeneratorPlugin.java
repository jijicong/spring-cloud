package org.trc.scm.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hzcyn on 2018/12/15.
 */
public class GeneratorPlugin {

    public static InputStream getResourceAsStream(String path){
        return Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
    }

    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<>();
        boolean overwrite = true;
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(getResourceAsStream("generatorConfig.xml"));
        config.getContexts().get(0).getJavaModelGeneratorConfiguration().setTargetProject(System.getProperty("user.dir") +
                config.getContexts().get(0).getJavaModelGeneratorConfiguration().getTargetProject());
        config.getContexts().get(0).getSqlMapGeneratorConfiguration().setTargetProject(System.getProperty("user.dir") +
                config.getContexts().get(0).getSqlMapGeneratorConfiguration().getTargetProject());
        config.getContexts().get(0).getJavaClientGeneratorConfiguration().setTargetProject(System.getProperty("user.dir") +
                config.getContexts().get(0).getJavaClientGeneratorConfiguration().getTargetProject());
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

}
