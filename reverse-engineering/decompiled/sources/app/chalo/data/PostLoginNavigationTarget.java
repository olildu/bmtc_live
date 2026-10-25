package app.chalo.data;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/data/PostLoginNavigationTarget;", "", "CitySelection", "OnboardingResolutionFailed", "MinProfileUpdate", "Home", "GoBack", "Lapp/chalo/data/PostLoginNavigationTarget$CitySelection;", "Lapp/chalo/data/PostLoginNavigationTarget$GoBack;", "Lapp/chalo/data/PostLoginNavigationTarget$Home;", "Lapp/chalo/data/PostLoginNavigationTarget$MinProfileUpdate;", "Lapp/chalo/data/PostLoginNavigationTarget$OnboardingResolutionFailed;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PostLoginNavigationTarget {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/data/PostLoginNavigationTarget$CitySelection;", "Lapp/chalo/data/PostLoginNavigationTarget;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CitySelection implements PostLoginNavigationTarget {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f2371a;
        public final boolean b;

        public CitySelection(boolean z, boolean z2) {
            this.f2371a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CitySelection)) {
                return false;
            }
            CitySelection citySelection = (CitySelection) obj;
            return this.f2371a == citySelection.f2371a && this.b == citySelection.b;
        }

        public final int hashCode() {
            return ((this.f2371a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237);
        }

        public final String toString() {
            return "CitySelection(isProfileRequirementSatisfied=" + this.f2371a + ", configDisabled=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/data/PostLoginNavigationTarget$GoBack;", "Lapp/chalo/data/PostLoginNavigationTarget;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GoBack implements PostLoginNavigationTarget {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GoBack f2372a = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 202155127;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/data/PostLoginNavigationTarget$Home;", "Lapp/chalo/data/PostLoginNavigationTarget;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Home implements PostLoginNavigationTarget {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Home f2373a = new Home();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Home);
        }

        public final int hashCode() {
            return 1327614311;
        }

        public final String toString() {
            return "Home";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/data/PostLoginNavigationTarget$MinProfileUpdate;", "Lapp/chalo/data/PostLoginNavigationTarget;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MinProfileUpdate implements PostLoginNavigationTarget {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MinProfileUpdate f2374a = new MinProfileUpdate();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MinProfileUpdate);
        }

        public final int hashCode() {
            return -2061880536;
        }

        public final String toString() {
            return "MinProfileUpdate";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/data/PostLoginNavigationTarget$OnboardingResolutionFailed;", "Lapp/chalo/data/PostLoginNavigationTarget;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnboardingResolutionFailed implements PostLoginNavigationTarget {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnboardingResolutionFailed f2375a = new OnboardingResolutionFailed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnboardingResolutionFailed);
        }

        public final int hashCode() {
            return 826993356;
        }

        public final String toString() {
            return "OnboardingResolutionFailed";
        }
    }
}
