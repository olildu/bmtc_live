package app.chalo.productpurchase.passpurchase.ui.verificationstatus;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/verificationstatus/SuperPassBookingSuccessNextStepUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassBookingSuccessNextStepUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f8514a;
    public final TextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final ChaloPadding d;
    public final UIShape e;
    public final ChaloColorToken f;
    public final ChaloPadding g;
    public final ChaloPadding h;
    public final ImageUISize i;
    public final UiAlignment.BiasAlignment j;

    public SuperPassBookingSuccessNextStepUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, TextUIState.ChaloTextUIState chaloTextUIState3) {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().i, ChaloThemeHelper.a().i, 0.0f, 8);
        UIShape.Circle circle = UIShape.Circle.p;
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, 0.0f, ChaloThemeHelper.a().h, 0.0f, 11);
        ChaloPadding chaloPadding3 = new ChaloPadding(0.0f, 0.0f, 0.0f, ChaloThemeHelper.a().d, 7);
        ImageUISize imageUISize = new ImageUISize(ChaloThemeHelper.a().i);
        this.f8514a = chaloTextUIState;
        this.b = chaloTextUIState2;
        this.c = chaloTextUIState3;
        this.d = chaloPadding;
        this.e = circle;
        this.f = ChaloColorToken.LightGray.f9814a;
        this.g = chaloPadding2;
        this.h = chaloPadding3;
        this.i = imageUISize;
        this.j = UiAlignment.BiasAlignment.Center.f9878a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassBookingSuccessNextStepUIState)) {
            return false;
        }
        SuperPassBookingSuccessNextStepUIState superPassBookingSuccessNextStepUIState = (SuperPassBookingSuccessNextStepUIState) obj;
        return Intrinsics.d(this.f8514a, superPassBookingSuccessNextStepUIState.f8514a) && Intrinsics.d(this.b, superPassBookingSuccessNextStepUIState.b) && Intrinsics.d(this.c, superPassBookingSuccessNextStepUIState.c) && Intrinsics.d(this.d, superPassBookingSuccessNextStepUIState.d) && Intrinsics.d(this.e, superPassBookingSuccessNextStepUIState.e) && Intrinsics.d(this.f, superPassBookingSuccessNextStepUIState.f) && Intrinsics.d(this.g, superPassBookingSuccessNextStepUIState.g) && Intrinsics.d(this.h, superPassBookingSuccessNextStepUIState.h) && Intrinsics.d(this.i, superPassBookingSuccessNextStepUIState.i) && Intrinsics.d(this.j, superPassBookingSuccessNextStepUIState.j);
    }

    public final int hashCode() {
        int iHashCode = this.f8514a.hashCode() * 31;
        TextUIState textUIState = this.b;
        int iHashCode2 = (iHashCode + (textUIState == null ? 0 : textUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.c;
        return this.j.hashCode() + ((this.i.hashCode() + r30.c(this.h, r30.c(this.g, z40.b(this.f, pk0.b(this.e, r30.c(this.d, (iHashCode2 + (chaloTextUIState != null ? chaloTextUIState.hashCode() : 0)) * 31, 31), 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperPassBookingSuccessNextStepUIState(number=");
        sb.append(this.f8514a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", paddingAroundNextStepItems=");
        sb.append(this.d);
        sb.append(", numberBackgroundShape=");
        sb.append(this.e);
        sb.append(", numberBackgroundColor=");
        sb.append(this.f);
        sb.append(", paddingAroundNumber=");
        r30.o(sb, this.g, ", paddingAroundTitle=", this.h, ", numberSize=");
        sb.append(this.i);
        sb.append(", horizontalAlignment=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
