package com.productorder.platform.user.springjpa;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import java.util.Objects;
import java.util.UUID;

import static com.productorder.platform.user.springjpa.DatabaseConstants.USER_SCHEMA_NAME;
import static com.productorder.platform.user.springjpa.DatabaseConstants.USER_TABLE_NAME;

@Entity
@Table(name = USER_TABLE_NAME, schema = USER_SCHEMA_NAME)
@Getter
@Setter
public class UserEntity {

    @Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    @Column(name = "user_id", nullable = false, updatable = false, unique = true)
    private UUID id;

    @Column(name = "user_name", nullable = false)
    private String name;

    @Column(name = "user_surname", nullable = false)
    private String surname;

    @Column(name = "user_email", nullable = false, updatable = false, unique = true)
    private String email;

    @Column(name = "user_password", nullable = false)
    private String password;

    @Column(name = "user_phone_number", nullable = false,unique = true)
    private String phoneNumber;

    @Column(name = "user_verification_code")
    private String verifyCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}