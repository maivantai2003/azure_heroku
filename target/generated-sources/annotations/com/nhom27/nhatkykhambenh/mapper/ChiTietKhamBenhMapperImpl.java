package com.nhom27.nhatkykhambenh.mapper;

import com.nhom27.nhatkykhambenh.dto.ChiTietKhamBenhDTO;
import com.nhom27.nhatkykhambenh.model.ChiTietKhamBenh;
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
public class ChiTietKhamBenhMapperImpl implements ChiTietKhamBenhMapper {

    @Override
    public ChiTietKhamBenh toChiTietKhamBenh(ChiTietKhamBenhDTO chiTietKhamBenhDTO) {
        if ( chiTietKhamBenhDTO == null ) {
            return null;
        }

        ChiTietKhamBenh chiTietKhamBenh = new ChiTietKhamBenh();

        chiTietKhamBenh.setMaChiTietKhamBenh( chiTietKhamBenhDTO.getMaChiTietKhamBenh() );
        chiTietKhamBenh.setKhoaKham( chiTietKhamBenhDTO.getKhoaKham() );
        chiTietKhamBenh.setThoiGianVaoKham( chiTietKhamBenhDTO.getThoiGianVaoKham() );
        chiTietKhamBenh.setBacSiKham( chiTietKhamBenhDTO.getBacSiKham() );
        chiTietKhamBenh.setChiDinh( chiTietKhamBenhDTO.getChiDinh() );
        chiTietKhamBenh.setChuanDoan( chiTietKhamBenhDTO.getChuanDoan() );
        chiTietKhamBenh.setNhomMau( chiTietKhamBenhDTO.getNhomMau() );
        chiTietKhamBenh.setTinhTrang( chiTietKhamBenhDTO.getTinhTrang() );
        chiTietKhamBenh.setTrangThai( chiTietKhamBenhDTO.getTrangThai() );

        return chiTietKhamBenh;
    }

    @Override
    public ChiTietKhamBenhDTO toChiTietKhamBenhDTO(ChiTietKhamBenh chiTietKhamBenh) {
        if ( chiTietKhamBenh == null ) {
            return null;
        }

        ChiTietKhamBenhDTO chiTietKhamBenhDTO = new ChiTietKhamBenhDTO();

        chiTietKhamBenhDTO.setMaChiTietKhamBenh( chiTietKhamBenh.getMaChiTietKhamBenh() );
        chiTietKhamBenhDTO.setKhoaKham( chiTietKhamBenh.getKhoaKham() );
        chiTietKhamBenhDTO.setThoiGianVaoKham( chiTietKhamBenh.getThoiGianVaoKham() );
        chiTietKhamBenhDTO.setBacSiKham( chiTietKhamBenh.getBacSiKham() );
        chiTietKhamBenhDTO.setChiDinh( chiTietKhamBenh.getChiDinh() );
        chiTietKhamBenhDTO.setChuanDoan( chiTietKhamBenh.getChuanDoan() );
        chiTietKhamBenhDTO.setNhomMau( chiTietKhamBenh.getNhomMau() );
        chiTietKhamBenhDTO.setTinhTrang( chiTietKhamBenh.getTinhTrang() );
        chiTietKhamBenhDTO.setTrangThai( chiTietKhamBenh.getTrangThai() );

        return chiTietKhamBenhDTO;
    }

    @Override
    public List<ChiTietKhamBenhDTO> toChiTietKhamBenhDtoList(List<ChiTietKhamBenh> chiTietKhamBenhList) {
        if ( chiTietKhamBenhList == null ) {
            return null;
        }

        List<ChiTietKhamBenhDTO> list = new ArrayList<ChiTietKhamBenhDTO>( chiTietKhamBenhList.size() );
        for ( ChiTietKhamBenh chiTietKhamBenh : chiTietKhamBenhList ) {
            list.add( toChiTietKhamBenhDTO( chiTietKhamBenh ) );
        }

        return list;
    }

    @Override
    public void updateChiTietKhamBenhFromDTO(ChiTietKhamBenhDTO chiTietKhamBenhDTO, ChiTietKhamBenh chiTietKhamBenh) {
        if ( chiTietKhamBenhDTO == null ) {
            return;
        }

        if ( chiTietKhamBenhDTO.getKhoaKham() != null ) {
            chiTietKhamBenh.setKhoaKham( chiTietKhamBenhDTO.getKhoaKham() );
        }
        if ( chiTietKhamBenhDTO.getThoiGianVaoKham() != null ) {
            chiTietKhamBenh.setThoiGianVaoKham( chiTietKhamBenhDTO.getThoiGianVaoKham() );
        }
        if ( chiTietKhamBenhDTO.getBacSiKham() != null ) {
            chiTietKhamBenh.setBacSiKham( chiTietKhamBenhDTO.getBacSiKham() );
        }
        if ( chiTietKhamBenhDTO.getChiDinh() != null ) {
            chiTietKhamBenh.setChiDinh( chiTietKhamBenhDTO.getChiDinh() );
        }
        if ( chiTietKhamBenhDTO.getChuanDoan() != null ) {
            chiTietKhamBenh.setChuanDoan( chiTietKhamBenhDTO.getChuanDoan() );
        }
        if ( chiTietKhamBenhDTO.getNhomMau() != null ) {
            chiTietKhamBenh.setNhomMau( chiTietKhamBenhDTO.getNhomMau() );
        }
        if ( chiTietKhamBenhDTO.getTinhTrang() != null ) {
            chiTietKhamBenh.setTinhTrang( chiTietKhamBenhDTO.getTinhTrang() );
        }
        if ( chiTietKhamBenhDTO.getTrangThai() != null ) {
            chiTietKhamBenh.setTrangThai( chiTietKhamBenhDTO.getTrangThai() );
        }
    }
}
