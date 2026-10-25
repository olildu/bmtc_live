package app.chalo.uistate.dialog;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.divider.DividerOrientation;
import app.chalo.uistate.divider.DividerUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/ButtonContainerUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ButtonContainerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ButtonContainerUISpecs f9967a;
    public final ButtonUIState b;
    public final ButtonUIState c;
    public final DividerUIState d;

    public ButtonContainerUIState(ButtonContainerUISpecs specs, ButtonUIState buttonUIState, ButtonUIState buttonUIState2, int i) {
        specs = (i & 1) != 0 ? new ButtonContainerUISpecs(15) : specs;
        DividerUIState dividerUIState = new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.Black_12.f9761a, DividerOrientation.Vertical);
        Intrinsics.i(specs, "specs");
        this.f9967a = specs;
        this.b = buttonUIState;
        this.c = buttonUIState2;
        this.d = dividerUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonContainerUIState)) {
            return false;
        }
        ButtonContainerUIState buttonContainerUIState = (ButtonContainerUIState) obj;
        return Intrinsics.d(this.f9967a, buttonContainerUIState.f9967a) && Intrinsics.d(this.b, buttonContainerUIState.b) && Intrinsics.d(this.c, buttonContainerUIState.c) && Intrinsics.d(this.d, buttonContainerUIState.d);
    }

    public final int hashCode() {
        int iHashCode = this.f9967a.hashCode() * 31;
        ButtonUIState buttonUIState = this.b;
        int iHashCode2 = (iHashCode + (buttonUIState == null ? 0 : buttonUIState.hashCode())) * 31;
        ButtonUIState buttonUIState2 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (buttonUIState2 != null ? buttonUIState2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ButtonContainerUIState(specs=" + this.f9967a + ", cancelBtn=" + this.b + ", acceptBtn=" + this.c + ", divider=" + this.d + ")";
    }
}
