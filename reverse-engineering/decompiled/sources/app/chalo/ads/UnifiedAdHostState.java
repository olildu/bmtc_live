package app.chalo.ads;

import defpackage.b3;
import defpackage.nf1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/UnifiedAdHostState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnifiedAdHostState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f841a;
    public final boolean b;
    public final boolean c;

    public UnifiedAdHostState(boolean z, boolean z2, boolean z3) {
        this.f841a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnifiedAdHostState)) {
            return false;
        }
        UnifiedAdHostState unifiedAdHostState = (UnifiedAdHostState) obj;
        return this.f841a == unifiedAdHostState.f841a && this.b == unifiedAdHostState.b && this.c == unifiedAdHostState.c;
    }

    public final int hashCode() {
        return ((((this.f841a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        return b3.g(")", nf1.r("UnifiedAdHostState(isActivityUsable=", ", isLifecycleStarted=", ", hasWindowToken=", this.f841a, this.b), this.c);
    }
}
