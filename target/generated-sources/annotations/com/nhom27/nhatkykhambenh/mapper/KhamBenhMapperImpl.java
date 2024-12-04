package com.nhom27.nhatkykhambenh.mapper;

import com.nhom27.nhatkykhambenh.dto.KhamBenhDTO;
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
    date = "2024-12-05T06:16:53+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Oracle Corporation)"
)
@Component
public class KhamBenhMapperImpl implements KhamBenhMapper {

    @Override
    public KhamBenh toKhamBenh(KhamBenhDTO khamBenhDTO) {
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

    @Override
    public KhamBenhDTO toKhamBenhDTO(KhamBenh khamBenh) {
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

    @Override
    public List<KhamBenhDTO> toKhamBenhDtoList(List<KhamBenh> khamBenhList) {
        if ( khamBenhList == null ) {
            return null;
        }

        List<KhamBenhDTO> list = new ArrayList<KhamBenhDTO>( khamBenhList.size() );
        for ( KhamBenh khamBenh : khamBenhList ) {
            list.add( toKhamBenhDTO( khamBenh ) );
        }

        return list;
    }

    @Override
    public void updateKhamBenhFromDTO(KhamBenhDTO khamBenhDTO, KhamBenh khamBenh) {
        if ( khamBenhDTO == null ) {
            return;
        }

        if ( khamBenhDTO.getBenhVien() != null ) {
            khamBenh.setBenhVien( khamBenhDTO.getBenhVien() );
        }
        if ( khamBenhDTO.getNgayKham() != null ) {
            khamBenh.setNgayKham( khamBenhDTO.getNgayKham() );
        }
        if ( khamBenhDTO.getTrangThai() != null ) {
            khamBenh.setTrangThai( khamBenhDTO.getTrangThai() );
        }
        if ( khamBenhDTO.getNguoiDung() != null ) {
            khamBenh.setNguoiDung( khamBenhDTO.getNguoiDung() );
        }
        if ( khamBenh.getDanhSachChiTietKhamBenh() != null ) {
            Set<ChiTietKhamBenh> set = khamBenhDTO.getDanhSachChiTietKhamBenh();
            if ( set != null ) {
                khamBenh.getDanhSachChiTietKhamBenh().clear();
                khamBenh.getDanhSachChiTietKhamBenh().addAll( set );
            }
        }
        else {
            Set<ChiTietKhamBenh> set = khamBenhDTO.getDanhSachChiTietKhamBenh();
            if ( set != null ) {
                khamBenh.setDanhSachChiTietKhamBenh( new LinkedHashSet<ChiTietKhamBenh>( set ) );
            }
        }
        if ( khamBenh.getDanhSachLichHenKham() != null ) {
            Set<LichHenKham> set1 = khamBenhDTO.getDanhSachLichHenKham();
            if ( set1 != null ) {
                khamBenh.getDanhSachLichHenKham().clear();
                khamBenh.getDanhSachLichHenKham().addAll( set1 );
            }
        }
        else {
            Set<LichHenKham> set1 = khamBenhDTO.getDanhSachLichHenKham();
            if ( set1 != null ) {
                khamBenh.setDanhSachLichHenKham( new LinkedHashSet<LichHenKham>( set1 ) );
            }
        }
    }
}
