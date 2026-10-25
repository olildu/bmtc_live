package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.validationsdk.blevalidation.ui.common.QRValidationBottomSheetUIState;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationUIState;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QRValidationUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ToolbarUIState f10652a;
    public final QRValidationScreenUIState b;
    public final ConfirmationDialogUiState c;
    public final QRValidationBottomSheetUIState d;
    public final ChaloColorToken e;

    public QRValidationUIState(ToolbarUIState toolbar, QRValidationScreenUIState screen, ConfirmationDialogUiState confirmationDialogUiState, QRValidationBottomSheetUIState qRValidationBottomSheetUIState, ChaloColorToken.White background) {
        Intrinsics.i(toolbar, "toolbar");
        Intrinsics.i(screen, "screen");
        Intrinsics.i(background, "background");
        this.f10652a = toolbar;
        this.b = screen;
        this.c = confirmationDialogUiState;
        this.d = qRValidationBottomSheetUIState;
        this.e = background;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRValidationUIState)) {
            return false;
        }
        QRValidationUIState qRValidationUIState = (QRValidationUIState) obj;
        return Intrinsics.d(this.f10652a, qRValidationUIState.f10652a) && Intrinsics.d(this.b, qRValidationUIState.b) && Intrinsics.d(this.c, qRValidationUIState.c) && Intrinsics.d(this.d, qRValidationUIState.d) && Intrinsics.d(this.e, qRValidationUIState.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f10652a.hashCode() * 31)) * 31;
        ConfirmationDialogUiState confirmationDialogUiState = this.c;
        int iHashCode2 = (iHashCode + (confirmationDialogUiState == null ? 0 : confirmationDialogUiState.hashCode())) * 31;
        QRValidationBottomSheetUIState qRValidationBottomSheetUIState = this.d;
        return this.e.hashCode() + ((iHashCode2 + (qRValidationBottomSheetUIState != null ? qRValidationBottomSheetUIState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QRValidationUIState(toolbar=");
        sb.append(this.f10652a);
        sb.append(", screen=");
        sb.append(this.b);
        sb.append(", activationExpiredDialog=");
        sb.append(this.c);
        sb.append(", validationBottomSheet=");
        sb.append(this.d);
        sb.append(", background=");
        return pk0.j(sb, this.e, ")");
    }
}
