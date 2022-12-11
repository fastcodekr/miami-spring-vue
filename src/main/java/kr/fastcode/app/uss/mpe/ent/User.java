package kr.fastcode.app.uss.mpe.ent;

import lombok.*;

import javax.persistence.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    private Long id;
    @Column(name = "userid") private String userid;
    @Column(name = "password") private String password;


}
