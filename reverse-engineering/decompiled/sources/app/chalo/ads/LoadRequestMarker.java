package app.chalo.ads;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/LoadRequestMarker;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class LoadRequestMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoadRequestKey f795a;
    public final LoadStatus b;

    public LoadRequestMarker(LoadRequestKey key, LoadStatus status) {
        Intrinsics.i(key, "key");
        Intrinsics.i(status, "status");
        this.f795a = key;
        this.b = status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadRequestMarker)) {
            return false;
        }
        LoadRequestMarker loadRequestMarker = (LoadRequestMarker) obj;
        return Intrinsics.d(this.f795a, loadRequestMarker.f795a) && this.b == loadRequestMarker.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f795a.hashCode() * 31);
    }

    public final String toString() {
        return "LoadRequestMarker(key=" + this.f795a + ", status=" + this.b + ")";
    }
}
