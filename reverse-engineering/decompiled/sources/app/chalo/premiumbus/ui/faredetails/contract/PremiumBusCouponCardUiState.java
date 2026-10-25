package app.chalo.premiumbus.ui.faredetails.contract;

import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusCouponCardUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusCouponCardUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f7564a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final ImageUIState d;
    public final PremiumBusCouponCardUISpecs e;

    public PremiumBusCouponCardUiState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, ImageUIState imageUIState2) {
        PremiumBusCouponCardUISpecs premiumBusCouponCardUISpecs = new PremiumBusCouponCardUISpecs();
        this.f7564a = imageUIState;
        this.b = chaloTextUIState;
        this.c = chaloTextUIState2;
        this.d = imageUIState2;
        this.e = premiumBusCouponCardUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusCouponCardUiState)) {
            return false;
        }
        PremiumBusCouponCardUiState premiumBusCouponCardUiState = (PremiumBusCouponCardUiState) obj;
        return Intrinsics.d(this.f7564a, premiumBusCouponCardUiState.f7564a) && Intrinsics.d(this.b, premiumBusCouponCardUiState.b) && Intrinsics.d(this.c, premiumBusCouponCardUiState.c) && Intrinsics.d(this.d, premiumBusCouponCardUiState.d) && Intrinsics.d(this.e, premiumBusCouponCardUiState.e);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f7564a.hashCode() * 31, 31);
        TextUIState.ChaloTextUIState chaloTextUIState = this.c;
        return this.e.hashCode() + r30.e(this.d, (iF + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbN = pk0.n("PremiumBusCouponCardUiState(offerIconUIState=", this.f7564a, ", couponNameTextUIState=", this.b, ", couponOfferCopyTextUIState=");
        sbN.append(this.c);
        sbN.append(", infoIconUIState=");
        sbN.append(this.d);
        sbN.append(", specs=");
        sbN.append(this.e);
        sbN.append(")");
        return sbN.toString();
    }
}
