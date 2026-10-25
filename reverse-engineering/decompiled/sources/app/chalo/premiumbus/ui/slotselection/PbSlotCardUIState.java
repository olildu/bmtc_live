package app.chalo.premiumbus.ui.slotselection;

import androidx.core.app.FrameMetricsAggregator;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.radiobutton.RadioButtonUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PbSlotCardUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PbSlotCardUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PbSlotCardUISpecs f7835a;
    public final RadioButtonUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final SlotDelayTextUIState d;
    public final TextUIState.ChaloTextUIState e;
    public final TextUIState.ChaloTextUIState f;
    public final ExpressSlotIndicatorUIState g;
    public final OfferTagUIState h;
    public final UiEventHandler i;

    public PbSlotCardUIState(PbSlotCardUISpecs specs, RadioButtonUIState radioButtonUIState, TextUIState.ChaloTextUIState slotScheduledTime, SlotDelayTextUIState slotDelayTextUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState slotReachTime, ExpressSlotIndicatorUIState expressSlotIndicatorUIState, OfferTagUIState offerTagUIState, UiEventHandler uiEventHandler) {
        Intrinsics.i(specs, "specs");
        Intrinsics.i(slotScheduledTime, "slotScheduledTime");
        Intrinsics.i(slotReachTime, "slotReachTime");
        this.f7835a = specs;
        this.b = radioButtonUIState;
        this.c = slotScheduledTime;
        this.d = slotDelayTextUIState;
        this.e = chaloTextUIState;
        this.f = slotReachTime;
        this.g = expressSlotIndicatorUIState;
        this.h = offerTagUIState;
        this.i = uiEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PbSlotCardUIState)) {
            return false;
        }
        PbSlotCardUIState pbSlotCardUIState = (PbSlotCardUIState) obj;
        return Intrinsics.d(this.f7835a, pbSlotCardUIState.f7835a) && Intrinsics.d(this.b, pbSlotCardUIState.b) && Intrinsics.d(this.c, pbSlotCardUIState.c) && Intrinsics.d(this.d, pbSlotCardUIState.d) && Intrinsics.d(this.e, pbSlotCardUIState.e) && Intrinsics.d(this.f, pbSlotCardUIState.f) && Intrinsics.d(this.g, pbSlotCardUIState.g) && Intrinsics.d(this.h, pbSlotCardUIState.h) && Intrinsics.d(this.i, pbSlotCardUIState.i);
    }

    public final int hashCode() {
        int iHashCode = this.f7835a.hashCode() * 31;
        RadioButtonUIState radioButtonUIState = this.b;
        int iF = r30.f(this.c, (iHashCode + (radioButtonUIState == null ? 0 : radioButtonUIState.hashCode())) * 31, 31);
        SlotDelayTextUIState slotDelayTextUIState = this.d;
        int iHashCode2 = (iF + (slotDelayTextUIState == null ? 0 : slotDelayTextUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.e;
        int iF2 = r30.f(this.f, (iHashCode2 + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31, 31);
        ExpressSlotIndicatorUIState expressSlotIndicatorUIState = this.g;
        int iHashCode3 = (iF2 + (expressSlotIndicatorUIState == null ? 0 : expressSlotIndicatorUIState.hashCode())) * 31;
        OfferTagUIState offerTagUIState = this.h;
        int iHashCode4 = (iHashCode3 + (offerTagUIState == null ? 0 : offerTagUIState.hashCode())) * 31;
        UiEventHandler uiEventHandler = this.i;
        return iHashCode4 + (uiEventHandler != null ? uiEventHandler.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PbSlotCardUIState(specs=");
        sb.append(this.f7835a);
        sb.append(", selectionRadioBtnUIState=");
        sb.append(this.b);
        sb.append(", slotScheduledTime=");
        sb.append(this.c);
        sb.append(", slotDelay=");
        sb.append(this.d);
        sb.append(", slotStatus=");
        r30.p(sb, this.e, ", slotReachTime=", this.f, ", expressSlotIndicatorUIState=");
        sb.append(this.g);
        sb.append(", offerTagUIState=");
        sb.append(this.h);
        sb.append(", uiEventHandler=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ PbSlotCardUIState(PbSlotCardUISpecs pbSlotCardUISpecs, RadioButtonUIState radioButtonUIState, TextUIState.ChaloTextUIState chaloTextUIState, SlotDelayTextUIState slotDelayTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, TextUIState.ChaloTextUIState chaloTextUIState3, ExpressSlotIndicatorUIState expressSlotIndicatorUIState, UiEventHandler uiEventHandler, int i) {
        this((i & 1) != 0 ? new PbSlotCardUISpecs(null, 0.0f, null, FrameMetricsAggregator.EVERY_DURATION) : pbSlotCardUISpecs, (i & 2) != 0 ? null : radioButtonUIState, chaloTextUIState, slotDelayTextUIState, chaloTextUIState2, chaloTextUIState3, expressSlotIndicatorUIState, (OfferTagUIState) null, (i & 256) != 0 ? null : uiEventHandler);
    }
}
