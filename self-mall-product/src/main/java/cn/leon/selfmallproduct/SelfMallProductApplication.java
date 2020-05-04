package cn.leon.selfmallproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.SpringCloudApplication;

@EnableOAuth2Sso
@SpringCloudApplication
public class SelfMallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SelfMallProductApplication.class, args);
    }

}
