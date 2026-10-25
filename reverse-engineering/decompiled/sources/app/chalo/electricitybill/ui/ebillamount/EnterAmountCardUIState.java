package app.chalo.electricitybill.ui.ebillamount;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillamount/EnterAmountCardUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EnterAmountCardUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnterAmountCardUISpecs f2555a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final BaseTextFieldUIState.TextFieldUIState d;
    public final TextUIState.ChaloTextUIState e;
    public final ButtonUIState f;

    public EnterAmountCardUIState(TextUIState.ChaloTextUIState title, TextUIState.ChaloTextUIState desc, BaseTextFieldUIState.TextFieldUIState enterAmountTextField, TextUIState.ChaloTextUIState chaloTextUIState, ButtonUIState buttonUIState) {
        EnterAmountCardUISpecs enterAmountCardUISpecs = new EnterAmountCardUISpecs();
        Intrinsics.i(title, "title");
        Intrinsics.i(desc, "desc");
        Intrinsics.i(enterAmountTextField, "enterAmountTextField");
        this.f2555a = enterAmountCardUISpecs;
        this.b = title;
        this.c = desc;
        this.d = enterAmountTextField;
        this.e = chaloTextUIState;
        this.f = buttonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterAmountCardUIState)) {
            return false;
        }
        EnterAmountCardUIState enterAmountCardUIState = (EnterAmountCardUIState) obj;
        return Intrinsics.d(this.f2555a, enterAmountCardUIState.f2555a) && Intrinsics.d(this.b, enterAmountCardUIState.b) && Intrinsics.d(this.c, enterAmountCardUIState.c) && Intrinsics.d(this.d, enterAmountCardUIState.d) && Intrinsics.d(this.e, enterAmountCardUIState.e) && Intrinsics.d(this.f, enterAmountCardUIState.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + r30.f(this.c, r30.f(this.b, this.f2555a.hashCode() * 31, 31), 31)) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.e;
        return this.f.hashCode() + ((iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31);
    }

    public final String toString() {
        return "EnterAmountCardUIState(specs=" + this.f2555a + ", title=" + this.b + ", desc=" + this.c + ", enterAmountTextField=" + this.d + ", errorText=" + this.e + ", nextBtn=" + this.f + ")";
    }
}
