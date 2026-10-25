package app.chalo.productsummary.ui.pass;

import app.chalo.constants.Source;
import app.chalo.data.BookingsRequestType;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.productsummary.domain.DownloadInvoiceOptionVisibilityState;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/pass/PassSummaryDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassSummaryDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8768a;
    public final boolean b;
    public final boolean c;
    public final BookingsRequestType d;
    public final ChaloUserBookingType e;
    public final String f;
    public final DownloadInvoiceOptionVisibilityState g;
    public final Source h;

    static {
        BookingsRequestType.Companion companion = BookingsRequestType.INSTANCE;
    }

    public PassSummaryDataState(boolean z, boolean z2, boolean z3, BookingsRequestType bookingsRequestType, ChaloUserBookingType chaloUserBookingType, String str, DownloadInvoiceOptionVisibilityState downloadInvoiceOptionVisibilityState, Source source) {
        Intrinsics.i(source, "source");
        this.f8768a = z;
        this.b = z2;
        this.c = z3;
        this.d = bookingsRequestType;
        this.e = chaloUserBookingType;
        this.f = str;
        this.g = downloadInvoiceOptionVisibilityState;
        this.h = source;
    }

    public static PassSummaryDataState a(PassSummaryDataState passSummaryDataState, boolean z, boolean z2, BookingsRequestType bookingsRequestType, ChaloUserBookingType chaloUserBookingType, String str, DownloadInvoiceOptionVisibilityState downloadInvoiceOptionVisibilityState, Source source, int i) {
        if ((i & 1) != 0) {
            z = passSummaryDataState.f8768a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            z2 = passSummaryDataState.b;
        }
        boolean z4 = z2;
        boolean z5 = (i & 4) != 0 ? passSummaryDataState.c : true;
        if ((i & 8) != 0) {
            bookingsRequestType = passSummaryDataState.d;
        }
        BookingsRequestType bookingsRequestType2 = bookingsRequestType;
        if ((i & 16) != 0) {
            chaloUserBookingType = passSummaryDataState.e;
        }
        ChaloUserBookingType chaloUserBookingType2 = chaloUserBookingType;
        if ((i & 32) != 0) {
            str = passSummaryDataState.f;
        }
        String str2 = str;
        if ((i & 64) != 0) {
            downloadInvoiceOptionVisibilityState = passSummaryDataState.g;
        }
        DownloadInvoiceOptionVisibilityState downloadInvoiceOptionVisibilityState2 = downloadInvoiceOptionVisibilityState;
        Source source2 = (i & 128) != 0 ? passSummaryDataState.h : source;
        passSummaryDataState.getClass();
        Intrinsics.i(downloadInvoiceOptionVisibilityState2, "downloadInvoiceOptionVisibilityState");
        Intrinsics.i(source2, "source");
        return new PassSummaryDataState(z3, z4, z5, bookingsRequestType2, chaloUserBookingType2, str2, downloadInvoiceOptionVisibilityState2, source2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassSummaryDataState)) {
            return false;
        }
        PassSummaryDataState passSummaryDataState = (PassSummaryDataState) obj;
        return this.f8768a == passSummaryDataState.f8768a && this.b == passSummaryDataState.b && this.c == passSummaryDataState.c && Intrinsics.d(this.d, passSummaryDataState.d) && Intrinsics.d(this.e, passSummaryDataState.e) && Intrinsics.d(this.f, passSummaryDataState.f) && Intrinsics.d(this.g, passSummaryDataState.g) && this.h == passSummaryDataState.h;
    }

    public final int hashCode() {
        int i = (((((this.f8768a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31;
        BookingsRequestType bookingsRequestType = this.d;
        int iHashCode = (i + (bookingsRequestType == null ? 0 : bookingsRequestType.hashCode())) * 31;
        ChaloUserBookingType chaloUserBookingType = this.e;
        int iHashCode2 = (iHashCode + (chaloUserBookingType == null ? 0 : chaloUserBookingType.hashCode())) * 31;
        String str = this.f;
        return this.h.hashCode() + ((this.g.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("PassSummaryDataState(isLoading=", ", showLoadingDialog=", ", isError=", this.f8768a, this.b);
        sbR.append(this.c);
        sbR.append(", bookingRequestType=");
        sbR.append(this.d);
        sbR.append(", chaloUserBookingType=");
        sbR.append(this.e);
        sbR.append(", imageUrlToShowFullScreen=");
        sbR.append(this.f);
        sbR.append(", downloadInvoiceOptionVisibilityState=");
        sbR.append(this.g);
        sbR.append(", source=");
        sbR.append(this.h);
        sbR.append(")");
        return sbR.toString();
    }
}
