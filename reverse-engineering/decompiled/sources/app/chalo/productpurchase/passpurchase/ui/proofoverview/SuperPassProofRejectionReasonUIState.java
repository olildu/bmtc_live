package app.chalo.productpurchase.passpurchase.ui.proofoverview;

import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofRejectionReasonUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassProofRejectionReasonUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassProofRejectionReasonUISpec f8494a;
    public final SuperPassProofRejectionImageUIState b;
    public final TextUIState c;

    public SuperPassProofRejectionReasonUIState(SuperPassProofRejectionImageUIState rejectionImage, TextUIState rejectionListText) {
        SuperPassProofRejectionReasonUISpec superPassProofRejectionReasonUISpec = new SuperPassProofRejectionReasonUISpec();
        Intrinsics.i(rejectionImage, "rejectionImage");
        Intrinsics.i(rejectionListText, "rejectionListText");
        this.f8494a = superPassProofRejectionReasonUISpec;
        this.b = rejectionImage;
        this.c = rejectionListText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassProofRejectionReasonUIState)) {
            return false;
        }
        SuperPassProofRejectionReasonUIState superPassProofRejectionReasonUIState = (SuperPassProofRejectionReasonUIState) obj;
        return Intrinsics.d(this.f8494a, superPassProofRejectionReasonUIState.f8494a) && Intrinsics.d(this.b, superPassProofRejectionReasonUIState.b) && Intrinsics.d(this.c, superPassProofRejectionReasonUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f8494a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SuperPassProofRejectionReasonUIState(spec=" + this.f8494a + ", rejectionImage=" + this.b + ", rejectionListText=" + this.c + ")";
    }
}
