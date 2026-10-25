package app.chalo.domain;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.data.PostLoginNavigationTarget;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/domain/MinProfileAnalyticsHelper;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MinProfileAnalyticsHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f2513a;

    public MinProfileAnalyticsHelper(AnalyticsContract analyticsContract) {
        this.f2513a = analyticsContract;
    }

    public final void a(PostLoginNavigationTarget postLoginTarget, Source source) {
        Intrinsics.i(postLoginTarget, "postLoginTarget");
        Intrinsics.i(source, "source");
        if (postLoginTarget instanceof PostLoginNavigationTarget.CitySelection) {
            PostLoginNavigationTarget.CitySelection citySelection = (PostLoginNavigationTarget.CitySelection) postLoginTarget;
            b(source, citySelection.f2371a, true, false, citySelection.b);
        } else if (postLoginTarget.equals(PostLoginNavigationTarget.MinProfileUpdate.f2374a)) {
            b(source, false, true, true, false);
        } else if (!postLoginTarget.equals(PostLoginNavigationTarget.OnboardingResolutionFailed.f2375a) && !postLoginTarget.equals(PostLoginNavigationTarget.Home.f2373a) && !postLoginTarget.equals(PostLoginNavigationTarget.GoBack.f2372a)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void b(Source source, boolean z, boolean z2, boolean z3, boolean z4) {
        AnalyticsContractImplKt.b(this.f2513a, "minProfile pre screen trigger", source, MapsKt.i(new Pair("isMinProfileSet", String.valueOf(z)), new Pair("isSkipAllowed", String.valueOf(z2)), new Pair("requestingMinProfile", String.valueOf(z3)), new Pair("minProfileConfigDisable", String.valueOf(z4))), false, 24);
    }
}
