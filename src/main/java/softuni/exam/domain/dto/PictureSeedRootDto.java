package softuni.exam.domain.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
@XmlRootElement(name = "pictures")
@XmlAccessorType(XmlAccessType.FIELD)
public class PictureSeedRootDto {
    @XmlElement(name = "picture")
    List<PictureSeedDto> pictureSeedDtos;

    public PictureSeedRootDto() {
    }

    public List<PictureSeedDto> getPictureSeedDtos() {
        return pictureSeedDtos;
    }

    public void setPictureSeedDtos(List<PictureSeedDto> pictureSeedDtos) {
        this.pictureSeedDtos = pictureSeedDtos;
    }
}
