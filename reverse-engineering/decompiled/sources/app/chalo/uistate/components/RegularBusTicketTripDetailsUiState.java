package app.chalo.uistate.components;

import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/components/RegularBusTicketTripDetailsUiState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RegularBusTicketTripDetailsUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RegularBusTicketTripDetailsSpec f9952a;
    public final TicketRouteNameUiState b;
    public final List c;
    public final TextUIState.ChaloTextUIState d;
    public final TextUIState.ChaloTextUIState e;
    public final ImageUIState f;
    public final TextUIState.ChaloTextUIState g;

    public RegularBusTicketTripDetailsUiState(RegularBusTicketTripDetailsSpec regularBusTicketTripDetailsSpec, TicketRouteNameUiState ticketRouteNameUiState, List list, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, TextUIState.ChaloTextUIState chaloTextUIState3, int i) {
        regularBusTicketTripDetailsSpec = (i & 1) != 0 ? new RegularBusTicketTripDetailsSpec() : regularBusTicketTripDetailsSpec;
        ticketRouteNameUiState = (i & 2) != 0 ? null : ticketRouteNameUiState;
        List transportModeIcons = (i & 4) != 0 ? EmptyList.f17557a : list;
        ImageUIState imageUIState = new ImageUIState(IconType.IC_FROM_TO_BOLD, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
        TextUIState.ChaloTextUIState chaloTextUIState4 = (i & 64) == 0 ? chaloTextUIState3 : null;
        Intrinsics.i(transportModeIcons, "transportModeIcons");
        this.f9952a = regularBusTicketTripDetailsSpec;
        this.b = ticketRouteNameUiState;
        this.c = transportModeIcons;
        this.d = chaloTextUIState;
        this.e = chaloTextUIState2;
        this.f = imageUIState;
        this.g = chaloTextUIState4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegularBusTicketTripDetailsUiState)) {
            return false;
        }
        RegularBusTicketTripDetailsUiState regularBusTicketTripDetailsUiState = (RegularBusTicketTripDetailsUiState) obj;
        return Intrinsics.d(this.f9952a, regularBusTicketTripDetailsUiState.f9952a) && Intrinsics.d(this.b, regularBusTicketTripDetailsUiState.b) && Intrinsics.d(this.c, regularBusTicketTripDetailsUiState.c) && Intrinsics.d(this.d, regularBusTicketTripDetailsUiState.d) && Intrinsics.d(this.e, regularBusTicketTripDetailsUiState.e) && Intrinsics.d(this.f, regularBusTicketTripDetailsUiState.f) && Intrinsics.d(this.g, regularBusTicketTripDetailsUiState.g);
    }

    public final int hashCode() {
        int iHashCode = this.f9952a.hashCode() * 31;
        TicketRouteNameUiState ticketRouteNameUiState = this.b;
        int iB = r30.b((iHashCode + (ticketRouteNameUiState == null ? 0 : ticketRouteNameUiState.hashCode())) * 31, 31, this.c);
        TextUIState.ChaloTextUIState chaloTextUIState = this.d;
        int iHashCode2 = (iB + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState2 = this.e;
        int iE = r30.e(this.f, (iHashCode2 + (chaloTextUIState2 == null ? 0 : chaloTextUIState2.hashCode())) * 31, 31);
        TextUIState.ChaloTextUIState chaloTextUIState3 = this.g;
        return iE + (chaloTextUIState3 != null ? chaloTextUIState3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegularBusTicketTripDetailsUiState(spec=");
        sb.append(this.f9952a);
        sb.append(", routeName=");
        sb.append(this.b);
        sb.append(", transportModeIcons=");
        sb.append(this.c);
        sb.append(", fromStop=");
        sb.append(this.d);
        sb.append(", toStop=");
        sb.append(this.e);
        sb.append(", image=");
        sb.append(this.f);
        sb.append(", routeViaText=");
        return py.f(sb, this.g, ")");
    }
}
