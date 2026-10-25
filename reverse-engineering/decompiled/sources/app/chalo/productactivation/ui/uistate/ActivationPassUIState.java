package app.chalo.productactivation.ui.uistate;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.card.CardUISpec;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.TicketCardContentSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/ActivationPassUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ActivationPassUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardUISpec f8056a;
    public final TicketCardContentSpec b;
    public final ActivationPassContainerUIState c;
    public final BannerDetailsUIState d;
    public final ActivationPassFooterUIState e;

    public ActivationPassUIState(ActivationPassContainerUIState passContainerUIState, BannerDetailsUIState bannerDetailsUIState, ActivationPassFooterUIState activationPassFooterUIState) {
        CardUISpec cardUISpec = new CardUISpec(null, 0.0f, 0.0f, 7);
        float f = ChaloThemeHelper.a().g;
        TicketCardContentSpec ticketCardContentSpec = new TicketCardContentSpec(new ChaloPadding(f, f, f, f), 2);
        Intrinsics.i(passContainerUIState, "passContainerUIState");
        this.f8056a = cardUISpec;
        this.b = ticketCardContentSpec;
        this.c = passContainerUIState;
        this.d = bannerDetailsUIState;
        this.e = activationPassFooterUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivationPassUIState)) {
            return false;
        }
        ActivationPassUIState activationPassUIState = (ActivationPassUIState) obj;
        return Intrinsics.d(this.f8056a, activationPassUIState.f8056a) && Intrinsics.d(this.b, activationPassUIState.b) && Intrinsics.d(this.c, activationPassUIState.c) && Intrinsics.d(this.d, activationPassUIState.d) && Intrinsics.d(this.e, activationPassUIState.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f8056a.hashCode() * 31)) * 31)) * 31;
        BannerDetailsUIState bannerDetailsUIState = this.d;
        int iHashCode2 = (iHashCode + (bannerDetailsUIState == null ? 0 : bannerDetailsUIState.hashCode())) * 31;
        ActivationPassFooterUIState activationPassFooterUIState = this.e;
        return iHashCode2 + (activationPassFooterUIState != null ? activationPassFooterUIState.hashCode() : 0);
    }

    public final String toString() {
        return "ActivationPassUIState(cardSpec=" + this.f8056a + ", contentSpec=" + this.b + ", passContainerUIState=" + this.c + ", bannerDetailsUIState=" + this.d + ", passFooterUIState=" + this.e + ")";
    }
}
