package app.chalo.metro.ui.regular.uistate;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.hq0;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/regular/uistate/PassengerSelectionContainerUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassengerSelectionContainerUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PassengerSelectionUISpec f5547a;
    public final TextUIState.ChaloTextUIState b;
    public final ImageUIState c;
    public final List d;
    public final ButtonUIState e;

    public PassengerSelectionContainerUiState(PassengerSelectionUISpec spec, TextUIState.ChaloTextUIState title, ImageUIState imageUIState, List passengerSelectionList, ButtonUIState buttonUIState) {
        Intrinsics.i(spec, "spec");
        Intrinsics.i(title, "title");
        Intrinsics.i(passengerSelectionList, "passengerSelectionList");
        this.f5547a = spec;
        this.b = title;
        this.c = imageUIState;
        this.d = passengerSelectionList;
        this.e = buttonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassengerSelectionContainerUiState)) {
            return false;
        }
        PassengerSelectionContainerUiState passengerSelectionContainerUiState = (PassengerSelectionContainerUiState) obj;
        return Intrinsics.d(this.f5547a, passengerSelectionContainerUiState.f5547a) && Intrinsics.d(this.b, passengerSelectionContainerUiState.b) && Intrinsics.d(this.c, passengerSelectionContainerUiState.c) && Intrinsics.d(this.d, passengerSelectionContainerUiState.d) && Intrinsics.d(this.e, passengerSelectionContainerUiState.e);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f5547a.hashCode() * 31, 31);
        ImageUIState imageUIState = this.c;
        return this.e.hashCode() + r30.b((iF + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PassengerSelectionContainerUiState(spec=");
        sb.append(this.f5547a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", crossIcon=");
        sb.append(this.c);
        sb.append(", passengerSelectionList=");
        sb.append(this.d);
        sb.append(", ctaButton=");
        return hq0.j(sb, this.e, ")");
    }
}
