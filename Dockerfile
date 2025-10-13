FROM node:20 as build-stage

COPY . /app
WORKDIR /app

#Install the dependencies
RUN npm install

#Create an optimized version of the webapp
RUN npm run build
# Use the lightweight Nginx image from the previous stage for the nginx container
FROM linuxserver/nginx:arm64v8-1.26.1 as production-stage
# Copy the build application from the previous stage to the Nginx container
COPY  --from=build-stage /app/dist /config/www
# Copy the nginx configuration file
COPY  --from=build-stage /app/nginx.conf /config/nginx/nginx.conf
# Expose the port 443
EXPOSE 443