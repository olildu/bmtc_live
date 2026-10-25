package app.chalo.productpurchase.passselection.ui;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/ProductDisabledBannerUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductDisabledBannerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f8551a;
    public final TextUIState.ChaloTextUIState b;
    public final DividerUIState c;
    public final ChaloPadding d;
    public final ChaloPadding e;
    public final ChaloPadding f;

    public ProductDisabledBannerUIState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        DividerUIState dividerUIState = new DividerUIState(ChaloThemeHelper.a().b, null, null, 6);
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 0.0f, 9);
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, ChaloThemeHelper.a().f, ChaloThemeHelper.a().f, 0.0f, 9);
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, ChaloThemeHelper.a().h, 6);
        this.f8551a = imageUIState;
        this.b = chaloTextUIState;
        this.c = dividerUIState;
        this.d = chaloPadding;
        this.e = chaloPadding2;
        this.f = chaloPadding3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDisabledBannerUIState)) {
            return false;
        }
        ProductDisabledBannerUIState productDisabledBannerUIState = (ProductDisabledBannerUIState) obj;
        return Intrinsics.d(this.f8551a, productDisabledBannerUIState.f8551a) && Intrinsics.d(this.b, productDisabledBannerUIState.b) && Intrinsics.d(this.c, productDisabledBannerUIState.c) && Intrinsics.d(this.d, productDisabledBannerUIState.d) && Intrinsics.d(this.e, productDisabledBannerUIState.e) && Intrinsics.d(this.f, productDisabledBannerUIState.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + r30.c(this.e, r30.c(this.d, py.c(this.c, r30.f(this.b, this.f8551a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = pk0.n("ProductDisabledBannerUIState(icon=", this.f8551a, ", text=", this.b, ", divider=");
        sbN.append(this.c);
        sbN.append(", contentPadding=");
        sbN.append(this.d);
        sbN.append(", paddingAroundText=");
        sbN.append(this.e);
        sbN.append(", paddingAroundBorder=");
        sbN.append(this.f);
        sbN.append(")");
        return sbN.toString();
    }
}
