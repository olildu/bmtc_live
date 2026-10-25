package app.chalo.productpurchase.passselection.ui;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/SubCategoryBubbleUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SubCategoryBubbleUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f8552a;
    public final UIShape b;
    public final ChaloPadding c;
    public final ChaloColorToken d;
    public final float e;
    public final UiEventHandler f;

    public SubCategoryBubbleUIState(TextUIState.ChaloTextUIState chaloTextUIState, ChaloColorToken chaloColorToken, float f, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        UIShape.Circle circle = UIShape.Circle.p;
        float fM7278constructorimpl = Dp.m7278constructorimpl(ChaloThemeHelper.a().h + ChaloThemeHelper.a().e);
        float f2 = ChaloThemeHelper.a().g;
        ChaloPadding chaloPadding = new ChaloPadding(f2, fM7278constructorimpl, fM7278constructorimpl, f2);
        this.f8552a = chaloTextUIState;
        this.b = circle;
        this.c = chaloPadding;
        this.d = chaloColorToken;
        this.e = f;
        this.f = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubCategoryBubbleUIState)) {
            return false;
        }
        SubCategoryBubbleUIState subCategoryBubbleUIState = (SubCategoryBubbleUIState) obj;
        return Intrinsics.d(this.f8552a, subCategoryBubbleUIState.f8552a) && Intrinsics.d(this.b, subCategoryBubbleUIState.b) && Intrinsics.d(this.c, subCategoryBubbleUIState.c) && Intrinsics.d(this.d, subCategoryBubbleUIState.d) && Float.compare(this.e, subCategoryBubbleUIState.e) == 0 && Intrinsics.d(this.f, subCategoryBubbleUIState.f);
    }

    public final int hashCode() {
        int iA = r30.a(this.e, z40.b(this.d, r30.c(this.c, pk0.b(this.b, this.f8552a.hashCode() * 31, 31), 31), 31), 31);
        UiEventHandler uiEventHandler = this.f;
        return iA + (uiEventHandler == null ? 0 : uiEventHandler.hashCode());
    }

    public final String toString() {
        return "SubCategoryBubbleUIState(text=" + this.f8552a + ", shape=" + this.b + ", padding=" + this.c + ", color=" + this.d + ", alpha=" + this.e + ", eventHandler=" + this.f + ")";
    }
}
