package kr.fastcode.app.external.geomap.domains.vo;
import java.util.List;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Lazy
@Component
@NoArgsConstructor
public class GeoMapVO {
    private String place,latitude;
    private List<GeoMapVO> placeList;
    public GeoMapVO(String place, String latitude) {
        this.place = place;
        this.latitude = latitude;
    }

}