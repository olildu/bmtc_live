package app.chalo.productpurchase.passpurchase.ui.confirmation;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import defpackage.gf;
import defpackage.pk0;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/PassStateDateChangeInfoBannerUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassStateDateChangeInfoBannerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f8395a;
    public final TextUIState.ChaloTextUIState b;
    public final ChaloPadding c;
    public final ChaloPadding d;
    public final ChaloColorToken e;
    public final ChaloColorToken f;
    public final UIShape g;

    public PassStateDateChangeInfoBannerUIState(TextUIState.ChaloTextUIState chaloTextUIState) {
        ImageUIState imageUIState = new ImageUIState(IconType.IC_INFO, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding2 = new ChaloPadding(f2, f2, f2, f2);
        UIShape.Rectangle backgroundShape = UIShape.e;
        Intrinsics.i(backgroundShape, "backgroundShape");
        this.f8395a = imageUIState;
        this.b = chaloTextUIState;
        this.c = chaloPadding;
        this.d = chaloPadding2;
        this.e = ChaloColorToken.ActivityBackground.f9755a;
        this.f = ChaloColorToken.White.f9870a;
        this.g = backgroundShape;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassStateDateChangeInfoBannerUIState)) {
            return false;
        }
        PassStateDateChangeInfoBannerUIState passStateDateChangeInfoBannerUIState = (PassStateDateChangeInfoBannerUIState) obj;
        return Intrinsics.d(this.f8395a, passStateDateChangeInfoBannerUIState.f8395a) && Intrinsics.d(this.b, passStateDateChangeInfoBannerUIState.b) && Intrinsics.d(this.c, passStateDateChangeInfoBannerUIState.c) && Intrinsics.d(this.d, passStateDateChangeInfoBannerUIState.d) && Intrinsics.d(this.e, passStateDateChangeInfoBannerUIState.e) && Intrinsics.d(this.f, passStateDateChangeInfoBannerUIState.f) && Intrinsics.d(this.g, passStateDateChangeInfoBannerUIState.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + z40.b(this.f, z40.b(this.e, r30.c(this.d, r30.c(this.c, r30.f(this.b, this.f8395a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = pk0.n("PassStateDateChangeInfoBannerUIState(image=", this.f8395a, ", textUIState=", this.b, ", internalPadding=");
        r30.o(sbN, this.c, ", contentPadding=", this.d, ", backgroundColor=");
        sbN.append(this.e);
        sbN.append(", backgroundContainerColor=");
        sbN.append(this.f);
        sbN.append(", backgroundShape=");
        return gf.j(sbN, this.g, ")");
    }
}
