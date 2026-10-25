package app.chalo.reportproblem;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.nf1;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/reportproblem/ReportProblemViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ReportProblemViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoadingDialogUIState f9032a;
    public final ToolbarUIState b;
    public final List c;
    public final ConfirmationDialogUiState d;
    public final ConfirmationDialogUiState e;
    public final SnackbarUIState f;
    public final UiEventHandler$Companion$fromLambda$1 g;

    public ReportProblemViewState(LoadingDialogUIState loadingDialogUIState, ToolbarUIState toolbarUIState, List problemCollection, ConfirmationDialogUiState confirmationDialogUiState, ConfirmationDialogUiState confirmationDialogUiState2, SnackbarUIState snackbarUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        Intrinsics.i(problemCollection, "problemCollection");
        this.f9032a = loadingDialogUIState;
        this.b = toolbarUIState;
        this.c = problemCollection;
        this.d = confirmationDialogUiState;
        this.e = confirmationDialogUiState2;
        this.f = snackbarUIState;
        this.g = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportProblemViewState)) {
            return false;
        }
        ReportProblemViewState reportProblemViewState = (ReportProblemViewState) obj;
        return Intrinsics.d(this.f9032a, reportProblemViewState.f9032a) && Intrinsics.d(this.b, reportProblemViewState.b) && Intrinsics.d(this.c, reportProblemViewState.c) && Intrinsics.d(this.d, reportProblemViewState.d) && Intrinsics.d(this.e, reportProblemViewState.e) && Intrinsics.d(this.f, reportProblemViewState.f) && this.g.equals(reportProblemViewState.g);
    }

    public final int hashCode() {
        LoadingDialogUIState loadingDialogUIState = this.f9032a;
        int iHashCode = (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode()) * 31;
        ToolbarUIState toolbarUIState = this.b;
        int iB = r30.b((iHashCode + (toolbarUIState == null ? 0 : toolbarUIState.hashCode())) * 31, 31, this.c);
        ConfirmationDialogUiState confirmationDialogUiState = this.d;
        int iHashCode2 = (iB + (confirmationDialogUiState == null ? 0 : confirmationDialogUiState.hashCode())) * 31;
        ConfirmationDialogUiState confirmationDialogUiState2 = this.e;
        int iHashCode3 = (iHashCode2 + (confirmationDialogUiState2 == null ? 0 : confirmationDialogUiState2.hashCode())) * 31;
        SnackbarUIState snackbarUIState = this.f;
        return this.g.hashCode() + ((iHashCode3 + (snackbarUIState != null ? snackbarUIState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportProblemViewState(loader=");
        sb.append(this.f9032a);
        sb.append(", toolbar=");
        sb.append(this.b);
        sb.append(", problemCollection=");
        sb.append(this.c);
        sb.append(", reclaimRequestDialog=");
        sb.append(this.d);
        sb.append(", reclaimResponseDialog=");
        sb.append(this.e);
        sb.append(", snackbarUIState=");
        sb.append(this.f);
        sb.append(", backPressedEventHandler=");
        return nf1.n(sb, this.g, ")");
    }
}
