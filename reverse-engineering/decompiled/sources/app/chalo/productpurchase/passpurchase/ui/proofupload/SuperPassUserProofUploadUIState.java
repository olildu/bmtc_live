package app.chalo.productpurchase.passpurchase.ui.proofupload;

import app.chalo.productpurchase.passpurchase.ui.proofoverview.EnlargedProofImageUIState;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewNextBtnUIState;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperProofImageUIState;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassUserProofUploadUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ToolbarUIState f8511a;
    public final TextUIState b;
    public final TextUIState c;
    public final SuperPassProofTutorialUIState d;
    public final SuperPassProofOverviewNextBtnUIState e;
    public final SuperProofImageUIState f;
    public final ConfirmationDialogUiState g;
    public final EnlargedProofImageUIState h;
    public final SuperPassUserProofUploadUISpec i;

    public SuperPassUserProofUploadUIState(ToolbarUIState toolbar, TextUIState proofName, TextUIState textUIState, SuperPassProofTutorialUIState superPassProofTutorialUIState, SuperPassProofOverviewNextBtnUIState proofOverviewNextBtnUIState, SuperProofImageUIState superProofImageUIState, ConfirmationDialogUiState confirmationDialogUiState, EnlargedProofImageUIState enlargedProofImageUIState) {
        SuperPassUserProofUploadUISpec superPassUserProofUploadUISpec = new SuperPassUserProofUploadUISpec();
        Intrinsics.i(toolbar, "toolbar");
        Intrinsics.i(proofName, "proofName");
        Intrinsics.i(proofOverviewNextBtnUIState, "proofOverviewNextBtnUIState");
        this.f8511a = toolbar;
        this.b = proofName;
        this.c = textUIState;
        this.d = superPassProofTutorialUIState;
        this.e = proofOverviewNextBtnUIState;
        this.f = superProofImageUIState;
        this.g = confirmationDialogUiState;
        this.h = enlargedProofImageUIState;
        this.i = superPassUserProofUploadUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassUserProofUploadUIState)) {
            return false;
        }
        SuperPassUserProofUploadUIState superPassUserProofUploadUIState = (SuperPassUserProofUploadUIState) obj;
        return Intrinsics.d(this.f8511a, superPassUserProofUploadUIState.f8511a) && Intrinsics.d(this.b, superPassUserProofUploadUIState.b) && Intrinsics.d(this.c, superPassUserProofUploadUIState.c) && Intrinsics.d(this.d, superPassUserProofUploadUIState.d) && Intrinsics.d(this.e, superPassUserProofUploadUIState.e) && Intrinsics.d(this.f, superPassUserProofUploadUIState.f) && Intrinsics.d(this.g, superPassUserProofUploadUIState.g) && Intrinsics.d(this.h, superPassUserProofUploadUIState.h) && Intrinsics.d(this.i, superPassUserProofUploadUIState.i);
    }

    public final int hashCode() {
        int iC = pk0.c(this.b, this.f8511a.hashCode() * 31, 31);
        TextUIState textUIState = this.c;
        int iHashCode = (iC + (textUIState == null ? 0 : textUIState.hashCode())) * 31;
        SuperPassProofTutorialUIState superPassProofTutorialUIState = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (superPassProofTutorialUIState == null ? 0 : superPassProofTutorialUIState.hashCode())) * 31)) * 31;
        SuperProofImageUIState superProofImageUIState = this.f;
        int iHashCode3 = (iHashCode2 + (superProofImageUIState == null ? 0 : superProofImageUIState.hashCode())) * 31;
        ConfirmationDialogUiState confirmationDialogUiState = this.g;
        int iHashCode4 = (iHashCode3 + (confirmationDialogUiState == null ? 0 : confirmationDialogUiState.hashCode())) * 31;
        EnlargedProofImageUIState enlargedProofImageUIState = this.h;
        return this.i.hashCode() + ((iHashCode4 + (enlargedProofImageUIState != null ? enlargedProofImageUIState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SuperPassUserProofUploadUIState(toolbar=" + this.f8511a + ", proofName=" + this.b + ", proofDesc=" + this.c + ", tutorial=" + this.d + ", proofOverviewNextBtnUIState=" + this.e + ", placeholder=" + this.f + ", permissionRationale=" + this.g + ", zoomedPlaceholderImage=" + this.h + ", spec=" + this.i + ")";
    }
}
