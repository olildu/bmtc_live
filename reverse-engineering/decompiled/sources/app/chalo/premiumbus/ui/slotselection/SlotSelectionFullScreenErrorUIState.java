package app.chalo.premiumbus.ui.slotselection;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/SlotSelectionFullScreenErrorUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SlotSelectionFullScreenErrorUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f7898a;
    public final TextUIState.ChaloTextUIState b;
    public final ButtonUIState c;
    public final ButtonUIState d;
    public final NoODPairAvailableErrorUISpecs e;

    public SlotSelectionFullScreenErrorUIState(ImageUIState imageUIState, TextUIState.ChaloTextUIState title, ButtonUIState buttonUIState, ButtonUIState buttonUIState2, int i) {
        buttonUIState2 = (i & 8) != 0 ? null : buttonUIState2;
        NoODPairAvailableErrorUISpecs noODPairAvailableErrorUISpecs = new NoODPairAvailableErrorUISpecs();
        Intrinsics.i(title, "title");
        this.f7898a = imageUIState;
        this.b = title;
        this.c = buttonUIState;
        this.d = buttonUIState2;
        this.e = noODPairAvailableErrorUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotSelectionFullScreenErrorUIState)) {
            return false;
        }
        SlotSelectionFullScreenErrorUIState slotSelectionFullScreenErrorUIState = (SlotSelectionFullScreenErrorUIState) obj;
        return Intrinsics.d(this.f7898a, slotSelectionFullScreenErrorUIState.f7898a) && Intrinsics.d(this.b, slotSelectionFullScreenErrorUIState.b) && Intrinsics.d(this.c, slotSelectionFullScreenErrorUIState.c) && Intrinsics.d(this.d, slotSelectionFullScreenErrorUIState.d) && Intrinsics.d(this.e, slotSelectionFullScreenErrorUIState.e);
    }

    public final int hashCode() {
        ImageUIState imageUIState = this.f7898a;
        int iF = r30.f(this.b, (imageUIState == null ? 0 : imageUIState.hashCode()) * 31, 31);
        ButtonUIState buttonUIState = this.c;
        int iHashCode = (iF + (buttonUIState == null ? 0 : buttonUIState.hashCode())) * 31;
        ButtonUIState buttonUIState2 = this.d;
        return this.e.hashCode() + ((iHashCode + (buttonUIState2 != null ? buttonUIState2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = pk0.n("SlotSelectionFullScreenErrorUIState(image=", this.f7898a, ", title=", this.b, ", positiveBtn=");
        sbN.append(this.c);
        sbN.append(", negativeBtn=");
        sbN.append(this.d);
        sbN.append(", specs=");
        sbN.append(this.e);
        sbN.append(")");
        return sbN.toString();
    }
}
