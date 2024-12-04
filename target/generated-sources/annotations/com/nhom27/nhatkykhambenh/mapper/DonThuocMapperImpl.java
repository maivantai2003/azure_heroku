package com.nhom27.nhatkykhambenh.mapper;

import com.nhom27.nhatkykhambenh.dto.DonThuocDTO;
import com.nhom27.nhatkykhambenh.model.DonThuoc;
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
public class DonThuocMapperImpl implements DonThuocMapper {

    @Override
    public DonThuoc toDonThuoc(DonThuocDTO donThuocDTO) {
        if ( donThuocDTO == null ) {
            return null;
        }

        DonThuoc donThuoc = new DonThuoc();

        donThuoc.setMaDonThuoc( donThuocDTO.getMaDonThuoc() );
        donThuoc.setTenThuoc( donThuocDTO.getTenThuoc() );
        donThuoc.setHamLuong( donThuocDTO.getHamLuong() );
        donThuoc.setDonViTinh( donThuocDTO.getDonViTinh() );
        donThuoc.setTrangThai( donThuocDTO.getTrangThai() );

        return donThuoc;
    }

    @Override
    public DonThuocDTO toDonThuocDTO(DonThuoc donThuoc) {
        if ( donThuoc == null ) {
            return null;
        }

        DonThuocDTO donThuocDTO = new DonThuocDTO();

        donThuocDTO.setMaDonThuoc( donThuoc.getMaDonThuoc() );
        donThuocDTO.setTenThuoc( donThuoc.getTenThuoc() );
        donThuocDTO.setHamLuong( donThuoc.getHamLuong() );
        donThuocDTO.setDonViTinh( donThuoc.getDonViTinh() );
        donThuocDTO.setTrangThai( donThuoc.getTrangThai() );

        return donThuocDTO;
    }

    @Override
    public List<DonThuocDTO> toDonThuocDtoList(List<DonThuoc> donThuocList) {
        if ( donThuocList == null ) {
            return null;
        }

        List<DonThuocDTO> list = new ArrayList<DonThuocDTO>( donThuocList.size() );
        for ( DonThuoc donThuoc : donThuocList ) {
            list.add( toDonThuocDTO( donThuoc ) );
        }

        return list;
    }
}
