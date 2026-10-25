package app.chalo.validationsdk.blevalidation.data.models.api;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.py;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/api/TITOTapInDataApiResponseModel;", "", "Companion", "$serializer", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TITOTapInDataApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10493a;
    public final String b;
    public final String c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;
    public final String h;
    public final String i;
    public final String j;
    public final Long k;
    public final String l;
    public final String m;
    public final Long n;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/api/TITOTapInDataApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/validationsdk/blevalidation/data/models/api/TITOTapInDataApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TITOTapInDataApiResponseModel> serializer() {
            return TITOTapInDataApiResponseModel$$serializer.f10494a;
        }
    }

    public /* synthetic */ TITOTapInDataApiResponseModel(int i, String str, String str2, String str3, Long l, Long l2, Long l3, Long l4, String str4, String str5, String str6, Long l5, String str7, String str8, Long l6) {
        if (16383 != (i & 16383)) {
            PluginExceptionsKt.b(TITOTapInDataApiResponseModel$$serializer.f10494a.getDescriptor(), i, 16383);
            throw null;
        }
        this.f10493a = str;
        this.b = str2;
        this.c = str3;
        this.d = l;
        this.e = l2;
        this.f = l3;
        this.g = l4;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = l5;
        this.l = str7;
        this.m = str8;
        this.n = l6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TITOTapInDataApiResponseModel)) {
            return false;
        }
        TITOTapInDataApiResponseModel tITOTapInDataApiResponseModel = (TITOTapInDataApiResponseModel) obj;
        return Intrinsics.d(this.f10493a, tITOTapInDataApiResponseModel.f10493a) && Intrinsics.d(this.b, tITOTapInDataApiResponseModel.b) && Intrinsics.d(this.c, tITOTapInDataApiResponseModel.c) && Intrinsics.d(this.d, tITOTapInDataApiResponseModel.d) && Intrinsics.d(this.e, tITOTapInDataApiResponseModel.e) && Intrinsics.d(this.f, tITOTapInDataApiResponseModel.f) && Intrinsics.d(this.g, tITOTapInDataApiResponseModel.g) && Intrinsics.d(this.h, tITOTapInDataApiResponseModel.h) && Intrinsics.d(this.i, tITOTapInDataApiResponseModel.i) && Intrinsics.d(this.j, tITOTapInDataApiResponseModel.j) && Intrinsics.d(this.k, tITOTapInDataApiResponseModel.k) && Intrinsics.d(this.l, tITOTapInDataApiResponseModel.l) && Intrinsics.d(this.m, tITOTapInDataApiResponseModel.m) && Intrinsics.d(this.n, tITOTapInDataApiResponseModel.n);
    }

    public final int hashCode() {
        String str = this.f10493a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.g;
        int iHashCode7 = (iHashCode6 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l5 = this.k;
        int iHashCode11 = (iHashCode10 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str7 = this.l;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.m;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l6 = this.n;
        return iHashCode13 + (l6 != null ? l6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("TITOTapInDataApiResponseModel(bookingId=", this.f10493a, ", productType=", this.b, ", productSubType=");
        cb0.r(this.d, this.c, ", groupNo=", ", firstTimeValidScanTS=", sbE);
        nf1.w(sbE, this.e, ", activationTsInSec=", this.f, ", tapinPunchTsInMillis=");
        py.t(this.g, ", routeId=", this.h, ", stopId=", sbE);
        cb0.t(sbE, this.i, ", tripNo=", this.j, ", waybillNo=");
        py.t(this.k, ", vehicleNumber=", this.l, ", walletId=", sbE);
        sbE.append(this.m);
        sbE.append(", expiryTime=");
        sbE.append(this.n);
        sbE.append(")");
        return sbE.toString();
    }
}
