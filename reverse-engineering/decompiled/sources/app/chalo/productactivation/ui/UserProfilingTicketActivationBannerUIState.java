package app.chalo.productactivation.ui;

import app.chalo.compose.components.userprofile.UserProfilePicComposableUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.iw0;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/UserProfilingTicketActivationBannerUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserProfilingTicketActivationBannerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfilingTicketActivationBannerUISpecs f8049a;
    public final UserProfilePicComposableUIState b;
    public final TextUIState c;
    public final TextUIState d;
    public final SetUpProfileBtnUIState e;
    public final iw0 f;

    public UserProfilingTicketActivationBannerUIState(UserProfilePicComposableUIState userProfilePicComposableUIState, TextUIState titleTextUIState, TextUIState msgUIState, SetUpProfileBtnUIState setUpProfileBtnUIState, iw0 iw0Var) {
        UserProfilingTicketActivationBannerUISpecs userProfilingTicketActivationBannerUISpecs = new UserProfilingTicketActivationBannerUISpecs();
        Intrinsics.i(userProfilePicComposableUIState, "userProfilePicComposableUIState");
        Intrinsics.i(titleTextUIState, "titleTextUIState");
        Intrinsics.i(msgUIState, "msgUIState");
        this.f8049a = userProfilingTicketActivationBannerUISpecs;
        this.b = userProfilePicComposableUIState;
        this.c = titleTextUIState;
        this.d = msgUIState;
        this.e = setUpProfileBtnUIState;
        this.f = iw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfilingTicketActivationBannerUIState)) {
            return false;
        }
        UserProfilingTicketActivationBannerUIState userProfilingTicketActivationBannerUIState = (UserProfilingTicketActivationBannerUIState) obj;
        return Intrinsics.d(this.f8049a, userProfilingTicketActivationBannerUIState.f8049a) && Intrinsics.d(this.b, userProfilingTicketActivationBannerUIState.b) && Intrinsics.d(this.c, userProfilingTicketActivationBannerUIState.c) && Intrinsics.d(this.d, userProfilingTicketActivationBannerUIState.d) && Intrinsics.d(this.e, userProfilingTicketActivationBannerUIState.e) && Intrinsics.d(this.f, userProfilingTicketActivationBannerUIState.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + pk0.c(this.d, pk0.c(this.c, (this.b.hashCode() + (this.f8049a.hashCode() * 31)) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "UserProfilingTicketActivationBannerUIState(specs=" + this.f8049a + ", userProfilePicComposableUIState=" + this.b + ", titleTextUIState=" + this.c + ", msgUIState=" + this.d + ", setUpProfileBtnUIState=" + this.e + ", onBannerShownEventHandler=" + this.f + ")";
    }
}
