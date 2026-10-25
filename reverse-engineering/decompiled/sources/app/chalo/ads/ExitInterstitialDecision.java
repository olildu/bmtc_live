package app.chalo.ads;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/ExitInterstitialDecision;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ExitInterstitialDecision {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f779a;
    public final ExitInterstitialDecisionReason b;

    public ExitInterstitialDecision(boolean z, ExitInterstitialDecisionReason reason) {
        Intrinsics.i(reason, "reason");
        this.f779a = z;
        this.b = reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExitInterstitialDecision)) {
            return false;
        }
        ExitInterstitialDecision exitInterstitialDecision = (ExitInterstitialDecision) obj;
        return this.f779a == exitInterstitialDecision.f779a && this.b == exitInterstitialDecision.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f779a ? 1231 : 1237) * 31);
    }

    public final String toString() {
        return "ExitInterstitialDecision(shouldShow=" + this.f779a + ", reason=" + this.b + ")";
    }
}
