package app.chalo.productpurchase.passselection.ui;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassCategorySelectionSectionUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassCategorySelectionSectionUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8526a;
    public final ChaloPadding b;
    public final ChaloPadding c;
    public final float d;
    public final ChaloPadding e;

    public PassCategorySelectionSectionUISpec() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding3 = new ChaloPadding(0.0f, ChaloThemeHelper.a().f, 1);
        float f = ChaloThemeHelper.a().g;
        ChaloPadding chaloPadding4 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        this.f8526a = chaloPadding;
        this.b = chaloPadding2;
        this.c = chaloPadding3;
        this.d = f;
        this.e = chaloPadding4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassCategorySelectionSectionUISpec)) {
            return false;
        }
        PassCategorySelectionSectionUISpec passCategorySelectionSectionUISpec = (PassCategorySelectionSectionUISpec) obj;
        return Intrinsics.d(this.f8526a, passCategorySelectionSectionUISpec.f8526a) && Intrinsics.d(this.b, passCategorySelectionSectionUISpec.b) && Intrinsics.d(this.c, passCategorySelectionSectionUISpec.c) && Dp.m7283equalsimpl0(this.d, passCategorySelectionSectionUISpec.d) && Intrinsics.d(this.e, passCategorySelectionSectionUISpec.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + uf0.a(this.d, r30.c(this.c, r30.c(this.b, this.f8526a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        StringBuilder sbM = pk0.m("PassCategorySelectionSectionUISpec(paddingAroundAnnouncement=", this.f8526a, ", paddingAroundInfoNote=", this.b, ", paddingAroundList=");
        py.u(sbM, this.c, ", spaceBeforePlansList=", strM7289toStringimpl, ", paddingAroundPassInfoImage=");
        return py.e(sbM, this.e, ")");
    }
}
