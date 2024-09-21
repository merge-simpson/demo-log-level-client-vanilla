package letsdev.demo;

import letsdev.common.log.AdaptiveLogger;
import letsdev.common.log.LogLevel;

public class Demo {
    AdaptiveLogger logger = AdaptiveLogger.getLogger(Demo.class);

    void log(LogLevel logLevel, String message, Object... args) {
        // 외부에서 로그 레벨을 주입해 사용합니다.
        logger.with(logLevel)
                .log(message, args);
    }
}