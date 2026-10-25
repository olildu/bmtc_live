package app.chalo.appsupport.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appsupport/uistate/BookingHelpDetailsScreenUiSpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BookingHelpDetailsScreenUiSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f989a;
    public final float b;

    public BookingHelpDetailsScreenUiSpec() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, 0.0f, 3);
        float f = ChaloThemeHelper.a().h;
        this.f989a = chaloPadding;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingHelpDetailsScreenUiSpec)) {
            return false;
        }
        BookingHelpDetailsScreenUiSpec bookingHelpDetailsScreenUiSpec = (BookingHelpDetailsScreenUiSpec) obj;
        return Intrinsics.d(this.f989a, bookingHelpDetailsScreenUiSpec.f989a) && Dp.m7283equalsimpl0(this.b, bookingHelpDetailsScreenUiSpec.b);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.b) + (this.f989a.hashCode() * 31);
    }

    public final String toString() {
        return t8.h("BookingHelpDetailsScreenUiSpec(contentPadding=", this.f989a, ", toolbarAndContentSpacing=", Dp.m7289toStringimpl(this.b), ")");
    }
}
