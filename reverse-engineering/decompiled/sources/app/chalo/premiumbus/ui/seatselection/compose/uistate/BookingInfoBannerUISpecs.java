package app.chalo.premiumbus.ui.seatselection.compose.uistate;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.gf;
import defpackage.pk0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/BookingInfoBannerUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BookingInfoBannerUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7764a;
    public final ChaloColorToken b;
    public final UIShape c;
    public final ChaloPadding d;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public BookingInfoBannerUISpecs(ChaloColorToken chaloColorToken) {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 0.0f, 8);
        UIShape backgroundShape = ChaloThemeHelper.d.g;
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().g, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().g);
        Intrinsics.i(backgroundShape, "backgroundShape");
        this.f7764a = chaloPadding;
        this.b = chaloColorToken;
        this.c = backgroundShape;
        this.d = chaloPadding2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingInfoBannerUISpecs)) {
            return false;
        }
        BookingInfoBannerUISpecs bookingInfoBannerUISpecs = (BookingInfoBannerUISpecs) obj;
        return Intrinsics.d(this.f7764a, bookingInfoBannerUISpecs.f7764a) && Intrinsics.d(this.b, bookingInfoBannerUISpecs.b) && Intrinsics.d(this.c, bookingInfoBannerUISpecs.c) && Intrinsics.d(this.d, bookingInfoBannerUISpecs.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + pk0.b(this.c, z40.b(this.b, this.f7764a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbL = gf.l(this.f7764a, this.b, "BookingInfoBannerUISpecs(contentPadding=", ", backgroundColor=", ", backgroundShape=");
        sbL.append(this.c);
        sbL.append(", itemPadding=");
        sbL.append(this.d);
        sbL.append(")");
        return sbL.toString();
    }
}
