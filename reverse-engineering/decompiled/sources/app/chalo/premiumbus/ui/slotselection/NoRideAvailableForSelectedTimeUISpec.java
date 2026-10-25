package app.chalo.premiumbus.ui.slotselection;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/NoRideAvailableForSelectedTimeUISpec;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NoRideAvailableForSelectedTimeUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7813a;
    public final UIShape b;
    public final ChaloColorToken c;
    public final float d;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public NoRideAvailableForSelectedTimeUISpec() {
        float f = ChaloThemeHelper.a().f;
        float f2 = ChaloThemeHelper.a().g;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        UIShape.Rectangle shape = UIShape.d;
        float f3 = ChaloThemeHelper.a().d;
        Intrinsics.i(shape, "shape");
        this.f7813a = chaloPadding;
        this.b = shape;
        this.c = ChaloColorToken.LightGray.f9814a;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoRideAvailableForSelectedTimeUISpec)) {
            return false;
        }
        NoRideAvailableForSelectedTimeUISpec noRideAvailableForSelectedTimeUISpec = (NoRideAvailableForSelectedTimeUISpec) obj;
        return Intrinsics.d(this.f7813a, noRideAvailableForSelectedTimeUISpec.f7813a) && Intrinsics.d(this.b, noRideAvailableForSelectedTimeUISpec.b) && Intrinsics.d(this.c, noRideAvailableForSelectedTimeUISpec.c) && Dp.m7283equalsimpl0(this.d, noRideAvailableForSelectedTimeUISpec.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + z40.b(this.c, pk0.b(this.b, this.f7813a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "NoRideAvailableForSelectedTimeUISpec(contentSpacing=" + this.f7813a + ", shape=" + this.b + ", backgroundColor=" + this.c + ", iconAndTextSpacing=" + Dp.m7289toStringimpl(this.d) + ")";
    }
}
