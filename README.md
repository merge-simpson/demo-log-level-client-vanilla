# Demo Client for [Letsdev Log Level API](https://github.com/merge-simpson/letsdev-log-level-api)

이 프로젝트는 [letsdev-log-level-api](https://github.com/merge-simpson/letsdev-log-level-api)의 데모입니다.

# Configuration

[letsdev-log-level-api](https://github.com/merge-simpson/letsdev-log-level-api)는 SLF4J 구현체를 따로 추가해야 하며,
이 예시는 `"org.slf4j:slf4j-simple:2.0.16"` 라이브러리를 사용합니다.
`simplelogger.properties` 파일에 로깅 레벨을 설정할 수 있으며,
다른 의존성 없이 `.properties` 외에 확장자를 바꿀 수 없습니다.

다음은 예시이며, 더 자세한 속성은 구현 라이브러리의 매뉴얼을 확인하십시오.

```properties
# 기본 로깅 레벨(TRACE, DEBUG, INFO, WARN, ERROR)
org.slf4j.simpleLogger.defaultLogLevel=DEBUG

# 패키지 단위 로깅 레벨
org.slf4j.simpleLogger.label1.label2.label3=TRACE
org.slf4j.simpleLogger.label1.label2.label4=TRACE

### 추가 속성들 ###

# 로그에 타임스탬프 표시 여부 (true/false)
org.slf4j.simpleLogger.showDateTime=true

# 타임스탬프 포맷 설정 (java.text.SimpleDateFormat 규칙 사용)
org.slf4j.simpleLogger.dateTimeFormat=yyyy-MM-dd HH:mm:ss.SSS

# 로그 메시지의 포맷을 지정할 수 있음
org.slf4j.simpleLogger.logFile=System.out
```