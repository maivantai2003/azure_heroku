package com.nhom27.nhatkykhambenh.mapper;

import com.nhom27.nhatkykhambenh.dto.ChiTietChiSoDTO;
import com.nhom27.nhatkykhambenh.model.ChiTietChiSo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-05T06:16:53+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Oracle Corporation)"
)
@Component
public class ChiTietChiSoMapperImpl implements ChiTietChiSoMapper {

    @Override
    public ChiTietChiSo toChiTietChiSo(ChiTietChiSoDTO chiTietChiSoDTO) {
        if ( chiTietChiSoDTO == null ) {
            return null;
        }

        ChiTietChiSo chiTietChiSo = new ChiTietChiSo();

        chiTietChiSo.setMaChiSo( chiTietChiSoDTO.getMaChiSo() );
        chiTietChiSo.setMaTongQuan( chiTietChiSoDTO.getMaTongQuan() );
        chiTietChiSo.setThoiGianDo( chiTietChiSoDTO.getThoiGianDo() );
        chiTietChiSo.setKetQuaDo( chiTietChiSoDTO.getKetQuaDo() );

        return chiTietChiSo;
    }

    @Override
    public ChiTietChiSoDTO toChiTietChiSoDTO(ChiTietChiSo chiTietChiSo) {
        if ( chiTietChiSo == null ) {
            return null;
        }

        ChiTietChiSoDTO chiTietChiSoDTO = new ChiTietChiSoDTO();

        chiTietChiSoDTO.setMaChiSo( chiTietChiSo.getMaChiSo() );
        chiTietChiSoDTO.setMaTongQuan( chiTietChiSo.getMaTongQuan() );
        chiTietChiSoDTO.setThoiGianDo( chiTietChiSo.getThoiGianDo() );
        chiTietChiSoDTO.setKetQuaDo( chiTietChiSo.getKetQuaDo() );

        return chiTietChiSoDTO;
    }

    @Override
    public List<ChiTietChiSoDTO> toChiTietChiSoDtoList(List<ChiTietChiSo> chiTietChiSoList) {
        if ( chiTietChiSoList == null ) {
            return null;
        }

        List<ChiTietChiSoDTO> list = new ArrayList<ChiTietChiSoDTO>( chiTietChiSoList.size() );
        for ( ChiTietChiSo chiTietChiSo : chiTietChiSoList ) {
            list.add( toChiTietChiSoDTO( chiTietChiSo ) );
        }

        return list;
    }
}
