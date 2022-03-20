package uz.pdp.clickup.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.clickup.enums.AccessType;

import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SpaceRespDto{
    private UUID id;

    private String name;

    private String color;

    private Long workspace;

    private String initialLetter;

    private Long icon;

    private UUID avatar;

    private UUID owner;

    private AccessType accessType;
}
