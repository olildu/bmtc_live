package app.chalo.bookingsuccess;

import app.chalo.constants.Source;
import app.chalo.scenes.args.BookingSuccessArgs;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/bookingsuccess/BookingSuccessDataState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BookingSuccessDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BookingSuccessScreenDetail f1149a;
    public final BookingSuccessArgs b;
    public final Source c;
    public final boolean d;

    static {
        BookingSuccessArgs.Companion companion = BookingSuccessArgs.INSTANCE;
    }

    public BookingSuccessDataState(BookingSuccessScreenDetail bookingSuccessScreenDetail, BookingSuccessArgs bookingSuccessArgs, Source source, boolean z) {
        Intrinsics.i(source, "source");
        this.f1149a = bookingSuccessScreenDetail;
        this.b = bookingSuccessArgs;
        this.c = source;
        this.d = z;
    }

    public static BookingSuccessDataState a(BookingSuccessDataState bookingSuccessDataState, BookingSuccessScreenDetail bookingSuccessScreenDetail, int i) {
        if ((i & 1) != 0) {
            bookingSuccessScreenDetail = bookingSuccessDataState.f1149a;
        }
        BookingSuccessArgs bookingSuccessArgs = bookingSuccessDataState.b;
        Source source = bookingSuccessDataState.c;
        boolean z = (i & 8) != 0 ? bookingSuccessDataState.d : true;
        bookingSuccessDataState.getClass();
        Intrinsics.i(source, "source");
        return new BookingSuccessDataState(bookingSuccessScreenDetail, bookingSuccessArgs, source, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingSuccessDataState)) {
            return false;
        }
        BookingSuccessDataState bookingSuccessDataState = (BookingSuccessDataState) obj;
        return Intrinsics.d(this.f1149a, bookingSuccessDataState.f1149a) && Intrinsics.d(this.b, bookingSuccessDataState.b) && this.c == bookingSuccessDataState.c && this.d == bookingSuccessDataState.d;
    }

    public final int hashCode() {
        BookingSuccessScreenDetail bookingSuccessScreenDetail = this.f1149a;
        int iHashCode = (bookingSuccessScreenDetail == null ? 0 : bookingSuccessScreenDetail.hashCode()) * 31;
        BookingSuccessArgs bookingSuccessArgs = this.b;
        return nf1.f(this.c, (iHashCode + (bookingSuccessArgs != null ? bookingSuccessArgs.hashCode() : 0)) * 31, 31) + (this.d ? 1231 : 1237);
    }

    public final String toString() {
        return "BookingSuccessDataState(bookingSuccessScreenDetail=" + this.f1149a + ", args=" + this.b + ", source=" + this.c + ", isLoading=" + this.d + ")";
    }

    public /* synthetic */ BookingSuccessDataState(BookingSuccessArgs bookingSuccessArgs, Source source, int i) {
        this(null, (i & 2) != 0 ? null : bookingSuccessArgs, (i & 4) != 0 ? Source.BOOKING_SUCCESS_SCREEN : source, false);
    }
}
