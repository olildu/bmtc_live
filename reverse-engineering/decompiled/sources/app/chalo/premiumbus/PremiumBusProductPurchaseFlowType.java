package app.chalo.premiumbus;

import app.chalo.data.PremiumBusProductModificationReasonAppModel;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import defpackage.nt0;
import defpackage.uf0;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType;", "", "Companion", "FreshPurchase", "RescheduleTicket", "TicketPurchaseThroughPass", "RePurchaseTicket", "Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType$FreshPurchase;", "Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType$RePurchaseTicket;", "Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType$RescheduleTicket;", "Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType$TicketPurchaseThroughPass;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class PremiumBusProductPurchaseFlowType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new nt0(16));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6858a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<PremiumBusProductPurchaseFlowType> serializer() {
            return (KSerializer) PremiumBusProductPurchaseFlowType.b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType$FreshPurchase;", "Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class FreshPurchase extends PremiumBusProductPurchaseFlowType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final PBStopPlaceSelectedAppModel c;
        public final PBStopPlaceSelectedAppModel d;
        public final long e;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType$FreshPurchase$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType$FreshPurchase;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<FreshPurchase> serializer() {
                return PremiumBusProductPurchaseFlowType$FreshPurchase$$serializer.f6859a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FreshPurchase(int i, long j, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2, long j2) {
            super(j);
            if (15 != (i & 15)) {
                PluginExceptionsKt.b(PremiumBusProductPurchaseFlowType$FreshPurchase$$serializer.f6859a.getDescriptor(), i, 15);
                throw null;
            }
            this.c = pBStopPlaceSelectedAppModel;
            this.d = pBStopPlaceSelectedAppModel2;
            this.e = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FreshPurchase)) {
                return false;
            }
            FreshPurchase freshPurchase = (FreshPurchase) obj;
            return Intrinsics.d(this.c, freshPurchase.c) && Intrinsics.d(this.d, freshPurchase.d) && this.e == freshPurchase.e;
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
            long j = this.e;
            return iHashCode + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FreshPurchase(fromStopOrPlaceSelected=");
            sb.append(this.c);
            sb.append(", toStopOrPlaceSelected=");
            sb.append(this.d);
            sb.append(", preferredTimeInMillisForSlotSelection=");
            return uf0.m(this.e, ")", sb);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FreshPurchase(PBStopPlaceSelectedAppModel fromStopOrPlaceSelected, PBStopPlaceSelectedAppModel toStopOrPlaceSelected, long j) {
            super(j, 0);
            Intrinsics.i(fromStopOrPlaceSelected, "fromStopOrPlaceSelected");
            Intrinsics.i(toStopOrPlaceSelected, "toStopOrPlaceSelected");
            this.c = fromStopOrPlaceSelected;
            this.d = toStopOrPlaceSelected;
            this.e = j;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType$RePurchaseTicket;", "Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class RePurchaseTicket extends PremiumBusProductPurchaseFlowType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final PBOriginDestinationAppModel c;
        public final long d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType$RePurchaseTicket$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType$RePurchaseTicket;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<RePurchaseTicket> serializer() {
                return PremiumBusProductPurchaseFlowType$RePurchaseTicket$$serializer.f6860a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RePurchaseTicket(int i, long j, PBOriginDestinationAppModel pBOriginDestinationAppModel, long j2) {
            super(j);
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(PremiumBusProductPurchaseFlowType$RePurchaseTicket$$serializer.f6860a.getDescriptor(), i, 7);
                throw null;
            }
            this.c = pBOriginDestinationAppModel;
            this.d = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RePurchaseTicket)) {
                return false;
            }
            RePurchaseTicket rePurchaseTicket = (RePurchaseTicket) obj;
            return Intrinsics.d(this.c, rePurchaseTicket.c) && this.d == rePurchaseTicket.d;
        }

        public final int hashCode() {
            int iHashCode = this.c.hashCode() * 31;
            long j = this.d;
            return iHashCode + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return "RePurchaseTicket(fpOriginDestinationAppModel=" + this.c + ", preferredTimeInMillisForSlotSelection=" + this.d + ")";
        }

        public RePurchaseTicket(PBOriginDestinationAppModel pBOriginDestinationAppModel, long j) {
            super(j, 0);
            this.c = pBOriginDestinationAppModel;
            this.d = j;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType$RescheduleTicket;", "Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class RescheduleTicket extends PremiumBusProductPurchaseFlowType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;
        public final PBOriginDestinationAppModel d;
        public final PremiumBusProductModificationReasonAppModel e;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType$RescheduleTicket$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType$RescheduleTicket;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<RescheduleTicket> serializer() {
                return PremiumBusProductPurchaseFlowType$RescheduleTicket$$serializer.f6861a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RescheduleTicket(int i, long j, String str, PBOriginDestinationAppModel pBOriginDestinationAppModel, PremiumBusProductModificationReasonAppModel premiumBusProductModificationReasonAppModel) {
            super(j);
            if (15 != (i & 15)) {
                PluginExceptionsKt.b(PremiumBusProductPurchaseFlowType$RescheduleTicket$$serializer.f6861a.getDescriptor(), i, 15);
                throw null;
            }
            this.c = str;
            this.d = pBOriginDestinationAppModel;
            this.e = premiumBusProductModificationReasonAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RescheduleTicket)) {
                return false;
            }
            RescheduleTicket rescheduleTicket = (RescheduleTicket) obj;
            return Intrinsics.d(this.c, rescheduleTicket.c) && Intrinsics.d(this.d, rescheduleTicket.d) && Intrinsics.d(this.e, rescheduleTicket.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "RescheduleTicket(bookingId=" + this.c + ", fpOriginDestinationAppModel=" + this.d + ", reason=" + this.e + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType$TicketPurchaseThroughPass;", "Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class TicketPurchaseThroughPass extends PremiumBusProductPurchaseFlowType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;
        public final PBStopPlaceSelectedAppModel d;
        public final PBStopPlaceSelectedAppModel e;
        public final long f;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType$TicketPurchaseThroughPass$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/PremiumBusProductPurchaseFlowType$TicketPurchaseThroughPass;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<TicketPurchaseThroughPass> serializer() {
                return PremiumBusProductPurchaseFlowType$TicketPurchaseThroughPass$$serializer.f6862a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ TicketPurchaseThroughPass(int i, long j, String str, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2, long j2) {
            super(j);
            if (31 != (i & 31)) {
                PluginExceptionsKt.b(PremiumBusProductPurchaseFlowType$TicketPurchaseThroughPass$$serializer.f6862a.getDescriptor(), i, 31);
                throw null;
            }
            this.c = str;
            this.d = pBStopPlaceSelectedAppModel;
            this.e = pBStopPlaceSelectedAppModel2;
            this.f = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TicketPurchaseThroughPass)) {
                return false;
            }
            TicketPurchaseThroughPass ticketPurchaseThroughPass = (TicketPurchaseThroughPass) obj;
            return Intrinsics.d(this.c, ticketPurchaseThroughPass.c) && Intrinsics.d(this.d, ticketPurchaseThroughPass.d) && Intrinsics.d(this.e, ticketPurchaseThroughPass.e) && this.f == ticketPurchaseThroughPass.f;
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31)) * 31;
            long j = this.f;
            return iHashCode + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return "TicketPurchaseThroughPass(selectedPassId=" + this.c + ", fromStopOrPlaceSelected=" + this.d + ", toStopOrPlaceSelected=" + this.e + ", preferredTimeInMillisForSlotSelection=" + this.f + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TicketPurchaseThroughPass(String selectedPassId, PBStopPlaceSelectedAppModel fromStopOrPlaceSelected, PBStopPlaceSelectedAppModel toStopOrPlaceSelected, long j) {
            super(j, 0);
            Intrinsics.i(selectedPassId, "selectedPassId");
            Intrinsics.i(fromStopOrPlaceSelected, "fromStopOrPlaceSelected");
            Intrinsics.i(toStopOrPlaceSelected, "toStopOrPlaceSelected");
            this.c = selectedPassId;
            this.d = fromStopOrPlaceSelected;
            this.e = toStopOrPlaceSelected;
            this.f = j;
        }
    }

    public /* synthetic */ PremiumBusProductPurchaseFlowType(long j) {
        this.f6858a = j;
    }

    public PremiumBusProductPurchaseFlowType(long j, int i) {
        this.f6858a = j;
    }
}
