package app.chalo.onboarding.splash.orchestrator;

import app.chalo.providers.iconassetprovider.IconType;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/onboarding/splash/orchestrator/SplashInitResult;", "", "ShowAnimation", "Lapp/chalo/onboarding/splash/orchestrator/SplashInitResult$ShowAnimation;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SplashInitResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/splash/orchestrator/SplashInitResult$ShowAnimation;", "Lapp/chalo/onboarding/splash/orchestrator/SplashInitResult;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowAnimation extends SplashInitResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IconType f6682a;

        public ShowAnimation(IconType iconType) {
            this.f6682a = iconType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowAnimation) && this.f6682a == ((ShowAnimation) obj).f6682a;
        }

        public final int hashCode() {
            IconType iconType = this.f6682a;
            if (iconType == null) {
                return 0;
            }
            return iconType.hashCode();
        }

        public final String toString() {
            return "ShowAnimation(specialLogoResId=" + this.f6682a + ")";
        }
    }
}
