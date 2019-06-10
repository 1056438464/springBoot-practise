cd ..
cd myProject-dependencies
call mvn install

cd ..
cd myProject-commons
call mvn install

cd ..
cd myProject-commons-domain
call mvn install

cd ..
cd myProject-commons-mapper
call mvn install

cd ..
cd myProject-commons-dubbo
call mvn install

cd ..
cd myProject-static-backend
call mvn install

cd ..
cd myProject-service-user-api
call mvn install

cd ..
cd myProject-service-content-api
call mvn install

cd ..
cd myProject-service-redis-api
call mvn clean