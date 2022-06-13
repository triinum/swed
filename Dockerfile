FROM alpine



RUN apk update && apk add bash


WORKDIR /usr/share/tag


ADD target/swedbank-uiautomation.jar            swedbank-uiautomation.jar
ADD target/swedbank-uiautomation-tests.jar      swedbank-uiautomation-tests.jar
ADD target/libs                                 libs


ADD xml-suites/*                                /usr/share/tag/


ADD src/test/resources/config/*                 src/test/resources/properties/config/


CMD ["bash"]
