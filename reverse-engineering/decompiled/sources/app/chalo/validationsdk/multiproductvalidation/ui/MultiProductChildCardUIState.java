package app.chalo.validationsdk.multiproductvalidation.ui;

import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.multimodal.StepTicketModeBasedInfoUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductChildCardUIState;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MultiProductChildCardUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState f10687a;
    public final StepTicketModeBasedInfoUIState b;
    public final ValidationTicketStatusUIState c;
    public final TextWithLeftAndRightIconUIState d;
    public final MultiChildQRCard e;
    public final UiEventHandler f;
    public final UiEventHandler g;
    public final TextWithLeftAndRightIconUIState h;
    public final MultiProductChildCardUISpec i;

    public MultiProductChildCardUIState(TextUIState.ChaloTextUIState stepLabel, StepTicketModeBasedInfoUIState stepTicketModeBasedInfoUIState, ValidationTicketStatusUIState validationTicketStatusUIState, TextWithLeftAndRightIconUIState expandTicket, MultiChildQRCard multiChildQRCard, UiEventHandler cardClickEventHandler, UiEventHandler viewReceiptEventHandler, TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState, MultiProductChildCardUISpec multiProductChildCardUISpec) {
        Intrinsics.i(stepLabel, "stepLabel");
        Intrinsics.i(expandTicket, "expandTicket");
        Intrinsics.i(cardClickEventHandler, "cardClickEventHandler");
        Intrinsics.i(viewReceiptEventHandler, "viewReceiptEventHandler");
        this.f10687a = stepLabel;
        this.b = stepTicketModeBasedInfoUIState;
        this.c = validationTicketStatusUIState;
        this.d = expandTicket;
        this.e = multiChildQRCard;
        this.f = cardClickEventHandler;
        this.g = viewReceiptEventHandler;
        this.h = textWithLeftAndRightIconUIState;
        this.i = multiProductChildCardUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiProductChildCardUIState)) {
            return false;
        }
        MultiProductChildCardUIState multiProductChildCardUIState = (MultiProductChildCardUIState) obj;
        return Intrinsics.d(this.f10687a, multiProductChildCardUIState.f10687a) && Intrinsics.d(this.b, multiProductChildCardUIState.b) && Intrinsics.d(this.c, multiProductChildCardUIState.c) && Intrinsics.d(this.d, multiProductChildCardUIState.d) && Intrinsics.d(this.e, multiProductChildCardUIState.e) && Intrinsics.d(this.f, multiProductChildCardUIState.f) && Intrinsics.d(this.g, multiProductChildCardUIState.g) && Intrinsics.d(this.h, multiProductChildCardUIState.h) && Intrinsics.d(this.i, multiProductChildCardUIState.i);
    }

    public final int hashCode() {
        int iHashCode = this.f10687a.hashCode() * 31;
        StepTicketModeBasedInfoUIState stepTicketModeBasedInfoUIState = this.b;
        int iHashCode2 = (iHashCode + (stepTicketModeBasedInfoUIState == null ? 0 : stepTicketModeBasedInfoUIState.hashCode())) * 31;
        ValidationTicketStatusUIState validationTicketStatusUIState = this.c;
        int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (validationTicketStatusUIState == null ? 0 : validationTicketStatusUIState.hashCode())) * 31)) * 31;
        MultiChildQRCard multiChildQRCard = this.e;
        int iHashCode4 = (this.g.hashCode() + ((this.f.hashCode() + ((iHashCode3 + (multiChildQRCard == null ? 0 : multiChildQRCard.hashCode())) * 31)) * 31)) * 31;
        TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState = this.h;
        return this.i.hashCode() + ((iHashCode4 + (textWithLeftAndRightIconUIState != null ? textWithLeftAndRightIconUIState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MultiProductChildCardUIState(stepLabel=" + this.f10687a + ", routeAndStopDetails=" + this.b + ", status=" + this.c + ", expandTicket=" + this.d + ", qrContent=" + this.e + ", cardClickEventHandler=" + this.f + ", viewReceiptEventHandler=" + this.g + ", viewReceipt=" + this.h + ", spec=" + this.i + ")";
    }
}
