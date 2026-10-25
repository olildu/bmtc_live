package app.chalo.productactivation.ui.uistate;

import app.chalo.uistate.text.TextUIState;
import defpackage.n21;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/UpsellRideSectionUIState;", "", "Booked", "BookedUnconfirmed", "Lapp/chalo/productactivation/ui/uistate/UpsellRideSectionUIState$Booked;", "Lapp/chalo/productactivation/ui/uistate/UpsellRideSectionUIState$BookedUnconfirmed;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class UpsellRideSectionUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/UpsellRideSectionUIState$Booked;", "Lapp/chalo/productactivation/ui/uistate/UpsellRideSectionUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Booked extends UpsellRideSectionUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState.ChaloTextUIState f8083a;
        public final ActivationTicketRouteDetailsUIState b;
        public final TextUIState.ChaloTextUIState c;
        public final TextUIState.ChaloTextUIState d;
        public final ActivationPassFooterUIState e;
        public final UpsellRideSectionUISpecs f;

        public Booked(TextUIState.ChaloTextUIState titleTextUIState, ActivationTicketRouteDetailsUIState routeDetailsUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, ActivationPassFooterUIState activationPassFooterUIState) {
            UpsellRideSectionUISpecs upsellRideSectionUISpecs = new UpsellRideSectionUISpecs();
            Intrinsics.i(titleTextUIState, "titleTextUIState");
            Intrinsics.i(routeDetailsUIState, "routeDetailsUIState");
            this.f8083a = titleTextUIState;
            this.b = routeDetailsUIState;
            this.c = chaloTextUIState;
            this.d = chaloTextUIState2;
            this.e = activationPassFooterUIState;
            this.f = upsellRideSectionUISpecs;
        }

        @Override // app.chalo.productactivation.ui.uistate.UpsellRideSectionUIState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivationPassFooterUIState getC() {
            return this.e;
        }

        @Override // app.chalo.productactivation.ui.uistate.UpsellRideSectionUIState
        /* JADX INFO: renamed from: b, reason: from getter */
        public final UpsellRideSectionUISpecs getD() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Booked)) {
                return false;
            }
            Booked booked = (Booked) obj;
            return Intrinsics.d(this.f8083a, booked.f8083a) && Intrinsics.d(this.b, booked.b) && Intrinsics.d(this.c, booked.c) && Intrinsics.d(this.d, booked.d) && Intrinsics.d(this.e, booked.e) && Intrinsics.d(this.f, booked.f);
        }

        public final int hashCode() {
            int iF = r30.f(this.d, r30.f(this.c, (this.b.hashCode() + (this.f8083a.hashCode() * 31)) * 31, 31), 31);
            ActivationPassFooterUIState activationPassFooterUIState = this.e;
            return this.f.hashCode() + ((iF + (activationPassFooterUIState == null ? 0 : activationPassFooterUIState.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Booked(titleTextUIState=");
            sb.append(this.f8083a);
            sb.append(", routeDetailsUIState=");
            sb.append(this.b);
            sb.append(", pickupLabelTextUIState=");
            r30.p(sb, this.c, ", pickupTimeTextUIState=", this.d, ", footerUIState=");
            sb.append(this.e);
            sb.append(", specs=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/UpsellRideSectionUIState$BookedUnconfirmed;", "Lapp/chalo/productactivation/ui/uistate/UpsellRideSectionUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BookedUnconfirmed extends UpsellRideSectionUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState.ChaloTextUIState f8084a;
        public final TextUIState.ChaloTextUIState b;
        public final ActivationPassFooterUIState c;
        public final UpsellRideSectionUISpecs d;

        public BookedUnconfirmed(TextUIState.ChaloTextUIState titleTextUIState, TextUIState.ChaloTextUIState chaloTextUIState, ActivationPassFooterUIState activationPassFooterUIState) {
            UpsellRideSectionUISpecs upsellRideSectionUISpecs = new UpsellRideSectionUISpecs();
            Intrinsics.i(titleTextUIState, "titleTextUIState");
            this.f8084a = titleTextUIState;
            this.b = chaloTextUIState;
            this.c = activationPassFooterUIState;
            this.d = upsellRideSectionUISpecs;
        }

        @Override // app.chalo.productactivation.ui.uistate.UpsellRideSectionUIState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivationPassFooterUIState getC() {
            return this.c;
        }

        @Override // app.chalo.productactivation.ui.uistate.UpsellRideSectionUIState
        /* JADX INFO: renamed from: b, reason: from getter */
        public final UpsellRideSectionUISpecs getD() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BookedUnconfirmed)) {
                return false;
            }
            BookedUnconfirmed bookedUnconfirmed = (BookedUnconfirmed) obj;
            return Intrinsics.d(this.f8084a, bookedUnconfirmed.f8084a) && Intrinsics.d(this.b, bookedUnconfirmed.b) && Intrinsics.d(this.c, bookedUnconfirmed.c) && Intrinsics.d(this.d, bookedUnconfirmed.d);
        }

        public final int hashCode() {
            int iF = r30.f(this.b, this.f8084a.hashCode() * 31, 31);
            ActivationPassFooterUIState activationPassFooterUIState = this.c;
            return this.d.hashCode() + ((iF + (activationPassFooterUIState == null ? 0 : activationPassFooterUIState.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbJ = n21.j("BookedUnconfirmed(titleTextUIState=", this.f8084a, ", messageTextUIState=", this.b, ", footerUIState=");
            sbJ.append(this.c);
            sbJ.append(", specs=");
            sbJ.append(this.d);
            sbJ.append(")");
            return sbJ.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract ActivationPassFooterUIState getC();

    /* JADX INFO: renamed from: b */
    public abstract UpsellRideSectionUISpecs getD();
}
