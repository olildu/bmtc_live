package app.chalo.ads;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/NativeBindingResult;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NativeBindingResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f803a;
    public final int b;
    public final NativeBindingFailureReason c;

    public NativeBindingResult(boolean z, int i, NativeBindingFailureReason nativeBindingFailureReason) {
        this.f803a = z;
        this.b = i;
        this.c = nativeBindingFailureReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeBindingResult)) {
            return false;
        }
        NativeBindingResult nativeBindingResult = (NativeBindingResult) obj;
        return this.f803a == nativeBindingResult.f803a && this.b == nativeBindingResult.b && this.c == nativeBindingResult.c;
    }

    public final int hashCode() {
        int i = (((this.f803a ? 1231 : 1237) * 31) + this.b) * 31;
        NativeBindingFailureReason nativeBindingFailureReason = this.c;
        return i + (nativeBindingFailureReason == null ? 0 : nativeBindingFailureReason.hashCode());
    }

    public final String toString() {
        return "NativeBindingResult(isBound=" + this.f803a + ", heightDp=" + this.b + ", failureReason=" + this.c + ")";
    }
}
