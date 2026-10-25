package app.chalo.home.ui.savedplacesandrides;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/savedplacesandrides/SavedPlaceUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SavedPlaceUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f3676a;
    public final UIShape b;
    public final ChaloColorToken c;
    public final float d;
    public final float e;
    public final float f;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public SavedPlaceUISpecs() {
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().g;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        UIShape.Rectangle cardShape = UIShape.e;
        float f3 = ChaloThemeHelper.a().f;
        float f4 = ChaloThemeHelper.a().c;
        float f5 = ChaloThemeHelper.a().f;
        Intrinsics.i(cardShape, "cardShape");
        this.f3676a = chaloPadding;
        this.b = cardShape;
        this.c = ChaloColorToken.White.f9870a;
        this.d = f3;
        this.e = f4;
        this.f = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedPlaceUISpecs)) {
            return false;
        }
        SavedPlaceUISpecs savedPlaceUISpecs = (SavedPlaceUISpecs) obj;
        return Intrinsics.d(this.f3676a, savedPlaceUISpecs.f3676a) && Intrinsics.d(this.b, savedPlaceUISpecs.b) && Intrinsics.d(this.c, savedPlaceUISpecs.c) && Dp.m7283equalsimpl0(this.d, savedPlaceUISpecs.d) && Dp.m7283equalsimpl0(this.e, savedPlaceUISpecs.e) && Dp.m7283equalsimpl0(this.f, savedPlaceUISpecs.f);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.f) + uf0.a(this.e, uf0.a(this.d, z40.b(this.c, pk0.b(this.b, this.f3676a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.f);
        StringBuilder sb = new StringBuilder("SavedPlaceUISpecs(internalPadding=");
        sb.append(this.f3676a);
        sb.append(", cardShape=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        sb.append(this.c);
        sb.append(", spaceBtwIconAndTitle=");
        sb.append(strM7289toStringimpl);
        sb.append(", spaceBtwTitleAndSubTitle=");
        return r30.i(sb, strM7289toStringimpl2, ", spaceBtwActions=", strM7289toStringimpl3, ")");
    }
}
