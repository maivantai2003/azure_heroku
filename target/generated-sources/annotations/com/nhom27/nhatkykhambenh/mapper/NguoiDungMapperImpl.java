package com.nhom27.nhatkykhambenh.mapper;

import com.nhom27.nhatkykhambenh.dto.NguoiDungDTO;
import com.nhom27.nhatkykhambenh.model.NguoiDung;
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
public class NguoiDungMapperImpl implements NguoiDungMapper {

    @Override
    public NguoiDung toNguoiDung(NguoiDungDTO nguoiDungDTO) {
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

    @Override
    public NguoiDungDTO toNguoiDungDTO(NguoiDung nguoiDung) {
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

    @Override
    public List<NguoiDungDTO> toNguoiDungDtoList(List<NguoiDung> nguoiDungList) {
        if ( nguoiDungList == null ) {
            return null;
        }

        List<NguoiDungDTO> list = new ArrayList<NguoiDungDTO>( nguoiDungList.size() );
        for ( NguoiDung nguoiDung : nguoiDungList ) {
            list.add( toNguoiDungDTO( nguoiDung ) );
        }

        return list;
    }
}
