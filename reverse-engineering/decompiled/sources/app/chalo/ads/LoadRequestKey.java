package app.chalo.ads;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/LoadRequestKey;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class LoadRequestKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f794a;
    public final Map b;

    public LoadRequestKey(String adUnitId, Map targeting) {
        Intrinsics.i(adUnitId, "adUnitId");
        Intrinsics.i(targeting, "targeting");
        this.f794a = adUnitId;
        this.b = targeting;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadRequestKey)) {
            return false;
        }
        LoadRequestKey loadRequestKey = (LoadRequestKey) obj;
        return Intrinsics.d(this.f794a, loadRequestKey.f794a) && Intrinsics.d(this.b, loadRequestKey.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f794a.hashCode() * 31);
    }

    public final String toString() {
        return "LoadRequestKey(adUnitId=" + this.f794a + ", targeting=" + this.b + ")";
    }
}
