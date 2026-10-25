package app.chalo.productactivation.data;

import app.chalo.instantticket.data.model.app.InstantTicketAppModel;
import app.chalo.metro.data.app.MetroTicketAppModel;
import app.chalo.models.mticketing.MTicket;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel;
import app.chalo.ondc.model.app.OndcMetroTicketAppModel;
import app.chalo.ondc.model.app.OndcTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.superpass.data.models.entities.MagicSuperPass;
import app.chalo.superpass.data.models.entities.RideBasedSuperPass;
import app.chalo.superpass.data.models.entities.SuperPass;
import app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayAppModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lapp/chalo/productactivation/data/ActivationProductData;", "", "PassActivation", "InstantTicketActivation", "QuickPayActivation", "MobileTicketActivation", "PremiumTicketActivation", "ONDCTicketActivation", "ONDCMetroTicketActivation", "MetroTicketActivation", "MultiModalGroupTicketActivation", "Lapp/chalo/productactivation/data/ActivationProductData$InstantTicketActivation;", "Lapp/chalo/productactivation/data/ActivationProductData$MetroTicketActivation;", "Lapp/chalo/productactivation/data/ActivationProductData$MobileTicketActivation;", "Lapp/chalo/productactivation/data/ActivationProductData$MultiModalGroupTicketActivation;", "Lapp/chalo/productactivation/data/ActivationProductData$ONDCMetroTicketActivation;", "Lapp/chalo/productactivation/data/ActivationProductData$ONDCTicketActivation;", "Lapp/chalo/productactivation/data/ActivationProductData$PassActivation;", "Lapp/chalo/productactivation/data/ActivationProductData$PremiumTicketActivation;", "Lapp/chalo/productactivation/data/ActivationProductData$QuickPayActivation;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ActivationProductData {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/data/ActivationProductData$InstantTicketActivation;", "Lapp/chalo/productactivation/data/ActivationProductData;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InstantTicketActivation extends ActivationProductData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InstantTicketAppModel f7993a;

        public InstantTicketActivation(InstantTicketAppModel instantTicketAppModel) {
            this.f7993a = instantTicketAppModel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InstantTicketAppModel getF7993a() {
            return this.f7993a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InstantTicketActivation) && Intrinsics.d(this.f7993a, ((InstantTicketActivation) obj).f7993a);
        }

        public final int hashCode() {
            return this.f7993a.hashCode();
        }

        public final String toString() {
            return "InstantTicketActivation(instant=" + this.f7993a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/data/ActivationProductData$MetroTicketActivation;", "Lapp/chalo/productactivation/data/ActivationProductData;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MetroTicketActivation extends ActivationProductData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MetroTicketAppModel f7994a;

        public MetroTicketActivation(MetroTicketAppModel metroTicketAppModel) {
            Intrinsics.i(metroTicketAppModel, "metroTicketAppModel");
            this.f7994a = metroTicketAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MetroTicketActivation) && Intrinsics.d(this.f7994a, ((MetroTicketActivation) obj).f7994a);
        }

        public final int hashCode() {
            return this.f7994a.hashCode();
        }

        public final String toString() {
            return "MetroTicketActivation(metroTicketAppModel=" + this.f7994a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/data/ActivationProductData$MobileTicketActivation;", "Lapp/chalo/productactivation/data/ActivationProductData;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MobileTicketActivation extends ActivationProductData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MTicket f7995a;

        public MobileTicketActivation(MTicket mTicket) {
            this.f7995a = mTicket;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MobileTicketActivation) && Intrinsics.d(this.f7995a, ((MobileTicketActivation) obj).f7995a);
        }

        public final int hashCode() {
            return this.f7995a.hashCode();
        }

        public final String toString() {
            return "MobileTicketActivation(ticket=" + this.f7995a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/data/ActivationProductData$MultiModalGroupTicketActivation;", "Lapp/chalo/productactivation/data/ActivationProductData;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MultiModalGroupTicketActivation extends ActivationProductData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MultiModalGroupTicketAppModel f7996a;

        public MultiModalGroupTicketActivation(MultiModalGroupTicketAppModel multiModalGroupTicketAppModel) {
            Intrinsics.i(multiModalGroupTicketAppModel, "multiModalGroupTicketAppModel");
            this.f7996a = multiModalGroupTicketAppModel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final MultiModalGroupTicketAppModel getF7996a() {
            return this.f7996a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MultiModalGroupTicketActivation) && Intrinsics.d(this.f7996a, ((MultiModalGroupTicketActivation) obj).f7996a);
        }

        public final int hashCode() {
            return this.f7996a.hashCode();
        }

        public final String toString() {
            return "MultiModalGroupTicketActivation(multiModalGroupTicketAppModel=" + this.f7996a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/data/ActivationProductData$ONDCMetroTicketActivation;", "Lapp/chalo/productactivation/data/ActivationProductData;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ONDCMetroTicketActivation extends ActivationProductData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OndcMetroTicketAppModel f7997a;

        public ONDCMetroTicketActivation(OndcMetroTicketAppModel ondcMetroTicketAppModel) {
            Intrinsics.i(ondcMetroTicketAppModel, "ondcMetroTicketAppModel");
            this.f7997a = ondcMetroTicketAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ONDCMetroTicketActivation) && Intrinsics.d(this.f7997a, ((ONDCMetroTicketActivation) obj).f7997a);
        }

        public final int hashCode() {
            return this.f7997a.hashCode();
        }

        public final String toString() {
            return "ONDCMetroTicketActivation(ondcMetroTicketAppModel=" + this.f7997a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/data/ActivationProductData$ONDCTicketActivation;", "Lapp/chalo/productactivation/data/ActivationProductData;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ONDCTicketActivation extends ActivationProductData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OndcTicketAppModel f7998a;

        public ONDCTicketActivation(OndcTicketAppModel ondcTicketAppModel) {
            Intrinsics.i(ondcTicketAppModel, "ondcTicketAppModel");
            this.f7998a = ondcTicketAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ONDCTicketActivation) && Intrinsics.d(this.f7998a, ((ONDCTicketActivation) obj).f7998a);
        }

        public final int hashCode() {
            return this.f7998a.hashCode();
        }

        public final String toString() {
            return "ONDCTicketActivation(ondcTicketAppModel=" + this.f7998a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productactivation/data/ActivationProductData$PassActivation;", "Lapp/chalo/productactivation/data/ActivationProductData;", "RideBased", "Magic", "Lapp/chalo/productactivation/data/ActivationProductData$PassActivation$Magic;", "Lapp/chalo/productactivation/data/ActivationProductData$PassActivation$RideBased;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class PassActivation extends ActivationProductData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SuperPass f7999a;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/data/ActivationProductData$PassActivation$Magic;", "Lapp/chalo/productactivation/data/ActivationProductData$PassActivation;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Magic extends PassActivation {
            public final MagicSuperPass b;
            public final boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Magic(MagicSuperPass magicPass, boolean z) {
                super(magicPass);
                Intrinsics.i(magicPass, "magicPass");
                this.b = magicPass;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Magic)) {
                    return false;
                }
                Magic magic = (Magic) obj;
                return Intrinsics.d(this.b, magic.b) && this.c == magic.c;
            }

            public final int hashCode() {
                return (this.b.hashCode() * 31) + (this.c ? 1231 : 1237);
            }

            public final String toString() {
                return "Magic(magicPass=" + this.b + ", isBulkBookingPass=" + this.c + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/data/ActivationProductData$PassActivation$RideBased;", "Lapp/chalo/productactivation/data/ActivationProductData$PassActivation;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RideBased extends PassActivation {
            public final RideBasedSuperPass b;
            public final boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RideBased(RideBasedSuperPass rideBasedPass, boolean z) {
                super(rideBasedPass);
                Intrinsics.i(rideBasedPass, "rideBasedPass");
                this.b = rideBasedPass;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RideBased)) {
                    return false;
                }
                RideBased rideBased = (RideBased) obj;
                return Intrinsics.d(this.b, rideBased.b) && this.c == rideBased.c;
            }

            public final int hashCode() {
                return (this.b.hashCode() * 31) + (this.c ? 1231 : 1237);
            }

            public final String toString() {
                return "RideBased(rideBasedPass=" + this.b + ", isBulkBookingPass=" + this.c + ")";
            }
        }

        public PassActivation(SuperPass superPass) {
            this.f7999a = superPass;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/data/ActivationProductData$PremiumTicketActivation;", "Lapp/chalo/productactivation/data/ActivationProductData;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PremiumTicketActivation extends ActivationProductData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumReserveTicketAppModel f8000a;

        public PremiumTicketActivation(PremiumReserveTicketAppModel premiumReserveTicketAppModel) {
            Intrinsics.i(premiumReserveTicketAppModel, "premiumReserveTicketAppModel");
            this.f8000a = premiumReserveTicketAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PremiumTicketActivation) && Intrinsics.d(this.f8000a, ((PremiumTicketActivation) obj).f8000a);
        }

        public final int hashCode() {
            return this.f8000a.hashCode();
        }

        public final String toString() {
            return "PremiumTicketActivation(premiumReserveTicketAppModel=" + this.f8000a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/data/ActivationProductData$QuickPayActivation;", "Lapp/chalo/productactivation/data/ActivationProductData;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuickPayActivation extends ActivationProductData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final QuickPayAppModel f8001a;

        public QuickPayActivation(QuickPayAppModel quickPayAppModel) {
            this.f8001a = quickPayAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QuickPayActivation) && Intrinsics.d(this.f8001a, ((QuickPayActivation) obj).f8001a);
        }

        public final int hashCode() {
            return this.f8001a.hashCode();
        }

        public final String toString() {
            return "QuickPayActivation(quickPay=" + this.f8001a + ")";
        }
    }

    public final boolean a() {
        if ((this instanceof InstantTicketActivation) || (this instanceof QuickPayActivation)) {
            return false;
        }
        if (this instanceof PassActivation) {
            return ((PassActivation) this).f7999a.l();
        }
        if ((this instanceof MobileTicketActivation) || (this instanceof MetroTicketActivation) || (this instanceof ONDCMetroTicketActivation) || (this instanceof ONDCTicketActivation)) {
            return false;
        }
        if (this instanceof PremiumTicketActivation) {
            return true;
        }
        if (this instanceof MultiModalGroupTicketActivation) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
