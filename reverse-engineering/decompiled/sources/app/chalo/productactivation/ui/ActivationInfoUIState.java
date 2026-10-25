package app.chalo.productactivation.ui;

import app.chalo.productactivation.ui.uistate.ActivationPassUIState;
import app.chalo.productactivation.ui.uistate.ActivationTicketUIState;
import app.chalo.productactivation.ui.uistate.DiscountBannerUIState;
import app.chalo.productactivation.ui.uistate.TopBarUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productactivation/ui/ActivationInfoUIState;", "", "TicketActivationInfo", "PassActivationInfo", "Lapp/chalo/productactivation/ui/ActivationInfoUIState$PassActivationInfo;", "Lapp/chalo/productactivation/ui/ActivationInfoUIState$TicketActivationInfo;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ActivationInfoUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopBarUIState f8024a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/ActivationInfoUIState$PassActivationInfo;", "Lapp/chalo/productactivation/ui/ActivationInfoUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassActivationInfo extends ActivationInfoUIState {
        public final TopBarUIState b;
        public final DiscountBannerUIState c;
        public final ActivationPassUIState d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PassActivationInfo(TopBarUIState topBarUIState, DiscountBannerUIState discountBannerUIState, ActivationPassUIState activationPassUIState) {
            super(topBarUIState);
            Intrinsics.i(topBarUIState, "topBarUIState");
            Intrinsics.i(activationPassUIState, "activationPassUIState");
            this.b = topBarUIState;
            this.c = discountBannerUIState;
            this.d = activationPassUIState;
        }

        @Override // app.chalo.productactivation.ui.ActivationInfoUIState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TopBarUIState getF8024a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PassActivationInfo)) {
                return false;
            }
            PassActivationInfo passActivationInfo = (PassActivationInfo) obj;
            return Intrinsics.d(this.b, passActivationInfo.b) && Intrinsics.d(this.c, passActivationInfo.c) && Intrinsics.d(this.d, passActivationInfo.d);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            DiscountBannerUIState discountBannerUIState = this.c;
            return this.d.hashCode() + ((iHashCode + (discountBannerUIState == null ? 0 : discountBannerUIState.hashCode())) * 31);
        }

        public final String toString() {
            return "PassActivationInfo(topBarUIState=" + this.b + ", discountBannerUIState=" + this.c + ", activationPassUIState=" + this.d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/ActivationInfoUIState$TicketActivationInfo;", "Lapp/chalo/productactivation/ui/ActivationInfoUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TicketActivationInfo extends ActivationInfoUIState {
        public final TopBarUIState b;
        public final ActivationTicketUIState c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TicketActivationInfo(TopBarUIState topBarUIState, ActivationTicketUIState activationTicketUIState) {
            super(topBarUIState);
            Intrinsics.i(topBarUIState, "topBarUIState");
            this.b = topBarUIState;
            this.c = activationTicketUIState;
        }

        @Override // app.chalo.productactivation.ui.ActivationInfoUIState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TopBarUIState getF8024a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TicketActivationInfo)) {
                return false;
            }
            TicketActivationInfo ticketActivationInfo = (TicketActivationInfo) obj;
            return Intrinsics.d(this.b, ticketActivationInfo.b) && Intrinsics.d(this.c, ticketActivationInfo.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "TicketActivationInfo(topBarUIState=" + this.b + ", activationTicketUIState=" + this.c + ")";
        }
    }

    public ActivationInfoUIState(TopBarUIState topBarUIState) {
        this.f8024a = topBarUIState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public TopBarUIState getF8024a() {
        return this.f8024a;
    }
}
