cd ..
cd myProject-dependencies
call mvn deploy

cd ..
cd myProject-commons
call mvn deploy

cd ..
cd myProject-commons-domain
call mvn deploy

cd ..
cd myProject-commons-mapper
call mvn deploy

cd ..
cd myProject-commons-dubbo
call mvn deploy

cd ..
cd myProject-static-backend
call mvn deploy

cd ..
cd myProject-service-user-api
call mvn deploy

cd ..
cd myProject-service-content-api
call mvn deploy

cd ..
cd myProject-service-redis-api
call mvn clean