package app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.cb0;
import defpackage.pk0;
import defpackage.t10;
import defpackage.uf0;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/multipleorigindestinationselectionscreen/OriginDestinationSelectionCardUISpec;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OriginDestinationSelectionCardUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7685a;
    public final float b;
    public final float c;
    public final ChaloColorToken d;
    public final float e;
    public final UIShape f;
    public final float g;
    public final float h;
    public final float i;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public OriginDestinationSelectionCardUISpec() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().g, ChaloThemeHelper.a().g, ChaloThemeHelper.a().h);
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().g;
        float f3 = ChaloThemeHelper.a().c;
        UIShape.Rectangle shape = UIShape.d;
        float f4 = ChaloThemeHelper.a().f;
        float f5 = ChaloThemeHelper.a().b;
        float f6 = ChaloThemeHelper.a().h;
        Intrinsics.i(shape, "shape");
        this.f7685a = chaloPadding;
        this.b = f;
        this.c = f2;
        this.d = ChaloColorToken.White.f9870a;
        this.e = f3;
        this.f = shape;
        this.g = f4;
        this.h = f5;
        this.i = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriginDestinationSelectionCardUISpec)) {
            return false;
        }
        OriginDestinationSelectionCardUISpec originDestinationSelectionCardUISpec = (OriginDestinationSelectionCardUISpec) obj;
        return Intrinsics.d(this.f7685a, originDestinationSelectionCardUISpec.f7685a) && Dp.m7283equalsimpl0(this.b, originDestinationSelectionCardUISpec.b) && Dp.m7283equalsimpl0(this.c, originDestinationSelectionCardUISpec.c) && Intrinsics.d(this.d, originDestinationSelectionCardUISpec.d) && Dp.m7283equalsimpl0(this.e, originDestinationSelectionCardUISpec.e) && Intrinsics.d(this.f, originDestinationSelectionCardUISpec.f) && Dp.m7283equalsimpl0(this.g, originDestinationSelectionCardUISpec.g) && Dp.m7283equalsimpl0(this.h, originDestinationSelectionCardUISpec.h) && Dp.m7283equalsimpl0(this.i, originDestinationSelectionCardUISpec.i);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.i) + uf0.a(this.h, uf0.a(this.g, pk0.b(this.f, uf0.a(this.e, z40.b(this.d, uf0.a(this.c, uf0.a(this.b, this.f7685a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.g);
        String strM7289toStringimpl5 = Dp.m7289toStringimpl(this.h);
        String strM7289toStringimpl6 = Dp.m7289toStringimpl(this.i);
        StringBuilder sbN = t10.n("OriginDestinationSelectionCardUISpec(contentPadding=", this.f7685a, ", labelTextAndOriginDestinationInfoSpacing=", strM7289toStringimpl, ", originDestinationSideIndicatorAndInfoSpacing=");
        sbN.append(strM7289toStringimpl2);
        sbN.append(", cardBackgroundColor=");
        sbN.append(this.d);
        sbN.append(", cardElevation=");
        sbN.append(strM7289toStringimpl3);
        sbN.append(", shape=");
        sbN.append(this.f);
        sbN.append(", originDestinationSideIndicatorBulletSize=");
        cb0.t(sbN, strM7289toStringimpl4, ", originDestinationSideIndicatorLineWidth=", strM7289toStringimpl5, ", dividerVerticalSpacing=");
        return vo1.p(sbN, strM7289toStringimpl6, ")");
    }
}
