package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.TITOValidationEntityMapper;
import app.chalo.tito.data.model.entity.TITOValidationEntity;
import app.chalo.titoridedetail.data.app.TITOProductSubType;
import app.chalo.titoridedetail.data.app.TITOProductType;
import app.chalo.titoridedetail.data.app.TitoValidationStatus;
import kotlin.Metadata;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class TITOValidationDaoImpl$getTitoEntryForTapId$2 extends FunctionReferenceImpl implements FunctionN<TITOValidationEntity> {
    @Override // kotlin.jvm.functions.FunctionN
    public final Object invoke(Object[] objArr) {
        if (objArr.length != 23) {
            throw new IllegalArgumentException("Expected 23 arguments");
        }
        String p0 = (String) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        long jLongValue2 = ((Number) objArr[2]).longValue();
        long jLongValue3 = ((Number) objArr[3]).longValue();
        String p4 = (String) objArr[4];
        String p5 = (String) objArr[5];
        String p6 = (String) objArr[6];
        String p7 = (String) objArr[7];
        long jLongValue4 = ((Number) objArr[8]).longValue();
        String p9 = (String) objArr[9];
        String str = (String) objArr[10];
        TitoValidationStatus p11 = (TitoValidationStatus) objArr[11];
        String p12 = (String) objArr[12];
        String p13 = (String) objArr[13];
        TITOProductType p14 = (TITOProductType) objArr[14];
        TITOProductSubType p15 = (TITOProductSubType) objArr[15];
        long jLongValue5 = ((Number) objArr[16]).longValue();
        Long l = (Long) objArr[17];
        Long l2 = (Long) objArr[18];
        String str2 = (String) objArr[19];
        String str3 = (String) objArr[20];
        String str4 = (String) objArr[21];
        Long l3 = (Long) objArr[22];
        Intrinsics.i(p0, "p0");
        Intrinsics.i(p4, "p4");
        Intrinsics.i(p5, "p5");
        Intrinsics.i(p6, "p6");
        Intrinsics.i(p7, "p7");
        Intrinsics.i(p9, "p9");
        Intrinsics.i(p11, "p11");
        Intrinsics.i(p12, "p12");
        Intrinsics.i(p13, "p13");
        Intrinsics.i(p14, "p14");
        Intrinsics.i(p15, "p15");
        ((TITOValidationEntityMapper) this.receiver).getClass();
        return new TITOValidationEntity(p0, jLongValue, jLongValue2, jLongValue3, p4, p5, p6, p7, jLongValue4, p9, str, p11, p12, p13, p14, p15, jLongValue5, l, l2, str2, str3, str4, l3);
    }
}
