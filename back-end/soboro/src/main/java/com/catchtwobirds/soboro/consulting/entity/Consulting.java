package com.catchtwobirds.soboro.consulting.entity;

import com.catchtwobirds.soboro.user.entity.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "consulting")
@Setter @Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Consulting {
    @Id
    @GeneratedValue
    @Column(name = "consulting_no")
    private Integer consultingNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "consulting_user_no")
    private User user;
    private LocalDateTime consultingVisitDate;
    private String consultingVisitPlace;
    private String consultingVisitClass;
    private String videoLocation;


}
