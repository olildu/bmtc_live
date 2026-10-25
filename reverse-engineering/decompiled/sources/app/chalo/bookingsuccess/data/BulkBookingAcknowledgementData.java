package app.chalo.bookingsuccess.data;

import androidx.core.app.FrameMetricsAggregator;
import app.chalo.models.SuperPassSubTypes;
import defpackage.b3;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import defpackage.wb;
import java.util.List;
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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lapp/chalo/bookingsuccess/data/BulkBookingAcknowledgementData;", "", "Companion", "BookingSuccess", "BookingFailed", "OverlappingBookingFailure", "Lapp/chalo/bookingsuccess/data/BulkBookingAcknowledgementData$BookingFailed;", "Lapp/chalo/bookingsuccess/data/BulkBookingAcknowledgementData$BookingSuccess;", "Lapp/chalo/bookingsuccess/data/BulkBookingAcknowledgementData$OverlappingBookingFailure;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class BulkBookingAcknowledgementData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f1157a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new wb(16));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/bookingsuccess/data/BulkBookingAcknowledgementData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/bookingsuccess/data/BulkBookingAcknowledgementData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<BulkBookingAcknowledgementData> serializer() {
            return (KSerializer) BulkBookingAcknowledgementData.f1157a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/bookingsuccess/data/BulkBookingAcknowledgementData$BookingFailed;", "Lapp/chalo/bookingsuccess/data/BulkBookingAcknowledgementData;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class BookingFailed extends BulkBookingAcknowledgementData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] k;
        public final String b;
        public final SuperPassSubTypes c;
        public final String d;
        public final int e;
        public final String f;
        public final String g;
        public final List h;
        public final List i;
        public final boolean j;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/bookingsuccess/data/BulkBookingAcknowledgementData$BookingFailed$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/bookingsuccess/data/BulkBookingAcknowledgementData$BookingFailed;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<BookingFailed> serializer() {
                return BulkBookingAcknowledgementData$BookingFailed$$serializer.f1158a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            k = new Lazy[]{null, LazyKt.a(lazyThreadSafetyMode, new wb(17)), null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new wb(18)), LazyKt.a(lazyThreadSafetyMode, new wb(19)), null};
        }

        public /* synthetic */ BookingFailed(int i, String str, SuperPassSubTypes superPassSubTypes, String str2, int i2, String str3, String str4, List list, List list2, boolean z) {
            if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
                PluginExceptionsKt.b(BulkBookingAcknowledgementData$BookingFailed$$serializer.f1158a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
                throw null;
            }
            this.b = str;
            this.c = superPassSubTypes;
            this.d = str2;
            this.e = i2;
            this.f = str3;
            this.g = str4;
            this.h = list;
            this.i = list2;
            this.j = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BookingFailed)) {
                return false;
            }
            BookingFailed bookingFailed = (BookingFailed) obj;
            return Intrinsics.d(this.b, bookingFailed.b) && this.c == bookingFailed.c && Intrinsics.d(this.d, bookingFailed.d) && this.e == bookingFailed.e && Intrinsics.d(this.f, bookingFailed.f) && Intrinsics.d(this.g, bookingFailed.g) && Intrinsics.d(this.h, bookingFailed.h) && Intrinsics.d(this.i, bookingFailed.i) && this.j == bookingFailed.j;
        }

        public final int hashCode() {
            return r30.b(r30.b(nf1.e(nf1.e((nf1.e((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d) + this.e) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i) + (this.j ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BookingFailed(passId=");
            sb.append(this.b);
            sb.append(", superPassSubType=");
            sb.append(this.c);
            sb.append(", configId=");
            cb0.o(this.e, this.d, ", fareMappingId=", ", endStopId=", sb);
            cb0.t(sb, this.f, ", startStopId=", this.g, ", requestedTripIds=");
            dd.o(sb, this.h, ", seats=", this.i, ", autoAssignForWomenReservation=");
            return b3.g(")", sb, this.j);
        }

        public BookingFailed(String str, SuperPassSubTypes superPassSubType, String configId, int i, String str2, String str3, List requestedTripIds, List seats, boolean z) {
            Intrinsics.i(superPassSubType, "superPassSubType");
            Intrinsics.i(configId, "configId");
            Intrinsics.i(requestedTripIds, "requestedTripIds");
            Intrinsics.i(seats, "seats");
            this.b = str;
            this.c = superPassSubType;
            this.d = configId;
            this.e = i;
            this.f = str2;
            this.g = str3;
            this.h = requestedTripIds;
            this.i = seats;
            this.j = z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/bookingsuccess/data/BulkBookingAcknowledgementData$OverlappingBookingFailure;", "Lapp/chalo/bookingsuccess/data/BulkBookingAcknowledgementData;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class OverlappingBookingFailure extends BulkBookingAcknowledgementData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] g = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new wb(21)), null, null};
        public final String b;
        public final String c;
        public final SuperPassSubTypes d;
        public final String e;
        public final int f;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/bookingsuccess/data/BulkBookingAcknowledgementData$OverlappingBookingFailure$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/bookingsuccess/data/BulkBookingAcknowledgementData$OverlappingBookingFailure;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<OverlappingBookingFailure> serializer() {
                return BulkBookingAcknowledgementData$OverlappingBookingFailure$$serializer.f1160a;
            }
        }

        public /* synthetic */ OverlappingBookingFailure(int i, String str, String str2, SuperPassSubTypes superPassSubTypes, String str3, int i2) {
            if (31 != (i & 31)) {
                PluginExceptionsKt.b(BulkBookingAcknowledgementData$OverlappingBookingFailure$$serializer.f1160a.getDescriptor(), i, 31);
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = superPassSubTypes;
            this.e = str3;
            this.f = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OverlappingBookingFailure)) {
                return false;
            }
            OverlappingBookingFailure overlappingBookingFailure = (OverlappingBookingFailure) obj;
            return Intrinsics.d(this.b, overlappingBookingFailure.b) && Intrinsics.d(this.c, overlappingBookingFailure.c) && this.d == overlappingBookingFailure.d && Intrinsics.d(this.e, overlappingBookingFailure.e) && this.f == overlappingBookingFailure.f;
        }

        public final int hashCode() {
            String str = this.b;
            return nf1.e((this.d.hashCode() + nf1.e((str == null ? 0 : str.hashCode()) * 31, 31, this.c)) * 31, 31, this.e) + this.f;
        }

        public final String toString() {
            StringBuilder sbE = dd.e("OverlappingBookingFailure(errorMessage=", this.b, ", passId=", this.c, ", superPassSubType=");
            sbE.append(this.d);
            sbE.append(", configId=");
            sbE.append(this.e);
            sbE.append(", fareMappingId=");
            return b3.f(")", this.f, sbE);
        }

        public OverlappingBookingFailure(String str, String passId, SuperPassSubTypes superPassSubType, String configId, int i) {
            Intrinsics.i(passId, "passId");
            Intrinsics.i(superPassSubType, "superPassSubType");
            Intrinsics.i(configId, "configId");
            this.b = str;
            this.c = passId;
            this.d = superPassSubType;
            this.e = configId;
            this.f = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/bookingsuccess/data/BulkBookingAcknowledgementData$BookingSuccess;", "Lapp/chalo/bookingsuccess/data/BulkBookingAcknowledgementData;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class BookingSuccess extends BulkBookingAcknowledgementData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] f = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new wb(20)), null, null};
        public final String b;
        public final SuperPassSubTypes c;
        public final String d;
        public final int e;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/bookingsuccess/data/BulkBookingAcknowledgementData$BookingSuccess$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/bookingsuccess/data/BulkBookingAcknowledgementData$BookingSuccess;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<BookingSuccess> serializer() {
                return BulkBookingAcknowledgementData$BookingSuccess$$serializer.f1159a;
            }
        }

        public BookingSuccess(int i, SuperPassSubTypes superPassSubType, String passId, String configId) {
            Intrinsics.i(passId, "passId");
            Intrinsics.i(superPassSubType, "superPassSubType");
            Intrinsics.i(configId, "configId");
            this.b = passId;
            this.c = superPassSubType;
            this.d = configId;
            this.e = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BookingSuccess)) {
                return false;
            }
            BookingSuccess bookingSuccess = (BookingSuccess) obj;
            return Intrinsics.d(this.b, bookingSuccess.b) && this.c == bookingSuccess.c && Intrinsics.d(this.d, bookingSuccess.d) && this.e == bookingSuccess.e;
        }

        public final int hashCode() {
            return nf1.e((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d) + this.e;
        }

        public final String toString() {
            return "BookingSuccess(passId=" + this.b + ", superPassSubType=" + this.c + ", configId=" + this.d + ", fareMappingId=" + this.e + ")";
        }

        public /* synthetic */ BookingSuccess(int i, String str, SuperPassSubTypes superPassSubTypes, String str2, int i2) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.b(BulkBookingAcknowledgementData$BookingSuccess$$serializer.f1159a.getDescriptor(), i, 15);
                throw null;
            }
            this.b = str;
            this.c = superPassSubTypes;
            this.d = str2;
            this.e = i2;
        }
    }
}
