package com.APi.uniapp.until;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
@Service
public class WeChatAuthService {

    private final WebClient webClient = WebClient.create();

    public Mono<String> getSessionInfo(String jsCode) {
        // 构造URL参数
        String apiUrl = "https://api.weixin.qq.com/sns/jscode2session";
        String appId = "wx224030ac1ab6d5e8";
        String secret = "41a0533380c343b6f487e9adbcf59e06";
        String grantType = "authorization_code";

        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .scheme("https")
                        .host("api.weixin.qq.com")
                        .path("/sns/jscode2session")
                        .queryParam("appid", appId)
                        .queryParam("secret", secret)
                        .queryParam("grant_type", grantType)
                        .queryParam("js_code", jsCode)
                        .build())
                .retrieve()
                .bodyToMono(String.class)
                .doOnSuccess(s -> System.out.println(s));
    }
}
