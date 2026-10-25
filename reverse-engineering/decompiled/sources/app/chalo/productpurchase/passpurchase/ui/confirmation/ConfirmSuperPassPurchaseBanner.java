package app.chalo.productpurchase.passpurchase.ui.confirmation;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseBanner;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConfirmSuperPassPurchaseBanner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f8363a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final ChaloPadding d;
    public final ChaloColorToken e;
    public final ChaloColorToken.LightOrangeSpf f;
    public final ChaloColorToken.LightOrangeSpfDark g;
    public final UIShape h;
    public final ChaloPadding i;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ConfirmSuperPassPurchaseBanner(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, ChaloColorToken chaloColorToken, ChaloColorToken.LightOrangeSpf lightOrangeSpf, ChaloColorToken.LightOrangeSpfDark lightOrangeSpfDark) {
        float f = ChaloThemeHelper.a().f;
        float f2 = ChaloThemeHelper.a().g;
        ChaloPadding chaloPadding = new ChaloPadding(f, f2, f2, f);
        UIShape.Rectangle backgroundShape = UIShape.d;
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().c);
        Intrinsics.i(backgroundShape, "backgroundShape");
        this.f8363a = imageUIState;
        this.b = chaloTextUIState;
        this.c = chaloTextUIState2;
        this.d = chaloPadding;
        this.e = chaloColorToken;
        this.f = lightOrangeSpf;
        this.g = lightOrangeSpfDark;
        this.h = backgroundShape;
        this.i = chaloPadding2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmSuperPassPurchaseBanner)) {
            return false;
        }
        ConfirmSuperPassPurchaseBanner confirmSuperPassPurchaseBanner = (ConfirmSuperPassPurchaseBanner) obj;
        return Intrinsics.d(this.f8363a, confirmSuperPassPurchaseBanner.f8363a) && Intrinsics.d(this.b, confirmSuperPassPurchaseBanner.b) && Intrinsics.d(this.c, confirmSuperPassPurchaseBanner.c) && Intrinsics.d(this.d, confirmSuperPassPurchaseBanner.d) && Intrinsics.d(this.e, confirmSuperPassPurchaseBanner.e) && Intrinsics.d(this.f, confirmSuperPassPurchaseBanner.f) && Intrinsics.d(this.g, confirmSuperPassPurchaseBanner.g) && Intrinsics.d(this.h, confirmSuperPassPurchaseBanner.h) && Intrinsics.d(this.i, confirmSuperPassPurchaseBanner.i);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f8363a.hashCode() * 31, 31);
        TextUIState.ChaloTextUIState chaloTextUIState = this.c;
        return this.i.hashCode() + pk0.b(this.h, (((z40.b(this.e, r30.c(this.d, (iF + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31, 31), 31) + (this.f == null ? 0 : 335687566)) * 31) + (this.g != null ? -515630044 : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbN = pk0.n("ConfirmSuperPassPurchaseBanner(image=", this.f8363a, ", textUIState=", this.b, ", subTextUIState=");
        sbN.append(this.c);
        sbN.append(", internalPadding=");
        sbN.append(this.d);
        sbN.append(", backgroundContainerColor=");
        sbN.append(this.e);
        sbN.append(", backgroundGradientStartColor=");
        sbN.append(this.f);
        sbN.append(", backgroundGradientEndColor=");
        sbN.append(this.g);
        sbN.append(", backgroundShape=");
        sbN.append(this.h);
        sbN.append(", contentPadding=");
        return py.e(sbN, this.i, ")");
    }
}
