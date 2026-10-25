package app.chalo.validationsdk.multiproductvalidation.ui;

import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationUIState;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MultiProductValidationUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ToolbarUIState f10703a;
    public final MultiProductValidationScreenUIState b;
    public final ConfirmationDialogUiState c;
    public final ChaloColorToken d;

    public MultiProductValidationUIState(ToolbarUIState toolbar, MultiProductValidationScreenUIState screen, ConfirmationDialogUiState confirmationDialogUiState, ChaloColorToken background) {
        Intrinsics.i(toolbar, "toolbar");
        Intrinsics.i(screen, "screen");
        Intrinsics.i(background, "background");
        this.f10703a = toolbar;
        this.b = screen;
        this.c = confirmationDialogUiState;
        this.d = background;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiProductValidationUIState)) {
            return false;
        }
        MultiProductValidationUIState multiProductValidationUIState = (MultiProductValidationUIState) obj;
        return Intrinsics.d(this.f10703a, multiProductValidationUIState.f10703a) && Intrinsics.d(this.b, multiProductValidationUIState.b) && Intrinsics.d(this.c, multiProductValidationUIState.c) && Intrinsics.d(this.d, multiProductValidationUIState.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f10703a.hashCode() * 31)) * 31;
        ConfirmationDialogUiState confirmationDialogUiState = this.c;
        return this.d.hashCode() + ((iHashCode + (confirmationDialogUiState == null ? 0 : confirmationDialogUiState.hashCode())) * 31);
    }

    public final String toString() {
        return "MultiProductValidationUIState(toolbar=" + this.f10703a + ", screen=" + this.b + ", activationExpiredDialog=" + this.c + ", background=" + this.d + ")";
    }

    public /* synthetic */ MultiProductValidationUIState(ToolbarUIState toolbarUIState, ChaloColorToken.White white, int i) {
        this(toolbarUIState, MultiProductValidationScreenUIState.Loading.f10701a, null, (i & 8) != 0 ? ChaloColorToken.White.f9870a : white);
    }
}
