package app.chalo.productpurchase.passpurchase.ui.proofoverview;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/EnlargedProofImageUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EnlargedProofImageUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperProofImageUIState f8460a;
    public final EnlargeProofImageEventHandler b;

    public EnlargedProofImageUIState(SuperProofImageUIState superProofImageUIState, EnlargeProofImageEventHandler eventHandler) {
        Intrinsics.i(eventHandler, "eventHandler");
        this.f8460a = superProofImageUIState;
        this.b = eventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnlargedProofImageUIState)) {
            return false;
        }
        EnlargedProofImageUIState enlargedProofImageUIState = (EnlargedProofImageUIState) obj;
        return Intrinsics.d(this.f8460a, enlargedProofImageUIState.f8460a) && Intrinsics.d(this.b, enlargedProofImageUIState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8460a.hashCode() * 31);
    }

    public final String toString() {
        return "EnlargedProofImageUIState(img=" + this.f8460a + ", eventHandler=" + this.b + ")";
    }
}
