package app.chalo.multimodalticket.ui;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.radiobutton.RadioButtonUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/IndividualStepsTicketCardUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class IndividualStepsTicketCardUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IndividualStepsTicketCardUISpecs f5953a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final boolean d;
    public final List e;
    public final RadioButtonUIState f;
    public final DividerUIState g;
    public final UiEventHandler$Companion$fromLambda$1 h;

    public IndividualStepsTicketCardUIState(IndividualStepsTicketCardUISpecs specs, TextUIState.ChaloTextUIState titleTextUIState, TextUIState.ChaloTextUIState subTitleTextUIState, boolean z, List stepTicketSectionUIStateList, RadioButtonUIState radioButtonUIState, DividerUIState dividerUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        Intrinsics.i(specs, "specs");
        Intrinsics.i(titleTextUIState, "titleTextUIState");
        Intrinsics.i(subTitleTextUIState, "subTitleTextUIState");
        Intrinsics.i(stepTicketSectionUIStateList, "stepTicketSectionUIStateList");
        this.f5953a = specs;
        this.b = titleTextUIState;
        this.c = subTitleTextUIState;
        this.d = z;
        this.e = stepTicketSectionUIStateList;
        this.f = radioButtonUIState;
        this.g = dividerUIState;
        this.h = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndividualStepsTicketCardUIState)) {
            return false;
        }
        IndividualStepsTicketCardUIState individualStepsTicketCardUIState = (IndividualStepsTicketCardUIState) obj;
        return Intrinsics.d(this.f5953a, individualStepsTicketCardUIState.f5953a) && Intrinsics.d(this.b, individualStepsTicketCardUIState.b) && Intrinsics.d(this.c, individualStepsTicketCardUIState.c) && this.d == individualStepsTicketCardUIState.d && Intrinsics.d(this.e, individualStepsTicketCardUIState.e) && this.f.equals(individualStepsTicketCardUIState.f) && this.g.equals(individualStepsTicketCardUIState.g) && this.h.equals(individualStepsTicketCardUIState.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + py.c(this.g, (this.f.hashCode() + r30.b((r30.f(this.c, r30.f(this.b, this.f5953a.hashCode() * 31, 31), 31) + (this.d ? 1231 : 1237)) * 31, 31, this.e)) * 31, 31);
    }

    public final String toString() {
        return "IndividualStepsTicketCardUIState(specs=" + this.f5953a + ", titleTextUIState=" + this.b + ", subTitleTextUIState=" + this.c + ", isExpanded=" + this.d + ", stepTicketSectionUIStateList=" + this.e + ", radioButtonUIState=" + this.f + ", dividerUIState=" + this.g + ", eventHandler=" + this.h + ")";
    }
}
