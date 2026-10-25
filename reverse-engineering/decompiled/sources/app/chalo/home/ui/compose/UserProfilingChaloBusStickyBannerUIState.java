package app.chalo.home.ui.compose;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.nf1;
import defpackage.r30;
import defpackage.w70;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/compose/UserProfilingChaloBusStickyBannerUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserProfilingChaloBusStickyBannerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfilingChaloBusStickyBannerUISpecs f3389a;
    public final ImageUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final ImageUIState e;
    public final int f;
    public final int g;
    public final w70 h;
    public final UiEventHandler$Companion$fromLambda$1 i;

    public UserProfilingChaloBusStickyBannerUIState(ImageUIState bannerIcon, TextUIState.ChaloTextUIState bannerTitle, TextUIState.ChaloTextUIState chaloTextUIState, ImageUIState imageUIState, int i, int i2, w70 w70Var, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        UserProfilingChaloBusStickyBannerUISpecs userProfilingChaloBusStickyBannerUISpecs = new UserProfilingChaloBusStickyBannerUISpecs();
        Intrinsics.i(bannerIcon, "bannerIcon");
        Intrinsics.i(bannerTitle, "bannerTitle");
        this.f3389a = userProfilingChaloBusStickyBannerUISpecs;
        this.b = bannerIcon;
        this.c = bannerTitle;
        this.d = chaloTextUIState;
        this.e = imageUIState;
        this.f = i;
        this.g = i2;
        this.h = w70Var;
        this.i = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfilingChaloBusStickyBannerUIState)) {
            return false;
        }
        UserProfilingChaloBusStickyBannerUIState userProfilingChaloBusStickyBannerUIState = (UserProfilingChaloBusStickyBannerUIState) obj;
        return Intrinsics.d(this.f3389a, userProfilingChaloBusStickyBannerUIState.f3389a) && Intrinsics.d(this.b, userProfilingChaloBusStickyBannerUIState.b) && Intrinsics.d(this.c, userProfilingChaloBusStickyBannerUIState.c) && Intrinsics.d(this.d, userProfilingChaloBusStickyBannerUIState.d) && Intrinsics.d(this.e, userProfilingChaloBusStickyBannerUIState.e) && this.f == userProfilingChaloBusStickyBannerUIState.f && this.g == userProfilingChaloBusStickyBannerUIState.g && Intrinsics.d(this.h, userProfilingChaloBusStickyBannerUIState.h) && Intrinsics.d(this.i, userProfilingChaloBusStickyBannerUIState.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((((r30.e(this.e, r30.f(this.d, r30.f(this.c, r30.e(this.b, this.f3389a.hashCode() * 31, 31), 31), 31), 31) + this.f) * 31) + this.g) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserProfilingChaloBusStickyBannerUIState(specs=");
        sb.append(this.f3389a);
        sb.append(", bannerIcon=");
        sb.append(this.b);
        sb.append(", bannerTitle=");
        r30.p(sb, this.c, ", bannerSubtitle=", this.d, ", rightArrowIcon=");
        sb.append(this.e);
        sb.append(", totalCount=");
        sb.append(this.f);
        sb.append(", completedCount=");
        sb.append(this.g);
        sb.append(", onStickyBannerShown=");
        sb.append(this.h);
        sb.append(", eventHandler=");
        return nf1.n(sb, this.i, ")");
    }
}
