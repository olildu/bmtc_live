package app.chalo.productsummary.ui.data;

import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TitleSubtitleUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/data/BookingDetailsUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BookingDetailsUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f8748a;
    public final TitleSubtitleUiState b;
    public final TitleSubtitleUiState c;
    public final TitleSubtitleUiState d;
    public final TitleSubtitleUiState e;
    public final TitleSubtitleUiState f;
    public final TitleSubtitleUiState g;

    public BookingDetailsUIState(TextUIState.ChaloTextUIState title, TitleSubtitleUiState titleSubtitleUiState, TitleSubtitleUiState titleSubtitleUiState2, TitleSubtitleUiState titleSubtitleUiState3, TitleSubtitleUiState titleSubtitleUiState4, TitleSubtitleUiState titleSubtitleUiState5, TitleSubtitleUiState titleSubtitleUiState6, int i) {
        titleSubtitleUiState = (i & 2) != 0 ? null : titleSubtitleUiState;
        titleSubtitleUiState2 = (i & 4) != 0 ? null : titleSubtitleUiState2;
        titleSubtitleUiState3 = (i & 8) != 0 ? null : titleSubtitleUiState3;
        titleSubtitleUiState4 = (i & 16) != 0 ? null : titleSubtitleUiState4;
        titleSubtitleUiState5 = (i & 32) != 0 ? null : titleSubtitleUiState5;
        titleSubtitleUiState6 = (i & 64) != 0 ? null : titleSubtitleUiState6;
        Intrinsics.i(title, "title");
        this.f8748a = title;
        this.b = titleSubtitleUiState;
        this.c = titleSubtitleUiState2;
        this.d = titleSubtitleUiState3;
        this.e = titleSubtitleUiState4;
        this.f = titleSubtitleUiState5;
        this.g = titleSubtitleUiState6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingDetailsUIState)) {
            return false;
        }
        BookingDetailsUIState bookingDetailsUIState = (BookingDetailsUIState) obj;
        return Intrinsics.d(this.f8748a, bookingDetailsUIState.f8748a) && Intrinsics.d(this.b, bookingDetailsUIState.b) && Intrinsics.d(this.c, bookingDetailsUIState.c) && Intrinsics.d(this.d, bookingDetailsUIState.d) && Intrinsics.d(this.e, bookingDetailsUIState.e) && Intrinsics.d(this.f, bookingDetailsUIState.f) && Intrinsics.d(this.g, bookingDetailsUIState.g);
    }

    public final int hashCode() {
        int iHashCode = this.f8748a.hashCode() * 31;
        TitleSubtitleUiState titleSubtitleUiState = this.b;
        int iHashCode2 = (iHashCode + (titleSubtitleUiState == null ? 0 : titleSubtitleUiState.hashCode())) * 31;
        TitleSubtitleUiState titleSubtitleUiState2 = this.c;
        int iHashCode3 = (iHashCode2 + (titleSubtitleUiState2 == null ? 0 : titleSubtitleUiState2.hashCode())) * 31;
        TitleSubtitleUiState titleSubtitleUiState3 = this.d;
        int iHashCode4 = (iHashCode3 + (titleSubtitleUiState3 == null ? 0 : titleSubtitleUiState3.hashCode())) * 31;
        TitleSubtitleUiState titleSubtitleUiState4 = this.e;
        int iHashCode5 = (iHashCode4 + (titleSubtitleUiState4 == null ? 0 : titleSubtitleUiState4.hashCode())) * 31;
        TitleSubtitleUiState titleSubtitleUiState5 = this.f;
        int iHashCode6 = (iHashCode5 + (titleSubtitleUiState5 == null ? 0 : titleSubtitleUiState5.hashCode())) * 31;
        TitleSubtitleUiState titleSubtitleUiState6 = this.g;
        return iHashCode6 + (titleSubtitleUiState6 != null ? titleSubtitleUiState6.hashCode() : 0);
    }

    public final String toString() {
        return "BookingDetailsUIState(title=" + this.f8748a + ", bookingDate=" + this.b + ", bookingId=" + this.c + ", transactionId=" + this.d + ", paymentMode=" + this.e + ", utrNumber=" + this.f + ", sellerBookingId=" + this.g + ")";
    }
}
