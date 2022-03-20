package uz.pdp.clickup.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.clickup.entity.template.AbsLongEntity;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Icon extends AbsLongEntity {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String color;

    @Column
    private String initialLetter;

    @OneToOne
    private Attachment attachment;
}
