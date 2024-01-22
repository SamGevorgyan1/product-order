CREATE DATABASE product_order;
CREATE USER admin PASSWORD 'admin_pwd';
GRANT ALL PRIVILEGES ON DATABASE product_order TO admin;

CREATE USER user_service_user PASSWORD 'user_service_user_pwd';
GRANT CONNECT ON DATABASE product_order TO user_service_user;


CREATE SCHEMA user_service;
ALTER SCHEMA user_service OWNER TO admin;
GRANT ALL PRIVILEGES ON SCHEMA user_service TO user_service_user;
ALTER DEFAULT PRIVILEGES
      FOR USER admin
      IN SCHEMA user_service
      GRANT ALL PRIVILEGES ON TABLES TO user_service_user;
ALTER DEFAULT PRIVILEGES
      FOR USER admin
      IN SCHEMA user_service
      GRANT ALL ON PRIVILEGES SEQUENCES TO user_service_user;
