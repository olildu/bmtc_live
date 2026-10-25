package app.chalo.productsummary.ui.data;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/data/UserInfoUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserInfoUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUrlUIState f8763a;
    public final ImageUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final TextUIState.ChaloTextUIState e;
    public final BorderUISpec f;

    public UserInfoUIState(ImageUrlUIState imageUrlUIState, ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, TextUIState.ChaloTextUIState chaloTextUIState3) {
        BorderUISpec borderUISpec = new BorderUISpec(ChaloThemeHelper.a().c, ChaloColorToken.SectionDividerColor.f9849a, UIShape.n);
        this.f8763a = imageUrlUIState;
        this.b = imageUIState;
        this.c = chaloTextUIState;
        this.d = chaloTextUIState2;
        this.e = chaloTextUIState3;
        this.f = borderUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInfoUIState)) {
            return false;
        }
        UserInfoUIState userInfoUIState = (UserInfoUIState) obj;
        return Intrinsics.d(this.f8763a, userInfoUIState.f8763a) && Intrinsics.d(this.b, userInfoUIState.b) && Intrinsics.d(this.c, userInfoUIState.c) && Intrinsics.d(this.d, userInfoUIState.d) && Intrinsics.d(this.e, userInfoUIState.e) && Intrinsics.d(this.f, userInfoUIState.f);
    }

    public final int hashCode() {
        ImageUrlUIState imageUrlUIState = this.f8763a;
        int iE = r30.e(this.b, (imageUrlUIState == null ? 0 : imageUrlUIState.hashCode()) * 31, 31);
        TextUIState.ChaloTextUIState chaloTextUIState = this.c;
        int iHashCode = (iE + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState2 = this.d;
        int iHashCode2 = (iHashCode + (chaloTextUIState2 == null ? 0 : chaloTextUIState2.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState3 = this.e;
        return this.f.hashCode() + ((iHashCode2 + (chaloTextUIState3 != null ? chaloTextUIState3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserInfoUIState(imageUrlUIState=");
        sb.append(this.f8763a);
        sb.append(", placeHolderImageUIState=");
        sb.append(this.b);
        sb.append(", userName=");
        r30.p(sb, this.c, ", userDOB=", this.d, ", userGender=");
        sb.append(this.e);
        sb.append(", userImageBorderUISpec=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
