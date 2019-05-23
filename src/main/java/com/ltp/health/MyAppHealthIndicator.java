package com.ltp.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @projectName springboot-actuator
 * @ClassName MyAppHealthIndicator
 * @Auther Ltp
 * @Date 2019/5/23 21:18
 * @Description 自定义健康指示器
 * @Version 1.0
 */
@Component
public class MyAppHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {

        //检查方法
        //成功Health.up().build()

        return Health.down().withDetail("msg", "未连接").build();
    }
}
