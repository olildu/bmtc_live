package app.chalo.userprofile.ui;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/TextFieldSectionUISpecs;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TextFieldSectionUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10340a;
    public final ChaloColorToken b;
    public final UIShape c;
    public final ChaloPadding d;
    public final ChaloPadding e;
    public final float f;
    public final ChaloColorToken g;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public TextFieldSectionUISpecs() {
        float fM7278constructorimpl = Dp.m7278constructorimpl(-ChaloThemeHelper.a().q0);
        UIShape.Rectangle rectangle = new UIShape.Rectangle(ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 0.0f, 0.0f, 12);
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding2 = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().f;
        this.f10340a = fM7278constructorimpl;
        ChaloColorToken.White white = ChaloColorToken.White.f9870a;
        this.b = white;
        this.c = rectangle;
        this.d = chaloPadding;
        this.e = chaloPadding2;
        this.f = f2;
        this.g = white;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldSectionUISpecs)) {
            return false;
        }
        TextFieldSectionUISpecs textFieldSectionUISpecs = (TextFieldSectionUISpecs) obj;
        return Dp.m7283equalsimpl0(this.f10340a, textFieldSectionUISpecs.f10340a) && Intrinsics.d(this.b, textFieldSectionUISpecs.b) && Intrinsics.d(this.c, textFieldSectionUISpecs.c) && Intrinsics.d(this.d, textFieldSectionUISpecs.d) && Intrinsics.d(this.e, textFieldSectionUISpecs.e) && Dp.m7283equalsimpl0(this.f, textFieldSectionUISpecs.f) && Intrinsics.d(this.g, textFieldSectionUISpecs.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + uf0.a(this.f, r30.c(this.e, r30.c(this.d, pk0.b(this.c, z40.b(this.b, Dp.m7284hashCodeimpl(this.f10340a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f10340a);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.f);
        StringBuilder sb = new StringBuilder("TextFieldSectionUISpecs(verticalOffset=");
        sb.append(strM7289toStringimpl);
        sb.append(", fieldSectionBackgroundColor=");
        sb.append(this.b);
        sb.append(", fieldSectionShape=");
        sb.append(this.c);
        sb.append(", fieldContentPadding=");
        sb.append(this.d);
        sb.append(", saveBtnPadding=");
        py.u(sb, this.e, ", saveBtnContainerElevation=", strM7289toStringimpl2, ", saveBtnContainerBackgroundColor=");
        return pk0.j(sb, this.g, ")");
    }
}
