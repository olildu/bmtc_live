package app.chalo.metro.ui.landing.uistate;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.radiobutton.RadioButtonUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/uistate/LineSelectionItemUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LineSelectionItemUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LineSelectionItemSpec f5519a = new LineSelectionItemSpec();
    public final LineTypeIndicatorUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final RadioButtonUIState e;
    public final DividerUIState f;
    public final UiEventHandler$Companion$fromLambda$1 g;

    public LineSelectionItemUIState(LineTypeIndicatorUIState lineTypeIndicatorUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, RadioButtonUIState radioButtonUIState, DividerUIState dividerUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        this.b = lineTypeIndicatorUIState;
        this.c = chaloTextUIState;
        this.d = chaloTextUIState2;
        this.e = radioButtonUIState;
        this.f = dividerUIState;
        this.g = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineSelectionItemUIState)) {
            return false;
        }
        LineSelectionItemUIState lineSelectionItemUIState = (LineSelectionItemUIState) obj;
        return Intrinsics.d(this.f5519a, lineSelectionItemUIState.f5519a) && Intrinsics.d(this.b, lineSelectionItemUIState.b) && Intrinsics.d(this.c, lineSelectionItemUIState.c) && Intrinsics.d(this.d, lineSelectionItemUIState.d) && Intrinsics.d(this.e, lineSelectionItemUIState.e) && Intrinsics.d(this.f, lineSelectionItemUIState.f) && Intrinsics.d(this.g, lineSelectionItemUIState.g);
    }

    public final int hashCode() {
        int iF = r30.f(this.c, (this.b.hashCode() + (this.f5519a.hashCode() * 31)) * 31, 31);
        TextUIState.ChaloTextUIState chaloTextUIState = this.d;
        int iHashCode = (this.e.hashCode() + ((iF + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31)) * 31;
        DividerUIState dividerUIState = this.f;
        return this.g.hashCode() + ((iHashCode + (dividerUIState != null ? dividerUIState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineSelectionItemUIState(spec=");
        sb.append(this.f5519a);
        sb.append(", lineIndicator=");
        sb.append(this.b);
        sb.append(", lineName=");
        r30.p(sb, this.c, ", lineDescription=", this.d, ", lineSelectionRadioButton=");
        sb.append(this.e);
        sb.append(", dividerUiState=");
        sb.append(this.f);
        sb.append(", uiEventHandler=");
        return nf1.n(sb, this.g, ")");
    }
}
