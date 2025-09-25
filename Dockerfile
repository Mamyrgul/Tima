FROM eclipse-temurin:17-jdk-alpine

# Рабочая директория внутри контейнера
WORKDIR /app

# Копируем собранный JAR в контейнер
COPY build/libs/Tima-0.0.1-SNAPSHOT.jar app.jar

# Открываем порт 8080
EXPOSE 8080

# Запуск приложения
ENTRYPOINT ["java", "-jar", "app.jar"]
