package app.chalo.productpurchase.productselection.ui;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiArrangement;
import app.chalo.uistate.card.CardUISpec;
import defpackage.cb0;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/RecentProductItemUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecentProductItemUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardUISpec f8701a;
    public final ChaloPadding b;
    public final float c;
    public final float d;
    public final ChaloPadding e;
    public final ChaloPadding f;
    public final ChaloPadding g;
    public final UiAlignment.Vertical h;
    public final UiArrangement.HorizontalOrVertical i;
    public final float j;
    public final ChaloColorToken k;

    public RecentProductItemUISpec() {
        float f = ChaloThemeHelper.a().d;
        CardUISpec cardUISpec = new CardUISpec(new UIShape.Rectangle(f, f, f, f), ChaloThemeHelper.b().c, 0.0f, 4);
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f2, f2, f2);
        float f3 = ChaloThemeHelper.a().f;
        float f4 = ChaloThemeHelper.a().c;
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().f, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding3 = new ChaloPadding(0.0f, ChaloThemeHelper.a().f, ChaloThemeHelper.a().b, 0.0f, 9);
        ChaloPadding chaloPadding4 = new ChaloPadding(ChaloThemeHelper.a().f, 0.0f, 0.0f, 0.0f, 14);
        float f5 = ChaloThemeHelper.a().c;
        this.f8701a = cardUISpec;
        this.b = chaloPadding;
        this.c = f3;
        this.d = f4;
        this.e = chaloPadding2;
        this.f = chaloPadding3;
        this.g = chaloPadding4;
        this.h = UiAlignment.Vertical.Center.f9888a;
        this.i = UiArrangement.HorizontalOrVertical.SpaceBetween.f9892a;
        this.j = f5;
        this.k = ChaloColorToken.Black.f9759a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentProductItemUISpec)) {
            return false;
        }
        RecentProductItemUISpec recentProductItemUISpec = (RecentProductItemUISpec) obj;
        return Intrinsics.d(this.f8701a, recentProductItemUISpec.f8701a) && Intrinsics.d(this.b, recentProductItemUISpec.b) && Dp.m7283equalsimpl0(this.c, recentProductItemUISpec.c) && Dp.m7283equalsimpl0(this.d, recentProductItemUISpec.d) && Intrinsics.d(this.e, recentProductItemUISpec.e) && Intrinsics.d(this.f, recentProductItemUISpec.f) && Intrinsics.d(this.g, recentProductItemUISpec.g) && Intrinsics.d(this.h, recentProductItemUISpec.h) && Intrinsics.d(this.i, recentProductItemUISpec.i) && Dp.m7283equalsimpl0(this.j, recentProductItemUISpec.j) && Intrinsics.d(this.k, recentProductItemUISpec.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + uf0.a(this.j, (this.i.hashCode() + uf0.e(this.h, r30.c(this.g, r30.c(this.f, r30.c(this.e, uf0.a(this.d, uf0.a(this.c, r30.c(this.b, this.f8701a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31, 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.j);
        StringBuilder sb = new StringBuilder("RecentProductItemUISpec(cardSpec=");
        sb.append(this.f8701a);
        sb.append(", internalPadding=");
        sb.append(this.b);
        sb.append(", spaceBetweenDetails=");
        cb0.t(sb, strM7289toStringimpl, ", spaceBetweenSpfTags=", strM7289toStringimpl2, ", paddingAroundFromToStopIcon=");
        r30.o(sb, this.e, ", paddingAroundRouteName=", this.f, ", paddingAboveRouteIcon=");
        sb.append(this.g);
        sb.append(", fromToStopVerticalAlignment=");
        sb.append(this.h);
        sb.append(", fromToStopVerticalArrangement=");
        sb.append(this.i);
        sb.append(", indicatorSeparatorWidth=");
        sb.append(strM7289toStringimpl3);
        sb.append(", indicatorSeparatorColor=");
        return pk0.j(sb, this.k, ")");
    }
}
