package app.chalo.onboarding.splash.ui;

import app.chalo.providers.iconassetprovider.IconType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/splash/ui/SplashScreenViewState;", "", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SplashScreenViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6696a;
    public final IconType b;
    public final Boolean c;

    public SplashScreenViewState(boolean z, IconType iconType, Boolean bool) {
        this.f6696a = z;
        this.b = iconType;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplashScreenViewState)) {
            return false;
        }
        SplashScreenViewState splashScreenViewState = (SplashScreenViewState) obj;
        return this.f6696a == splashScreenViewState.f6696a && this.b == splashScreenViewState.b && Intrinsics.d(this.c, splashScreenViewState.c);
    }

    public final int hashCode() {
        int i = (this.f6696a ? 1231 : 1237) * 31;
        IconType iconType = this.b;
        int iHashCode = (i + (iconType == null ? 0 : iconType.hashCode())) * 31;
        Boolean bool = this.c;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "SplashScreenViewState(isSplashBrandingResolved=" + this.f6696a + ", specialLogoResId=" + this.b + ", showFullScreenLoader=" + this.c + ")";
    }
}
