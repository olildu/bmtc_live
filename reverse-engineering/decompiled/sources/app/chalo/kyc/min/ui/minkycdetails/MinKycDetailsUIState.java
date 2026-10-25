package app.chalo.kyc.min.ui.minkycdetails;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.hq0;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsUIState;", "", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MinKycDetailsUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MinKycDetailsUISpecs f4129a;
    public final LoadingDialogUIState b;
    public final ToolbarUIState c;
    public final NameRegistrationUIState d;
    public final ButtonUIState e;

    public MinKycDetailsUIState(LoadingDialogUIState loadingDialogUIState, ToolbarUIState toolbarUIState, NameRegistrationUIState nameRegistrationUIState, ButtonUIState buttonUIState) {
        MinKycDetailsUISpecs minKycDetailsUISpecs = new MinKycDetailsUISpecs();
        Intrinsics.i(toolbarUIState, "toolbarUIState");
        Intrinsics.i(nameRegistrationUIState, "nameRegistrationUIState");
        this.f4129a = minKycDetailsUISpecs;
        this.b = loadingDialogUIState;
        this.c = toolbarUIState;
        this.d = nameRegistrationUIState;
        this.e = buttonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinKycDetailsUIState)) {
            return false;
        }
        MinKycDetailsUIState minKycDetailsUIState = (MinKycDetailsUIState) obj;
        return Intrinsics.d(this.f4129a, minKycDetailsUIState.f4129a) && Intrinsics.d(this.b, minKycDetailsUIState.b) && Intrinsics.d(this.c, minKycDetailsUIState.c) && Intrinsics.d(this.d, minKycDetailsUIState.d) && Intrinsics.d(this.e, minKycDetailsUIState.e);
    }

    public final int hashCode() {
        int iHashCode = this.f4129a.hashCode() * 31;
        LoadingDialogUIState loadingDialogUIState = this.b;
        return this.e.hashCode() + ((this.d.hashCode() + t8.d(this.c, (iHashCode + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MinKycDetailsUIState(specs=");
        sb.append(this.f4129a);
        sb.append(", loadingDialogState=");
        sb.append(this.b);
        sb.append(", toolbarUIState=");
        sb.append(this.c);
        sb.append(", nameRegistrationUIState=");
        sb.append(this.d);
        sb.append(", proceedBtnUIState=");
        return hq0.j(sb, this.e, ")");
    }
}
