package app.chalo.onboarding.cityselection.ui;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/cityselection/ui/CitySelectionUISpec;", "", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CitySelectionUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f6634a;
    public final ChaloPadding b;
    public final ChaloPadding c;
    public final ChaloPadding d;
    public final ChaloPadding e;
    public final float f;

    public CitySelectionUISpec() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().g, 0.0f, 2);
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        ChaloPadding chaloPadding4 = new ChaloPadding(0.0f, 0.0f, 0.0f, Dp.m7278constructorimpl(ChaloThemeHelper.a().i + ChaloThemeHelper.a().c), 7);
        ChaloPadding chaloPadding5 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14);
        float f = ChaloThemeHelper.a().p;
        this.f6634a = chaloPadding;
        this.b = chaloPadding2;
        this.c = chaloPadding3;
        this.d = chaloPadding4;
        this.e = chaloPadding5;
        this.f = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CitySelectionUISpec)) {
            return false;
        }
        CitySelectionUISpec citySelectionUISpec = (CitySelectionUISpec) obj;
        return Intrinsics.d(this.f6634a, citySelectionUISpec.f6634a) && Intrinsics.d(this.b, citySelectionUISpec.b) && Intrinsics.d(this.c, citySelectionUISpec.c) && Intrinsics.d(this.d, citySelectionUISpec.d) && Intrinsics.d(this.e, citySelectionUISpec.e) && Dp.m7283equalsimpl0(this.f, citySelectionUISpec.f);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.f) + r30.c(this.e, r30.c(this.d, r30.c(this.c, r30.c(this.b, this.f6634a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f);
        StringBuilder sbM = pk0.m("CitySelectionUISpec(paddingAroundHeader=", this.f6634a, ", paddingAroundSearchPanel=", this.b, ", paddingAroundDivider=");
        r30.o(sbM, this.c, ", paddingAroundHeaderImage=", this.d, ", paddingAroundList=");
        sbM.append(this.e);
        sbM.append(", minimumHeaderHeightWhenCollapsed=");
        sbM.append(strM7289toStringimpl);
        sbM.append(")");
        return sbM.toString();
    }
}
