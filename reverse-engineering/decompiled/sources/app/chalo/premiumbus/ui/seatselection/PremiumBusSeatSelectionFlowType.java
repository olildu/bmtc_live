package app.chalo.premiumbus.ui.seatselection;

import defpackage.b3;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.nt0;
import defpackage.q7;
import defpackage.r30;
import defpackage.vo1;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType;", "", "Companion", "FreshPurchase", "FreshPurchaseThroughPass", "BulkBooking", "Reschedule", "ChangeSeat", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType$BulkBooking;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType$ChangeSeat;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType$FreshPurchase;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType$FreshPurchaseThroughPass;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType$Reschedule;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class PremiumBusSeatSelectionFlowType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new nt0(17));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7725a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType$BulkBooking;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class BulkBooking extends PremiumBusSeatSelectionFlowType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] m;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final List j;
        public final List k;
        public final boolean l;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType$BulkBooking$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType$BulkBooking;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<BulkBooking> serializer() {
                return PremiumBusSeatSelectionFlowType$BulkBooking$$serializer.f7726a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            m = new Lazy[]{null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new nt0(18)), LazyKt.a(lazyThreadSafetyMode, new nt0(19)), null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BulkBooking(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, boolean z) {
            super(str, str2);
            if (2047 != (i & 2047)) {
                PluginExceptionsKt.b(PremiumBusSeatSelectionFlowType$BulkBooking$$serializer.f7726a.getDescriptor(), i, 2047);
                throw null;
            }
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = str7;
            this.i = str8;
            this.j = list;
            this.k = list2;
            this.l = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BulkBooking)) {
                return false;
            }
            BulkBooking bulkBooking = (BulkBooking) obj;
            return Intrinsics.d(this.d, bulkBooking.d) && Intrinsics.d(this.e, bulkBooking.e) && Intrinsics.d(this.f, bulkBooking.f) && Intrinsics.d(this.g, bulkBooking.g) && Intrinsics.d(this.h, bulkBooking.h) && Intrinsics.d(this.i, bulkBooking.i) && Intrinsics.d(this.j, bulkBooking.j) && Intrinsics.d(this.k, bulkBooking.k) && this.l == bulkBooking.l;
        }

        public final int hashCode() {
            return r30.b(r30.b(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.d.hashCode() * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k) + (this.l ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("BulkBooking(passId=", this.d, ", productSubType=", this.e, ", fromStopId=");
            cb0.t(sbE, this.f, ", toStopId=", this.g, ", fromStopName=");
            cb0.t(sbE, this.h, ", toStopName=", this.i, ", selectedSlots=");
            dd.o(sbE, this.j, ", selectedSeats=", this.k, ", autoAssignForWomenReservation=");
            return b3.g(")", sbE, this.l);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BulkBooking(String passId, String productSubType, String fromStopId, String toStopId, String fromStopName, String toStopName, List selectedSlots, List selectedSeats, boolean z) {
            super(fromStopId, toStopId, 0);
            Intrinsics.i(passId, "passId");
            Intrinsics.i(productSubType, "productSubType");
            Intrinsics.i(fromStopId, "fromStopId");
            Intrinsics.i(toStopId, "toStopId");
            Intrinsics.i(fromStopName, "fromStopName");
            Intrinsics.i(toStopName, "toStopName");
            Intrinsics.i(selectedSlots, "selectedSlots");
            Intrinsics.i(selectedSeats, "selectedSeats");
            this.d = passId;
            this.e = productSubType;
            this.f = fromStopId;
            this.g = toStopId;
            this.h = fromStopName;
            this.i = toStopName;
            this.j = selectedSlots;
            this.k = selectedSeats;
            this.l = z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType$ChangeSeat;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ChangeSeat extends PremiumBusSeatSelectionFlowType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] i = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new nt0(20)), null, null, null};
        public final String d;
        public final List e;
        public final String f;
        public final String g;
        public final String h;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType$ChangeSeat$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType$ChangeSeat;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<ChangeSeat> serializer() {
                return PremiumBusSeatSelectionFlowType$ChangeSeat$$serializer.f7727a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ChangeSeat(int i2, String str, String str2, String str3, List list, String str4, String str5, String str6) {
            super(str, str2);
            if (127 != (i2 & 127)) {
                PluginExceptionsKt.b(PremiumBusSeatSelectionFlowType$ChangeSeat$$serializer.f7727a.getDescriptor(), i2, 127);
                throw null;
            }
            this.d = str3;
            this.e = list;
            this.f = str4;
            this.g = str5;
            this.h = str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeSeat)) {
                return false;
            }
            ChangeSeat changeSeat = (ChangeSeat) obj;
            return Intrinsics.d(this.d, changeSeat.d) && Intrinsics.d(this.e, changeSeat.e) && Intrinsics.d(this.f, changeSeat.f) && Intrinsics.d(this.g, changeSeat.g) && Intrinsics.d(this.h, changeSeat.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + nf1.e(nf1.e(r30.b(this.d.hashCode() * 31, 31, this.e), 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder sbH = q7.h("ChangeSeat(bookingId=", this.d, ", selectedSeats=", ", tripId=", this.e);
            cb0.t(sbH, this.f, ", fromStopId=", this.g, ", toStopId=");
            return vo1.p(sbH, this.h, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChangeSeat(String str, String str2, String str3, String str4, List selectedSeats) {
            super(str3, str4, 0);
            Intrinsics.i(selectedSeats, "selectedSeats");
            this.d = str;
            this.e = selectedSeats;
            this.f = str2;
            this.g = str3;
            this.h = str4;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<PremiumBusSeatSelectionFlowType> serializer() {
            return (KSerializer) PremiumBusSeatSelectionFlowType.c.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType$FreshPurchase;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class FreshPurchase extends PremiumBusSeatSelectionFlowType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType$FreshPurchase$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType$FreshPurchase;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<FreshPurchase> serializer() {
                return PremiumBusSeatSelectionFlowType$FreshPurchase$$serializer.f7728a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FreshPurchase(int i, String str, String str2, String str3, String str4, String str5) {
            super(str, str2);
            if (31 != (i & 31)) {
                PluginExceptionsKt.b(PremiumBusSeatSelectionFlowType$FreshPurchase$$serializer.f7728a.getDescriptor(), i, 31);
                throw null;
            }
            this.d = str3;
            this.e = str4;
            this.f = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FreshPurchase)) {
                return false;
            }
            FreshPurchase freshPurchase = (FreshPurchase) obj;
            return Intrinsics.d(this.d, freshPurchase.d) && Intrinsics.d(this.e, freshPurchase.e) && Intrinsics.d(this.f, freshPurchase.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + nf1.e(this.d.hashCode() * 31, 31, this.e);
        }

        public final String toString() {
            return vo1.p(dd.e("FreshPurchase(tripId=", this.d, ", fromStopId=", this.e, ", toStopId="), this.f, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FreshPurchase(String tripId, String fromStopId, String toStopId) {
            super(fromStopId, toStopId, 0);
            Intrinsics.i(tripId, "tripId");
            Intrinsics.i(fromStopId, "fromStopId");
            Intrinsics.i(toStopId, "toStopId");
            this.d = tripId;
            this.e = fromStopId;
            this.f = toStopId;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType$FreshPurchaseThroughPass;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class FreshPurchaseThroughPass extends PremiumBusSeatSelectionFlowType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType$FreshPurchaseThroughPass$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType$FreshPurchaseThroughPass;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<FreshPurchaseThroughPass> serializer() {
                return PremiumBusSeatSelectionFlowType$FreshPurchaseThroughPass$$serializer.f7729a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FreshPurchaseThroughPass(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            super(str, str2);
            if (255 != (i & 255)) {
                PluginExceptionsKt.b(PremiumBusSeatSelectionFlowType$FreshPurchaseThroughPass$$serializer.f7729a.getDescriptor(), i, 255);
                throw null;
            }
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = str7;
            this.i = str8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FreshPurchaseThroughPass)) {
                return false;
            }
            FreshPurchaseThroughPass freshPurchaseThroughPass = (FreshPurchaseThroughPass) obj;
            return Intrinsics.d(this.d, freshPurchaseThroughPass.d) && Intrinsics.d(this.e, freshPurchaseThroughPass.e) && Intrinsics.d(this.f, freshPurchaseThroughPass.f) && Intrinsics.d(this.g, freshPurchaseThroughPass.g) && Intrinsics.d(this.h, freshPurchaseThroughPass.h) && Intrinsics.d(this.i, freshPurchaseThroughPass.i);
        }

        public final int hashCode() {
            int iE = nf1.e(nf1.e(nf1.e(nf1.e(this.d.hashCode() * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
            String str = this.i;
            return iE + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbE = dd.e("FreshPurchaseThroughPass(tripId=", this.d, ", fromStopId=", this.e, ", toStopId=");
            cb0.t(sbE, this.f, ", fareDetailsData=", this.g, ", fareDetailsFlowType=");
            return r30.i(sbE, this.h, ", configurationId=", this.i, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FreshPurchaseThroughPass(String tripId, String fromStopId, String toStopId, String str, String str2) {
            super(fromStopId, toStopId, 0);
            Intrinsics.i(tripId, "tripId");
            Intrinsics.i(fromStopId, "fromStopId");
            Intrinsics.i(toStopId, "toStopId");
            this.d = tripId;
            this.e = fromStopId;
            this.f = toStopId;
            this.g = str;
            this.h = str2;
            this.i = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType$Reschedule;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Reschedule extends PremiumBusSeatSelectionFlowType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String d;
        public final String e;
        public final String f;
        public final int g;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType$Reschedule$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionFlowType$Reschedule;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Reschedule> serializer() {
                return PremiumBusSeatSelectionFlowType$Reschedule$$serializer.f7730a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Reschedule(int i, int i2, String str, String str2, String str3, String str4, String str5) {
            super(str, str2);
            if (63 != (i & 63)) {
                PluginExceptionsKt.b(PremiumBusSeatSelectionFlowType$Reschedule$$serializer.f7730a.getDescriptor(), i, 63);
                throw null;
            }
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Reschedule)) {
                return false;
            }
            Reschedule reschedule = (Reschedule) obj;
            return Intrinsics.d(this.d, reschedule.d) && Intrinsics.d(this.e, reschedule.e) && Intrinsics.d(this.f, reschedule.f) && this.g == reschedule.g;
        }

        public final int hashCode() {
            return nf1.e(nf1.e(this.d.hashCode() * 31, 31, this.e), 31, this.f) + this.g;
        }

        public final String toString() {
            StringBuilder sbE = dd.e("Reschedule(tripId=", this.d, ", fromStopId=", this.e, ", toStopId=");
            sbE.append(this.f);
            sbE.append(", noOfSeatSelected=");
            sbE.append(this.g);
            sbE.append(")");
            return sbE.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Reschedule(String tripId, String fromStopId, String toStopId, int i) {
            super(fromStopId, toStopId, 0);
            Intrinsics.i(tripId, "tripId");
            Intrinsics.i(fromStopId, "fromStopId");
            Intrinsics.i(toStopId, "toStopId");
            this.d = tripId;
            this.e = fromStopId;
            this.f = toStopId;
            this.g = i;
        }
    }

    public /* synthetic */ PremiumBusSeatSelectionFlowType(String str, String str2) {
        this.f7725a = str;
        this.b = str2;
    }

    public static final /* synthetic */ void a(PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, premiumBusSeatSelectionFlowType.f7725a);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, premiumBusSeatSelectionFlowType.b);
    }

    public PremiumBusSeatSelectionFlowType(String str, String str2, int i) {
        this.f7725a = str;
        this.b = str2;
    }
}
