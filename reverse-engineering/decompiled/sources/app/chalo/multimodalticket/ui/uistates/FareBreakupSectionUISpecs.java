package app.chalo.multimodalticket.ui.uistates;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.components.TooltipPopupPlacement;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/uistates/FareBreakupSectionUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FareBreakupSectionUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f5959a;
    public final ChaloPadding b;
    public final float c;
    public final UIShape d;
    public final float e;
    public final ChaloColorToken f;
    public final TooltipPopupPlacement g;
    public final float h;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public FareBreakupSectionUISpecs() {
        float f = ChaloThemeHelper.a().g;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, ChaloThemeHelper.a().g, 1);
        float f2 = ChaloThemeHelper.a().p;
        UIShape.Rectangle toolTipShape = UIShape.e;
        float f3 = ChaloThemeHelper.a().g;
        TooltipPopupPlacement tooltipPopupPlacement = TooltipPopupPlacement.AboveAnchor;
        float f4 = ChaloThemeHelper.a().e;
        Intrinsics.i(toolTipShape, "toolTipShape");
        Intrinsics.i(tooltipPopupPlacement, "tooltipPopupPlacement");
        this.f5959a = chaloPadding;
        this.b = chaloPadding2;
        this.c = f2;
        this.d = toolTipShape;
        this.e = f3;
        this.f = ChaloColorToken.White.f9870a;
        this.g = tooltipPopupPlacement;
        this.h = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareBreakupSectionUISpecs)) {
            return false;
        }
        FareBreakupSectionUISpecs fareBreakupSectionUISpecs = (FareBreakupSectionUISpecs) obj;
        return Intrinsics.d(this.f5959a, fareBreakupSectionUISpecs.f5959a) && Intrinsics.d(this.b, fareBreakupSectionUISpecs.b) && Dp.m7283equalsimpl0(this.c, fareBreakupSectionUISpecs.c) && Intrinsics.d(this.d, fareBreakupSectionUISpecs.d) && Dp.m7283equalsimpl0(this.e, fareBreakupSectionUISpecs.e) && Intrinsics.d(this.f, fareBreakupSectionUISpecs.f) && this.g == fareBreakupSectionUISpecs.g && Dp.m7283equalsimpl0(this.h, fareBreakupSectionUISpecs.h);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.h) + ((this.g.hashCode() + z40.b(this.f, uf0.a(this.e, pk0.b(this.d, uf0.a(this.c, r30.c(this.b, this.f5959a.hashCode() * 31, 31), 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.h);
        StringBuilder sbM = pk0.m("FareBreakupSectionUISpecs(contentPadding=", this.f5959a, ", dividerVerticalPadding=", this.b, ", minSpacingBetweenTexts=");
        sbM.append(strM7289toStringimpl);
        sbM.append(", toolTipShape=");
        sbM.append(this.d);
        sbM.append(", toolTipArrowHeight=");
        sbM.append(strM7289toStringimpl2);
        sbM.append(", toolTipBackgroundColor=");
        sbM.append(this.f);
        sbM.append(", tooltipPopupPlacement=");
        sbM.append(this.g);
        sbM.append(", toolTipElevation=");
        sbM.append(strM7289toStringimpl3);
        sbM.append(")");
        return sbM.toString();
    }
}
