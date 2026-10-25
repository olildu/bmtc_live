package app.chalo.premiumbus.ui.slotselection;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.hq0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/NewSlotTimeSuggestionSuccessUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NewSlotTimeSuggestionSuccessUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NewSlotTimeSuggestionSuccessUISpec f7811a = new NewSlotTimeSuggestionSuccessUISpec();
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final ImageUIState d;
    public final ButtonUIState e;

    public NewSlotTimeSuggestionSuccessUIState(ButtonUIState buttonUIState, ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        this.b = chaloTextUIState;
        this.c = chaloTextUIState2;
        this.d = imageUIState;
        this.e = buttonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewSlotTimeSuggestionSuccessUIState)) {
            return false;
        }
        NewSlotTimeSuggestionSuccessUIState newSlotTimeSuggestionSuccessUIState = (NewSlotTimeSuggestionSuccessUIState) obj;
        return Intrinsics.d(this.f7811a, newSlotTimeSuggestionSuccessUIState.f7811a) && Intrinsics.d(this.b, newSlotTimeSuggestionSuccessUIState.b) && Intrinsics.d(this.c, newSlotTimeSuggestionSuccessUIState.c) && Intrinsics.d(this.d, newSlotTimeSuggestionSuccessUIState.d) && Intrinsics.d(this.e, newSlotTimeSuggestionSuccessUIState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + r30.e(this.d, r30.f(this.c, r30.f(this.b, this.f7811a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewSlotTimeSuggestionSuccessUIState(spec=");
        sb.append(this.f7811a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subTitle=");
        sb.append(this.c);
        sb.append(", icon=");
        sb.append(this.d);
        sb.append(", okBtnUIState=");
        return hq0.j(sb, this.e, ")");
    }
}
