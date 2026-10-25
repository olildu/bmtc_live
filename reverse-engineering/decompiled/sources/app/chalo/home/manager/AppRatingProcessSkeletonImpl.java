package app.chalo.home.manager;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.data.MiscellaneousCityWiseConfigForCity;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
import app.chalo.utils.PlatformFeature;
import defpackage.i4;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/manager/AppRatingProcessSkeletonImpl;", "Lapp/chalo/home/manager/AppRatingProcessSkeleton;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppRatingProcessSkeletonImpl implements AppRatingProcessSkeleton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppRatingProcessManagerProvider f3110a;
    public final AnalyticsContract b;
    public final CrashlyticsLogger c;
    public final GetMiscellaneousCityWiseFlagsConfigUseCase d;
    public final Lazy e = LazyKt.b(new i4(this, 8));

    public AppRatingProcessSkeletonImpl(AppRatingProcessManagerProvider appRatingProcessManagerProvider, AnalyticsContract analyticsContract, CrashlyticsLogger crashlyticsLogger, GetMiscellaneousCityWiseFlagsConfigUseCase getMiscellaneousCityWiseFlagsConfigUseCase) {
        this.f3110a = appRatingProcessManagerProvider;
        this.b = analyticsContract;
        this.c = crashlyticsLogger;
        this.d = getMiscellaneousCityWiseFlagsConfigUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.home.manager.AppRatingProcessSkeleton
    public final Object a(ContinuationImpl continuationImpl) {
        AppRatingProcessSkeletonImpl$checkConfigForInAppReviewLaunch$1 appRatingProcessSkeletonImpl$checkConfigForInAppReviewLaunch$1;
        if (continuationImpl instanceof AppRatingProcessSkeletonImpl$checkConfigForInAppReviewLaunch$1) {
            appRatingProcessSkeletonImpl$checkConfigForInAppReviewLaunch$1 = (AppRatingProcessSkeletonImpl$checkConfigForInAppReviewLaunch$1) continuationImpl;
            int i = appRatingProcessSkeletonImpl$checkConfigForInAppReviewLaunch$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                appRatingProcessSkeletonImpl$checkConfigForInAppReviewLaunch$1.label = i - Integer.MIN_VALUE;
            } else {
                appRatingProcessSkeletonImpl$checkConfigForInAppReviewLaunch$1 = new AppRatingProcessSkeletonImpl$checkConfigForInAppReviewLaunch$1(this, continuationImpl);
            }
        } else {
            appRatingProcessSkeletonImpl$checkConfigForInAppReviewLaunch$1 = new AppRatingProcessSkeletonImpl$checkConfigForInAppReviewLaunch$1(this, continuationImpl);
        }
        Object objA = appRatingProcessSkeletonImpl$checkConfigForInAppReviewLaunch$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = appRatingProcessSkeletonImpl$checkConfigForInAppReviewLaunch$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            appRatingProcessSkeletonImpl$checkConfigForInAppReviewLaunch$1.label = 1;
            objA = this.d.a(appRatingProcessSkeletonImpl$checkConfigForInAppReviewLaunch$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return Boolean.valueOf(((MiscellaneousCityWiseConfigForCity) objA).t);
    }

    @Override // app.chalo.home.manager.AppRatingProcessSkeleton
    public final Unit b(boolean z, Source source, Map map) {
        Lazy lazy = this.e;
        Unit unit = Unit.f17538a;
        if (z) {
            try {
                ((AppRatingProcessManager) lazy.getValue()).a(source, map);
                return unit;
            } catch (Exception e) {
                this.c.i(e);
                return unit;
            }
        }
        AnalyticsContract analyticsContract = this.b;
        AnalyticsContractImplKt.b(analyticsContract, "in app ratings turned off", source, map, false, 24);
        boolean zB = ((AppRatingProcessManager) lazy.getValue()).b(source, map);
        float f = PlatformFeature.f10436a;
        AnalyticsContractImplKt.b(analyticsContract, zB ? "redirected to play store" : "redirection to play store failed", source, map, false, 24);
        return unit;
    }
}
