package app.chalo.ads;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/NativeMediaRatioResolution;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class NativeMediaRatioResolution {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f819a;
    public final String b;

    public NativeMediaRatioResolution(String str, Float f) {
        this.f819a = f;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeMediaRatioResolution)) {
            return false;
        }
        NativeMediaRatioResolution nativeMediaRatioResolution = (NativeMediaRatioResolution) obj;
        return Intrinsics.d(this.f819a, nativeMediaRatioResolution.f819a) && Intrinsics.d(this.b, nativeMediaRatioResolution.b);
    }

    public final int hashCode() {
        Float f = this.f819a;
        return this.b.hashCode() + ((f == null ? 0 : f.hashCode()) * 31);
    }

    public final String toString() {
        return "NativeMediaRatioResolution(ratio=" + this.f819a + ", source=" + this.b + ")";
    }
}
