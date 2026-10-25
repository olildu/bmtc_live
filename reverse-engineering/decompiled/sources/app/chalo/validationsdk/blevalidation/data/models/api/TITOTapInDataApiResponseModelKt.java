package app.chalo.validationsdk.blevalidation.data.models.api;

import app.chalo.validationsdk.blevalidation.data.models.app.TITOTapInDataFromPolling;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"validationsdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TITOTapInDataApiResponseModelKt {
    public static final TITOTapInDataFromPolling a(TITOTapInDataApiResponseModel tITOTapInDataApiResponseModel) {
        Intrinsics.i(tITOTapInDataApiResponseModel, "<this>");
        try {
            String str = tITOTapInDataApiResponseModel.f10493a;
            Intrinsics.f(str);
            String str2 = tITOTapInDataApiResponseModel.b;
            Intrinsics.f(str2);
            String str3 = tITOTapInDataApiResponseModel.c;
            Intrinsics.f(str3);
            Long l = tITOTapInDataApiResponseModel.d;
            Intrinsics.f(l);
            long jLongValue = l.longValue();
            Long l2 = tITOTapInDataApiResponseModel.e;
            Intrinsics.f(l2);
            long jLongValue2 = l2.longValue();
            Long l3 = tITOTapInDataApiResponseModel.f;
            Intrinsics.f(l3);
            long jLongValue3 = l3.longValue();
            Long l4 = tITOTapInDataApiResponseModel.g;
            Intrinsics.f(l4);
            long jLongValue4 = l4.longValue();
            String str4 = tITOTapInDataApiResponseModel.h;
            Intrinsics.f(str4);
            String str5 = tITOTapInDataApiResponseModel.i;
            Intrinsics.f(str5);
            String str6 = tITOTapInDataApiResponseModel.j;
            Intrinsics.f(str6);
            Long l5 = tITOTapInDataApiResponseModel.k;
            Intrinsics.f(l5);
            long jLongValue5 = l5.longValue();
            String str7 = tITOTapInDataApiResponseModel.l;
            if (str7 == null) {
                str7 = "";
            }
            return new TITOTapInDataFromPolling(str, str2, str3, jLongValue, jLongValue2, jLongValue3, jLongValue4, str4, str5, str6, jLongValue5, str7, tITOTapInDataApiResponseModel.m, tITOTapInDataApiResponseModel.n);
        } catch (Exception unused) {
            return null;
        }
    }
}
