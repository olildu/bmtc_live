package app.chalo.multimodalticket.ui;

import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.multimodal.FromAndToStopUIState;
import app.chalo.uistate.radiobutton.RadioButtonUIState;
import app.chalo.uistate.text.SpecialFeaturesTagListUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import defpackage.xs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/FullJourneyTicketCardUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FullJourneyTicketCardUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FullJourneyTicketCardUISpecs f5926a;
    public final SpecialFeaturesTagListUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final ArrayList d;
    public final ImageUIState e;
    public final FromAndToStopUIState f;
    public final RadioButtonUIState g;
    public final UiEventHandler h;

    public FullJourneyTicketCardUIState(FullJourneyTicketCardUISpecs specs, SpecialFeaturesTagListUIState tagListUIState, TextUIState.ChaloTextUIState chaloTextUIState, ArrayList arrayList, ImageUIState imageUIState, FromAndToStopUIState fromAndToStopUIState, RadioButtonUIState radioButtonUIState, UiEventHandler uiEventHandler) {
        Intrinsics.i(specs, "specs");
        Intrinsics.i(tagListUIState, "tagListUIState");
        this.f5926a = specs;
        this.b = tagListUIState;
        this.c = chaloTextUIState;
        this.d = arrayList;
        this.e = imageUIState;
        this.f = fromAndToStopUIState;
        this.g = radioButtonUIState;
        this.h = uiEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FullJourneyTicketCardUIState)) {
            return false;
        }
        FullJourneyTicketCardUIState fullJourneyTicketCardUIState = (FullJourneyTicketCardUIState) obj;
        return Intrinsics.d(this.f5926a, fullJourneyTicketCardUIState.f5926a) && Intrinsics.d(this.b, fullJourneyTicketCardUIState.b) && Intrinsics.d(this.c, fullJourneyTicketCardUIState.c) && this.d.equals(fullJourneyTicketCardUIState.d) && this.e.equals(fullJourneyTicketCardUIState.e) && this.f.equals(fullJourneyTicketCardUIState.f) && Intrinsics.d(this.g, fullJourneyTicketCardUIState.g) && this.h.equals(fullJourneyTicketCardUIState.h);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f5926a.hashCode() * 31)) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.c;
        int iHashCode2 = (this.f.hashCode() + r30.e(this.e, xs.e(this.d, (iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31, 31), 31)) * 31;
        RadioButtonUIState radioButtonUIState = this.g;
        return this.h.hashCode() + ((iHashCode2 + (radioButtonUIState != null ? radioButtonUIState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "FullJourneyTicketCardUIState(specs=" + this.f5926a + ", tagListUIState=" + this.b + ", titleTextUIState=" + this.c + ", modeIconList=" + this.d + ", modeSwitchImgUIState=" + this.e + ", fromAndToStopUIState=" + this.f + ", radioButtonUIState=" + this.g + ", eventHandler=" + this.h + ")";
    }
}
