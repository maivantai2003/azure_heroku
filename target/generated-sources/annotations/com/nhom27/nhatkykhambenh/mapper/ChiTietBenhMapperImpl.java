package com.nhom27.nhatkykhambenh.mapper;

import com.nhom27.nhatkykhambenh.dto.ChiTietBenhDTO;
import com.nhom27.nhatkykhambenh.model.ChiTietBenh;
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
public class ChiTietBenhMapperImpl implements ChiTietBenhMapper {

    @Override
    public ChiTietBenh toChiTietBenh(ChiTietBenhDTO chiTietBenhDTO) {
        if ( chiTietBenhDTO == null ) {
            return null;
        }

        ChiTietBenh chiTietBenh = new ChiTietBenh();

        chiTietBenh.setMaChiTietBenh( chiTietBenhDTO.getMaChiTietBenh() );
        chiTietBenh.setTenBenh( chiTietBenhDTO.getTenBenh() );
        chiTietBenh.setTrangThaiBenhHienTai( chiTietBenhDTO.getTrangThaiBenhHienTai() );
        chiTietBenh.setTrangThai( chiTietBenhDTO.getTrangThai() );

        return chiTietBenh;
    }

    @Override
    public ChiTietBenhDTO toChiTietBenhDTO(ChiTietBenh chiTietBenh) {
        if ( chiTietBenh == null ) {
            return null;
        }

        ChiTietBenhDTO chiTietBenhDTO = new ChiTietBenhDTO();

        chiTietBenhDTO.setMaChiTietBenh( chiTietBenh.getMaChiTietBenh() );
        chiTietBenhDTO.setTenBenh( chiTietBenh.getTenBenh() );
        chiTietBenhDTO.setTrangThaiBenhHienTai( chiTietBenh.getTrangThaiBenhHienTai() );
        chiTietBenhDTO.setTrangThai( chiTietBenh.getTrangThai() );

        return chiTietBenhDTO;
    }

    @Override
    public List<ChiTietBenhDTO> toChiTietBenhDtoList(List<ChiTietBenh> chiTietBenhList) {
        if ( chiTietBenhList == null ) {
            return null;
        }

        List<ChiTietBenhDTO> list = new ArrayList<ChiTietBenhDTO>( chiTietBenhList.size() );
        for ( ChiTietBenh chiTietBenh : chiTietBenhList ) {
            list.add( toChiTietBenhDTO( chiTietBenh ) );
        }

        return list;
    }
}
