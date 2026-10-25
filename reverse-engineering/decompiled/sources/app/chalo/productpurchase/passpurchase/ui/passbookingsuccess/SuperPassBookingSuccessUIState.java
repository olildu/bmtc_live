package app.chalo.productpurchase.passpurchase.ui.passbookingsuccess;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.productpurchase.passpurchase.ui.SuperPassBookingSuccessDetailsUIState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/passbookingsuccess/SuperPassBookingSuccessUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassBookingSuccessUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassBookingSuccessUISpec f8442a;
    public final ImageUIState b;
    public final TextUIState c;
    public final TextUIState d;
    public final SuperPassBookingSuccessDetailsUIState e;

    public SuperPassBookingSuccessUIState(TextUIState successTitle, TextUIState textUIState, SuperPassBookingSuccessDetailsUIState details) {
        SuperPassBookingSuccessUISpec superPassBookingSuccessUISpec = new SuperPassBookingSuccessUISpec();
        ImageUIState imageUIState = new ImageUIState(IconType.ACKNOWLEDGEMENT_PASS_TICKET, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().o), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
        Intrinsics.i(successTitle, "successTitle");
        Intrinsics.i(details, "details");
        this.f8442a = superPassBookingSuccessUISpec;
        this.b = imageUIState;
        this.c = successTitle;
        this.d = textUIState;
        this.e = details;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassBookingSuccessUIState)) {
            return false;
        }
        SuperPassBookingSuccessUIState superPassBookingSuccessUIState = (SuperPassBookingSuccessUIState) obj;
        return Intrinsics.d(this.f8442a, superPassBookingSuccessUIState.f8442a) && Intrinsics.d(this.b, superPassBookingSuccessUIState.b) && Intrinsics.d(this.c, superPassBookingSuccessUIState.c) && Intrinsics.d(this.d, superPassBookingSuccessUIState.d) && Intrinsics.d(this.e, superPassBookingSuccessUIState.e);
    }

    public final int hashCode() {
        int iC = pk0.c(this.c, r30.e(this.b, this.f8442a.hashCode() * 31, 31), 31);
        TextUIState textUIState = this.d;
        return this.e.hashCode() + ((iC + (textUIState == null ? 0 : textUIState.hashCode())) * 31);
    }

    public final String toString() {
        return "SuperPassBookingSuccessUIState(spec=" + this.f8442a + ", successImg=" + this.b + ", successTitle=" + this.c + ", bookingDetailsText=" + this.d + ", details=" + this.e + ")";
    }
}
