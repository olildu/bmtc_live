package app.chalo.scenes.args;

import app.chalo.bookingsuccessproducttype.BookingSuccessProductType;
import app.chalo.constants.Source;
import app.chalo.scenes.ChaloScenes;
import defpackage.a9;
import defpackage.wb;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/scenes/args/BookingSuccessArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Companion", "ProductSuccessScreen", "BulkBooking", "Lapp/chalo/scenes/args/BookingSuccessArgs$BulkBooking;", "Lapp/chalo/scenes/args/BookingSuccessArgs$ProductSuccessScreen;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class BookingSuccessArgs extends SceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c;
    public static final Object d;
    public final Source b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/BookingSuccessArgs$BulkBooking;", "Lapp/chalo/scenes/args/BookingSuccessArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class BulkBooking extends BookingSuccessArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] g;
        public final String e;
        public final Source f;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/BookingSuccessArgs$BulkBooking$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/BookingSuccessArgs$BulkBooking;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<BulkBooking> serializer() {
                return BookingSuccessArgs$BulkBooking$$serializer.f9227a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            g = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new wb(1)), null, LazyKt.a(lazyThreadSafetyMode, new wb(2))};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BulkBooking(int i, Source source, String str, Source source2) {
            super(source);
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(BookingSuccessArgs$BulkBooking$$serializer.f9227a.getDescriptor(), i, 7);
                throw null;
            }
            this.e = str;
            this.f = source2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BulkBooking)) {
                return false;
            }
            BulkBooking bulkBooking = (BulkBooking) obj;
            return Intrinsics.d(this.e, bulkBooking.e) && this.f == bulkBooking.f;
        }

        public final int hashCode() {
            return this.f.hashCode() + (this.e.hashCode() * 31);
        }

        public final String toString() {
            return "BulkBooking(bulkBookingData=" + this.e + ", screenSource=" + this.f + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BulkBooking(Source screenSource, String str) {
            super(0, screenSource);
            Intrinsics.i(screenSource, "screenSource");
            this.e = str;
            this.f = screenSource;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/BookingSuccessArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/BookingSuccessArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<BookingSuccessArgs> serializer() {
            return (KSerializer) BookingSuccessArgs.d.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/BookingSuccessArgs$ProductSuccessScreen;", "Lapp/chalo/scenes/args/BookingSuccessArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ProductSuccessScreen extends BookingSuccessArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] g;
        public final BookingSuccessProductType e;
        public final Source f;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/BookingSuccessArgs$ProductSuccessScreen$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/BookingSuccessArgs$ProductSuccessScreen;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<ProductSuccessScreen> serializer() {
                return BookingSuccessArgs$ProductSuccessScreen$$serializer.f9228a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            g = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new wb(3)), LazyKt.a(lazyThreadSafetyMode, new wb(4)), LazyKt.a(lazyThreadSafetyMode, new wb(5))};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ProductSuccessScreen(int i, Source source, BookingSuccessProductType bookingSuccessProductType, Source source2) {
            super(source);
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(BookingSuccessArgs$ProductSuccessScreen$$serializer.f9228a.getDescriptor(), i, 7);
                throw null;
            }
            this.e = bookingSuccessProductType;
            this.f = source2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductSuccessScreen)) {
                return false;
            }
            ProductSuccessScreen productSuccessScreen = (ProductSuccessScreen) obj;
            return Intrinsics.d(this.e, productSuccessScreen.e) && this.f == productSuccessScreen.f;
        }

        public final int hashCode() {
            return this.f.hashCode() + (this.e.hashCode() * 31);
        }

        public final String toString() {
            return "ProductSuccessScreen(bookingSuccessProductType=" + this.e + ", screenSource=" + this.f + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProductSuccessScreen(BookingSuccessProductType bookingSuccessProductType, Source screenSource) {
            super(0, screenSource);
            Intrinsics.i(screenSource, "screenSource");
            this.e = bookingSuccessProductType;
            this.f = screenSource;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new a9(29))};
        d = LazyKt.a(lazyThreadSafetyMode, new wb(0));
    }

    public BookingSuccessArgs(int i, Source source) {
        this.b = source;
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.BookingSuccessScreen;
    }

    public /* synthetic */ BookingSuccessArgs(Source source) {
        this.b = source;
    }
}
