package app.chalo.userprofile.ui.minprofileupdate;

import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/AgeInputFieldUIState;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AgeInputFieldUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseTextFieldUIState f10377a;
    public final TextUIState b;
    public final ChaloColorToken c;
    public final AgeInputFieldUISpec d;

    public AgeInputFieldUIState(BaseTextFieldUIState textField, TextUIState textUIState) {
        AgeInputFieldUISpec ageInputFieldUISpec = new AgeInputFieldUISpec();
        Intrinsics.i(textField, "textField");
        this.f10377a = textField;
        this.b = textUIState;
        this.c = ChaloColorToken.White.f9870a;
        this.d = ageInputFieldUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgeInputFieldUIState)) {
            return false;
        }
        AgeInputFieldUIState ageInputFieldUIState = (AgeInputFieldUIState) obj;
        return Intrinsics.d(this.f10377a, ageInputFieldUIState.f10377a) && Intrinsics.d(this.b, ageInputFieldUIState.b) && Intrinsics.d(this.c, ageInputFieldUIState.c) && Intrinsics.d(this.d, ageInputFieldUIState.d);
    }

    public final int hashCode() {
        int iHashCode = this.f10377a.hashCode() * 31;
        TextUIState textUIState = this.b;
        return this.d.hashCode() + z40.b(this.c, (iHashCode + (textUIState == null ? 0 : textUIState.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "AgeInputFieldUIState(textField=" + this.f10377a + ", supportingText=" + this.b + ", backgroundColor=" + this.c + ", spec=" + this.d + ")";
    }
}
