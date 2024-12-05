package com.nhom27.nhatkykhambenh.mapper;

import com.nhom27.nhatkykhambenh.dto.NguoiDungDTO;
import com.nhom27.nhatkykhambenh.dto.NguoiDungTiemChungDTO;
import com.nhom27.nhatkykhambenh.model.NguoiDung;
import com.nhom27.nhatkykhambenh.model.NguoiDungTiemChung;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-05T10:06:32+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Oracle Corporation)"
)
@Component
public class NguoiDungTiemChungMapperImpl implements NguoiDungTiemChungMapper {

    @Override
    public NguoiDungTiemChung toNguoiDungTiemChung(NguoiDungTiemChungDTO nguoiDungTiemChungDTO) {
        if ( nguoiDungTiemChungDTO == null ) {
            return null;
        }

        NguoiDungTiemChung.NguoiDungTiemChungBuilder nguoiDungTiemChung = NguoiDungTiemChung.builder();

        nguoiDungTiemChung.maNguoiDungTiemChung( nguoiDungTiemChungDTO.getMaNguoiDungTiemChung() );
        nguoiDungTiemChung.nguoiDung( nguoiDungDTOToNguoiDung( nguoiDungTiemChungDTO.getNguoiDung() ) );
        nguoiDungTiemChung.tenVaccin( nguoiDungTiemChungDTO.getTenVaccin() );

        return nguoiDungTiemChung.build();
    }

    @Override
    public NguoiDungTiemChungDTO toNguoiDungTiemChungDTO(NguoiDungTiemChung nguoiDungTiemChung) {
        if ( nguoiDungTiemChung == null ) {
            return null;
        }

        NguoiDungTiemChungDTO.NguoiDungTiemChungDTOBuilder nguoiDungTiemChungDTO = NguoiDungTiemChungDTO.builder();

        nguoiDungTiemChungDTO.maNguoiDungTiemChung( nguoiDungTiemChung.getMaNguoiDungTiemChung() );
        nguoiDungTiemChungDTO.tenVaccin( nguoiDungTiemChung.getTenVaccin() );
        nguoiDungTiemChungDTO.nguoiDung( nguoiDungToNguoiDungDTO( nguoiDungTiemChung.getNguoiDung() ) );

        return nguoiDungTiemChungDTO.build();
    }

    @Override
    public Set<NguoiDungTiemChung> toNguoiDungTiemChungSet(Set<NguoiDungTiemChungDTO> nguoiDungTiemChungDTOSet) {
        if ( nguoiDungTiemChungDTOSet == null ) {
            return null;
        }

        Set<NguoiDungTiemChung> set = new LinkedHashSet<NguoiDungTiemChung>( Math.max( (int) ( nguoiDungTiemChungDTOSet.size() / .75f ) + 1, 16 ) );
        for ( NguoiDungTiemChungDTO nguoiDungTiemChungDTO : nguoiDungTiemChungDTOSet ) {
            set.add( toNguoiDungTiemChung( nguoiDungTiemChungDTO ) );
        }

        return set;
    }

    @Override
    public Set<NguoiDungTiemChungDTO> toNguoiDungTiemChungDTOSet(Set<NguoiDungTiemChung> nguoiDungTiemChungSet) {
        if ( nguoiDungTiemChungSet == null ) {
            return null;
        }

        Set<NguoiDungTiemChungDTO> set = new LinkedHashSet<NguoiDungTiemChungDTO>( Math.max( (int) ( nguoiDungTiemChungSet.size() / .75f ) + 1, 16 ) );
        for ( NguoiDungTiemChung nguoiDungTiemChung : nguoiDungTiemChungSet ) {
            set.add( toNguoiDungTiemChungDTO( nguoiDungTiemChung ) );
        }

        return set;
    }

    protected NguoiDung nguoiDungDTOToNguoiDung(NguoiDungDTO nguoiDungDTO) {
        if ( nguoiDungDTO == null ) {
            return null;
        }

        NguoiDung.NguoiDungBuilder nguoiDung = NguoiDung.builder();

        nguoiDung.maNguoiDung( nguoiDungDTO.getMaNguoiDung() );
        nguoiDung.hinhAnh( nguoiDungDTO.getHinhAnh() );
        nguoiDung.soDienThoai( nguoiDungDTO.getSoDienThoai() );
        nguoiDung.cccd( nguoiDungDTO.getCccd() );
        nguoiDung.ngayThangNamSinh( nguoiDungDTO.getNgayThangNamSinh() );
        nguoiDung.gioiTinh( nguoiDungDTO.getGioiTinh() );
        nguoiDung.diaChi( nguoiDungDTO.getDiaChi() );
        nguoiDung.tenNguoiDung( nguoiDungDTO.getTenNguoiDung() );
        nguoiDung.email( nguoiDungDTO.getEmail() );
        nguoiDung.moiQuanHe( nguoiDungDTO.getMoiQuanHe() );
        nguoiDung.trangThai( nguoiDungDTO.getTrangThai() );

        return nguoiDung.build();
    }

    protected NguoiDungDTO nguoiDungToNguoiDungDTO(NguoiDung nguoiDung) {
        if ( nguoiDung == null ) {
            return null;
        }

        NguoiDungDTO nguoiDungDTO = new NguoiDungDTO();

        nguoiDungDTO.setMaNguoiDung( nguoiDung.getMaNguoiDung() );
        nguoiDungDTO.setTenNguoiDung( nguoiDung.getTenNguoiDung() );
        nguoiDungDTO.setHinhAnh( nguoiDung.getHinhAnh() );
        nguoiDungDTO.setSoDienThoai( nguoiDung.getSoDienThoai() );
        nguoiDungDTO.setCccd( nguoiDung.getCccd() );
        nguoiDungDTO.setNgayThangNamSinh( nguoiDung.getNgayThangNamSinh() );
        nguoiDungDTO.setGioiTinh( nguoiDung.getGioiTinh() );
        nguoiDungDTO.setDiaChi( nguoiDung.getDiaChi() );
        nguoiDungDTO.setEmail( nguoiDung.getEmail() );
        nguoiDungDTO.setMoiQuanHe( nguoiDung.getMoiQuanHe() );
        nguoiDungDTO.setTrangThai( nguoiDung.getTrangThai() );

        return nguoiDungDTO;
    }
}
