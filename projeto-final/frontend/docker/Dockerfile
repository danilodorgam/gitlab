FROM nginx:alpine
RUN apk --update add  unzip
COPY nginx.conf /etc/nginx/nginx.conf
RUN rm /etc/nginx/conf.d/default.conf
WORKDIR /usr/share/nginx/html

RUN rm -rf ./*
COPY --chown=1001:root *.zip /usr/share/nginx/html
RUN sh -c 'unzip -q "*.zip"'

ENTRYPOINT ["nginx", "-g", "daemon off;"]
