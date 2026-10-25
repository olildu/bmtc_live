package app.chalo.multimodalticket.ui.uistates;

import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.checkbox.ChaloCheckBoxUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.multimodal.StepTicketModeBasedInfoUIState;
import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/uistates/StepTicketSectionUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StepTicketSectionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StepTicketSectionUISpecs f5971a;
    public final TextUIState.ChaloTextUIState b;
    public final StepTicketModeBasedInfoUIState c;
    public final ChaloCheckBoxUIState d;
    public final ImageUIState e;
    public final UiEventHandler f;

    public StepTicketSectionUIState(StepTicketSectionUISpecs stepTicketSectionUISpecs, TextUIState.ChaloTextUIState chaloTextUIState, StepTicketModeBasedInfoUIState stepTicketModeBasedInfoUIState, ChaloCheckBoxUIState chaloCheckBoxUIState, ImageUIState imageUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        this.f5971a = stepTicketSectionUISpecs;
        this.b = chaloTextUIState;
        this.c = stepTicketModeBasedInfoUIState;
        this.d = chaloCheckBoxUIState;
        this.e = imageUIState;
        this.f = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepTicketSectionUIState)) {
            return false;
        }
        StepTicketSectionUIState stepTicketSectionUIState = (StepTicketSectionUIState) obj;
        return Intrinsics.d(this.f5971a, stepTicketSectionUIState.f5971a) && Intrinsics.d(this.b, stepTicketSectionUIState.b) && Intrinsics.d(this.c, stepTicketSectionUIState.c) && Intrinsics.d(this.d, stepTicketSectionUIState.d) && Intrinsics.d(this.e, stepTicketSectionUIState.e) && Intrinsics.d(this.f, stepTicketSectionUIState.f);
    }

    public final int hashCode() {
        int iHashCode = this.f5971a.hashCode() * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31)) * 31;
        ChaloCheckBoxUIState chaloCheckBoxUIState = this.d;
        int iHashCode3 = (iHashCode2 + (chaloCheckBoxUIState == null ? 0 : chaloCheckBoxUIState.hashCode())) * 31;
        ImageUIState imageUIState = this.e;
        int iHashCode4 = (iHashCode3 + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31;
        UiEventHandler uiEventHandler = this.f;
        return iHashCode4 + (uiEventHandler != null ? uiEventHandler.hashCode() : 0);
    }

    public final String toString() {
        return "StepTicketSectionUIState(specs=" + this.f5971a + ", stepNumberTextUIState=" + this.b + ", modeBasedInfoUIState=" + this.c + ", checkBoxUIState=" + this.d + ", endArrow=" + this.e + ", eventHandler=" + this.f + ")";
    }
}
