package app.chalo.premiumbus.ui.changestop;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/ChangeStopResultScreenUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChangeStopResultScreenUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f7513a;
    public final GifImageUIState b;
    public final ImageUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final ButtonUIState e;
    public final ButtonUIState f;

    public ChangeStopResultScreenUIState(TextUIState.ChaloTextUIState title, GifImageUIState gifImageUIState, ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, ButtonUIState buttonUIState, ButtonUIState buttonUIState2, int i) {
        gifImageUIState = (i & 2) != 0 ? null : gifImageUIState;
        imageUIState = (i & 4) != 0 ? null : imageUIState;
        chaloTextUIState = (i & 8) != 0 ? null : chaloTextUIState;
        buttonUIState = (i & 16) != 0 ? null : buttonUIState;
        buttonUIState2 = (i & 32) != 0 ? null : buttonUIState2;
        Intrinsics.i(title, "title");
        this.f7513a = title;
        this.b = gifImageUIState;
        this.c = imageUIState;
        this.d = chaloTextUIState;
        this.e = buttonUIState;
        this.f = buttonUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeStopResultScreenUIState)) {
            return false;
        }
        ChangeStopResultScreenUIState changeStopResultScreenUIState = (ChangeStopResultScreenUIState) obj;
        return Intrinsics.d(this.f7513a, changeStopResultScreenUIState.f7513a) && Intrinsics.d(this.b, changeStopResultScreenUIState.b) && Intrinsics.d(this.c, changeStopResultScreenUIState.c) && Intrinsics.d(this.d, changeStopResultScreenUIState.d) && Intrinsics.d(this.e, changeStopResultScreenUIState.e) && Intrinsics.d(this.f, changeStopResultScreenUIState.f);
    }

    public final int hashCode() {
        int iHashCode = this.f7513a.hashCode() * 31;
        GifImageUIState gifImageUIState = this.b;
        int iHashCode2 = (iHashCode + (gifImageUIState == null ? 0 : gifImageUIState.hashCode())) * 31;
        ImageUIState imageUIState = this.c;
        int iHashCode3 = (iHashCode2 + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.d;
        int iHashCode4 = (iHashCode3 + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        ButtonUIState buttonUIState = this.e;
        int iHashCode5 = (iHashCode4 + (buttonUIState == null ? 0 : buttonUIState.hashCode())) * 31;
        ButtonUIState buttonUIState2 = this.f;
        return iHashCode5 + (buttonUIState2 != null ? buttonUIState2.hashCode() : 0);
    }

    public final String toString() {
        return "ChangeStopResultScreenUIState(title=" + this.f7513a + ", gif=" + this.b + ", image=" + this.c + ", description=" + this.d + ", positiveActionButton=" + this.e + ", negativeActionButton=" + this.f + ")";
    }
}
