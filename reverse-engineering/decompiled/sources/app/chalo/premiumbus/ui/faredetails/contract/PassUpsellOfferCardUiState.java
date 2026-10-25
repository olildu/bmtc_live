package app.chalo.premiumbus.ui.faredetails.contract;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PassUpsellOfferCardUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassUpsellOfferCardUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusOfferHeaderStripUiState f7562a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final ImageUrlUIState e;
    public final TextUIState.ChaloTextUIState f;
    public final ButtonUIState g;
    public final PassUpsellOfferCardUISpecs h;

    public PassUpsellOfferCardUiState(PremiumBusOfferHeaderStripUiState headerStrip, TextUIState.ChaloTextUIState nameTextUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, ImageUrlUIState imageUrlUIState, TextUIState.ChaloTextUIState chaloTextUIState3, ButtonUIState actionButtonUIState, PassUpsellOfferCardUISpecs specs) {
        Intrinsics.i(headerStrip, "headerStrip");
        Intrinsics.i(nameTextUIState, "nameTextUIState");
        Intrinsics.i(actionButtonUIState, "actionButtonUIState");
        Intrinsics.i(specs, "specs");
        this.f7562a = headerStrip;
        this.b = nameTextUIState;
        this.c = chaloTextUIState;
        this.d = chaloTextUIState2;
        this.e = imageUrlUIState;
        this.f = chaloTextUIState3;
        this.g = actionButtonUIState;
        this.h = specs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassUpsellOfferCardUiState)) {
            return false;
        }
        PassUpsellOfferCardUiState passUpsellOfferCardUiState = (PassUpsellOfferCardUiState) obj;
        return Intrinsics.d(this.f7562a, passUpsellOfferCardUiState.f7562a) && Intrinsics.d(this.b, passUpsellOfferCardUiState.b) && Intrinsics.d(this.c, passUpsellOfferCardUiState.c) && Intrinsics.d(this.d, passUpsellOfferCardUiState.d) && Intrinsics.d(this.e, passUpsellOfferCardUiState.e) && Intrinsics.d(this.f, passUpsellOfferCardUiState.f) && Intrinsics.d(this.g, passUpsellOfferCardUiState.g) && Intrinsics.d(this.h, passUpsellOfferCardUiState.h);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f7562a.hashCode() * 31, 31);
        TextUIState.ChaloTextUIState chaloTextUIState = this.c;
        int iHashCode = (iF + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState2 = this.d;
        int iHashCode2 = (iHashCode + (chaloTextUIState2 == null ? 0 : chaloTextUIState2.hashCode())) * 31;
        ImageUrlUIState imageUrlUIState = this.e;
        int iHashCode3 = (iHashCode2 + (imageUrlUIState == null ? 0 : imageUrlUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState3 = this.f;
        return this.h.hashCode() + r30.d(this.g, (iHashCode3 + (chaloTextUIState3 != null ? chaloTextUIState3.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PassUpsellOfferCardUiState(headerStrip=");
        sb.append(this.f7562a);
        sb.append(", nameTextUIState=");
        sb.append(this.b);
        sb.append(", fareBeforeTextUIState=");
        r30.p(sb, this.c, ", fareAfterTextUIState=", this.d, ", imageUIState=");
        sb.append(this.e);
        sb.append(", seeMoreDetailsTextUIState=");
        sb.append(this.f);
        sb.append(", actionButtonUIState=");
        sb.append(this.g);
        sb.append(", specs=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
