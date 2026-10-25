package app.chalo.appsupport;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.scenes.args.BookingCancellationTarget;
import defpackage.r30;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appsupport/BookingHelpScreenDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BookingHelpScreenDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloTransitMode f969a;
    public final BookingCancellationTarget b;
    public final List c;
    public final boolean d;
    public final BookingHelpBottomSheetType e;

    public BookingHelpScreenDataState(ChaloTransitMode transitMode, BookingCancellationTarget bookingCancellationTarget, List faqList, boolean z, BookingHelpBottomSheetType bottomSheetType) {
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(faqList, "faqList");
        Intrinsics.i(bottomSheetType, "bottomSheetType");
        this.f969a = transitMode;
        this.b = bookingCancellationTarget;
        this.c = faqList;
        this.d = z;
        this.e = bottomSheetType;
    }

    public static BookingHelpScreenDataState a(BookingHelpScreenDataState bookingHelpScreenDataState, BookingCancellationTarget bookingCancellationTarget, ArrayList arrayList, boolean z, BookingHelpBottomSheetType bookingHelpBottomSheetType, int i) {
        BookingCancellationTarget target = bookingCancellationTarget;
        ChaloTransitMode transitMode = bookingHelpScreenDataState.f969a;
        if ((i & 2) != 0) {
            target = bookingHelpScreenDataState.b;
        }
        List faqList = arrayList;
        if ((i & 4) != 0) {
            faqList = bookingHelpScreenDataState.c;
        }
        if ((i & 8) != 0) {
            z = bookingHelpScreenDataState.d;
        }
        bookingHelpScreenDataState.getClass();
        if ((i & 32) != 0) {
            bookingHelpBottomSheetType = bookingHelpScreenDataState.e;
        }
        BookingHelpBottomSheetType bottomSheetType = bookingHelpBottomSheetType;
        bookingHelpScreenDataState.getClass();
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(target, "target");
        Intrinsics.i(faqList, "faqList");
        Intrinsics.i(bottomSheetType, "bottomSheetType");
        boolean z2 = z;
        return new BookingHelpScreenDataState(transitMode, target, faqList, z2, bottomSheetType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingHelpScreenDataState)) {
            return false;
        }
        BookingHelpScreenDataState bookingHelpScreenDataState = (BookingHelpScreenDataState) obj;
        return this.f969a == bookingHelpScreenDataState.f969a && this.b.equals(bookingHelpScreenDataState.b) && Intrinsics.d(this.c, bookingHelpScreenDataState.c) && this.d == bookingHelpScreenDataState.d && Intrinsics.d(this.e, bookingHelpScreenDataState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((r30.b((this.b.hashCode() + (this.f969a.hashCode() * 31)) * 31, 31, this.c) + (this.d ? 1231 : 1237)) * 961);
    }

    public final String toString() {
        return "BookingHelpScreenDataState(transitMode=" + this.f969a + ", target=" + this.b + ", faqList=" + this.c + ", showLoadingDialog=" + this.d + ", toastErrorMsg=null, bottomSheetType=" + this.e + ")";
    }
}
