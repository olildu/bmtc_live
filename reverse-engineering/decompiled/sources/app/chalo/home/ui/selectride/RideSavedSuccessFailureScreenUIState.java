package app.chalo.home.ui.selectride;

import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.hq0;
import defpackage.n21;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/selectride/RideSavedSuccessFailureScreenUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RideSavedSuccessFailureScreenUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f3697a;
    public final TextUIState.ChaloTextUIState b;
    public final LottieType c;
    public final ButtonUIState d;
    public final ButtonUIState e;

    public RideSavedSuccessFailureScreenUIState(TextUIState.ChaloTextUIState title, TextUIState.ChaloTextUIState chaloTextUIState, LottieType gif, ButtonUIState positiveBtn, ButtonUIState buttonUIState) {
        Intrinsics.i(title, "title");
        Intrinsics.i(gif, "gif");
        Intrinsics.i(positiveBtn, "positiveBtn");
        this.f3697a = title;
        this.b = chaloTextUIState;
        this.c = gif;
        this.d = positiveBtn;
        this.e = buttonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideSavedSuccessFailureScreenUIState)) {
            return false;
        }
        RideSavedSuccessFailureScreenUIState rideSavedSuccessFailureScreenUIState = (RideSavedSuccessFailureScreenUIState) obj;
        return Intrinsics.d(this.f3697a, rideSavedSuccessFailureScreenUIState.f3697a) && Intrinsics.d(this.b, rideSavedSuccessFailureScreenUIState.b) && this.c == rideSavedSuccessFailureScreenUIState.c && Intrinsics.d(this.d, rideSavedSuccessFailureScreenUIState.d) && Intrinsics.d(this.e, rideSavedSuccessFailureScreenUIState.e);
    }

    public final int hashCode() {
        int iHashCode = this.f3697a.hashCode() * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.b;
        int iD = r30.d(this.d, (this.c.hashCode() + ((iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31)) * 31, 31);
        ButtonUIState buttonUIState = this.e;
        return iD + (buttonUIState != null ? buttonUIState.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbJ = n21.j("RideSavedSuccessFailureScreenUIState(title=", this.f3697a, ", subTitle=", this.b, ", gif=");
        sbJ.append(this.c);
        sbJ.append(", positiveBtn=");
        sbJ.append(this.d);
        sbJ.append(", negativeBtn=");
        return hq0.j(sbJ, this.e, ")");
    }
}
