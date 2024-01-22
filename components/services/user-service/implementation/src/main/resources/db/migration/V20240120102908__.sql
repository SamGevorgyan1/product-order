CREATE TABLE user_service.users
(
    user_id                UUID primary key    not null,
    user_name              VARCHAR(256)        not null,
    user_surname           VARCHAR(256)        not null,
    user_email             VARCHAR(256) unique not null,
    user_password          VARCHAR(256)        not null,
    user_phone_number      VARCHAR(256) unique not null,
    user_verification_code VARCHAR(256)
)
