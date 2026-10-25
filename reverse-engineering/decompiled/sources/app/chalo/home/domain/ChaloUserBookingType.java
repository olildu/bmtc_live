package app.chalo.home.domain;

import app.chalo.data.CardRechargeSummaryData;
import app.chalo.instantticket.data.model.app.InstantTicketAppModel;
import app.chalo.metro.data.app.MetroTicketAppModel;
import app.chalo.models.mticketing.MTicket;
import app.chalo.models.products.SuperPassRideBookingAppModel;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel;
import app.chalo.ondc.model.app.OndcMetroTicketAppModel;
import app.chalo.ondc.model.app.OndcTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel;
import app.chalo.superpass.data.models.entities.MagicSuperPass;
import app.chalo.superpass.data.models.entities.RideBasedSuperPass;
import app.chalo.superpass.data.models.entities.SuperPassApplication;
import app.chalo.superpass.data.models.entities.SuperPassProperties;
import app.chalo.superpass.data.models.entities.SuperPassSubType;
import app.chalo.superpass.data.models.pendingSuperPass.PendingSuperPass;
import app.chalo.superpass.data.models.pendingSuperPass.PendingSuperPassProperties;
import app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayAppModel;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/home/domain/ChaloUserBookingType;", "", "TicketBooking", "SuperPassBooking", "CardBooking", "Lapp/chalo/home/domain/ChaloUserBookingType$CardBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$SuperPassBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChaloUserBookingType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2987a;
    public final String b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/domain/ChaloUserBookingType$CardBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType;", "CardRechargeBooking", "CardTransactionReceiptBooking", "Lapp/chalo/home/domain/ChaloUserBookingType$CardBooking$CardRechargeBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$CardBooking$CardTransactionReceiptBooking;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class CardBooking extends ChaloUserBookingType {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/ChaloUserBookingType$CardBooking$CardRechargeBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$CardBooking;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CardRechargeBooking extends CardBooking {
            public final CardRechargeSummaryData d;

            static {
                CardRechargeSummaryData.Companion companion = CardRechargeSummaryData.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CardRechargeBooking(CardRechargeSummaryData cardRechargeData) {
                super(cardRechargeData.f2333a, "chaloCard", "chaloCard");
                Intrinsics.i(cardRechargeData, "cardRechargeData");
                this.d = cardRechargeData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final CardRechargeSummaryData getD() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CardRechargeBooking) && Intrinsics.d(this.d, ((CardRechargeBooking) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return "CardRechargeBooking(cardRechargeData=" + this.d + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/ChaloUserBookingType$CardBooking$CardTransactionReceiptBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$CardBooking;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CardTransactionReceiptBooking extends CardBooking {
            public final String d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CardTransactionReceiptBooking(String transactionId) {
                super(transactionId, "chaloCard", "chaloCard");
                Intrinsics.i(transactionId, "transactionId");
                this.d = transactionId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CardTransactionReceiptBooking) && Intrinsics.d(this.d, ((CardTransactionReceiptBooking) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return vo1.B("CardTransactionReceiptBooking(transactionId=", this.d, ")");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/home/domain/ChaloUserBookingType$SuperPassBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType;", "MagicSuperPassBooking", "RideBasedSuperPassBooking", "SuperPassApplicationBooking", "PendingSuperPassBooking", "Lapp/chalo/home/domain/ChaloUserBookingType$SuperPassBooking$MagicSuperPassBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$SuperPassBooking$PendingSuperPassBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$SuperPassBooking$RideBasedSuperPassBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$SuperPassBooking$SuperPassApplicationBooking;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class SuperPassBooking extends ChaloUserBookingType {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/ChaloUserBookingType$SuperPassBooking$MagicSuperPassBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$SuperPassBooking;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MagicSuperPassBooking extends SuperPassBooking {
            public final MagicSuperPass d;

            /* JADX WARN: Illegal instructions before constructor call */
            public MagicSuperPassBooking(MagicSuperPass pass) {
                Intrinsics.i(pass, "pass");
                SuperPassProperties superPassProperties = pass.f9560a;
                String str = superPassProperties.f9566a;
                String str2 = superPassProperties.b;
                SuperPassSubType.Companion companion = SuperPassSubType.INSTANCE;
                SuperPassSubType superPassSubType = superPassProperties.c;
                companion.getClass();
                super(str, str2, SuperPassSubType.Companion.b(superPassSubType));
                this.d = pass;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final MagicSuperPass getD() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MagicSuperPassBooking) && Intrinsics.d(this.d, ((MagicSuperPassBooking) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return "MagicSuperPassBooking(pass=" + this.d + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/ChaloUserBookingType$SuperPassBooking$PendingSuperPassBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$SuperPassBooking;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PendingSuperPassBooking extends SuperPassBooking {
            public final PendingSuperPass d;

            /* JADX WARN: Illegal instructions before constructor call */
            public PendingSuperPassBooking(PendingSuperPass pendingPass) {
                Intrinsics.i(pendingPass, "pendingPass");
                PendingSuperPassProperties pendingSuperPassProperties = pendingPass.f9583a;
                String str = pendingSuperPassProperties.f9566a;
                String str2 = pendingSuperPassProperties.b;
                SuperPassSubType.Companion companion = SuperPassSubType.INSTANCE;
                SuperPassSubType superPassSubType = pendingSuperPassProperties.c;
                companion.getClass();
                super(str, str2, SuperPassSubType.Companion.b(superPassSubType));
                this.d = pendingPass;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final PendingSuperPass getD() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PendingSuperPassBooking) && Intrinsics.d(this.d, ((PendingSuperPassBooking) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return "PendingSuperPassBooking(pendingPass=" + this.d + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/ChaloUserBookingType$SuperPassBooking$RideBasedSuperPassBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$SuperPassBooking;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RideBasedSuperPassBooking extends SuperPassBooking {
            public final RideBasedSuperPass d;

            /* JADX WARN: Illegal instructions before constructor call */
            public RideBasedSuperPassBooking(RideBasedSuperPass pass) {
                Intrinsics.i(pass, "pass");
                SuperPassProperties superPassProperties = pass.f9560a;
                String str = superPassProperties.f9566a;
                String str2 = superPassProperties.b;
                SuperPassSubType.Companion companion = SuperPassSubType.INSTANCE;
                SuperPassSubType superPassSubType = superPassProperties.c;
                companion.getClass();
                super(str, str2, SuperPassSubType.Companion.b(superPassSubType));
                this.d = pass;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final RideBasedSuperPass getD() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RideBasedSuperPassBooking) && Intrinsics.d(this.d, ((RideBasedSuperPassBooking) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return "RideBasedSuperPassBooking(pass=" + this.d + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/ChaloUserBookingType$SuperPassBooking$SuperPassApplicationBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$SuperPassBooking;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SuperPassApplicationBooking extends SuperPassBooking {
            public final SuperPassApplication d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SuperPassApplicationBooking(SuperPassApplication application) {
                super(application.d(), "passApplications", "passApplications");
                Intrinsics.i(application, "application");
                this.d = application;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final SuperPassApplication getD() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SuperPassApplicationBooking) && Intrinsics.d(this.d, ((SuperPassApplicationBooking) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return "SuperPassApplicationBooking(application=" + this.d + ")";
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType;", "MobileTicketBooking", "QuickPayBooking", "InstantTicketBooking", "PremiumBusBooking", "OndcTicketBooking", "OndcMetroTicketBooking", "MetroTicketBooking", "MultiModalGroupTicketBooking", "PassRideBooking", "Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking$InstantTicketBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking$MetroTicketBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking$MobileTicketBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking$MultiModalGroupTicketBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking$OndcMetroTicketBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking$OndcTicketBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking$PassRideBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking$PremiumBusBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking$QuickPayBooking;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class TicketBooking extends ChaloUserBookingType {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking$InstantTicketBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InstantTicketBooking extends TicketBooking {
            public final InstantTicketAppModel d;
            public final String e;

            public InstantTicketBooking(InstantTicketAppModel instantTicketAppModel, String str) {
                super(instantTicketAppModel.f3881a, "mobileTicket", "instantTicket");
                this.d = instantTicketAppModel;
                this.e = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InstantTicketBooking)) {
                    return false;
                }
                InstantTicketBooking instantTicketBooking = (InstantTicketBooking) obj;
                return Intrinsics.d(this.d, instantTicketBooking.d) && Intrinsics.d(this.e, instantTicketBooking.e);
            }

            public final int hashCode() {
                int iHashCode = this.d.hashCode() * 31;
                String str = this.e;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return "InstantTicketBooking(instantTicket=" + this.d + ", parentMultiModalGroupId=" + this.e + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking$MetroTicketBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MetroTicketBooking extends TicketBooking {
            public final MetroTicketAppModel d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MetroTicketBooking(MetroTicketAppModel ticket) {
                super(ticket.f5431a, "mobileTicket", "metroTicket");
                Intrinsics.i(ticket, "ticket");
                this.d = ticket;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MetroTicketBooking) && Intrinsics.d(this.d, ((MetroTicketBooking) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return "MetroTicketBooking(ticket=" + this.d + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking$MobileTicketBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MobileTicketBooking extends TicketBooking {
            public final MTicket d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MobileTicketBooking(MTicket ticket) {
                super(ticket.f5615a, ticket.C, ticket.D);
                Intrinsics.i(ticket, "ticket");
                this.d = ticket;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MobileTicketBooking) && Intrinsics.d(this.d, ((MobileTicketBooking) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return "MobileTicketBooking(ticket=" + this.d + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking$MultiModalGroupTicketBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MultiModalGroupTicketBooking extends TicketBooking {
            public final MultiModalGroupTicketAppModel d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MultiModalGroupTicketBooking(MultiModalGroupTicketAppModel groupTicket) {
                super(groupTicket.f5874a, groupTicket.c, groupTicket.d);
                Intrinsics.i(groupTicket, "groupTicket");
                this.d = groupTicket;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MultiModalGroupTicketBooking) && Intrinsics.d(this.d, ((MultiModalGroupTicketBooking) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return "MultiModalGroupTicketBooking(groupTicket=" + this.d + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking$OndcMetroTicketBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OndcMetroTicketBooking extends TicketBooking {
            public final OndcMetroTicketAppModel d;
            public final String e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OndcMetroTicketBooking(OndcMetroTicketAppModel ticket, String str) {
                super(ticket.f6769a, "mobileTicket", "ondcMetroTicket");
                Intrinsics.i(ticket, "ticket");
                this.d = ticket;
                this.e = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final OndcMetroTicketAppModel getD() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OndcMetroTicketBooking)) {
                    return false;
                }
                OndcMetroTicketBooking ondcMetroTicketBooking = (OndcMetroTicketBooking) obj;
                return Intrinsics.d(this.d, ondcMetroTicketBooking.d) && Intrinsics.d(this.e, ondcMetroTicketBooking.e);
            }

            public final int hashCode() {
                int iHashCode = this.d.hashCode() * 31;
                String str = this.e;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return "OndcMetroTicketBooking(ticket=" + this.d + ", parentMultiModalGroupId=" + this.e + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking$OndcTicketBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OndcTicketBooking extends TicketBooking {
            public final OndcTicketAppModel d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OndcTicketBooking(OndcTicketAppModel ondcTicket) {
                super(ondcTicket.f6771a, "mobileTicket", "ondcTicket");
                Intrinsics.i(ondcTicket, "ondcTicket");
                this.d = ondcTicket;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OndcTicketBooking) && Intrinsics.d(this.d, ((OndcTicketBooking) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return "OndcTicketBooking(ondcTicket=" + this.d + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking$PassRideBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PassRideBooking extends TicketBooking {
            public final SuperPassRideBookingAppModel d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PassRideBooking(SuperPassRideBookingAppModel ride) {
                super(ride.f5681a, "superPass", "rideBasedPass");
                Intrinsics.i(ride, "ride");
                this.d = ride;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PassRideBooking) && Intrinsics.d(this.d, ((PassRideBooking) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return "PassRideBooking(ride=" + this.d + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking$PremiumBusBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PremiumBusBooking extends TicketBooking {
            public final PremiumReserveTicketAppModel d;

            /* JADX WARN: Illegal instructions before constructor call */
            public PremiumBusBooking(PremiumReserveTicketAppModel premiumReserveTicket) {
                Intrinsics.i(premiumReserveTicket, "premiumReserveTicket");
                PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel = premiumReserveTicket.f7113a;
                super(premiumReserveTicketBookingPropertiesAppModel.f7114a, premiumReserveTicketBookingPropertiesAppModel.d, premiumReserveTicketBookingPropertiesAppModel.e);
                this.d = premiumReserveTicket;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PremiumBusBooking) && Intrinsics.d(this.d, ((PremiumBusBooking) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return "PremiumBusBooking(premiumReserveTicket=" + this.d + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking$QuickPayBooking;", "Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class QuickPayBooking extends TicketBooking {
            public final QuickPayAppModel d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public QuickPayBooking(QuickPayAppModel quickPay) {
                super(quickPay.b, "quickpay", "quickpay");
                Intrinsics.i(quickPay, "quickPay");
                this.d = quickPay;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final QuickPayAppModel getD() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof QuickPayBooking) && Intrinsics.d(this.d, ((QuickPayBooking) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return "QuickPayBooking(quickPay=" + this.d + ")";
            }
        }
    }

    public ChaloUserBookingType(String str, String str2, String str3) {
        this.f2987a = str;
        this.b = str2;
        this.c = str3;
    }
}
