package app.chalo.bookingsuccess;

import app.chalo.uistate.success.StandardSuccessScreenUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/bookingsuccess/BookingSuccessViewState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BookingSuccessViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StandardSuccessScreenUIState.SuccessWithGifMsgAndCta f1153a;

    public BookingSuccessViewState(StandardSuccessScreenUIState.SuccessWithGifMsgAndCta successWithGifMsgAndCta) {
        this.f1153a = successWithGifMsgAndCta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BookingSuccessViewState) && Intrinsics.d(this.f1153a, ((BookingSuccessViewState) obj).f1153a);
    }

    public final int hashCode() {
        StandardSuccessScreenUIState.SuccessWithGifMsgAndCta successWithGifMsgAndCta = this.f1153a;
        if (successWithGifMsgAndCta == null) {
            return 0;
        }
        return successWithGifMsgAndCta.hashCode();
    }

    public final String toString() {
        return "BookingSuccessViewState(bookingSuccessDetailsUIState=" + this.f1153a + ")";
    }
}
