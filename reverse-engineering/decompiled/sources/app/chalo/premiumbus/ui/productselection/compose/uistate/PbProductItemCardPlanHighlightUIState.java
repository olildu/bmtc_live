package app.chalo.premiumbus.ui.productselection.compose.uistate;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/productselection/compose/uistate/PbProductItemCardPlanHighlightUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PbProductItemCardPlanHighlightUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ButtonUIState f7705a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.StyledTextUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final BorderUISpec e;

    public PbProductItemCardPlanHighlightUIState(ButtonUIState buttonUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.StyledTextUIState styledTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        BorderUISpec borderUISpec = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.LightGray.f9814a, UIShape.d);
        this.f7705a = buttonUIState;
        this.b = chaloTextUIState;
        this.c = styledTextUIState;
        this.d = chaloTextUIState2;
        this.e = borderUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PbProductItemCardPlanHighlightUIState)) {
            return false;
        }
        PbProductItemCardPlanHighlightUIState pbProductItemCardPlanHighlightUIState = (PbProductItemCardPlanHighlightUIState) obj;
        return Intrinsics.d(this.f7705a, pbProductItemCardPlanHighlightUIState.f7705a) && Intrinsics.d(this.b, pbProductItemCardPlanHighlightUIState.b) && Intrinsics.d(this.c, pbProductItemCardPlanHighlightUIState.c) && Intrinsics.d(this.d, pbProductItemCardPlanHighlightUIState.d) && Intrinsics.d(this.e, pbProductItemCardPlanHighlightUIState.e);
    }

    public final int hashCode() {
        ButtonUIState buttonUIState = this.f7705a;
        int iHashCode = (buttonUIState == null ? 0 : buttonUIState.hashCode()) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.b;
        int iHashCode2 = (iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        TextUIState.StyledTextUIState styledTextUIState = this.c;
        int iHashCode3 = (iHashCode2 + (styledTextUIState == null ? 0 : styledTextUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState2 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (chaloTextUIState2 != null ? chaloTextUIState2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PbProductItemCardPlanHighlightUIState(highlightBtnUiState=" + this.f7705a + ", highlightTitle=" + this.b + ", highLightCopy=" + this.c + ", strikeThroughHighlight=" + this.d + ", highlightedBtnBorderUISpec=" + this.e + ")";
    }
}
