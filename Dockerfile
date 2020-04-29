FROM nigesh/android-helloworld:105
USER root
RUN mkdir -p /usr/share/jenkins/ref
RUN mkdir -p /var/lib/docker/tmp/
COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt
USER jenkins
