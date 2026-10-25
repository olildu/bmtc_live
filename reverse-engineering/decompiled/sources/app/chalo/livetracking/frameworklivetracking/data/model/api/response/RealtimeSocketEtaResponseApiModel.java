package app.chalo.livetracking.frameworklivetracking.data.model.api.response;

import defpackage.dd;
import defpackage.nf1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/api/response/RealtimeSocketEtaResponseApiModel;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RealtimeSocketEtaResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4286a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final boolean h;
    public final Integer i;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/api/response/RealtimeSocketEtaResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/api/response/RealtimeSocketEtaResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RealtimeSocketEtaResponseApiModel> serializer() {
            return RealtimeSocketEtaResponseApiModel$$serializer.f4287a;
        }
    }

    public /* synthetic */ RealtimeSocketEtaResponseApiModel(int i, int i2, String str, long j, long j2, long j3, String str2, String str3, boolean z, Integer num) {
        if (19 != (i & 19)) {
            PluginExceptionsKt.b(RealtimeSocketEtaResponseApiModel$$serializer.f4287a.getDescriptor(), i, 19);
            throw null;
        }
        this.f4286a = i2;
        this.b = str;
        if ((i & 4) == 0) {
            this.c = -1L;
        } else {
            this.c = j;
        }
        if ((i & 8) == 0) {
            this.d = -1L;
        } else {
            this.d = j2;
        }
        this.e = j3;
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str3;
        }
        this.h = (i & 128) == 0 ? false : z;
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealtimeSocketEtaResponseApiModel)) {
            return false;
        }
        RealtimeSocketEtaResponseApiModel realtimeSocketEtaResponseApiModel = (RealtimeSocketEtaResponseApiModel) obj;
        return this.f4286a == realtimeSocketEtaResponseApiModel.f4286a && Intrinsics.d(this.b, realtimeSocketEtaResponseApiModel.b) && this.c == realtimeSocketEtaResponseApiModel.c && this.d == realtimeSocketEtaResponseApiModel.d && this.e == realtimeSocketEtaResponseApiModel.e && Intrinsics.d(this.f, realtimeSocketEtaResponseApiModel.f) && Intrinsics.d(this.g, realtimeSocketEtaResponseApiModel.g) && this.h == realtimeSocketEtaResponseApiModel.h && Intrinsics.d(this.i, realtimeSocketEtaResponseApiModel.i);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f4286a * 31, 31, this.b);
        long j = this.c;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        int iE2 = (nf1.e(nf1.e((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31, this.f), 31, this.g) + (this.h ? 1231 : 1237)) * 31;
        Integer num = this.i;
        return iE2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbP = nf1.p(this.f4286a, "RealtimeSocketEtaResponseApiModel(eta=", ", vehicleNumber=", this.b, ", minEta=");
        sbP.append(this.c);
        xs.r(this.d, ", maxEta=", ", timeStamp=", sbP);
        dd.k(this.e, ", lastStopId=", this.f, sbP);
        sbP.append(", firstStopId=");
        sbP.append(this.g);
        sbP.append(", isHalted=");
        sbP.append(this.h);
        sbP.append(", dist=");
        sbP.append(this.i);
        sbP.append(")");
        return sbP.toString();
    }
}
