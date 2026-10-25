package app.chalo.validationsdk.blevalidation.data.models.app;

import app.chalo.notification.models.TITOTapInNotificationEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"validationsdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BleValidationAckDataKt {
    public static final TITOTapInNotificationEvent a(BleValidationAckData.TITOTapInData tITOTapInData) {
        Intrinsics.i(tITOTapInData, "<this>");
        String str = tITOTapInData.b;
        String str2 = tITOTapInData.c;
        String str3 = tITOTapInData.d;
        long j = tITOTapInData.e;
        long j2 = tITOTapInData.g;
        long j3 = tITOTapInData.f;
        String str4 = tITOTapInData.h;
        String str5 = tITOTapInData.i;
        String str6 = tITOTapInData.j;
        long j4 = tITOTapInData.k;
        String str7 = tITOTapInData.m;
        Long l = tITOTapInData.n;
        return new TITOTapInNotificationEvent("", "", str, str2, str3, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j2), str4, str5, str6, Long.valueOf(j4), tITOTapInData.l, str7, l);
    }
}
