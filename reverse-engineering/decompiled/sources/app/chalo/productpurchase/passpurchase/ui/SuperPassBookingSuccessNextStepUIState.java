package app.chalo.productpurchase.passpurchase.ui;

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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/SuperPassBookingSuccessNextStepUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassBookingSuccessNextStepUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f8344a;
    public final TextUIState b;
    public final TextUIState c;
    public final UIShape d;
    public final ChaloColorToken e;
    public final ChaloPadding f;
    public final ChaloPadding g;
    public final ImageUISize h;
    public final UiAlignment.BiasAlignment i;

    public SuperPassBookingSuccessNextStepUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, TextUIState.ChaloTextUIState chaloTextUIState3) {
        UIShape.Circle circle = UIShape.Circle.p;
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, 0.0f, ChaloThemeHelper.a().i, 0.0f, 11);
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, 0.0f, 0.0f, ChaloThemeHelper.a().d, 7);
        ImageUISize imageUISize = new ImageUISize(ChaloThemeHelper.a().l);
        this.f8344a = chaloTextUIState;
        this.b = chaloTextUIState2;
        this.c = chaloTextUIState3;
        this.d = circle;
        this.e = ChaloColorToken.LightGray.f9814a;
        this.f = chaloPadding;
        this.g = chaloPadding2;
        this.h = imageUISize;
        this.i = UiAlignment.BiasAlignment.Center.f9878a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassBookingSuccessNextStepUIState)) {
            return false;
        }
        SuperPassBookingSuccessNextStepUIState superPassBookingSuccessNextStepUIState = (SuperPassBookingSuccessNextStepUIState) obj;
        return Intrinsics.d(this.f8344a, superPassBookingSuccessNextStepUIState.f8344a) && Intrinsics.d(this.b, superPassBookingSuccessNextStepUIState.b) && Intrinsics.d(this.c, superPassBookingSuccessNextStepUIState.c) && Intrinsics.d(this.d, superPassBookingSuccessNextStepUIState.d) && Intrinsics.d(this.e, superPassBookingSuccessNextStepUIState.e) && Intrinsics.d(this.f, superPassBookingSuccessNextStepUIState.f) && Intrinsics.d(this.g, superPassBookingSuccessNextStepUIState.g) && Intrinsics.d(this.h, superPassBookingSuccessNextStepUIState.h) && Intrinsics.d(this.i, superPassBookingSuccessNextStepUIState.i);
    }

    public final int hashCode() {
        int iHashCode = this.f8344a.hashCode() * 31;
        TextUIState textUIState = this.b;
        int iHashCode2 = (iHashCode + (textUIState == null ? 0 : textUIState.hashCode())) * 31;
        TextUIState textUIState2 = this.c;
        return this.i.hashCode() + ((this.h.hashCode() + r30.c(this.g, r30.c(this.f, z40.b(this.e, pk0.b(this.d, (iHashCode2 + (textUIState2 != null ? textUIState2.hashCode() : 0)) * 31, 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "SuperPassBookingSuccessNextStepUIState(number=" + this.f8344a + ", title=" + this.b + ", description=" + this.c + ", numberBackgroundShape=" + this.d + ", numberBackgroundColor=" + this.e + ", paddingAroundNumber=" + this.f + ", paddingAroundTitle=" + this.g + ", numberSize=" + this.h + ", horizontalAlignment=" + this.i + ")";
    }
}
