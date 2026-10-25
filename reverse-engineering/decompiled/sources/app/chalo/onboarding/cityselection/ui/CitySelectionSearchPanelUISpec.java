package app.chalo.onboarding.cityselection.ui;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.card.CardUISpec;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/cityselection/ui/CitySelectionSearchPanelUISpec;", "", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CitySelectionSearchPanelUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6631a;
    public final ChaloPadding b;
    public final ChaloPadding c;
    public final CardUISpec d;

    public CitySelectionSearchPanelUISpec() {
        float f = ChaloThemeHelper.a().n;
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().W, 0.0f, 2);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().W, 0.0f, 2);
        float f2 = ChaloThemeHelper.a().i;
        CardUISpec cardUISpec = new CardUISpec(new UIShape.Rectangle(f2, f2, f2, f2), ChaloThemeHelper.a().d, 0.0f, 4);
        this.f6631a = f;
        this.b = chaloPadding;
        this.c = chaloPadding2;
        this.d = cardUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CitySelectionSearchPanelUISpec)) {
            return false;
        }
        CitySelectionSearchPanelUISpec citySelectionSearchPanelUISpec = (CitySelectionSearchPanelUISpec) obj;
        return Dp.m7283equalsimpl0(this.f6631a, citySelectionSearchPanelUISpec.f6631a) && Intrinsics.d(this.b, citySelectionSearchPanelUISpec.b) && Intrinsics.d(this.c, citySelectionSearchPanelUISpec.c) && Intrinsics.d(this.d, citySelectionSearchPanelUISpec.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.c(this.c, r30.c(this.b, Dp.m7284hashCodeimpl(this.f6631a) * 31, 31), 31);
    }

    public final String toString() {
        return "CitySelectionSearchPanelUISpec(height=" + Dp.m7289toStringimpl(this.f6631a) + ", paddingAroundSearchIcon=" + this.b + ", paddingAroundTextField=" + this.c + ", cardUISpec=" + this.d + ")";
    }
}
