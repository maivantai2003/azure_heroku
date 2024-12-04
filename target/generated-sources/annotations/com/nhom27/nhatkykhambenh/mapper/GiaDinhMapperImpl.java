package com.nhom27.nhatkykhambenh.mapper;

import com.nhom27.nhatkykhambenh.dto.GiaDinhDTO;
import com.nhom27.nhatkykhambenh.dto.NguoiDungDTO;
import com.nhom27.nhatkykhambenh.dto.TaiKhoanDTO;
import com.nhom27.nhatkykhambenh.model.GiaDinh;
import com.nhom27.nhatkykhambenh.model.NguoiDung;
import com.nhom27.nhatkykhambenh.model.TaiKhoan;
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
public class GiaDinhMapperImpl implements GiaDinhMapper {

    @Override
    public GiaDinh toGiaDinh(GiaDinhDTO giaDinhDTO) {
        if ( giaDinhDTO == null ) {
            return null;
        }

        GiaDinh giaDinh = new GiaDinh();

        giaDinh.setMaGiaDinh( giaDinhDTO.getMaGiaDinh() );
        giaDinh.setSoLuong( giaDinhDTO.getSoLuong() );
        giaDinh.setTrangThai( giaDinhDTO.getTrangThai() );
        giaDinh.setTaiKhoan( taiKhoanDTOToTaiKhoan( giaDinhDTO.getTaiKhoan() ) );

        return giaDinh;
    }

    @Override
    public GiaDinhDTO toGiaDinhDTO(GiaDinh giaDinh) {
        if ( giaDinh == null ) {
            return null;
        }

        GiaDinhDTO giaDinhDTO = new GiaDinhDTO();

        giaDinhDTO.setMaGiaDinh( giaDinh.getMaGiaDinh() );
        giaDinhDTO.setSoLuong( giaDinh.getSoLuong() );
        giaDinhDTO.setTrangThai( giaDinh.getTrangThai() );
        giaDinhDTO.setTaiKhoan( taiKhoanToTaiKhoanDTO( giaDinh.getTaiKhoan() ) );

        return giaDinhDTO;
    }

    @Override
    public List<GiaDinhDTO> toGiaDinhDtoList(List<GiaDinh> giaDinhList) {
        if ( giaDinhList == null ) {
            return null;
        }

        List<GiaDinhDTO> list = new ArrayList<GiaDinhDTO>( giaDinhList.size() );
        for ( GiaDinh giaDinh : giaDinhList ) {
            list.add( toGiaDinhDTO( giaDinh ) );
        }

        return list;
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

    protected TaiKhoan taiKhoanDTOToTaiKhoan(TaiKhoanDTO taiKhoanDTO) {
        if ( taiKhoanDTO == null ) {
            return null;
        }

        TaiKhoan taiKhoan = new TaiKhoan();

        taiKhoan.setMaNguoiDung( taiKhoanDTO.getMaNguoiDung() );
        taiKhoan.setMatKhau( taiKhoanDTO.getMatKhau() );
        taiKhoan.setSoDienThoai( taiKhoanDTO.getSoDienThoai() );
        taiKhoan.setTrangThai( taiKhoanDTO.getTrangThai() );
        taiKhoan.setNguoiDung( nguoiDungDTOToNguoiDung( taiKhoanDTO.getNguoiDung() ) );

        return taiKhoan;
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

    protected TaiKhoanDTO taiKhoanToTaiKhoanDTO(TaiKhoan taiKhoan) {
        if ( taiKhoan == null ) {
            return null;
        }

        TaiKhoanDTO taiKhoanDTO = new TaiKhoanDTO();

        taiKhoanDTO.setMaNguoiDung( taiKhoan.getMaNguoiDung() );
        taiKhoanDTO.setMatKhau( taiKhoan.getMatKhau() );
        taiKhoanDTO.setSoDienThoai( taiKhoan.getSoDienThoai() );
        taiKhoanDTO.setTrangThai( taiKhoan.getTrangThai() );
        taiKhoanDTO.setNguoiDung( nguoiDungToNguoiDungDTO( taiKhoan.getNguoiDung() ) );

        return taiKhoanDTO;
    }
}
