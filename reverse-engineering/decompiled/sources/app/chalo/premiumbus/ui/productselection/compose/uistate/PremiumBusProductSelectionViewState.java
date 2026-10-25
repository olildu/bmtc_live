package app.chalo.premiumbus.ui.productselection.compose.uistate;

import app.chalo.uistate.cardwithtextleftandrighticon.CardWithTextLeftAndRightIconUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import defpackage.et0;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/productselection/compose/uistate/PremiumBusProductSelectionViewState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusProductSelectionViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusProductSelectionSpecs f7709a;
    public final PremiumBusProductSelectionToolBarUIState b;
    public final LoadingDialogUIState c;
    public final boolean d;
    public final List e;
    public final CardWithTextLeftAndRightIconUiState f;
    public final StandardErrorScreenUIState.ErrorWithMsgAndRetry g;
    public final Function1 h;

    public PremiumBusProductSelectionViewState(PremiumBusProductSelectionToolBarUIState toolbarUIState, LoadingDialogUIState loadingDialogUIState, boolean z, List pbProductConfigUiInfoStateList, CardWithTextLeftAndRightIconUiState customerSupportCardUiState, StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry, et0 et0Var) {
        PremiumBusProductSelectionSpecs premiumBusProductSelectionSpecs = new PremiumBusProductSelectionSpecs();
        Intrinsics.i(toolbarUIState, "toolbarUIState");
        Intrinsics.i(pbProductConfigUiInfoStateList, "pbProductConfigUiInfoStateList");
        Intrinsics.i(customerSupportCardUiState, "customerSupportCardUiState");
        this.f7709a = premiumBusProductSelectionSpecs;
        this.b = toolbarUIState;
        this.c = loadingDialogUIState;
        this.d = z;
        this.e = pbProductConfigUiInfoStateList;
        this.f = customerSupportCardUiState;
        this.g = errorWithMsgAndRetry;
        this.h = et0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusProductSelectionViewState)) {
            return false;
        }
        PremiumBusProductSelectionViewState premiumBusProductSelectionViewState = (PremiumBusProductSelectionViewState) obj;
        return Intrinsics.d(this.f7709a, premiumBusProductSelectionViewState.f7709a) && Intrinsics.d(this.b, premiumBusProductSelectionViewState.b) && Intrinsics.d(this.c, premiumBusProductSelectionViewState.c) && this.d == premiumBusProductSelectionViewState.d && Intrinsics.d(this.e, premiumBusProductSelectionViewState.e) && Intrinsics.d(this.f, premiumBusProductSelectionViewState.f) && Intrinsics.d(this.g, premiumBusProductSelectionViewState.g) && Intrinsics.d(this.h, premiumBusProductSelectionViewState.h);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f7709a.hashCode() * 31)) * 31;
        LoadingDialogUIState loadingDialogUIState = this.c;
        int iHashCode2 = (this.f.hashCode() + r30.b((((iHashCode + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31) + (this.d ? 1231 : 1237)) * 31, 31, this.e)) * 31;
        StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry = this.g;
        return this.h.hashCode() + ((iHashCode2 + (errorWithMsgAndRetry != null ? errorWithMsgAndRetry.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PremiumBusProductSelectionViewState(specs=" + this.f7709a + ", toolbarUIState=" + this.b + ", loadingDialogUIState=" + this.c + ", isFetchingProducts=" + this.d + ", pbProductConfigUiInfoStateList=" + this.e + ", customerSupportCardUiState=" + this.f + ", errorScreenUiState=" + this.g + ", uiEventHandler=" + this.h + ")";
    }
}
