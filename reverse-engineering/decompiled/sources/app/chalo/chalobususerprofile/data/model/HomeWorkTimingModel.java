package app.chalo.chalobususerprofile.data.model;

import defpackage.e80;
import defpackage.xs;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/chalobususerprofile/data/model/HomeWorkTimingModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class HomeWorkTimingModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1194a;
    public final TimingVariability b;
    public final long c;
    public final TimingVariability d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/chalobususerprofile/data/model/HomeWorkTimingModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/chalobususerprofile/data/model/HomeWorkTimingModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<HomeWorkTimingModel> serializer() {
            return HomeWorkTimingModel$$serializer.f1195a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new Lazy[]{null, LazyKt.a(lazyThreadSafetyMode, new e80(5)), null, LazyKt.a(lazyThreadSafetyMode, new e80(6))};
    }

    public /* synthetic */ HomeWorkTimingModel(int i, long j, TimingVariability timingVariability, long j2, TimingVariability timingVariability2) {
        if (5 != (i & 5)) {
            PluginExceptionsKt.b(HomeWorkTimingModel$$serializer.f1195a.getDescriptor(), i, 5);
            throw null;
        }
        this.f1194a = j;
        if ((i & 2) == 0) {
            this.b = TimingVariability.EXACT;
        } else {
            this.b = timingVariability;
        }
        this.c = j2;
        if ((i & 8) == 0) {
            this.d = TimingVariability.EXACT;
        } else {
            this.d = timingVariability2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeWorkTimingModel)) {
            return false;
        }
        HomeWorkTimingModel homeWorkTimingModel = (HomeWorkTimingModel) obj;
        return this.f1194a == homeWorkTimingModel.f1194a && this.b == homeWorkTimingModel.b && this.c == homeWorkTimingModel.c && this.d == homeWorkTimingModel.d;
    }

    public final int hashCode() {
        long j = this.f1194a;
        int iHashCode = (this.b.hashCode() + (((int) (j ^ (j >>> 32))) * 31)) * 31;
        long j2 = this.c;
        return this.d.hashCode() + ((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeWorkTimingModel(startTime=");
        sb.append(this.f1194a);
        sb.append(", startTimeVariability=");
        sb.append(this.b);
        xs.r(this.c, ", endTime=", ", endTimeVariability=", sb);
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }

    public HomeWorkTimingModel(long j, TimingVariability startTimeVariability, long j2, TimingVariability endTimeVariability) {
        Intrinsics.i(startTimeVariability, "startTimeVariability");
        Intrinsics.i(endTimeVariability, "endTimeVariability");
        this.f1194a = j;
        this.b = startTimeVariability;
        this.c = j2;
        this.d = endTimeVariability;
    }
}
