package app.chalo.livetracking.frameworklivetracking.data.model.api.response;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/api/response/RealtimeSocketRouteStreamResponseApiModel;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RealtimeSocketRouteStreamResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4288a;
    public final String b;
    public final double c;
    public final double d;
    public final boolean e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final Long k;
    public final Integer l;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/api/response/RealtimeSocketRouteStreamResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/api/response/RealtimeSocketRouteStreamResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RealtimeSocketRouteStreamResponseApiModel> serializer() {
            return RealtimeSocketRouteStreamResponseApiModel$$serializer.f4289a;
        }
    }

    public /* synthetic */ RealtimeSocketRouteStreamResponseApiModel(int i, int i2, String str, double d, double d2, boolean z, long j, String str2, String str3, String str4, String str5, Long l, Integer num) {
        if (99 != (i & 99)) {
            PluginExceptionsKt.b(RealtimeSocketRouteStreamResponseApiModel$$serializer.f4289a.getDescriptor(), i, 99);
            throw null;
        }
        this.f4288a = i2;
        this.b = str;
        if ((i & 4) == 0) {
            this.c = 0.0d;
        } else {
            this.c = d;
        }
        if ((i & 8) == 0) {
            this.d = 0.0d;
        } else {
            this.d = d2;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
        this.f = j;
        this.g = str2;
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str3;
        }
        if ((i & 256) == 0) {
            this.i = "";
        } else {
            this.i = str4;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str5;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = l;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealtimeSocketRouteStreamResponseApiModel)) {
            return false;
        }
        RealtimeSocketRouteStreamResponseApiModel realtimeSocketRouteStreamResponseApiModel = (RealtimeSocketRouteStreamResponseApiModel) obj;
        return this.f4288a == realtimeSocketRouteStreamResponseApiModel.f4288a && Intrinsics.d(this.b, realtimeSocketRouteStreamResponseApiModel.b) && Double.compare(this.c, realtimeSocketRouteStreamResponseApiModel.c) == 0 && Double.compare(this.d, realtimeSocketRouteStreamResponseApiModel.d) == 0 && this.e == realtimeSocketRouteStreamResponseApiModel.e && this.f == realtimeSocketRouteStreamResponseApiModel.f && Intrinsics.d(this.g, realtimeSocketRouteStreamResponseApiModel.g) && Intrinsics.d(this.h, realtimeSocketRouteStreamResponseApiModel.h) && Intrinsics.d(this.i, realtimeSocketRouteStreamResponseApiModel.i) && Intrinsics.d(this.j, realtimeSocketRouteStreamResponseApiModel.j) && Intrinsics.d(this.k, realtimeSocketRouteStreamResponseApiModel.k) && Intrinsics.d(this.l, realtimeSocketRouteStreamResponseApiModel.l);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f4288a * 31, 31, this.b);
        long jDoubleToLongBits = Double.doubleToLongBits(this.c);
        int i = (iE + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.d);
        int i2 = (((i + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + (this.e ? 1231 : 1237)) * 31;
        long j = this.f;
        int iE2 = nf1.e(nf1.e(nf1.e((i2 + ((int) (j ^ (j >>> 32)))) * 31, 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.k;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.l;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = nf1.p(this.f4288a, "RealtimeSocketRouteStreamResponseApiModel(eta=", ", vehicleNumber=", this.b, ", longitude=");
        sbP.append(this.c);
        pk0.z(sbP, ", latitude=", this.d, ", isHalted=");
        sbP.append(this.e);
        sbP.append(", timeStamp=");
        sbP.append(this.f);
        cb0.t(sbP, ", nextStopId=", this.g, ", lastStopId=", this.h);
        cb0.t(sbP, ", firstStopId=", this.i, ", passedStopId=", this.j);
        sbP.append(", passedStopTime=");
        sbP.append(this.k);
        sbP.append(", bearing=");
        sbP.append(this.l);
        sbP.append(")");
        return sbP.toString();
    }
}
