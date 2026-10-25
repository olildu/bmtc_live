package app.chalo.home.ui.history.uistate;

import androidx.compose.ui.unit.Dp;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/MyTicketFloatingButtonSpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MyTicketFloatingButtonSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f3473a;
    public final ChaloColorToken b;
    public final UIShape c;
    public final float d;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public MyTicketFloatingButtonSpec() {
        float f = ChaloThemeHelper.a().g;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        UIShape.Rectangle shape = UIShape.d;
        float f2 = ChaloThemeHelper.a().f;
        Intrinsics.i(shape, "shape");
        this.f3473a = chaloPadding;
        this.b = ChaloColorToken.OrangePrimary.f9835a;
        this.c = shape;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyTicketFloatingButtonSpec)) {
            return false;
        }
        MyTicketFloatingButtonSpec myTicketFloatingButtonSpec = (MyTicketFloatingButtonSpec) obj;
        return Intrinsics.d(this.f3473a, myTicketFloatingButtonSpec.f3473a) && Intrinsics.d(this.b, myTicketFloatingButtonSpec.b) && Intrinsics.d(this.c, myTicketFloatingButtonSpec.c) && Dp.m7283equalsimpl0(this.d, myTicketFloatingButtonSpec.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + pk0.b(this.c, z40.b(this.b, this.f3473a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        StringBuilder sbL = gf.l(this.f3473a, this.b, "MyTicketFloatingButtonSpec(contentPadding=", ", backgroundColor=", ", shape=");
        sbL.append(this.c);
        sbL.append(", imageAndTextSpacing=");
        sbL.append(strM7289toStringimpl);
        sbL.append(")");
        return sbL.toString();
    }
}
