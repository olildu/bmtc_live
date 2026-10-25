package app.chalo.scenes.args;

import app.chalo.constants.Source;
import app.chalo.data.BookingsRequestType;
import app.chalo.scenes.ChaloScenes;
import defpackage.ll1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lapp/chalo/scenes/args/TripSummaryArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Companion", "PassSummaryScreen", "TicketSummaryScreen", "RideReceiptScreen", "Lapp/chalo/scenes/args/TripSummaryArgs$PassSummaryScreen;", "Lapp/chalo/scenes/args/TripSummaryArgs$RideReceiptScreen;", "Lapp/chalo/scenes/args/TripSummaryArgs$TicketSummaryScreen;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class TripSummaryArgs extends SceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ll1(8));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/TripSummaryArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/TripSummaryArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<TripSummaryArgs> serializer() {
            return (KSerializer) TripSummaryArgs.b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/TripSummaryArgs$PassSummaryScreen;", "Lapp/chalo/scenes/args/TripSummaryArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PassSummaryScreen extends TripSummaryArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] e;
        public final BookingsRequestType c;
        public final Source d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/TripSummaryArgs$PassSummaryScreen$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/TripSummaryArgs$PassSummaryScreen;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PassSummaryScreen> serializer() {
                return TripSummaryArgs$PassSummaryScreen$$serializer.f9334a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            e = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new ll1(9)), LazyKt.a(lazyThreadSafetyMode, new ll1(10))};
        }

        public /* synthetic */ PassSummaryScreen(int i, BookingsRequestType bookingsRequestType, Source source) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(TripSummaryArgs$PassSummaryScreen$$serializer.f9334a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = bookingsRequestType;
            this.d = source;
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.PassSummaryScreen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PassSummaryScreen)) {
                return false;
            }
            PassSummaryScreen passSummaryScreen = (PassSummaryScreen) obj;
            return Intrinsics.d(this.c, passSummaryScreen.c) && this.d == passSummaryScreen.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + (this.c.hashCode() * 31);
        }

        public final String toString() {
            return "PassSummaryScreen(bookingRequestType=" + this.c + ", source=" + this.d + ")";
        }

        public PassSummaryScreen(Source source, BookingsRequestType bookingsRequestType) {
            Intrinsics.i(source, "source");
            this.c = bookingsRequestType;
            this.d = source;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/TripSummaryArgs$RideReceiptScreen;", "Lapp/chalo/scenes/args/TripSummaryArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class RideReceiptScreen extends TripSummaryArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] e = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ll1(11))};
        public final String c;
        public final Source d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/TripSummaryArgs$RideReceiptScreen$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/TripSummaryArgs$RideReceiptScreen;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<RideReceiptScreen> serializer() {
                return TripSummaryArgs$RideReceiptScreen$$serializer.f9335a;
            }
        }

        public /* synthetic */ RideReceiptScreen(int i, Source source, String str) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(TripSummaryArgs$RideReceiptScreen$$serializer.f9335a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = str;
            this.d = source;
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.RideReceipt;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RideReceiptScreen)) {
                return false;
            }
            RideReceiptScreen rideReceiptScreen = (RideReceiptScreen) obj;
            return Intrinsics.d(this.c, rideReceiptScreen.c) && this.d == rideReceiptScreen.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + (this.c.hashCode() * 31);
        }

        public final String toString() {
            return "RideReceiptScreen(bookingId=" + this.c + ", source=" + this.d + ")";
        }

        public RideReceiptScreen(Source source, String bookingId) {
            Intrinsics.i(bookingId, "bookingId");
            Intrinsics.i(source, "source");
            this.c = bookingId;
            this.d = source;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/TripSummaryArgs$TicketSummaryScreen;", "Lapp/chalo/scenes/args/TripSummaryArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class TicketSummaryScreen extends TripSummaryArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] e;
        public final BookingsRequestType c;
        public final Source d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/TripSummaryArgs$TicketSummaryScreen$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/TripSummaryArgs$TicketSummaryScreen;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<TicketSummaryScreen> serializer() {
                return TripSummaryArgs$TicketSummaryScreen$$serializer.f9336a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            e = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new ll1(12)), LazyKt.a(lazyThreadSafetyMode, new ll1(13))};
        }

        public /* synthetic */ TicketSummaryScreen(int i, BookingsRequestType bookingsRequestType, Source source) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(TripSummaryArgs$TicketSummaryScreen$$serializer.f9336a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = bookingsRequestType;
            this.d = source;
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.TicketSummaryScreen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TicketSummaryScreen)) {
                return false;
            }
            TicketSummaryScreen ticketSummaryScreen = (TicketSummaryScreen) obj;
            return Intrinsics.d(this.c, ticketSummaryScreen.c) && this.d == ticketSummaryScreen.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + (this.c.hashCode() * 31);
        }

        public final String toString() {
            return "TicketSummaryScreen(bookingsRequestType=" + this.c + ", source=" + this.d + ")";
        }

        public TicketSummaryScreen(Source source, BookingsRequestType bookingsRequestType) {
            Intrinsics.i(source, "source");
            this.c = bookingsRequestType;
            this.d = source;
        }
    }
}
