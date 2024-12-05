package com.nhom27.nhatkykhambenh.mapper;

import com.nhom27.nhatkykhambenh.dto.ChiTietTiemChungDTO;
import com.nhom27.nhatkykhambenh.model.ChiTietTiemChung;
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
public class ChiTietTiemChungMapperImpl implements ChiTietTiemChungMapper {

    @Override
    public ChiTietTiemChung toChiTietTiemChung(ChiTietTiemChungDTO chiTietTiemChungDTO) {
        if ( chiTietTiemChungDTO == null ) {
            return null;
        }

        ChiTietTiemChung chiTietTiemChung = new ChiTietTiemChung();

        chiTietTiemChung.setMaTiemChung( chiTietTiemChungDTO.getMaTiemChung() );
        chiTietTiemChung.setMaNguoiDung( chiTietTiemChungDTO.getMaNguoiDung() );
        chiTietTiemChung.setNgayTiem( chiTietTiemChungDTO.getNgayTiem() );
        chiTietTiemChung.setNguoiTiem( chiTietTiemChungDTO.getNguoiTiem() );
        chiTietTiemChung.setMuiTiemSo( chiTietTiemChungDTO.getMuiTiemSo() );
        chiTietTiemChung.setTrangThai( chiTietTiemChungDTO.getTrangThai() );
        chiTietTiemChung.setTiemChung( chiTietTiemChungDTO.getTiemChung() );
        chiTietTiemChung.setNguoiDung( chiTietTiemChungDTO.getNguoiDung() );

        return chiTietTiemChung;
    }

    @Override
    public ChiTietTiemChungDTO toChiTietTiemChungDTO(ChiTietTiemChung chiTietTiemChung) {
        if ( chiTietTiemChung == null ) {
            return null;
        }

        ChiTietTiemChungDTO chiTietTiemChungDTO = new ChiTietTiemChungDTO();

        chiTietTiemChungDTO.setMaTiemChung( chiTietTiemChung.getMaTiemChung() );
        chiTietTiemChungDTO.setMaNguoiDung( chiTietTiemChung.getMaNguoiDung() );
        chiTietTiemChungDTO.setNgayTiem( chiTietTiemChung.getNgayTiem() );
        chiTietTiemChungDTO.setNguoiTiem( chiTietTiemChung.getNguoiTiem() );
        chiTietTiemChungDTO.setMuiTiemSo( chiTietTiemChung.getMuiTiemSo() );
        chiTietTiemChungDTO.setTrangThai( chiTietTiemChung.getTrangThai() );
        chiTietTiemChungDTO.setTiemChung( chiTietTiemChung.getTiemChung() );
        chiTietTiemChungDTO.setNguoiDung( chiTietTiemChung.getNguoiDung() );

        return chiTietTiemChungDTO;
    }

    @Override
    public List<ChiTietTiemChungDTO> toChiTietTiemChungDtoList(List<ChiTietTiemChung> chiTietTiemChungList) {
        if ( chiTietTiemChungList == null ) {
            return null;
        }

        List<ChiTietTiemChungDTO> list = new ArrayList<ChiTietTiemChungDTO>( chiTietTiemChungList.size() );
        for ( ChiTietTiemChung chiTietTiemChung : chiTietTiemChungList ) {
            list.add( toChiTietTiemChungDTO( chiTietTiemChung ) );
        }

        return list;
    }
}
