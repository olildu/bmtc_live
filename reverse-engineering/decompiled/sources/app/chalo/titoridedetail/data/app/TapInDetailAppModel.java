package app.chalo.titoridedetail.data.app;

import defpackage.cb0;
import defpackage.d;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.t10;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/titoridedetail/data/app/TapInDetailAppModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TapInDetailAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9673a;
    public final long b;
    public final long c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;
    public final String j;
    public final String k;
    public final String l;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/titoridedetail/data/app/TapInDetailAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/titoridedetail/data/app/TapInDetailAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TapInDetailAppModel> serializer() {
            return TapInDetailAppModel$$serializer.f9674a;
        }
    }

    public /* synthetic */ TapInDetailAppModel(int i, String str, long j, long j2, String str2, long j3, String str3, String str4, String str5, long j4, String str6, String str7, String str8) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.b(TapInDetailAppModel$$serializer.f9674a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f9673a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
        this.e = j3;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = j4;
        this.j = str6;
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str7;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapInDetailAppModel)) {
            return false;
        }
        TapInDetailAppModel tapInDetailAppModel = (TapInDetailAppModel) obj;
        return Intrinsics.d(this.f9673a, tapInDetailAppModel.f9673a) && this.b == tapInDetailAppModel.b && this.c == tapInDetailAppModel.c && Intrinsics.d(this.d, tapInDetailAppModel.d) && this.e == tapInDetailAppModel.e && Intrinsics.d(this.f, tapInDetailAppModel.f) && Intrinsics.d(this.g, tapInDetailAppModel.g) && Intrinsics.d(this.h, tapInDetailAppModel.h) && this.i == tapInDetailAppModel.i && Intrinsics.d(this.j, tapInDetailAppModel.j) && Intrinsics.d(this.k, tapInDetailAppModel.k) && Intrinsics.d(this.l, tapInDetailAppModel.l);
    }

    public final int hashCode() {
        int iHashCode = this.f9673a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        int iE = nf1.e((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.d);
        long j3 = this.e;
        int iE2 = nf1.e(nf1.e(nf1.e((iE + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31, this.f), 31, this.g), 31, this.h);
        long j4 = this.i;
        int iE3 = nf1.e((iE2 + ((int) (j4 ^ (j4 >>> 32)))) * 31, 31, this.j);
        String str = this.k;
        int iHashCode2 = (iE3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.l;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "TapInDetailAppModel(tapId=", this.f9673a, ", tapInGroupNo=");
        xs.r(this.c, ", activationTSInSec=", ", conductorValidationStaticPayload=", sbM);
        n21.p(this.e, this.d, ", tapInTimestampInMillis=", sbM);
        cb0.t(sbM, ", tapInRouteId=", this.f, ", tapInStopId=", this.g);
        d.t(sbM, ", tapInTripNo=", this.h, ", tapInWaybillNo=");
        dd.k(this.i, ", vehicleNo=", this.j, sbM);
        cb0.t(sbM, ", dropOffStopId=", this.k, ", tapInStopName=", this.l);
        sbM.append(")");
        return sbM.toString();
    }

    public TapInDetailAppModel(String tapId, long j, long j2, String conductorValidationStaticPayload, long j3, String tapInRouteId, String tapInStopId, String tapInTripNo, long j4, String vehicleNo, String str, String str2) {
        Intrinsics.i(tapId, "tapId");
        Intrinsics.i(conductorValidationStaticPayload, "conductorValidationStaticPayload");
        Intrinsics.i(tapInRouteId, "tapInRouteId");
        Intrinsics.i(tapInStopId, "tapInStopId");
        Intrinsics.i(tapInTripNo, "tapInTripNo");
        Intrinsics.i(vehicleNo, "vehicleNo");
        this.f9673a = tapId;
        this.b = j;
        this.c = j2;
        this.d = conductorValidationStaticPayload;
        this.e = j3;
        this.f = tapInRouteId;
        this.g = tapInStopId;
        this.h = tapInTripNo;
        this.i = j4;
        this.j = vehicleNo;
        this.k = str;
        this.l = str2;
    }
}
