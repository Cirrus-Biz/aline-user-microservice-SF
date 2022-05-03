FROM amazoncorretto:17-alpine3.15

ADD ./user-microservice-0.1.0.jar user-microservice-0.1.0.jar

ENV SERVICE_NAME="gateway"
RUN addgroup --gid 1001 -S $SERVICE_NAME && \
    adduser -G $SERVICE_NAME --shell /bin/false --disabled-password -H --uid 1001 $SERVICE_NAME

EXPOSE 8070
USER $SERVICE_NAME

ENTRYPOINT ["java", "-jar", "user-microservice-0.1.0.jar"]

