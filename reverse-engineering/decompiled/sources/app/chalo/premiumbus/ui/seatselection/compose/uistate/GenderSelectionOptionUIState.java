package app.chalo.premiumbus.ui.seatselection.compose.uistate;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.radiobutton.RadioButtonUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.nf1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/GenderSelectionOptionUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GenderSelectionOptionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f7773a;
    public final RadioButtonUIState b;
    public final UiEventHandler$Companion$fromLambda$1 c;

    public GenderSelectionOptionUIState(TextUIState.ChaloTextUIState chaloTextUIState, RadioButtonUIState radioButtonUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        this.f7773a = chaloTextUIState;
        this.b = radioButtonUIState;
        this.c = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenderSelectionOptionUIState)) {
            return false;
        }
        GenderSelectionOptionUIState genderSelectionOptionUIState = (GenderSelectionOptionUIState) obj;
        return this.f7773a.equals(genderSelectionOptionUIState.f7773a) && this.b.equals(genderSelectionOptionUIState.b) && this.c.equals(genderSelectionOptionUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f7773a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GenderSelectionOptionUIState(text=");
        sb.append(this.f7773a);
        sb.append(", radioButtonUIState=");
        sb.append(this.b);
        sb.append(", uiEventHandler=");
        return nf1.n(sb, this.c, ")");
    }
}
