package com.nhom27.nhatkykhambenh.mapper;

import com.nhom27.nhatkykhambenh.dto.KhamBenhDTO;
import com.nhom27.nhatkykhambenh.dto.LichHenKhamDTO;
import com.nhom27.nhatkykhambenh.model.ChiTietKhamBenh;
import com.nhom27.nhatkykhambenh.model.KhamBenh;
import com.nhom27.nhatkykhambenh.model.LichHenKham;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-05T06:16:52+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Oracle Corporation)"
)
@Component
public class LichHenKhamMapperImpl implements LichHenKhamMapper {

    @Override
    public LichHenKhamDTO toDTO(LichHenKham lichHenKham) {
        if ( lichHenKham == null ) {
            return null;
        }

        LichHenKhamDTO lichHenKhamDTO = new LichHenKhamDTO();

        lichHenKhamDTO.setMaHenKham( lichHenKham.getMaHenKham() );
        lichHenKhamDTO.setThoiGianHen( lichHenKham.getThoiGianHen() );
        lichHenKhamDTO.setTrangThai( lichHenKham.getTrangThai() );
        lichHenKhamDTO.setKhamBenh( khamBenhToKhamBenhDTO( lichHenKham.getKhamBenh() ) );

        return lichHenKhamDTO;
    }

    @Override
    public List<LichHenKhamDTO> toListDTO(List<LichHenKham> lichHenKham) {
        if ( lichHenKham == null ) {
            return null;
        }

        List<LichHenKhamDTO> list = new ArrayList<LichHenKhamDTO>( lichHenKham.size() );
        for ( LichHenKham lichHenKham1 : lichHenKham ) {
            list.add( toDTO( lichHenKham1 ) );
        }

        return list;
    }

    @Override
    public LichHenKham toEntity(LichHenKhamDTO lichHenKhamDTO) {
        if ( lichHenKhamDTO == null ) {
            return null;
        }

        LichHenKham lichHenKham = new LichHenKham();

        lichHenKham.setMaHenKham( lichHenKhamDTO.getMaHenKham() );
        lichHenKham.setThoiGianHen( lichHenKhamDTO.getThoiGianHen() );
        lichHenKham.setTrangThai( lichHenKhamDTO.getTrangThai() );
        lichHenKham.setKhamBenh( khamBenhDTOToKhamBenh( lichHenKhamDTO.getKhamBenh() ) );

        return lichHenKham;
    }

    protected KhamBenhDTO khamBenhToKhamBenhDTO(KhamBenh khamBenh) {
        if ( khamBenh == null ) {
            return null;
        }

        KhamBenhDTO khamBenhDTO = new KhamBenhDTO();

        khamBenhDTO.setMaKhamBenh( khamBenh.getMaKhamBenh() );
        khamBenhDTO.setBenhVien( khamBenh.getBenhVien() );
        khamBenhDTO.setNgayKham( khamBenh.getNgayKham() );
        khamBenhDTO.setTrangThai( khamBenh.getTrangThai() );
        khamBenhDTO.setNguoiDung( khamBenh.getNguoiDung() );
        Set<ChiTietKhamBenh> set = khamBenh.getDanhSachChiTietKhamBenh();
        if ( set != null ) {
            khamBenhDTO.setDanhSachChiTietKhamBenh( new LinkedHashSet<ChiTietKhamBenh>( set ) );
        }
        Set<LichHenKham> set1 = khamBenh.getDanhSachLichHenKham();
        if ( set1 != null ) {
            khamBenhDTO.setDanhSachLichHenKham( new LinkedHashSet<LichHenKham>( set1 ) );
        }

        return khamBenhDTO;
    }

    protected KhamBenh khamBenhDTOToKhamBenh(KhamBenhDTO khamBenhDTO) {
        if ( khamBenhDTO == null ) {
            return null;
        }

        KhamBenh khamBenh = new KhamBenh();

        khamBenh.setMaKhamBenh( khamBenhDTO.getMaKhamBenh() );
        khamBenh.setBenhVien( khamBenhDTO.getBenhVien() );
        khamBenh.setNgayKham( khamBenhDTO.getNgayKham() );
        khamBenh.setTrangThai( khamBenhDTO.getTrangThai() );
        khamBenh.setNguoiDung( khamBenhDTO.getNguoiDung() );
        Set<ChiTietKhamBenh> set = khamBenhDTO.getDanhSachChiTietKhamBenh();
        if ( set != null ) {
            khamBenh.setDanhSachChiTietKhamBenh( new LinkedHashSet<ChiTietKhamBenh>( set ) );
        }
        Set<LichHenKham> set1 = khamBenhDTO.getDanhSachLichHenKham();
        if ( set1 != null ) {
            khamBenh.setDanhSachLichHenKham( new LinkedHashSet<LichHenKham>( set1 ) );
        }

        return khamBenh;
    }
}
