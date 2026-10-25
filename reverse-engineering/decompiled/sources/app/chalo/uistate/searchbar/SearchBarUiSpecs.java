package app.chalo.uistate.searchbar;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/searchbar/SearchBarUiSpecs;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SearchBarUiSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10066a;
    public final UIShape b;
    public final ChaloPadding c;
    public final UIShape d;
    public final ChaloColorToken e;
    public final ChaloPadding f;
    public final UiAlignment.Vertical g;
    public final float h;

    public SearchBarUiSpecs(ChaloPadding chaloPadding, int i) {
        float fM7278constructorimpl = Dp.m7278constructorimpl(0);
        float f = ChaloThemeHelper.a().l;
        UIShape.Rectangle rectangle = new UIShape.Rectangle(f, f, f, f);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().i, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().f);
        float f2 = ChaloThemeHelper.a().j;
        UIShape.Rectangle rectangle2 = new UIShape.Rectangle(f2, f2, f2, f2);
        if ((i & 32) != 0) {
            float f3 = ChaloThemeHelper.a().e;
            float f4 = ChaloThemeHelper.a().h;
            chaloPadding = new ChaloPadding(f3, f4, f4, f3);
        }
        float f5 = ChaloThemeHelper.a().g;
        this.f10066a = fM7278constructorimpl;
        this.b = rectangle;
        this.c = chaloPadding2;
        this.d = rectangle2;
        this.e = ChaloColorToken.SectionDividerColor.f9849a;
        this.f = chaloPadding;
        this.g = UiAlignment.Vertical.Center.f9888a;
        this.h = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchBarUiSpecs)) {
            return false;
        }
        SearchBarUiSpecs searchBarUiSpecs = (SearchBarUiSpecs) obj;
        return Dp.m7283equalsimpl0(this.f10066a, searchBarUiSpecs.f10066a) && Intrinsics.d(this.b, searchBarUiSpecs.b) && Intrinsics.d(this.c, searchBarUiSpecs.c) && Intrinsics.d(this.d, searchBarUiSpecs.d) && Intrinsics.d(this.e, searchBarUiSpecs.e) && Intrinsics.d(this.f, searchBarUiSpecs.f) && Intrinsics.d(this.g, searchBarUiSpecs.g) && Dp.m7283equalsimpl0(this.h, searchBarUiSpecs.h);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.h) + uf0.e(this.g, r30.c(this.f, z40.b(this.e, pk0.b(this.d, r30.c(this.c, pk0.b(this.b, Dp.m7284hashCodeimpl(this.f10066a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "SearchBarUiSpecs(elevation=" + Dp.m7289toStringimpl(this.f10066a) + ", shape=" + this.b + ", cardPadding=" + this.c + ", contentClipShape=" + this.d + ", backgroundColor=" + this.e + ", internalPadding=" + this.f + ", verticalAlignment=" + this.g + ", spaceBetweenIconAndTextField=" + Dp.m7289toStringimpl(this.h) + ")";
    }
}
