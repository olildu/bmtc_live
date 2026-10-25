package app.chalo.tito.data;

import app.chalo.models.validation.ValidationProduct;
import app.chalo.tito.data.model.entity.TITOValidationEntity;
import app.chalo.titoridedetail.data.app.TITOProductDetailAppModel;
import app.chalo.titoridedetail.data.app.TITOProductSubType;
import app.chalo.titoridedetail.data.app.TITOProductSubTypeKt;
import app.chalo.titoridedetail.data.app.TITOProductType;
import app.chalo.titoridedetail.data.app.TITOProductTypeKt;
import app.chalo.titoridedetail.data.app.TITOValidationAppModel;
import app.chalo.titoridedetail.data.app.TapInDetailAppModel;
import app.chalo.titoridedetail.data.app.TapOutDetailAppModel;
import app.chalo.titoridedetail.data.app.TitoValidationStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TITOValidationDataRepositoryImplKt {
    public static final TITOValidationAppModel a(TITOValidationEntity tITOValidationEntity) {
        int i = TITOValidationAppModel.f;
        String tapId = tITOValidationEntity.f9650a;
        long j = tITOValidationEntity.b;
        String conductorValidationStaticPayload = tITOValidationEntity.e;
        String tapInRouteId = tITOValidationEntity.f;
        String tapInStopId = tITOValidationEntity.g;
        String tapInTripNo = tITOValidationEntity.h;
        long j2 = tITOValidationEntity.i;
        TitoValidationStatus titoStatus = tITOValidationEntity.l;
        String bookingId = tITOValidationEntity.n;
        TITOProductType tITOProductType = tITOValidationEntity.o;
        TITOProductSubType tITOProductSubType = tITOValidationEntity.p;
        Long l = tITOValidationEntity.r;
        String str = tITOValidationEntity.t;
        String str2 = tITOValidationEntity.u;
        String str3 = tITOValidationEntity.v;
        Long l2 = tITOValidationEntity.w;
        String str4 = tITOValidationEntity.k;
        String vehicleNo = tITOValidationEntity.j;
        long j3 = tITOValidationEntity.q;
        long j4 = tITOValidationEntity.c;
        long j5 = tITOValidationEntity.d;
        String str5 = tITOValidationEntity.m;
        Intrinsics.i(tapId, "tapId");
        Intrinsics.i(conductorValidationStaticPayload, "conductorValidationStaticPayload");
        Intrinsics.i(vehicleNo, "vehicleNo");
        Intrinsics.i(tapInRouteId, "tapInRouteId");
        Intrinsics.i(tapInStopId, "tapInStopId");
        Intrinsics.i(tapInTripNo, "tapInTripNo");
        Intrinsics.i(titoStatus, "titoStatus");
        Intrinsics.i(bookingId, "bookingId");
        TapInDetailAppModel tapInDetailAppModel = new TapInDetailAppModel(tapId, j, j4, conductorValidationStaticPayload, j5, tapInRouteId, tapInStopId, tapInTripNo, j2, vehicleNo, str4, null);
        ValidationProduct.Companion companion = ValidationProduct.INSTANCE;
        String strA = TITOProductTypeKt.a(tITOProductType);
        String strA2 = TITOProductSubTypeKt.a(tITOProductSubType);
        companion.getClass();
        ValidationProduct validationProductA = ValidationProduct.Companion.a(strA, strA2, bookingId, null, null);
        if (validationProductA == null) {
            return null;
        }
        return new TITOValidationAppModel(tapInDetailAppModel, new TapOutDetailAppModel(l, null, str, str2, str3, l2), new TITOProductDetailAppModel(bookingId, validationProductA, j3), titoStatus, str5);
    }
}
