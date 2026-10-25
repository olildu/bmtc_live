package app.chalo.kyc.min.ui.minkycdetails;

import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycdetails/NameRegistrationUIState;", "", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NameRegistrationUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NameRegistrationUISpecs f4132a;
    public final DetailsStepProgressIndicatorUIState b;
    public final TextUIState c;
    public final BaseTextFieldUIState.TextFieldUIState d;

    public NameRegistrationUIState(NameRegistrationUISpecs nameRegistrationUISpecs, DetailsStepProgressIndicatorUIState detailsStepProgressIndicatorUIState, TextUIState.ChaloTextUIState nameTitleTextUIState, BaseTextFieldUIState.TextFieldUIState nameTextFieldUIState) {
        Intrinsics.i(nameTitleTextUIState, "nameTitleTextUIState");
        Intrinsics.i(nameTextFieldUIState, "nameTextFieldUIState");
        this.f4132a = nameRegistrationUISpecs;
        this.b = detailsStepProgressIndicatorUIState;
        this.c = nameTitleTextUIState;
        this.d = nameTextFieldUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NameRegistrationUIState)) {
            return false;
        }
        NameRegistrationUIState nameRegistrationUIState = (NameRegistrationUIState) obj;
        return Intrinsics.d(this.f4132a, nameRegistrationUIState.f4132a) && Intrinsics.d(this.b, nameRegistrationUIState.b) && Intrinsics.d(this.c, nameRegistrationUIState.c) && Intrinsics.d(this.d, nameRegistrationUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + pk0.c(this.c, (this.b.hashCode() + (this.f4132a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "NameRegistrationUIState(specs=" + this.f4132a + ", detailsStepProgressIndicatorUIState=" + this.b + ", nameTitleTextUIState=" + this.c + ", nameTextFieldUIState=" + this.d + ")";
    }
}
