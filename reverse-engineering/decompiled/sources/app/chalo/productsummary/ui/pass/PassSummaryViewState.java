package app.chalo.productsummary.ui.pass;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/pass/PassSummaryViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassSummaryViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8783a;
    public final PassSummaryScreenType b;
    public final LoadingDialogUIState c;
    public final UiEventHandler$Companion$fromLambda$1 d;

    public PassSummaryViewState(PassSummaryScreenType screenType, LoadingDialogUIState loadingDialogUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 0.0f, 9);
        Intrinsics.i(screenType, "screenType");
        this.f8783a = chaloPadding;
        this.b = screenType;
        this.c = loadingDialogUIState;
        this.d = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassSummaryViewState)) {
            return false;
        }
        PassSummaryViewState passSummaryViewState = (PassSummaryViewState) obj;
        return Intrinsics.d(this.f8783a, passSummaryViewState.f8783a) && Intrinsics.d(this.b, passSummaryViewState.b) && Intrinsics.d(this.c, passSummaryViewState.c) && Intrinsics.d(this.d, passSummaryViewState.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f8783a.hashCode() * 31)) * 31;
        LoadingDialogUIState loadingDialogUIState = this.c;
        return this.d.hashCode() + ((iHashCode + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31);
    }

    public final String toString() {
        return "PassSummaryViewState(contentPadding=" + this.f8783a + ", screenType=" + this.b + ", loadingDialogUIState=" + this.c + ", backPressedEventHandler=" + this.d + ")";
    }
}
