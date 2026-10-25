package app.chalo.ads;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/UnifiedAdLayoutContract;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnifiedAdLayoutContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedAdHeightBehavior f843a;
    public final UnifiedAdMediaPolicy b;
    public final UnifiedAdSecondaryContentPolicy c;
    public final UnifiedAdCtaTreatment d;

    public UnifiedAdLayoutContract(UnifiedAdHeightBehavior heightBehavior, UnifiedAdMediaPolicy mediaPolicy, UnifiedAdSecondaryContentPolicy secondaryContentPolicy, UnifiedAdCtaTreatment ctaTreatment) {
        Intrinsics.i(heightBehavior, "heightBehavior");
        Intrinsics.i(mediaPolicy, "mediaPolicy");
        Intrinsics.i(secondaryContentPolicy, "secondaryContentPolicy");
        Intrinsics.i(ctaTreatment, "ctaTreatment");
        this.f843a = heightBehavior;
        this.b = mediaPolicy;
        this.c = secondaryContentPolicy;
        this.d = ctaTreatment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnifiedAdLayoutContract)) {
            return false;
        }
        UnifiedAdLayoutContract unifiedAdLayoutContract = (UnifiedAdLayoutContract) obj;
        return this.f843a == unifiedAdLayoutContract.f843a && this.b == unifiedAdLayoutContract.b && this.c == unifiedAdLayoutContract.c && this.d == unifiedAdLayoutContract.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f843a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "UnifiedAdLayoutContract(heightBehavior=" + this.f843a + ", mediaPolicy=" + this.b + ", secondaryContentPolicy=" + this.c + ", ctaTreatment=" + this.d + ")";
    }
}
