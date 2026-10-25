package app.chalo.onboarding.citylocationselection.ui;

import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.lottieassetprovider.LottieType;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/ui/WelcomeScreenConfig;", "", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WelcomeScreenConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IconType f6601a;
    public final IconType b;
    public final LottieType c;

    public WelcomeScreenConfig(IconType iconType, IconType iconType2, LottieType lottieType, int i) {
        iconType = (i & 1) != 0 ? null : iconType;
        iconType2 = (i & 2) != 0 ? null : iconType2;
        lottieType = (i & 4) != 0 ? null : lottieType;
        this.f6601a = iconType;
        this.b = iconType2;
        this.c = lottieType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WelcomeScreenConfig)) {
            return false;
        }
        WelcomeScreenConfig welcomeScreenConfig = (WelcomeScreenConfig) obj;
        return this.f6601a == welcomeScreenConfig.f6601a && this.b == welcomeScreenConfig.b && this.c == welcomeScreenConfig.c;
    }

    public final int hashCode() {
        IconType iconType = this.f6601a;
        int iHashCode = (iconType == null ? 0 : iconType.hashCode()) * 31;
        IconType iconType2 = this.b;
        int iHashCode2 = (iHashCode + (iconType2 == null ? 0 : iconType2.hashCode())) * 31;
        LottieType lottieType = this.c;
        return iHashCode2 + (lottieType != null ? lottieType.hashCode() : 0);
    }

    public final String toString() {
        return "WelcomeScreenConfig(logoResId=" + this.f6601a + ", welcomeImageResId=" + this.b + ", lottieAnimationResId=" + this.c + ")";
    }
}
