package app.chalo.userprofile.ui;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.cb0;
import defpackage.pk0;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/ProfileIconWithEditBtnUISpecs;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProfileIconWithEditBtnUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BorderUISpec f10335a;
    public final ChaloPadding b;
    public final ChaloColorToken c;
    public final UIShape d;
    public final float e;
    public final float f;
    public final float g;
    public final UIShape h;
    public final ChaloColorToken i;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ProfileIconWithEditBtnUISpecs(BorderUISpec borderUISpec, ChaloPadding chaloPadding, float f, float f2, int i) {
        borderUISpec = (i & 1) != 0 ? new BorderUISpec(ChaloThemeHelper.a().d, ChaloColorToken.IvoryYellow.f9812a, UIShape.Circle.p) : borderUISpec;
        UIShape.Circle circle = UIShape.Circle.p;
        f = (i & 16) != 0 ? ChaloThemeHelper.a().p0 : f;
        float f3 = ChaloThemeHelper.a().e;
        f2 = (i & 64) != 0 ? ChaloThemeHelper.a().f1916a : f2;
        this.f10335a = borderUISpec;
        this.b = chaloPadding;
        this.c = ChaloColorToken.White.f9870a;
        this.d = circle;
        this.e = f;
        this.f = f3;
        this.g = f2;
        this.h = circle;
        this.i = ChaloColorToken.AlmostBlackColor.f9756a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileIconWithEditBtnUISpecs)) {
            return false;
        }
        ProfileIconWithEditBtnUISpecs profileIconWithEditBtnUISpecs = (ProfileIconWithEditBtnUISpecs) obj;
        return Intrinsics.d(this.f10335a, profileIconWithEditBtnUISpecs.f10335a) && Intrinsics.d(this.b, profileIconWithEditBtnUISpecs.b) && Intrinsics.d(this.c, profileIconWithEditBtnUISpecs.c) && Intrinsics.d(this.d, profileIconWithEditBtnUISpecs.d) && Dp.m7283equalsimpl0(this.e, profileIconWithEditBtnUISpecs.e) && Dp.m7283equalsimpl0(this.f, profileIconWithEditBtnUISpecs.f) && Dp.m7283equalsimpl0(this.g, profileIconWithEditBtnUISpecs.g) && Intrinsics.d(this.h, profileIconWithEditBtnUISpecs.h) && Intrinsics.d(this.i, profileIconWithEditBtnUISpecs.i);
    }

    public final int hashCode() {
        int iHashCode = this.f10335a.hashCode() * 31;
        ChaloPadding chaloPadding = this.b;
        return this.i.hashCode() + pk0.b(this.h, uf0.a(this.g, uf0.a(this.f, uf0.a(this.e, pk0.b(this.d, z40.b(this.c, (iHashCode + (chaloPadding == null ? 0 : chaloPadding.hashCode())) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.f);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.g);
        StringBuilder sb = new StringBuilder("ProfileIconWithEditBtnUISpecs(borderUISpecs=");
        sb.append(this.f10335a);
        sb.append(", defaultProfileImagePadding=");
        sb.append(this.b);
        sb.append(", defaultImageBackgroundColor=");
        sb.append(this.c);
        sb.append(", imageClipShape=");
        sb.append(this.d);
        sb.append(", imageSize=");
        cb0.t(sb, strM7289toStringimpl, ", editBtnPadding=", strM7289toStringimpl2, ", editBtnOuterPadding=");
        sb.append(strM7289toStringimpl3);
        sb.append(", editBtnBorderBackgroundShape=");
        sb.append(this.h);
        sb.append(", editBtnBorderBackgroundColor=");
        return pk0.j(sb, this.i, ")");
    }
}
