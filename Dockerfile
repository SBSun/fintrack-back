# jdk21 Image Start
FROM openjdk:21

# jar 파일 복제
COPY build/libs/*.jar app.jar

# 타임존 대한민국으로 설정
ENV TZ=Asia/Seoul

# 실행 명령어
ENTRYPOINT ["java", "-Dspring.profiles.active=dev", "-jar", "app.jar"]