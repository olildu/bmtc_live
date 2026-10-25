package app.chalo.premiumbus.ui.slotselectionlist;

import app.chalo.premiumbus.ui.slotselection.ExpressSlotIndicatorUIState;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.radiobutton.RadioButtonUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselectionlist/SlotCardUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SlotCardUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RadioButtonUIState f7922a;
    public final TextUIState.ChaloTextUIState b;
    public final ExpressSlotIndicatorUIState c;
    public final UiEventHandler d;
    public final SlotCardUISpecs e;

    public SlotCardUIState(RadioButtonUIState radioButtonUIState, TextUIState.ChaloTextUIState slotScheduledTime, ExpressSlotIndicatorUIState expressSlotIndicatorUIState, UiEventHandler uiEventHandler, SlotCardUISpecs slotCardUISpecs) {
        Intrinsics.i(slotScheduledTime, "slotScheduledTime");
        this.f7922a = radioButtonUIState;
        this.b = slotScheduledTime;
        this.c = expressSlotIndicatorUIState;
        this.d = uiEventHandler;
        this.e = slotCardUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotCardUIState)) {
            return false;
        }
        SlotCardUIState slotCardUIState = (SlotCardUIState) obj;
        return Intrinsics.d(this.f7922a, slotCardUIState.f7922a) && Intrinsics.d(this.b, slotCardUIState.b) && Intrinsics.d(this.c, slotCardUIState.c) && Intrinsics.d(this.d, slotCardUIState.d) && Intrinsics.d(this.e, slotCardUIState.e);
    }

    public final int hashCode() {
        RadioButtonUIState radioButtonUIState = this.f7922a;
        int iF = r30.f(this.b, (radioButtonUIState == null ? 0 : radioButtonUIState.hashCode()) * 31, 31);
        ExpressSlotIndicatorUIState expressSlotIndicatorUIState = this.c;
        int iHashCode = (iF + (expressSlotIndicatorUIState == null ? 0 : expressSlotIndicatorUIState.hashCode())) * 31;
        UiEventHandler uiEventHandler = this.d;
        return this.e.hashCode() + ((iHashCode + (uiEventHandler != null ? uiEventHandler.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SlotCardUIState(selectionRadioBtnUIState=" + this.f7922a + ", slotScheduledTime=" + this.b + ", expressSlotIndicatorUIState=" + this.c + ", uiEventHandler=" + this.d + ", specs=" + this.e + ")";
    }
}
