package com.nhom27.nhatkykhambenh.mapper;

import com.nhom27.nhatkykhambenh.dto.ChiTietDonThuocDTO;
import com.nhom27.nhatkykhambenh.model.ChiTietDonThuoc;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-05T06:16:52+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Oracle Corporation)"
)
@Component
public class ChiTietDonThuocMapperImpl implements ChiTietDonThuocMapper {

    @Override
    public ChiTietDonThuoc toChiTietDonThuoc(ChiTietDonThuocDTO chiTietDonThuocDTO) {
        if ( chiTietDonThuocDTO == null ) {
            return null;
        }

        ChiTietDonThuoc chiTietDonThuoc = new ChiTietDonThuoc();

        chiTietDonThuoc.setSoLuongThuoc( chiTietDonThuocDTO.getSoLuongThuoc() );
        chiTietDonThuoc.setLieuLuong( chiTietDonThuocDTO.getLieuLuong() );
        chiTietDonThuoc.setTrangThai( chiTietDonThuocDTO.getTrangThai() );
        chiTietDonThuoc.setChiTietKhamBenh( chiTietDonThuocDTO.getChiTietKhamBenh() );
        chiTietDonThuoc.setDonThuoc( chiTietDonThuocDTO.getDonThuoc() );

        return chiTietDonThuoc;
    }

    @Override
    public ChiTietDonThuocDTO toChiTietDonThuocDTO(ChiTietDonThuoc chiTietDonThuoc) {
        if ( chiTietDonThuoc == null ) {
            return null;
        }

        ChiTietDonThuocDTO chiTietDonThuocDTO = new ChiTietDonThuocDTO();

        chiTietDonThuocDTO.setDonThuoc( chiTietDonThuoc.getDonThuoc() );
        chiTietDonThuocDTO.setChiTietKhamBenh( chiTietDonThuoc.getChiTietKhamBenh() );
        chiTietDonThuocDTO.setSoLuongThuoc( chiTietDonThuoc.getSoLuongThuoc() );
        chiTietDonThuocDTO.setLieuLuong( chiTietDonThuoc.getLieuLuong() );
        chiTietDonThuocDTO.setTrangThai( chiTietDonThuoc.getTrangThai() );

        return chiTietDonThuocDTO;
    }

    @Override
    public List<ChiTietDonThuocDTO> toChiTietDonThuocDtoList(List<ChiTietDonThuoc> chiTietDonThuocList) {
        if ( chiTietDonThuocList == null ) {
            return null;
        }

        List<ChiTietDonThuocDTO> list = new ArrayList<ChiTietDonThuocDTO>( chiTietDonThuocList.size() );
        for ( ChiTietDonThuoc chiTietDonThuoc : chiTietDonThuocList ) {
            list.add( toChiTietDonThuocDTO( chiTietDonThuoc ) );
        }

        return list;
    }
}
