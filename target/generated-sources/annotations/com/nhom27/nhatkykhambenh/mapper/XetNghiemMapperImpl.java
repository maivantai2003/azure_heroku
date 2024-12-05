package com.nhom27.nhatkykhambenh.mapper;

import com.nhom27.nhatkykhambenh.dto.XetNghiemDTO;
import com.nhom27.nhatkykhambenh.model.XetNghiem;
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
public class XetNghiemMapperImpl implements XetNghiemMapper {

    @Override
    public XetNghiem toXetNghiem(XetNghiemDTO xetNghiemDTO) {
        if ( xetNghiemDTO == null ) {
            return null;
        }

        XetNghiem xetNghiem = new XetNghiem();

        xetNghiem.setMaXetNghiem( xetNghiemDTO.getMaXetNghiem() );
        xetNghiem.setTenXetNghiem( xetNghiemDTO.getTenXetNghiem() );
        xetNghiem.setKetQuaXetNghiem( xetNghiemDTO.getKetQuaXetNghiem() );
        xetNghiem.setTrangThai( xetNghiemDTO.getTrangThai() );
        xetNghiem.setMaChiTietKhamBenh( xetNghiemDTO.getMaChiTietKhamBenh() );

        return xetNghiem;
    }

    @Override
    public XetNghiemDTO toXetNghiemDTO(XetNghiem xetNghiem) {
        if ( xetNghiem == null ) {
            return null;
        }

        XetNghiemDTO xetNghiemDTO = new XetNghiemDTO();

        xetNghiemDTO.setMaXetNghiem( xetNghiem.getMaXetNghiem() );
        xetNghiemDTO.setMaChiTietKhamBenh( xetNghiem.getMaChiTietKhamBenh() );
        xetNghiemDTO.setKetQuaXetNghiem( xetNghiem.getKetQuaXetNghiem() );
        xetNghiemDTO.setTenXetNghiem( xetNghiem.getTenXetNghiem() );
        xetNghiemDTO.setTrangThai( xetNghiem.getTrangThai() );

        return xetNghiemDTO;
    }

    @Override
    public List<XetNghiemDTO> toXetNghiemDtoList(List<XetNghiem> xetNghiemList) {
        if ( xetNghiemList == null ) {
            return null;
        }

        List<XetNghiemDTO> list = new ArrayList<XetNghiemDTO>( xetNghiemList.size() );
        for ( XetNghiem xetNghiem : xetNghiemList ) {
            list.add( toXetNghiemDTO( xetNghiem ) );
        }

        return list;
    }

    @Override
    public void updateXetNghiemFromDTO(XetNghiemDTO xetNghiemDTO, XetNghiem xetNghiem) {
        if ( xetNghiemDTO == null ) {
            return;
        }

        if ( xetNghiemDTO.getTenXetNghiem() != null ) {
            xetNghiem.setTenXetNghiem( xetNghiemDTO.getTenXetNghiem() );
        }
        if ( xetNghiemDTO.getKetQuaXetNghiem() != null ) {
            xetNghiem.setKetQuaXetNghiem( xetNghiemDTO.getKetQuaXetNghiem() );
        }
        if ( xetNghiemDTO.getTrangThai() != null ) {
            xetNghiem.setTrangThai( xetNghiemDTO.getTrangThai() );
        }
        if ( xetNghiemDTO.getMaChiTietKhamBenh() != null ) {
            xetNghiem.setMaChiTietKhamBenh( xetNghiemDTO.getMaChiTietKhamBenh() );
        }
    }
}
