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
public class ClickApps extends AbsLongEntity {
    @Column(nullable = false)
    private String name;

    @ManyToOne
    private Icon icon;
}
