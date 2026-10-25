package app.chalo.home.ui.compose;

import app.chalo.compose.components.userprofile.UserProfilePicComposableUIState;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.nf1;
import defpackage.r30;
import defpackage.v70;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/compose/UserProfilingHomeStickyBannerUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserProfilingHomeStickyBannerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfilingHomeStickyBannerUISpecs f3391a = new UserProfilingHomeStickyBannerUISpecs();
    public final UserProfilePicComposableUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final ImageUIState e;
    public final v70 f;
    public final UiEventHandler$Companion$fromLambda$1 g;

    public UserProfilingHomeStickyBannerUIState(UserProfilePicComposableUIState userProfilePicComposableUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, ImageUIState imageUIState, v70 v70Var, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        this.b = userProfilePicComposableUIState;
        this.c = chaloTextUIState;
        this.d = chaloTextUIState2;
        this.e = imageUIState;
        this.f = v70Var;
        this.g = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfilingHomeStickyBannerUIState)) {
            return false;
        }
        UserProfilingHomeStickyBannerUIState userProfilingHomeStickyBannerUIState = (UserProfilingHomeStickyBannerUIState) obj;
        return Intrinsics.d(this.f3391a, userProfilingHomeStickyBannerUIState.f3391a) && Intrinsics.d(this.b, userProfilingHomeStickyBannerUIState.b) && Intrinsics.d(this.c, userProfilingHomeStickyBannerUIState.c) && Intrinsics.d(this.d, userProfilingHomeStickyBannerUIState.d) && Intrinsics.d(this.e, userProfilingHomeStickyBannerUIState.e) && Intrinsics.d(this.f, userProfilingHomeStickyBannerUIState.f) && Intrinsics.d(this.g, userProfilingHomeStickyBannerUIState.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + r30.e(this.e, r30.f(this.d, r30.f(this.c, (this.b.hashCode() + (this.f3391a.hashCode() * 31)) * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserProfilingHomeStickyBannerUIState(specs=");
        sb.append(this.f3391a);
        sb.append(", userProfilePicComposableUIState=");
        sb.append(this.b);
        sb.append(", bannerTitle=");
        r30.p(sb, this.c, ", bannerSubtitle=", this.d, ", rightArrowIcon=");
        sb.append(this.e);
        sb.append(", onStickyBannerShown=");
        sb.append(this.f);
        sb.append(", eventHandler=");
        return nf1.n(sb, this.g, ")");
    }
}
