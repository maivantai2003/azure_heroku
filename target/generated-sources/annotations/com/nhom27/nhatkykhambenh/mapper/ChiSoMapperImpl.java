package com.nhom27.nhatkykhambenh.mapper;

import com.nhom27.nhatkykhambenh.dto.ChiSoDTO;
import com.nhom27.nhatkykhambenh.model.ChiSo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-05T10:06:32+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Oracle Corporation)"
)
@Component
public class ChiSoMapperImpl implements ChiSoMapper {

    @Override
    public ChiSo toChiSo(ChiSoDTO chiSoDTO) {
        if ( chiSoDTO == null ) {
            return null;
        }

        ChiSo chiSo = new ChiSo();

        chiSo.setMaChiSo( chiSoDTO.getMaChiSo() );
        chiSo.setLoaiChiSo( chiSoDTO.getLoaiChiSo() );
        chiSo.setTenChiSo( chiSoDTO.getTenChiSo() );
        chiSo.setDonVi( chiSoDTO.getDonVi() );
        chiSo.setTrangThai( chiSoDTO.getTrangThai() );

        return chiSo;
    }

    @Override
    public ChiSoDTO toChiSoDTO(ChiSo chiSo) {
        if ( chiSo == null ) {
            return null;
        }

        ChiSoDTO chiSoDTO = new ChiSoDTO();

        chiSoDTO.setMaChiSo( chiSo.getMaChiSo() );
        chiSoDTO.setLoaiChiSo( chiSo.getLoaiChiSo() );
        chiSoDTO.setTenChiSo( chiSo.getTenChiSo() );
        chiSoDTO.setDonVi( chiSo.getDonVi() );
        chiSoDTO.setTrangThai( chiSo.getTrangThai() );

        return chiSoDTO;
    }

    @Override
    public List<ChiSoDTO> toChiSoDtoList(List<ChiSo> chiSoList) {
        if ( chiSoList == null ) {
            return null;
        }

        List<ChiSoDTO> list = new ArrayList<ChiSoDTO>( chiSoList.size() );
        for ( ChiSo chiSo : chiSoList ) {
            list.add( toChiSoDTO( chiSo ) );
        }

        return list;
    }
}
