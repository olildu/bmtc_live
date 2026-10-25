package app.chalo.productpurchase.passpurchase.ui.verificationstatus;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.hq0;
import defpackage.pk0;
import defpackage.r30;
import defpackage.t8;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/verificationstatus/SuperPassVerificationUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassVerificationUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassVerificationUISpec f8520a;
    public final ToolbarUIState b;
    public final ImageUIState c;
    public final TextUIState d;
    public final TextUIState e;
    public final List f;
    public final ButtonUIState g;

    public SuperPassVerificationUIState(ToolbarUIState toolbar, ImageUIState successImage, TextUIState successTitle, TextUIState subTitle, List nextSteps, ButtonUIState buttonUIState) {
        SuperPassVerificationUISpec superPassVerificationUISpec = new SuperPassVerificationUISpec();
        Intrinsics.i(toolbar, "toolbar");
        Intrinsics.i(successImage, "successImage");
        Intrinsics.i(successTitle, "successTitle");
        Intrinsics.i(subTitle, "subTitle");
        Intrinsics.i(nextSteps, "nextSteps");
        this.f8520a = superPassVerificationUISpec;
        this.b = toolbar;
        this.c = successImage;
        this.d = successTitle;
        this.e = subTitle;
        this.f = nextSteps;
        this.g = buttonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassVerificationUIState)) {
            return false;
        }
        SuperPassVerificationUIState superPassVerificationUIState = (SuperPassVerificationUIState) obj;
        return Intrinsics.d(this.f8520a, superPassVerificationUIState.f8520a) && Intrinsics.d(this.b, superPassVerificationUIState.b) && Intrinsics.d(this.c, superPassVerificationUIState.c) && Intrinsics.d(this.d, superPassVerificationUIState.d) && Intrinsics.d(this.e, superPassVerificationUIState.e) && Intrinsics.d(this.f, superPassVerificationUIState.f) && Intrinsics.d(this.g, superPassVerificationUIState.g);
    }

    public final int hashCode() {
        return r30.d(this.g, r30.b(pk0.c(this.e, pk0.c(this.d, r30.e(this.c, t8.d(this.b, this.f8520a.hashCode() * 31, 31), 31), 31), 31), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperPassVerificationUIState(spec=");
        sb.append(this.f8520a);
        sb.append(", toolbar=");
        sb.append(this.b);
        sb.append(", successImage=");
        sb.append(this.c);
        sb.append(", successTitle=");
        sb.append(this.d);
        sb.append(", subTitle=");
        sb.append(this.e);
        sb.append(", nextSteps=");
        sb.append(this.f);
        sb.append(", positiveBtn=");
        return hq0.j(sb, this.g, ", negativeBtn=null)");
    }
}
