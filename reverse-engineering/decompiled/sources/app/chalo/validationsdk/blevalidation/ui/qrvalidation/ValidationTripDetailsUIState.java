package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ShapedContentUIState;
import app.chalo.compose.theme.ShapedContentUIStateFactory;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.validationsdk.multiproductvalidation.ui.ValidationTicketStatusUIState;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/ValidationTripDetailsUIState;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ValidationTripDetailsUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ValidationTripDetailsUISpec f10662a;
    public final TextUIState b;
    public final ImageUIState c;
    public final TextUIState d;
    public final ShapedContentUIState e;
    public final ShapedContentUIState f;
    public final TextUIState g;
    public final TextUIState h;
    public final ValidationTicketStatusUIState i;

    public ValidationTripDetailsUIState(TextUIState title, ImageUIState imageUIState, TextUIState textUIState, TextUIState fromStop, TextUIState toStop, ValidationTicketStatusUIState validationTicketStatusUIState) {
        ValidationTripDetailsUISpec validationTripDetailsUISpec = new ValidationTripDetailsUISpec();
        ShapedContentUIState shapedContentUIStateA = ShapedContentUIStateFactory.a(Dp.m7278constructorimpl(ChaloThemeHelper.a().f + ChaloThemeHelper.a().c), ChaloThemeHelper.a().b, ChaloColorToken.UnselectedDot.f9866a, ChaloColorToken.Black_87.f9768a);
        float fM7278constructorimpl = Dp.m7278constructorimpl(ChaloThemeHelper.a().f + ChaloThemeHelper.a().c);
        float f = ChaloThemeHelper.a().b;
        ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
        ShapedContentUIState shapedContentUIStateA2 = ShapedContentUIStateFactory.a(fM7278constructorimpl, f, black, black);
        Intrinsics.i(title, "title");
        Intrinsics.i(fromStop, "fromStop");
        Intrinsics.i(toStop, "toStop");
        this.f10662a = validationTripDetailsUISpec;
        this.b = title;
        this.c = imageUIState;
        this.d = textUIState;
        this.e = shapedContentUIStateA;
        this.f = shapedContentUIStateA2;
        this.g = fromStop;
        this.h = toStop;
        this.i = validationTicketStatusUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidationTripDetailsUIState)) {
            return false;
        }
        ValidationTripDetailsUIState validationTripDetailsUIState = (ValidationTripDetailsUIState) obj;
        return Intrinsics.d(this.f10662a, validationTripDetailsUIState.f10662a) && Intrinsics.d(this.b, validationTripDetailsUIState.b) && Intrinsics.d(this.c, validationTripDetailsUIState.c) && Intrinsics.d(this.d, validationTripDetailsUIState.d) && Intrinsics.d(this.e, validationTripDetailsUIState.e) && Intrinsics.d(this.f, validationTripDetailsUIState.f) && Intrinsics.d(this.g, validationTripDetailsUIState.g) && Intrinsics.d(this.h, validationTripDetailsUIState.h) && Intrinsics.d(this.i, validationTripDetailsUIState.i);
    }

    public final int hashCode() {
        int iC = pk0.c(this.b, this.f10662a.hashCode() * 31, 31);
        ImageUIState imageUIState = this.c;
        int iHashCode = (iC + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31;
        TextUIState textUIState = this.d;
        int iC2 = pk0.c(this.h, pk0.c(this.g, (this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (textUIState == null ? 0 : textUIState.hashCode())) * 961)) * 31)) * 31, 31), 31);
        ValidationTicketStatusUIState validationTicketStatusUIState = this.i;
        return iC2 + (validationTicketStatusUIState != null ? validationTicketStatusUIState.hashCode() : 0);
    }

    public final String toString() {
        return "ValidationTripDetailsUIState(spec=" + this.f10662a + ", title=" + this.b + ", routeIcon=" + this.c + ", routeName=" + this.d + ", namingScheme=null, fromStopIndicator=" + this.e + ", toStopIndicator=" + this.f + ", fromStop=" + this.g + ", toStop=" + this.h + ", validationStatus=" + this.i + ")";
    }
}
