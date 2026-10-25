package app.chalo.validationsdk.vehiclebasedvalidation.ui;

import app.chalo.uistate.text.AlertTextWithIconUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/ValidationBottomCtaContainerUiState;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ValidationBottomCtaContainerUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ValidationBottomCtaContainerSpec f10743a;
    public final ValidateDetailButtonUIState b;
    public final AlertTextWithIconUiState c;

    public ValidationBottomCtaContainerUiState(ValidateDetailButtonUIState validateDetailButtonUIState, AlertTextWithIconUiState alertTextWithIconUiState, int i) {
        ValidationBottomCtaContainerSpec validationBottomCtaContainerSpec = new ValidationBottomCtaContainerSpec();
        validateDetailButtonUIState = (i & 2) != 0 ? new ValidateDetailButtonUIState(null, 15) : validateDetailButtonUIState;
        alertTextWithIconUiState = (i & 4) != 0 ? null : alertTextWithIconUiState;
        Intrinsics.i(validateDetailButtonUIState, "validateDetailButtonUIState");
        this.f10743a = validationBottomCtaContainerSpec;
        this.b = validateDetailButtonUIState;
        this.c = alertTextWithIconUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidationBottomCtaContainerUiState)) {
            return false;
        }
        ValidationBottomCtaContainerUiState validationBottomCtaContainerUiState = (ValidationBottomCtaContainerUiState) obj;
        return Intrinsics.d(this.f10743a, validationBottomCtaContainerUiState.f10743a) && Intrinsics.d(this.b, validationBottomCtaContainerUiState.b) && Intrinsics.d(this.c, validationBottomCtaContainerUiState.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f10743a.hashCode() * 31)) * 31;
        AlertTextWithIconUiState alertTextWithIconUiState = this.c;
        return iHashCode + (alertTextWithIconUiState == null ? 0 : alertTextWithIconUiState.hashCode());
    }

    public final String toString() {
        return "ValidationBottomCtaContainerUiState(spec=" + this.f10743a + ", validateDetailButtonUIState=" + this.b + ", validationNoteUiState=" + this.c + ")";
    }
}
