package app.chalo.premiumbus.ui.seatselection.compose.uistate;

import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/BookingInfoBannerUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BookingInfoBannerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f7765a;
    public final ImageUIState b;
    public final BookingInfoBannerUISpecs c;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public BookingInfoBannerUIState(TextUIState.ChaloTextUIState chaloTextUIState, ImageUIState imageUIState, BookingInfoBannerUISpecs bookingInfoBannerUISpecs) {
        this.f7765a = chaloTextUIState;
        this.b = imageUIState;
        this.c = bookingInfoBannerUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingInfoBannerUIState)) {
            return false;
        }
        BookingInfoBannerUIState bookingInfoBannerUIState = (BookingInfoBannerUIState) obj;
        return Intrinsics.d(this.f7765a, bookingInfoBannerUIState.f7765a) && Intrinsics.d(this.b, bookingInfoBannerUIState.b) && Intrinsics.d(this.c, bookingInfoBannerUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.e(this.b, this.f7765a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "BookingInfoBannerUIState(infoText=" + this.f7765a + ", infoIcon=" + this.b + ", specs=" + this.c + ")";
    }
}
