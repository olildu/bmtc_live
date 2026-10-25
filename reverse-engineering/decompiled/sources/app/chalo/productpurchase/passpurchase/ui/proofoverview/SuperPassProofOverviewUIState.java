package app.chalo.productpurchase.passpurchase.ui.proofoverview;

import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassProofOverviewUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ToolbarUIState f8484a;
    public final SuperPassProofOverviewNextBtnUIState b;
    public final List c;
    public final EnlargedProofImageUIState d;
    public final ConfirmationDialogUiState e;
    public final SuperPassProofOverviewUISpec f;

    public SuperPassProofOverviewUIState(ToolbarUIState toolbar, SuperPassProofOverviewNextBtnUIState nextBtn, List proofItems, EnlargedProofImageUIState enlargedProofImageUIState, ConfirmationDialogUiState confirmationDialogUiState) {
        SuperPassProofOverviewUISpec superPassProofOverviewUISpec = new SuperPassProofOverviewUISpec();
        Intrinsics.i(toolbar, "toolbar");
        Intrinsics.i(nextBtn, "nextBtn");
        Intrinsics.i(proofItems, "proofItems");
        this.f8484a = toolbar;
        this.b = nextBtn;
        this.c = proofItems;
        this.d = enlargedProofImageUIState;
        this.e = confirmationDialogUiState;
        this.f = superPassProofOverviewUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassProofOverviewUIState)) {
            return false;
        }
        SuperPassProofOverviewUIState superPassProofOverviewUIState = (SuperPassProofOverviewUIState) obj;
        return Intrinsics.d(this.f8484a, superPassProofOverviewUIState.f8484a) && Intrinsics.d(this.b, superPassProofOverviewUIState.b) && Intrinsics.d(this.c, superPassProofOverviewUIState.c) && Intrinsics.d(this.d, superPassProofOverviewUIState.d) && Intrinsics.d(this.e, superPassProofOverviewUIState.e) && Intrinsics.d(this.f, superPassProofOverviewUIState.f);
    }

    public final int hashCode() {
        int iB = r30.b((this.b.hashCode() + (this.f8484a.hashCode() * 31)) * 31, 31, this.c);
        EnlargedProofImageUIState enlargedProofImageUIState = this.d;
        int iHashCode = (iB + (enlargedProofImageUIState == null ? 0 : enlargedProofImageUIState.hashCode())) * 31;
        ConfirmationDialogUiState confirmationDialogUiState = this.e;
        return this.f.hashCode() + ((iHashCode + (confirmationDialogUiState != null ? confirmationDialogUiState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SuperPassProofOverviewUIState(toolbar=" + this.f8484a + ", nextBtn=" + this.b + ", proofItems=" + this.c + ", enlargeProofImage=" + this.d + ", cameraRationaleDialog=" + this.e + ", spec=" + this.f + ")";
    }
}
