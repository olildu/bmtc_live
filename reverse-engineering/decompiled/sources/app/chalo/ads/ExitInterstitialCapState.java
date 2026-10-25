package app.chalo.ads;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/ExitInterstitialCapState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ExitInterstitialCapState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f778a;
    public final Long b;

    public /* synthetic */ ExitInterstitialCapState() {
        this(0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExitInterstitialCapState)) {
            return false;
        }
        ExitInterstitialCapState exitInterstitialCapState = (ExitInterstitialCapState) obj;
        return this.f778a == exitInterstitialCapState.f778a && Intrinsics.d(this.b, exitInterstitialCapState.b);
    }

    public final int hashCode() {
        int i = this.f778a * 31;
        Long l = this.b;
        return i + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "ExitInterstitialCapState(exitCount=" + this.f778a + ", lastShownAtEpochMillis=" + this.b + ")";
    }

    public ExitInterstitialCapState(int i, Long l) {
        this.f778a = i;
        this.b = l;
    }
}
