package app.chalo.home.ui.history.uistate.chalobusticket;

import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/chalobusticket/ChaloBusTicketTripDetailsUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusTicketTripDetailsUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloBusTicketTripDetailsSpec f3506a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final ImageUIState d;

    public ChaloBusTicketTripDetailsUiState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        ChaloBusTicketTripDetailsSpec chaloBusTicketTripDetailsSpec = new ChaloBusTicketTripDetailsSpec();
        ImageUIState imageUIState = new ImageUIState(IconType.IC_FROM_TO_BOLD, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
        this.f3506a = chaloBusTicketTripDetailsSpec;
        this.b = chaloTextUIState;
        this.c = chaloTextUIState2;
        this.d = imageUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusTicketTripDetailsUiState)) {
            return false;
        }
        ChaloBusTicketTripDetailsUiState chaloBusTicketTripDetailsUiState = (ChaloBusTicketTripDetailsUiState) obj;
        return Intrinsics.d(this.f3506a, chaloBusTicketTripDetailsUiState.f3506a) && Intrinsics.d(this.b, chaloBusTicketTripDetailsUiState.b) && Intrinsics.d(this.c, chaloBusTicketTripDetailsUiState.c) && Intrinsics.d(this.d, chaloBusTicketTripDetailsUiState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.f(this.c, r30.f(this.b, this.f3506a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ChaloBusTicketTripDetailsUiState(spec=" + this.f3506a + ", fromStop=" + this.b + ", toStop=" + this.c + ", icon=" + this.d + ")";
    }
}
