package com.nhom27.nhatkykhambenh.mapper;

import com.nhom27.nhatkykhambenh.dto.TiemChungDTO;
import com.nhom27.nhatkykhambenh.model.TiemChung;
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
public class TiemChungMapperImpl implements TiemChungMapper {

    @Override
    public TiemChung toTiemChung(TiemChungDTO tiemChungDTO) {
        if ( tiemChungDTO == null ) {
            return null;
        }

        TiemChung tiemChung = new TiemChung();

        tiemChung.setMaTiemChung( tiemChungDTO.getMaTiemChung() );
        tiemChung.setTenVacXin( tiemChungDTO.getTenVacXin() );
        tiemChung.setNoiTiemChung( tiemChungDTO.getNoiTiemChung() );
        tiemChung.setSoMuiTiem( tiemChungDTO.getSoMuiTiem() );
        tiemChung.setTrangThai( tiemChungDTO.getTrangThai() );

        return tiemChung;
    }

    @Override
    public TiemChungDTO toTiemChungDTO(TiemChung tiemChung) {
        if ( tiemChung == null ) {
            return null;
        }

        TiemChungDTO tiemChungDTO = new TiemChungDTO();

        tiemChungDTO.setMaTiemChung( tiemChung.getMaTiemChung() );
        tiemChungDTO.setTenVacXin( tiemChung.getTenVacXin() );
        tiemChungDTO.setNoiTiemChung( tiemChung.getNoiTiemChung() );
        tiemChungDTO.setSoMuiTiem( tiemChung.getSoMuiTiem() );
        tiemChungDTO.setTrangThai( tiemChung.getTrangThai() );

        return tiemChungDTO;
    }

    @Override
    public List<TiemChungDTO> toTiemChungDtoList(List<TiemChung> tiemChungList) {
        if ( tiemChungList == null ) {
            return null;
        }

        List<TiemChungDTO> list = new ArrayList<TiemChungDTO>( tiemChungList.size() );
        for ( TiemChung tiemChung : tiemChungList ) {
            list.add( toTiemChungDTO( tiemChung ) );
        }

        return list;
    }

    @Override
    public void updateTiemChungFromDTO(TiemChungDTO tiemChungDTO, TiemChung tiemChung) {
        if ( tiemChungDTO == null ) {
            return;
        }

        if ( tiemChungDTO.getTenVacXin() != null ) {
            tiemChung.setTenVacXin( tiemChungDTO.getTenVacXin() );
        }
        if ( tiemChungDTO.getNoiTiemChung() != null ) {
            tiemChung.setNoiTiemChung( tiemChungDTO.getNoiTiemChung() );
        }
        if ( tiemChungDTO.getSoMuiTiem() != null ) {
            tiemChung.setSoMuiTiem( tiemChungDTO.getSoMuiTiem() );
        }
        if ( tiemChungDTO.getTrangThai() != null ) {
            tiemChung.setTrangThai( tiemChungDTO.getTrangThai() );
        }
    }
}
