package app.chalo.productpurchase.passselection.ui;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.r30;
import defpackage.uf0;
import defpackage.xs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/SubCategoryGridListUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SubCategoryGridListUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8553a;
    public final ArrayList b;
    public final float c;
    public final float d;

    public SubCategoryGridListUIState(ArrayList arrayList) {
        float fM7278constructorimpl = Dp.m7278constructorimpl(ChaloThemeHelper.a().h + ChaloThemeHelper.a().e);
        float f = ChaloThemeHelper.a().h;
        this.f8553a = 2;
        this.b = arrayList;
        this.c = fM7278constructorimpl;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubCategoryGridListUIState)) {
            return false;
        }
        SubCategoryGridListUIState subCategoryGridListUIState = (SubCategoryGridListUIState) obj;
        return this.f8553a == subCategoryGridListUIState.f8553a && Intrinsics.d(this.b, subCategoryGridListUIState.b) && Dp.m7283equalsimpl0(this.c, subCategoryGridListUIState.c) && Dp.m7283equalsimpl0(this.d, subCategoryGridListUIState.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + uf0.a(this.c, xs.e(this.b, this.f8553a * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        StringBuilder sb = new StringBuilder("SubCategoryGridListUIState(numItemsInSingleRow=");
        sb.append(this.f8553a);
        sb.append(", categoryList=");
        sb.append(this.b);
        sb.append(", horizontalSpacing=");
        return r30.i(sb, strM7289toStringimpl, ", verticalSpacing=", strM7289toStringimpl2, ")");
    }
}
