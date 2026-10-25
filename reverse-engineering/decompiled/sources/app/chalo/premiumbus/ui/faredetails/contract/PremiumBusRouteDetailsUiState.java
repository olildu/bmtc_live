package app.chalo.premiumbus.ui.faredetails.contract;

import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusRouteDetailsUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusRouteDetailsUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f7630a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final PremiumBusRouteDetailsUISpecs d;

    public PremiumBusRouteDetailsUiState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        PremiumBusRouteDetailsUISpecs premiumBusRouteDetailsUISpecs = new PremiumBusRouteDetailsUISpecs();
        this.f7630a = imageUIState;
        this.b = chaloTextUIState;
        this.c = chaloTextUIState2;
        this.d = premiumBusRouteDetailsUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusRouteDetailsUiState)) {
            return false;
        }
        PremiumBusRouteDetailsUiState premiumBusRouteDetailsUiState = (PremiumBusRouteDetailsUiState) obj;
        return Intrinsics.d(this.f7630a, premiumBusRouteDetailsUiState.f7630a) && Intrinsics.d(this.b, premiumBusRouteDetailsUiState.b) && Intrinsics.d(this.c, premiumBusRouteDetailsUiState.c) && Intrinsics.d(this.d, premiumBusRouteDetailsUiState.d);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f7630a.hashCode() * 31, 31);
        TextUIState.ChaloTextUIState chaloTextUIState = this.c;
        return this.d.hashCode() + ((iF + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 961);
    }

    public final String toString() {
        StringBuilder sbN = pk0.n("PremiumBusRouteDetailsUiState(routeIconUIState=", this.f7630a, ", routeNameTextUIState=", this.b, ", routeSubtitleTextUIState=");
        sbN.append(this.c);
        sbN.append(", specialFeatureTags=null, specs=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
