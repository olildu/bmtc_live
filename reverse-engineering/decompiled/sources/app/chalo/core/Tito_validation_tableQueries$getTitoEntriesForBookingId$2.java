package app.chalo.core;

import app.chalo.titoridedetail.data.app.TITOProductSubType;
import app.chalo.titoridedetail.data.app.TITOProductType;
import app.chalo.titoridedetail.data.app.TitoValidationStatus;
import kotlin.Metadata;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class Tito_validation_tableQueries$getTitoEntriesForBookingId$2 implements FunctionN<Tito_validation_table> {
    @Override // kotlin.jvm.functions.FunctionN
    public final Object invoke(Object[] objArr) {
        if (objArr.length != 23) {
            throw new IllegalArgumentException("Expected 23 arguments");
        }
        String tapId = (String) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        long jLongValue2 = ((Number) objArr[2]).longValue();
        long jLongValue3 = ((Number) objArr[3]).longValue();
        String conductorValidationStaticPayload = (String) objArr[4];
        String tapInRouteId = (String) objArr[5];
        String tapInStopId = (String) objArr[6];
        String tapInTripNo = (String) objArr[7];
        long jLongValue4 = ((Number) objArr[8]).longValue();
        String vehicleNo = (String) objArr[9];
        String str = (String) objArr[10];
        TitoValidationStatus titoStatus = (TitoValidationStatus) objArr[11];
        String userId = (String) objArr[12];
        String bookingId_ = (String) objArr[13];
        TITOProductType productType = (TITOProductType) objArr[14];
        TITOProductSubType productSubType = (TITOProductSubType) objArr[15];
        long jLongValue5 = ((Number) objArr[16]).longValue();
        Long l = (Long) objArr[17];
        Long l2 = (Long) objArr[18];
        String str2 = (String) objArr[19];
        String str3 = (String) objArr[20];
        String str4 = (String) objArr[21];
        Long l3 = (Long) objArr[22];
        Intrinsics.i(tapId, "tapId");
        Intrinsics.i(conductorValidationStaticPayload, "conductorValidationStaticPayload");
        Intrinsics.i(tapInRouteId, "tapInRouteId");
        Intrinsics.i(tapInStopId, "tapInStopId");
        Intrinsics.i(tapInTripNo, "tapInTripNo");
        Intrinsics.i(vehicleNo, "vehicleNo");
        Intrinsics.i(titoStatus, "titoStatus");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(bookingId_, "bookingId_");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        return new Tito_validation_table(tapId, jLongValue, jLongValue2, jLongValue3, conductorValidationStaticPayload, tapInRouteId, tapInStopId, tapInTripNo, jLongValue4, vehicleNo, str, titoStatus, userId, bookingId_, productType, productSubType, jLongValue5, l, l2, str2, str3, str4, l3);
    }
}
