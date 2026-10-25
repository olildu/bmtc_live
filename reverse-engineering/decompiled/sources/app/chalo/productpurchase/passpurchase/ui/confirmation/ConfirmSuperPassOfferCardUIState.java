package app.chalo.productpurchase.passpurchase.ui.confirmation;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import defpackage.n21;
import defpackage.pk0;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassOfferCardUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConfirmSuperPassOfferCardUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f8361a;
    public final TextUIState.ChaloTextUIState b;
    public final ImageUIState c;
    public final ImageUIState d;
    public final ChaloPadding e;
    public final ChaloColorToken f;
    public final ChaloColorToken g;
    public final ChaloColorToken h;
    public final UIShape i;
    public final BorderUISpec j;

    public ConfirmSuperPassOfferCardUIState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        ImageUIState imageUIState2 = new ImageUIState(IconType.IC_OFFER_GREEN, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
        float f = ChaloThemeHelper.a().g;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        UIShape.Rectangle backgroundShape = UIShape.e;
        float f2 = ChaloThemeHelper.a().b;
        ChaloColorToken.GreenBase greenBase = ChaloColorToken.GreenBase.f9800a;
        BorderUISpec borderUISpec = new BorderUISpec(f2, greenBase, backgroundShape);
        Intrinsics.i(backgroundShape, "backgroundShape");
        this.f8361a = chaloTextUIState;
        this.b = chaloTextUIState2;
        this.c = imageUIState2;
        this.d = imageUIState;
        this.e = chaloPadding;
        this.f = greenBase;
        this.g = greenBase;
        this.h = ChaloColorToken.White.f9870a;
        this.i = backgroundShape;
        this.j = borderUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmSuperPassOfferCardUIState)) {
            return false;
        }
        ConfirmSuperPassOfferCardUIState confirmSuperPassOfferCardUIState = (ConfirmSuperPassOfferCardUIState) obj;
        return Intrinsics.d(this.f8361a, confirmSuperPassOfferCardUIState.f8361a) && Intrinsics.d(this.b, confirmSuperPassOfferCardUIState.b) && Intrinsics.d(this.c, confirmSuperPassOfferCardUIState.c) && Intrinsics.d(this.d, confirmSuperPassOfferCardUIState.d) && Intrinsics.d(this.e, confirmSuperPassOfferCardUIState.e) && Intrinsics.d(this.f, confirmSuperPassOfferCardUIState.f) && Intrinsics.d(this.g, confirmSuperPassOfferCardUIState.g) && Intrinsics.d(this.h, confirmSuperPassOfferCardUIState.h) && Intrinsics.d(this.i, confirmSuperPassOfferCardUIState.i) && Intrinsics.d(this.j, confirmSuperPassOfferCardUIState.j);
    }

    public final int hashCode() {
        int iHashCode = this.f8361a.hashCode() * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.b;
        return this.j.hashCode() + pk0.b(this.i, z40.b(this.h, z40.b(this.g, z40.b(this.f, r30.c(this.e, r30.e(this.d, r30.e(this.c, (iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbJ = n21.j("ConfirmSuperPassOfferCardUIState(title=", this.f8361a, ", subtitle=", this.b, ", leadingImage=");
        sbJ.append(this.c);
        sbJ.append(", trailingImage=");
        sbJ.append(this.d);
        sbJ.append(", internalPadding=");
        sbJ.append(this.e);
        sbJ.append(", backgroundContainerColor=");
        sbJ.append(this.f);
        sbJ.append(", backgroundGradientStartColor=");
        sbJ.append(this.g);
        sbJ.append(", backgroundGradientEndColor=");
        sbJ.append(this.h);
        sbJ.append(", backgroundShape=");
        sbJ.append(this.i);
        sbJ.append(", borderUIState=");
        sbJ.append(this.j);
        sbJ.append(")");
        return sbJ.toString();
    }
}
