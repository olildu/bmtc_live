package app.chalo.uistate.searchbar;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.card.CardUISpec;
import app.chalo.uistate.image.ImageUISize;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/searchbar/SearchBarWithActionUISpecs;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SearchBarWithActionUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardUISpec f10068a;
    public final float b;
    public final ChaloColorToken c;
    public final ChaloColorToken d;
    public final UiAlignment.Vertical e;
    public final ChaloPadding f;
    public final ChaloPadding g;
    public final float h;
    public final ImageUISize i;

    public SearchBarWithActionUISpecs(CardUISpec cardUISpec, ChaloPadding chaloPadding, int i) {
        if ((i & 1) != 0) {
            cardUISpec = new CardUISpec(UIShape.i, ChaloThemeHelper.b().d, 0.0f, 4);
        }
        float f = ChaloThemeHelper.a().o;
        if ((i & 32) != 0) {
            float f2 = ChaloThemeHelper.a().h;
            chaloPadding = new ChaloPadding(f2, f2, f2, f2);
        }
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        float f3 = ChaloThemeHelper.a().h;
        ImageUISize imageUISize = new ImageUISize(ChaloThemeHelper.a().i);
        this.f10068a = cardUISpec;
        this.b = f;
        this.c = ChaloColorToken.White.f9870a;
        this.d = ChaloColorToken.LightGray.f9814a;
        this.e = UiAlignment.Vertical.Center.f9888a;
        this.f = chaloPadding;
        this.g = chaloPadding2;
        this.h = f3;
        this.i = imageUISize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchBarWithActionUISpecs)) {
            return false;
        }
        SearchBarWithActionUISpecs searchBarWithActionUISpecs = (SearchBarWithActionUISpecs) obj;
        return Intrinsics.d(this.f10068a, searchBarWithActionUISpecs.f10068a) && Dp.m7283equalsimpl0(this.b, searchBarWithActionUISpecs.b) && Intrinsics.d(this.c, searchBarWithActionUISpecs.c) && Intrinsics.d(this.d, searchBarWithActionUISpecs.d) && Intrinsics.d(this.e, searchBarWithActionUISpecs.e) && Intrinsics.d(this.f, searchBarWithActionUISpecs.f) && Intrinsics.d(this.g, searchBarWithActionUISpecs.g) && Dp.m7283equalsimpl0(this.h, searchBarWithActionUISpecs.h) && Intrinsics.d(this.i, searchBarWithActionUISpecs.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + uf0.a(this.h, r30.c(this.g, r30.c(this.f, uf0.e(this.e, z40.b(this.d, z40.b(this.c, uf0.a(this.b, this.f10068a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.h);
        StringBuilder sb = new StringBuilder("SearchBarWithActionUISpecs(cardUISpec=");
        sb.append(this.f10068a);
        sb.append(", cardHeight=");
        sb.append(strM7289toStringimpl);
        sb.append(", cardColor=");
        sb.append(this.c);
        sb.append(", backgroundColor=");
        sb.append(this.d);
        sb.append(", verticalAlignment=");
        sb.append(this.e);
        sb.append(", containerPadding=");
        sb.append(this.f);
        sb.append(", itemPadding=");
        py.u(sb, this.g, ", leadingIconAndTextFieldSpacing=", strM7289toStringimpl2, ", indicatorSize=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
