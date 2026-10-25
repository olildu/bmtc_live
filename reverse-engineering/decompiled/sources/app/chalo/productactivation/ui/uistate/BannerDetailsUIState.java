package app.chalo.productactivation.ui.uistate;

import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/BannerDetailsUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BannerDetailsUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BannerDetailsUISpecs f8067a;
    public final ImageUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;

    public BannerDetailsUIState(ImageUIState bannerImageUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        BannerDetailsUISpecs bannerDetailsUISpecs = new BannerDetailsUISpecs();
        Intrinsics.i(bannerImageUIState, "bannerImageUIState");
        this.f8067a = bannerDetailsUISpecs;
        this.b = bannerImageUIState;
        this.c = chaloTextUIState;
        this.d = chaloTextUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerDetailsUIState)) {
            return false;
        }
        BannerDetailsUIState bannerDetailsUIState = (BannerDetailsUIState) obj;
        return Intrinsics.d(this.f8067a, bannerDetailsUIState.f8067a) && Intrinsics.d(this.b, bannerDetailsUIState.b) && Intrinsics.d(this.c, bannerDetailsUIState.c) && Intrinsics.d(this.d, bannerDetailsUIState.d);
    }

    public final int hashCode() {
        int iE = r30.e(this.b, this.f8067a.hashCode() * 31, 31);
        TextUIState.ChaloTextUIState chaloTextUIState = this.c;
        int iHashCode = (iE + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState2 = this.d;
        return iHashCode + (chaloTextUIState2 != null ? chaloTextUIState2.hashCode() : 0);
    }

    public final String toString() {
        return "BannerDetailsUIState(specs=" + this.f8067a + ", bannerImageUIState=" + this.b + ", bannerTextUIState=" + this.c + ", bannerSubTextUIState=" + this.d + ")";
    }
}
