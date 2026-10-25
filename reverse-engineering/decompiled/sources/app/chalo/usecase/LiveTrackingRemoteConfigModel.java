package app.chalo.usecase;

import defpackage.hf0;
import defpackage.hq0;
import defpackage.xs;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/usecase/LiveTrackingRemoteConfigModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class LiveTrackingRemoteConfigModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new hf0(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10209a;
    public final boolean b;
    public final int c;
    public final int d;
    public final List e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/usecase/LiveTrackingRemoteConfigModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/usecase/LiveTrackingRemoteConfigModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<LiveTrackingRemoteConfigModel> serializer() {
            return LiveTrackingRemoteConfigModel$$serializer.f10210a;
        }
    }

    public /* synthetic */ LiveTrackingRemoteConfigModel(int i, String str, boolean z, int i2, int i3, List list) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(LiveTrackingRemoteConfigModel$$serializer.f10210a.getDescriptor(), i, 31);
            throw null;
        }
        this.f10209a = str;
        this.b = z;
        this.c = i2;
        this.d = i3;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveTrackingRemoteConfigModel)) {
            return false;
        }
        LiveTrackingRemoteConfigModel liveTrackingRemoteConfigModel = (LiveTrackingRemoteConfigModel) obj;
        return Intrinsics.d(this.f10209a, liveTrackingRemoteConfigModel.f10209a) && this.b == liveTrackingRemoteConfigModel.b && this.c == liveTrackingRemoteConfigModel.c && this.d == liveTrackingRemoteConfigModel.d && Intrinsics.d(this.e, liveTrackingRemoteConfigModel.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (((((((this.f10209a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31) + this.c) * 31) + this.d) * 31);
    }

    public final String toString() {
        StringBuilder sbM = hq0.m("LiveTrackingRemoteConfigModel(cityName=", this.f10209a, ", isEnabled=", ", minAppVer=", this.b);
        hq0.p(this.c, this.d, ", maxAppVer=", ", blacklistedAppVer=", sbM);
        return xs.l(sbM, this.e, ")");
    }
}
