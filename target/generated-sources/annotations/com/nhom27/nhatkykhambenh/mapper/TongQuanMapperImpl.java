package com.nhom27.nhatkykhambenh.mapper;

import com.nhom27.nhatkykhambenh.dto.TongQuanDTO;
import com.nhom27.nhatkykhambenh.model.TongQuan;
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
public class TongQuanMapperImpl implements TongQuanMapper {

    @Override
    public TongQuan toTongQuan(TongQuanDTO tongQuanDTO) {
        if ( tongQuanDTO == null ) {
            return null;
        }

        TongQuan tongQuan = new TongQuan();

        tongQuan.setMaTongQuan( tongQuanDTO.getMaTongQuan() );
        tongQuan.setDuongHuyet( tongQuanDTO.getDuongHuyet() );
        tongQuan.setNhipTim( tongQuanDTO.getNhipTim() );
        tongQuan.setHuyetAp( tongQuanDTO.getHuyetAp() );
        tongQuan.setNhietDo( tongQuanDTO.getNhietDo() );
        tongQuan.setChieuCao( tongQuanDTO.getChieuCao() );
        tongQuan.setCanNang( tongQuanDTO.getCanNang() );
        tongQuan.setChiSoBMI( tongQuanDTO.getChiSoBMI() );
        tongQuan.setNhomMau( tongQuanDTO.getNhomMau() );
        tongQuan.setTrangThai( tongQuanDTO.getTrangThai() );

        return tongQuan;
    }

    @Override
    public TongQuanDTO toTongQuanDTO(TongQuan tongQuan) {
        if ( tongQuan == null ) {
            return null;
        }

        TongQuanDTO tongQuanDTO = new TongQuanDTO();

        tongQuanDTO.setMaTongQuan( tongQuan.getMaTongQuan() );
        tongQuanDTO.setDuongHuyet( tongQuan.getDuongHuyet() );
        tongQuanDTO.setNhipTim( tongQuan.getNhipTim() );
        tongQuanDTO.setHuyetAp( tongQuan.getHuyetAp() );
        tongQuanDTO.setNhietDo( tongQuan.getNhietDo() );
        tongQuanDTO.setChieuCao( tongQuan.getChieuCao() );
        tongQuanDTO.setCanNang( tongQuan.getCanNang() );
        tongQuanDTO.setChiSoBMI( tongQuan.getChiSoBMI() );
        tongQuanDTO.setNhomMau( tongQuan.getNhomMau() );
        tongQuanDTO.setTrangThai( tongQuan.getTrangThai() );

        return tongQuanDTO;
    }

    @Override
    public List<TongQuanDTO> toTongQuanDtoList(List<TongQuan> tongQuanList) {
        if ( tongQuanList == null ) {
            return null;
        }

        List<TongQuanDTO> list = new ArrayList<TongQuanDTO>( tongQuanList.size() );
        for ( TongQuan tongQuan : tongQuanList ) {
            list.add( toTongQuanDTO( tongQuan ) );
        }

        return list;
    }
}
