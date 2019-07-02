package com.stylefeng.guns.config.properties;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * flowable工作流的的配置
 *
 * @author ...
 * @date 2017-12-02 23:18
 */
@Configuration
@ConfigurationProperties(prefix = GunsFlowableProperties.GUNS_FLOWABLE_DATASOURCE)
public class GunsFlowableProperties {

    public static final String GUNS_FLOWABLE_DATASOURCE = "guns.flowable.datasource";

    /**
     * 默认多数据源的链接
     */
    private String url = "jdbc:mysql://106.13.55.232:3306/guns?useSSL=false&characterEncoding=utf8";

    /**
     * 默认多数据源的数据库账号
     */
    private String username = "root";

    /**
     * 默认多数据源的数据库密码
     */
    private String password = "mypwd";

    public void config(DruidDataSource dataSource) {
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
