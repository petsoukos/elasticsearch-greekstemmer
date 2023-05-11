FROM docker.elastic.co/elasticsearch/elasticsearch:8.7.1

COPY elasticsearch-skroutz-greekstemmer-8.7.1-SNAPSHOT.zip /plugins/elasticsearch-skroutz-greekstemmer-8.7.1-SNAPSHOT.zip

RUN elasticsearch-plugin install file:///plugins/elasticsearch-skroutz-greekstemmer-8.7.1-SNAPSHOT.zip