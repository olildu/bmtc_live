package app.chalo.bookingsuccessproducttype;

import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import defpackage.wb;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType;", "", "Companion", "PremiumReserveTicket", "ONDCVehicleBasedTicket", "PremiumBusReschedule", "QuickPay", "SuperPassApplication", "GenderMismatchError", "Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType$GenderMismatchError;", "Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType$ONDCVehicleBasedTicket;", "Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType$PremiumBusReschedule;", "Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType$PremiumReserveTicket;", "Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType$QuickPay;", "Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType$SuperPassApplication;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class BookingSuccessProductType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f1161a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new wb(6));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<BookingSuccessProductType> serializer() {
            return (KSerializer) BookingSuccessProductType.f1161a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType$GenderMismatchError;", "Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class GenderMismatchError extends BookingSuccessProductType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType$GenderMismatchError$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType$GenderMismatchError;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<GenderMismatchError> serializer() {
                return BookingSuccessProductType$GenderMismatchError$$serializer.f1162a;
            }
        }

        public /* synthetic */ GenderMismatchError(int i, String str) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                PluginExceptionsKt.b(BookingSuccessProductType$GenderMismatchError$$serializer.f1162a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GenderMismatchError) && Intrinsics.d(this.b, ((GenderMismatchError) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("GenderMismatchError(premiumProductPurchaseFlowType=", this.b, ")");
        }

        public GenderMismatchError(String str) {
            this.b = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType$ONDCVehicleBasedTicket;", "Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ONDCVehicleBasedTicket extends BookingSuccessProductType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType$ONDCVehicleBasedTicket$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType$ONDCVehicleBasedTicket;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<ONDCVehicleBasedTicket> serializer() {
                return BookingSuccessProductType$ONDCVehicleBasedTicket$$serializer.f1163a;
            }
        }

        public /* synthetic */ ONDCVehicleBasedTicket(int i, String str) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                PluginExceptionsKt.b(BookingSuccessProductType$ONDCVehicleBasedTicket$$serializer.f1163a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ONDCVehicleBasedTicket) && Intrinsics.d(this.b, ((ONDCVehicleBasedTicket) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("ONDCVehicleBasedTicket(bookingId=", this.b, ")");
        }

        public ONDCVehicleBasedTicket(String bookingId) {
            Intrinsics.i(bookingId, "bookingId");
            this.b = bookingId;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType$PremiumBusReschedule;", "Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PremiumBusReschedule extends BookingSuccessProductType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;
        public final String c;
        public final String d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType$PremiumBusReschedule$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType$PremiumBusReschedule;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PremiumBusReschedule> serializer() {
                return BookingSuccessProductType$PremiumBusReschedule$$serializer.f1164a;
            }
        }

        public /* synthetic */ PremiumBusReschedule(int i, String str, String str2, String str3) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(BookingSuccessProductType$PremiumBusReschedule$$serializer.f1164a.getDescriptor(), i, 7);
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PremiumBusReschedule)) {
                return false;
            }
            PremiumBusReschedule premiumBusReschedule = (PremiumBusReschedule) obj;
            return Intrinsics.d(this.b, premiumBusReschedule.b) && Intrinsics.d(this.c, premiumBusReschedule.c) && Intrinsics.d(this.d, premiumBusReschedule.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + nf1.e(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            return vo1.p(dd.e("PremiumBusReschedule(bookingId=", this.b, ", productType=", this.c, ", productSubType="), this.d, ")");
        }

        public PremiumBusReschedule(String bookingId, String str, String str2) {
            Intrinsics.i(bookingId, "bookingId");
            this.b = bookingId;
            this.c = str;
            this.d = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType$QuickPay;", "Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class QuickPay extends BookingSuccessProductType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType$QuickPay$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType$QuickPay;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<QuickPay> serializer() {
                return BookingSuccessProductType$QuickPay$$serializer.f1166a;
            }
        }

        public /* synthetic */ QuickPay(int i, String str) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                PluginExceptionsKt.b(BookingSuccessProductType$QuickPay$$serializer.f1166a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QuickPay) && Intrinsics.d(this.b, ((QuickPay) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("QuickPay(bookingId=", this.b, ")");
        }

        public QuickPay(String bookingId) {
            Intrinsics.i(bookingId, "bookingId");
            this.b = bookingId;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType$SuperPassApplication;", "Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class SuperPassApplication extends BookingSuccessProductType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType$SuperPassApplication$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType$SuperPassApplication;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<SuperPassApplication> serializer() {
                return BookingSuccessProductType$SuperPassApplication$$serializer.f1167a;
            }
        }

        public /* synthetic */ SuperPassApplication(int i, String str) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                PluginExceptionsKt.b(BookingSuccessProductType$SuperPassApplication$$serializer.f1167a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuperPassApplication) && Intrinsics.d(this.b, ((SuperPassApplication) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("SuperPassApplication(superPassApplication=", this.b, ")");
        }

        public SuperPassApplication(String str) {
            this.b = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType$PremiumReserveTicket;", "Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PremiumReserveTicket extends BookingSuccessProductType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] f = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new wb(7)), null};
        public final String b;
        public final String c;
        public final Map d;
        public final boolean e;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType$PremiumReserveTicket$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/bookingsuccessproducttype/BookingSuccessProductType$PremiumReserveTicket;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PremiumReserveTicket> serializer() {
                return BookingSuccessProductType$PremiumReserveTicket$$serializer.f1165a;
            }
        }

        public PremiumReserveTicket(String bookingId, String str, Map map) {
            Intrinsics.i(bookingId, "bookingId");
            this.b = bookingId;
            this.c = str;
            this.d = map;
            this.e = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PremiumReserveTicket)) {
                return false;
            }
            PremiumReserveTicket premiumReserveTicket = (PremiumReserveTicket) obj;
            return Intrinsics.d(this.b, premiumReserveTicket.b) && Intrinsics.d(this.c, premiumReserveTicket.c) && Intrinsics.d(this.d, premiumReserveTicket.d) && this.e == premiumReserveTicket.e;
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            String str = this.c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Map map = this.d;
            return ((iHashCode2 + (map != null ? map.hashCode() : 0)) * 31) + (this.e ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("PremiumReserveTicket(bookingId=", this.b, ", passTierType=", this.c, ", analyticsAttrsMap=");
            sbE.append(this.d);
            sbE.append(", couponApplied=");
            sbE.append(this.e);
            sbE.append(")");
            return sbE.toString();
        }

        public /* synthetic */ PremiumReserveTicket(Map map, boolean z, int i, String str, String str2) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.b(BookingSuccessProductType$PremiumReserveTicket$$serializer.f1165a.getDescriptor(), i, 1);
                throw null;
            }
            this.b = str;
            if ((i & 2) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
            if ((i & 4) == 0) {
                this.d = null;
            } else {
                this.d = map;
            }
            if ((i & 8) == 0) {
                this.e = false;
            } else {
                this.e = z;
            }
        }
    }
}
