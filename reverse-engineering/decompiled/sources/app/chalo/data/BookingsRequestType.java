package app.chalo.data;

import defpackage.t10;
import defpackage.vo1;
import defpackage.wb;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0010\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0002\u0082\u0001\u000f\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f ¨\u0006!"}, d2 = {"Lapp/chalo/data/BookingsRequestType;", "", "Companion", "MobileTicketType", "MagicPassType", "RideBasedPassType", "PendingSuperPassType", "ApplicationPassType", "QuickPayType", "InstantTicketType", "PremiumBusTicketType", "OndcTicketType", "OndcMetroTicketType", "MetroTicketType", "MultiModalGroupTicketType", "SuperPassRideType", "CardRechargeType", "CardTransactionReceiptType", "Lapp/chalo/data/BookingsRequestType$ApplicationPassType;", "Lapp/chalo/data/BookingsRequestType$CardRechargeType;", "Lapp/chalo/data/BookingsRequestType$CardTransactionReceiptType;", "Lapp/chalo/data/BookingsRequestType$InstantTicketType;", "Lapp/chalo/data/BookingsRequestType$MagicPassType;", "Lapp/chalo/data/BookingsRequestType$MetroTicketType;", "Lapp/chalo/data/BookingsRequestType$MobileTicketType;", "Lapp/chalo/data/BookingsRequestType$MultiModalGroupTicketType;", "Lapp/chalo/data/BookingsRequestType$OndcMetroTicketType;", "Lapp/chalo/data/BookingsRequestType$OndcTicketType;", "Lapp/chalo/data/BookingsRequestType$PendingSuperPassType;", "Lapp/chalo/data/BookingsRequestType$PremiumBusTicketType;", "Lapp/chalo/data/BookingsRequestType$QuickPayType;", "Lapp/chalo/data/BookingsRequestType$RideBasedPassType;", "Lapp/chalo/data/BookingsRequestType$SuperPassRideType;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class BookingsRequestType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new wb(9));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2317a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/BookingsRequestType$ApplicationPassType;", "Lapp/chalo/data/BookingsRequestType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ApplicationPassType extends BookingsRequestType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/BookingsRequestType$ApplicationPassType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/BookingsRequestType$ApplicationPassType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<ApplicationPassType> serializer() {
                return BookingsRequestType$ApplicationPassType$$serializer.f2318a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ApplicationPassType(int i, String str, String str2) {
            super(str);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(BookingsRequestType$ApplicationPassType$$serializer.f2318a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApplicationPassType) && Intrinsics.d(this.c, ((ApplicationPassType) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return vo1.B("ApplicationPassType(uniqueId=", this.c, ")");
        }

        public ApplicationPassType(String str) {
            super(str, 0);
            this.c = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/BookingsRequestType$CardRechargeType;", "Lapp/chalo/data/BookingsRequestType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class CardRechargeType extends BookingsRequestType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;
        public final CardRechargeSummaryData d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/BookingsRequestType$CardRechargeType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/BookingsRequestType$CardRechargeType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<CardRechargeType> serializer() {
                return BookingsRequestType$CardRechargeType$$serializer.f2319a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ CardRechargeType(int i, String str, String str2, CardRechargeSummaryData cardRechargeSummaryData) {
            super(str);
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(BookingsRequestType$CardRechargeType$$serializer.f2319a.getDescriptor(), i, 7);
                throw null;
            }
            this.c = str2;
            this.d = cardRechargeSummaryData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardRechargeType)) {
                return false;
            }
            CardRechargeType cardRechargeType = (CardRechargeType) obj;
            return Intrinsics.d(this.c, cardRechargeType.c) && Intrinsics.d(this.d, cardRechargeType.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + (this.c.hashCode() * 31);
        }

        public final String toString() {
            return "CardRechargeType(transactionId=" + this.c + ", cardRechargeData=" + this.d + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardRechargeType(String transactionId, CardRechargeSummaryData cardRechargeData) {
            super(transactionId, 0);
            Intrinsics.i(transactionId, "transactionId");
            Intrinsics.i(cardRechargeData, "cardRechargeData");
            this.c = transactionId;
            this.d = cardRechargeData;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/BookingsRequestType$CardTransactionReceiptType;", "Lapp/chalo/data/BookingsRequestType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class CardTransactionReceiptType extends BookingsRequestType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/BookingsRequestType$CardTransactionReceiptType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/BookingsRequestType$CardTransactionReceiptType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<CardTransactionReceiptType> serializer() {
                return BookingsRequestType$CardTransactionReceiptType$$serializer.f2320a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ CardTransactionReceiptType(int i, String str, String str2) {
            super(str);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(BookingsRequestType$CardTransactionReceiptType$$serializer.f2320a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CardTransactionReceiptType) && Intrinsics.d(this.c, ((CardTransactionReceiptType) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return vo1.B("CardTransactionReceiptType(transactionId=", this.c, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardTransactionReceiptType(String transactionId) {
            super(transactionId, 0);
            Intrinsics.i(transactionId, "transactionId");
            this.c = transactionId;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/BookingsRequestType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/BookingsRequestType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<BookingsRequestType> serializer() {
            return (KSerializer) BookingsRequestType.b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/BookingsRequestType$InstantTicketType;", "Lapp/chalo/data/BookingsRequestType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class InstantTicketType extends BookingsRequestType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/BookingsRequestType$InstantTicketType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/BookingsRequestType$InstantTicketType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<InstantTicketType> serializer() {
                return BookingsRequestType$InstantTicketType$$serializer.f2321a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ InstantTicketType(int i, String str, String str2) {
            super(str);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(BookingsRequestType$InstantTicketType$$serializer.f2321a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InstantTicketType) && Intrinsics.d(this.c, ((InstantTicketType) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return vo1.B("InstantTicketType(bookingId=", this.c, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InstantTicketType(String bookingId) {
            super(bookingId, 0);
            Intrinsics.i(bookingId, "bookingId");
            this.c = bookingId;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/BookingsRequestType$MagicPassType;", "Lapp/chalo/data/BookingsRequestType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class MagicPassType extends BookingsRequestType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/BookingsRequestType$MagicPassType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/BookingsRequestType$MagicPassType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<MagicPassType> serializer() {
                return BookingsRequestType$MagicPassType$$serializer.f2322a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ MagicPassType(int i, String str, String str2) {
            super(str);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(BookingsRequestType$MagicPassType$$serializer.f2322a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MagicPassType) && Intrinsics.d(this.c, ((MagicPassType) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return vo1.B("MagicPassType(passId=", this.c, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MagicPassType(String passId) {
            super(passId, 0);
            Intrinsics.i(passId, "passId");
            this.c = passId;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/BookingsRequestType$MetroTicketType;", "Lapp/chalo/data/BookingsRequestType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class MetroTicketType extends BookingsRequestType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/BookingsRequestType$MetroTicketType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/BookingsRequestType$MetroTicketType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<MetroTicketType> serializer() {
                return BookingsRequestType$MetroTicketType$$serializer.f2323a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ MetroTicketType(int i, String str, String str2) {
            super(str);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(BookingsRequestType$MetroTicketType$$serializer.f2323a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MetroTicketType) && Intrinsics.d(this.c, ((MetroTicketType) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return vo1.B("MetroTicketType(bookingId=", this.c, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MetroTicketType(String bookingId) {
            super(bookingId, 0);
            Intrinsics.i(bookingId, "bookingId");
            this.c = bookingId;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/BookingsRequestType$MobileTicketType;", "Lapp/chalo/data/BookingsRequestType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class MobileTicketType extends BookingsRequestType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/BookingsRequestType$MobileTicketType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/BookingsRequestType$MobileTicketType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<MobileTicketType> serializer() {
                return BookingsRequestType$MobileTicketType$$serializer.f2324a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ MobileTicketType(int i, String str, String str2) {
            super(str);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(BookingsRequestType$MobileTicketType$$serializer.f2324a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MobileTicketType) && Intrinsics.d(this.c, ((MobileTicketType) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return vo1.B("MobileTicketType(ticketId=", this.c, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MobileTicketType(String ticketId) {
            super(ticketId, 0);
            Intrinsics.i(ticketId, "ticketId");
            this.c = ticketId;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/BookingsRequestType$MultiModalGroupTicketType;", "Lapp/chalo/data/BookingsRequestType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class MultiModalGroupTicketType extends BookingsRequestType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/BookingsRequestType$MultiModalGroupTicketType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/BookingsRequestType$MultiModalGroupTicketType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<MultiModalGroupTicketType> serializer() {
                return BookingsRequestType$MultiModalGroupTicketType$$serializer.f2325a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ MultiModalGroupTicketType(int i, String str, String str2) {
            super(str);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(BookingsRequestType$MultiModalGroupTicketType$$serializer.f2325a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MultiModalGroupTicketType) && Intrinsics.d(this.c, ((MultiModalGroupTicketType) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return vo1.B("MultiModalGroupTicketType(groupId=", this.c, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultiModalGroupTicketType(String groupId) {
            super(groupId, 0);
            Intrinsics.i(groupId, "groupId");
            this.c = groupId;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/BookingsRequestType$OndcMetroTicketType;", "Lapp/chalo/data/BookingsRequestType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class OndcMetroTicketType extends BookingsRequestType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/BookingsRequestType$OndcMetroTicketType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/BookingsRequestType$OndcMetroTicketType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<OndcMetroTicketType> serializer() {
                return BookingsRequestType$OndcMetroTicketType$$serializer.f2326a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ OndcMetroTicketType(int i, String str, String str2) {
            super(str);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(BookingsRequestType$OndcMetroTicketType$$serializer.f2326a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OndcMetroTicketType) && Intrinsics.d(this.c, ((OndcMetroTicketType) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return vo1.B("OndcMetroTicketType(bookingId=", this.c, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OndcMetroTicketType(String bookingId) {
            super(bookingId, 0);
            Intrinsics.i(bookingId, "bookingId");
            this.c = bookingId;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/BookingsRequestType$OndcTicketType;", "Lapp/chalo/data/BookingsRequestType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class OndcTicketType extends BookingsRequestType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/BookingsRequestType$OndcTicketType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/BookingsRequestType$OndcTicketType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<OndcTicketType> serializer() {
                return BookingsRequestType$OndcTicketType$$serializer.f2327a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ OndcTicketType(int i, String str, String str2) {
            super(str);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(BookingsRequestType$OndcTicketType$$serializer.f2327a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OndcTicketType) && Intrinsics.d(this.c, ((OndcTicketType) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return vo1.B("OndcTicketType(bookingId=", this.c, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OndcTicketType(String bookingId) {
            super(bookingId, 0);
            Intrinsics.i(bookingId, "bookingId");
            this.c = bookingId;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/BookingsRequestType$PendingSuperPassType;", "Lapp/chalo/data/BookingsRequestType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PendingSuperPassType extends BookingsRequestType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/BookingsRequestType$PendingSuperPassType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/BookingsRequestType$PendingSuperPassType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PendingSuperPassType> serializer() {
                return BookingsRequestType$PendingSuperPassType$$serializer.f2328a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PendingSuperPassType(int i, String str, String str2) {
            super(str);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(BookingsRequestType$PendingSuperPassType$$serializer.f2328a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PendingSuperPassType) && Intrinsics.d(this.c, ((PendingSuperPassType) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return vo1.B("PendingSuperPassType(passId=", this.c, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingSuperPassType(String passId) {
            super(passId, 0);
            Intrinsics.i(passId, "passId");
            this.c = passId;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/BookingsRequestType$PremiumBusTicketType;", "Lapp/chalo/data/BookingsRequestType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PremiumBusTicketType extends BookingsRequestType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/BookingsRequestType$PremiumBusTicketType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/BookingsRequestType$PremiumBusTicketType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PremiumBusTicketType> serializer() {
                return BookingsRequestType$PremiumBusTicketType$$serializer.f2329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PremiumBusTicketType(int i, String str, String str2) {
            super(str);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(BookingsRequestType$PremiumBusTicketType$$serializer.f2329a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PremiumBusTicketType) && Intrinsics.d(this.c, ((PremiumBusTicketType) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return vo1.B("PremiumBusTicketType(bookingId=", this.c, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PremiumBusTicketType(String bookingId) {
            super(bookingId, 0);
            Intrinsics.i(bookingId, "bookingId");
            this.c = bookingId;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/BookingsRequestType$QuickPayType;", "Lapp/chalo/data/BookingsRequestType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class QuickPayType extends BookingsRequestType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;
        public final String d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/BookingsRequestType$QuickPayType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/BookingsRequestType$QuickPayType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<QuickPayType> serializer() {
                return BookingsRequestType$QuickPayType$$serializer.f2330a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ QuickPayType(int i, String str, String str2, String str3) {
            super(str);
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(BookingsRequestType$QuickPayType$$serializer.f2330a.getDescriptor(), i, 7);
                throw null;
            }
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuickPayType)) {
                return false;
            }
            QuickPayType quickPayType = (QuickPayType) obj;
            return Intrinsics.d(this.c, quickPayType.c) && Intrinsics.d(this.d, quickPayType.d);
        }

        public final int hashCode() {
            int iHashCode = this.c.hashCode() * 31;
            String str = this.d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return vo1.o("QuickPayType(orderId=", this.c, ", transactionId=", this.d, ")");
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0013  */
        /* JADX WARN: Illegal instructions before constructor call */
        public QuickPayType(String orderId, String str) {
            String str2;
            Intrinsics.i(orderId, "orderId");
            if (str != null) {
                str2 = str.length() > 0 ? str : null;
                str2 = str2 == null ? orderId : str2;
            }
            super(str2, 0);
            this.c = orderId;
            this.d = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/BookingsRequestType$RideBasedPassType;", "Lapp/chalo/data/BookingsRequestType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class RideBasedPassType extends BookingsRequestType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/BookingsRequestType$RideBasedPassType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/BookingsRequestType$RideBasedPassType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<RideBasedPassType> serializer() {
                return BookingsRequestType$RideBasedPassType$$serializer.f2331a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RideBasedPassType(int i, String str, String str2) {
            super(str);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(BookingsRequestType$RideBasedPassType$$serializer.f2331a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RideBasedPassType) && Intrinsics.d(this.c, ((RideBasedPassType) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return vo1.B("RideBasedPassType(passId=", this.c, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RideBasedPassType(String passId) {
            super(passId, 0);
            Intrinsics.i(passId, "passId");
            this.c = passId;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/BookingsRequestType$SuperPassRideType;", "Lapp/chalo/data/BookingsRequestType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class SuperPassRideType extends BookingsRequestType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;
        public final long d;
        public final long e;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/BookingsRequestType$SuperPassRideType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/BookingsRequestType$SuperPassRideType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<SuperPassRideType> serializer() {
                return BookingsRequestType$SuperPassRideType$$serializer.f2332a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SuperPassRideType(long j, String str, String str2, long j2, int i) {
            super(str);
            if (15 != (i & 15)) {
                PluginExceptionsKt.b(BookingsRequestType$SuperPassRideType$$serializer.f2332a.getDescriptor(), i, 15);
                throw null;
            }
            this.c = str2;
            this.d = j;
            this.e = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperPassRideType)) {
                return false;
            }
            SuperPassRideType superPassRideType = (SuperPassRideType) obj;
            return Intrinsics.d(this.c, superPassRideType.c) && this.d == superPassRideType.d && this.e == superPassRideType.e;
        }

        public final int hashCode() {
            int iHashCode = this.c.hashCode() * 31;
            long j = this.d;
            int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.e;
            return i + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            return t10.g(this.e, ", punchTimeInMillis=", ")", t10.m(this.d, "SuperPassRideType(passId=", this.c, ", activationTimeInSec="));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuperPassRideType(String passId, long j, long j2) {
            super(passId, 0);
            Intrinsics.i(passId, "passId");
            this.c = passId;
            this.d = j;
            this.e = j2;
        }
    }

    public /* synthetic */ BookingsRequestType(String str) {
        this.f2317a = str;
    }

    public BookingsRequestType(String str, int i) {
        this.f2317a = str;
    }
}
