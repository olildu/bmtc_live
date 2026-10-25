package app.chalo.scenes.args;

import app.chalo.scenes.ChaloScenes;
import defpackage.a9;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/BookingHelpArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class BookingHelpArgs extends SceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d;
    public final List b;
    public final BookingCancellationTarget c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/BookingHelpArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/BookingHelpArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<BookingHelpArgs> serializer() {
            return BookingHelpArgs$$serializer.f9226a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new a9(21)), LazyKt.a(lazyThreadSafetyMode, new a9(22))};
    }

    public /* synthetic */ BookingHelpArgs(int i, List list, BookingCancellationTarget bookingCancellationTarget) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(BookingHelpArgs$$serializer.f9226a.getDescriptor(), i, 3);
            throw null;
        }
        this.b = list;
        this.c = bookingCancellationTarget;
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.BookingHelpScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingHelpArgs)) {
            return false;
        }
        BookingHelpArgs bookingHelpArgs = (BookingHelpArgs) obj;
        return Intrinsics.d(this.b, bookingHelpArgs.b) && Intrinsics.d(this.c, bookingHelpArgs.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "BookingHelpArgs(faqList=" + this.b + ", cancellationTarget=" + this.c + ")";
    }

    public BookingHelpArgs(List faqList, BookingCancellationTarget bookingCancellationTarget) {
        Intrinsics.i(faqList, "faqList");
        this.b = faqList;
        this.c = bookingCancellationTarget;
    }
}
