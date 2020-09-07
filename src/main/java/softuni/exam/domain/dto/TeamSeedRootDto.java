package softuni.exam.domain.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "teams")
@XmlAccessorType(XmlAccessType.FIELD)
public class TeamSeedRootDto {
    @XmlElement(name = "team")
    List<TeamSeedDto> teamSeedDtos;

    public TeamSeedRootDto() {
    }

    public List<TeamSeedDto> getTeamSeedDtos() {
        return teamSeedDtos;
    }

    public void setTeamSeedDtos(List<TeamSeedDto> teamSeedDtos) {
        this.teamSeedDtos = teamSeedDtos;
    }
}
