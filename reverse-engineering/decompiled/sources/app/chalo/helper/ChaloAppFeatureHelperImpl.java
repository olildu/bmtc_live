package app.chalo.helper;

import app.chalo.behaviour.policy.CityAutoSelectionApplicable;
import app.chalo.behaviour.policy.LocationPermissionPolicy;
import app.chalo.behaviour.policy.ProductPurchasePolicy;
import app.chalo.behaviour.policy.ProfilePolicy;
import app.chalo.behaviour.policy.ResolveCitySelectionPolicyUseCase;
import app.chalo.behaviour.policy.ResolveLocationPermissionPolicyUseCase;
import app.chalo.behaviour.policy.ResolveProductPurchasePolicyUseCase;
import app.chalo.behaviour.policy.ResolveProfilePolicyUseCase;
import app.chalo.behaviour.policy.ResolveSplashPolicyUseCase;
import app.chalo.behaviour.policy.ResolveSupportPolicyUseCase;
import app.chalo.behaviour.policy.ResolveWalletPolicyUseCase;
import app.chalo.behaviour.policy.ResolvedCitySelectionPolicy;
import app.chalo.behaviour.policy.ResolvedSplashPolicy;
import app.chalo.behaviour.policy.ResolvedSupportPolicy;
import app.chalo.behaviour.policy.TripPlannerPolicyManager;
import app.chalo.location.LatLng;
import app.chalo.userprofile.Gender;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/helper/ChaloAppFeatureHelperImpl;", "Lapp/chalo/helper/ChaloAppFeatureHelper;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloAppFeatureHelperImpl implements ChaloAppFeatureHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResolveSplashPolicyUseCase f2827a;
    public final ResolveCitySelectionPolicyUseCase b;
    public final ResolveSupportPolicyUseCase c;
    public final ResolveWalletPolicyUseCase d;
    public final ResolveProductPurchasePolicyUseCase e;
    public final ResolveProfilePolicyUseCase f;
    public final ResolveLocationPermissionPolicyUseCase g;
    public final TripPlannerPolicyManager h;

    public ChaloAppFeatureHelperImpl(ResolveSplashPolicyUseCase resolveSplashPolicyUseCase, ResolveCitySelectionPolicyUseCase resolveCitySelectionPolicyUseCase, ResolveSupportPolicyUseCase resolveSupportPolicyUseCase, ResolveWalletPolicyUseCase resolveWalletPolicyUseCase, ResolveProductPurchasePolicyUseCase resolveProductPurchasePolicyUseCase, ResolveProfilePolicyUseCase resolveProfilePolicyUseCase, ResolveLocationPermissionPolicyUseCase resolveLocationPermissionPolicyUseCase, TripPlannerPolicyManager tripPlannerPolicyManager) {
        this.f2827a = resolveSplashPolicyUseCase;
        this.b = resolveCitySelectionPolicyUseCase;
        this.c = resolveSupportPolicyUseCase;
        this.d = resolveWalletPolicyUseCase;
        this.e = resolveProductPurchasePolicyUseCase;
        this.f = resolveProfilePolicyUseCase;
        this.g = resolveLocationPermissionPolicyUseCase;
        this.h = tripPlannerPolicyManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.helper.ChaloAppFeatureHelper
    public final Object a(ContinuationImpl continuationImpl) {
        ChaloAppFeatureHelperImpl$shouldShowProfilePhotoStepInMinProfileUpdate$1 chaloAppFeatureHelperImpl$shouldShowProfilePhotoStepInMinProfileUpdate$1;
        if (continuationImpl instanceof ChaloAppFeatureHelperImpl$shouldShowProfilePhotoStepInMinProfileUpdate$1) {
            chaloAppFeatureHelperImpl$shouldShowProfilePhotoStepInMinProfileUpdate$1 = (ChaloAppFeatureHelperImpl$shouldShowProfilePhotoStepInMinProfileUpdate$1) continuationImpl;
            int i = chaloAppFeatureHelperImpl$shouldShowProfilePhotoStepInMinProfileUpdate$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloAppFeatureHelperImpl$shouldShowProfilePhotoStepInMinProfileUpdate$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloAppFeatureHelperImpl$shouldShowProfilePhotoStepInMinProfileUpdate$1 = new ChaloAppFeatureHelperImpl$shouldShowProfilePhotoStepInMinProfileUpdate$1(this, continuationImpl);
            }
        } else {
            chaloAppFeatureHelperImpl$shouldShowProfilePhotoStepInMinProfileUpdate$1 = new ChaloAppFeatureHelperImpl$shouldShowProfilePhotoStepInMinProfileUpdate$1(this, continuationImpl);
        }
        Object objA = chaloAppFeatureHelperImpl$shouldShowProfilePhotoStepInMinProfileUpdate$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloAppFeatureHelperImpl$shouldShowProfilePhotoStepInMinProfileUpdate$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            chaloAppFeatureHelperImpl$shouldShowProfilePhotoStepInMinProfileUpdate$1.label = 1;
            objA = this.f.a(chaloAppFeatureHelperImpl$shouldShowProfilePhotoStepInMinProfileUpdate$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return Boolean.valueOf(((ProfilePolicy) objA).d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.helper.ChaloAppFeatureHelper
    public final Object b(ContinuationImpl continuationImpl) {
        ChaloAppFeatureHelperImpl$showProfileCompleteNudgeBanner$1 chaloAppFeatureHelperImpl$showProfileCompleteNudgeBanner$1;
        if (continuationImpl instanceof ChaloAppFeatureHelperImpl$showProfileCompleteNudgeBanner$1) {
            chaloAppFeatureHelperImpl$showProfileCompleteNudgeBanner$1 = (ChaloAppFeatureHelperImpl$showProfileCompleteNudgeBanner$1) continuationImpl;
            int i = chaloAppFeatureHelperImpl$showProfileCompleteNudgeBanner$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloAppFeatureHelperImpl$showProfileCompleteNudgeBanner$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloAppFeatureHelperImpl$showProfileCompleteNudgeBanner$1 = new ChaloAppFeatureHelperImpl$showProfileCompleteNudgeBanner$1(this, continuationImpl);
            }
        } else {
            chaloAppFeatureHelperImpl$showProfileCompleteNudgeBanner$1 = new ChaloAppFeatureHelperImpl$showProfileCompleteNudgeBanner$1(this, continuationImpl);
        }
        Object objA = chaloAppFeatureHelperImpl$showProfileCompleteNudgeBanner$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloAppFeatureHelperImpl$showProfileCompleteNudgeBanner$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            chaloAppFeatureHelperImpl$showProfileCompleteNudgeBanner$1.label = 1;
            objA = this.f.a(chaloAppFeatureHelperImpl$showProfileCompleteNudgeBanner$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return Boolean.valueOf(((ProfilePolicy) objA).f1029a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.helper.ChaloAppFeatureHelper
    public final Object c(String cityId, ContinuationImpl continuationImpl) {
        ChaloAppFeatureHelperImpl$isCityIdValidForAutoSelection$1 chaloAppFeatureHelperImpl$isCityIdValidForAutoSelection$1;
        if (continuationImpl instanceof ChaloAppFeatureHelperImpl$isCityIdValidForAutoSelection$1) {
            chaloAppFeatureHelperImpl$isCityIdValidForAutoSelection$1 = (ChaloAppFeatureHelperImpl$isCityIdValidForAutoSelection$1) continuationImpl;
            int i = chaloAppFeatureHelperImpl$isCityIdValidForAutoSelection$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloAppFeatureHelperImpl$isCityIdValidForAutoSelection$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloAppFeatureHelperImpl$isCityIdValidForAutoSelection$1 = new ChaloAppFeatureHelperImpl$isCityIdValidForAutoSelection$1(this, continuationImpl);
            }
        } else {
            chaloAppFeatureHelperImpl$isCityIdValidForAutoSelection$1 = new ChaloAppFeatureHelperImpl$isCityIdValidForAutoSelection$1(this, continuationImpl);
        }
        Object objA = chaloAppFeatureHelperImpl$isCityIdValidForAutoSelection$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloAppFeatureHelperImpl$isCityIdValidForAutoSelection$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            chaloAppFeatureHelperImpl$isCityIdValidForAutoSelection$1.L$0 = cityId;
            chaloAppFeatureHelperImpl$isCityIdValidForAutoSelection$1.label = 1;
            objA = this.b.a(chaloAppFeatureHelperImpl$isCityIdValidForAutoSelection$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cityId = (String) chaloAppFeatureHelperImpl$isCityIdValidForAutoSelection$1.L$0;
            ResultKt.b(objA);
        }
        ResolvedCitySelectionPolicy resolvedCitySelectionPolicy = (ResolvedCitySelectionPolicy) objA;
        resolvedCitySelectionPolicy.getClass();
        Intrinsics.i(cityId, "cityId");
        Set set = resolvedCitySelectionPolicy.c;
        String lowerCase = cityId.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        return Boolean.valueOf(set.contains(lowerCase));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.helper.ChaloAppFeatureHelper
    public final Object d(ContinuationImpl continuationImpl) {
        ChaloAppFeatureHelperImpl$getReportProblemPath$1 chaloAppFeatureHelperImpl$getReportProblemPath$1;
        if (continuationImpl instanceof ChaloAppFeatureHelperImpl$getReportProblemPath$1) {
            chaloAppFeatureHelperImpl$getReportProblemPath$1 = (ChaloAppFeatureHelperImpl$getReportProblemPath$1) continuationImpl;
            int i = chaloAppFeatureHelperImpl$getReportProblemPath$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloAppFeatureHelperImpl$getReportProblemPath$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloAppFeatureHelperImpl$getReportProblemPath$1 = new ChaloAppFeatureHelperImpl$getReportProblemPath$1(this, continuationImpl);
            }
        } else {
            chaloAppFeatureHelperImpl$getReportProblemPath$1 = new ChaloAppFeatureHelperImpl$getReportProblemPath$1(this, continuationImpl);
        }
        Object objA = chaloAppFeatureHelperImpl$getReportProblemPath$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloAppFeatureHelperImpl$getReportProblemPath$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            chaloAppFeatureHelperImpl$getReportProblemPath$1.label = 1;
            objA = this.c.a(chaloAppFeatureHelperImpl$getReportProblemPath$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return ((ResolvedSupportPolicy) objA).f1075a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.helper.ChaloAppFeatureHelper
    public final Enum e(ContinuationImpl continuationImpl) {
        ChaloAppFeatureHelperImpl$getWelcomeIcon$1 chaloAppFeatureHelperImpl$getWelcomeIcon$1;
        if (continuationImpl instanceof ChaloAppFeatureHelperImpl$getWelcomeIcon$1) {
            chaloAppFeatureHelperImpl$getWelcomeIcon$1 = (ChaloAppFeatureHelperImpl$getWelcomeIcon$1) continuationImpl;
            int i = chaloAppFeatureHelperImpl$getWelcomeIcon$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloAppFeatureHelperImpl$getWelcomeIcon$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloAppFeatureHelperImpl$getWelcomeIcon$1 = new ChaloAppFeatureHelperImpl$getWelcomeIcon$1(this, continuationImpl);
            }
        } else {
            chaloAppFeatureHelperImpl$getWelcomeIcon$1 = new ChaloAppFeatureHelperImpl$getWelcomeIcon$1(this, continuationImpl);
        }
        Object objA = chaloAppFeatureHelperImpl$getWelcomeIcon$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloAppFeatureHelperImpl$getWelcomeIcon$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            chaloAppFeatureHelperImpl$getWelcomeIcon$1.label = 1;
            objA = this.b.a(chaloAppFeatureHelperImpl$getWelcomeIcon$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return ((ResolvedCitySelectionPolicy) objA).e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.helper.ChaloAppFeatureHelper
    public final Object f(ContinuationImpl continuationImpl) {
        ChaloAppFeatureHelperImpl$enableAbExperimentsForProfileCompletionHooks$1 chaloAppFeatureHelperImpl$enableAbExperimentsForProfileCompletionHooks$1;
        if (continuationImpl instanceof ChaloAppFeatureHelperImpl$enableAbExperimentsForProfileCompletionHooks$1) {
            chaloAppFeatureHelperImpl$enableAbExperimentsForProfileCompletionHooks$1 = (ChaloAppFeatureHelperImpl$enableAbExperimentsForProfileCompletionHooks$1) continuationImpl;
            int i = chaloAppFeatureHelperImpl$enableAbExperimentsForProfileCompletionHooks$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloAppFeatureHelperImpl$enableAbExperimentsForProfileCompletionHooks$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloAppFeatureHelperImpl$enableAbExperimentsForProfileCompletionHooks$1 = new ChaloAppFeatureHelperImpl$enableAbExperimentsForProfileCompletionHooks$1(this, continuationImpl);
            }
        } else {
            chaloAppFeatureHelperImpl$enableAbExperimentsForProfileCompletionHooks$1 = new ChaloAppFeatureHelperImpl$enableAbExperimentsForProfileCompletionHooks$1(this, continuationImpl);
        }
        Object objA = chaloAppFeatureHelperImpl$enableAbExperimentsForProfileCompletionHooks$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloAppFeatureHelperImpl$enableAbExperimentsForProfileCompletionHooks$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            chaloAppFeatureHelperImpl$enableAbExperimentsForProfileCompletionHooks$1.label = 1;
            objA = this.f.a(chaloAppFeatureHelperImpl$enableAbExperimentsForProfileCompletionHooks$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return Boolean.valueOf(((ProfilePolicy) objA).b);
    }

    @Override // app.chalo.helper.ChaloAppFeatureHelper
    public final boolean g() {
        return this.h.f1086a.f1085a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.helper.ChaloAppFeatureHelper
    public final Object h(ContinuationImpl continuationImpl) {
        ChaloAppFeatureHelperImpl$getCityAutoSelectionApplicability$1 chaloAppFeatureHelperImpl$getCityAutoSelectionApplicability$1;
        if (continuationImpl instanceof ChaloAppFeatureHelperImpl$getCityAutoSelectionApplicability$1) {
            chaloAppFeatureHelperImpl$getCityAutoSelectionApplicability$1 = (ChaloAppFeatureHelperImpl$getCityAutoSelectionApplicability$1) continuationImpl;
            int i = chaloAppFeatureHelperImpl$getCityAutoSelectionApplicability$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloAppFeatureHelperImpl$getCityAutoSelectionApplicability$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloAppFeatureHelperImpl$getCityAutoSelectionApplicability$1 = new ChaloAppFeatureHelperImpl$getCityAutoSelectionApplicability$1(this, continuationImpl);
            }
        } else {
            chaloAppFeatureHelperImpl$getCityAutoSelectionApplicability$1 = new ChaloAppFeatureHelperImpl$getCityAutoSelectionApplicability$1(this, continuationImpl);
        }
        Object objA = chaloAppFeatureHelperImpl$getCityAutoSelectionApplicability$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloAppFeatureHelperImpl$getCityAutoSelectionApplicability$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            chaloAppFeatureHelperImpl$getCityAutoSelectionApplicability$1.label = 1;
            objA = this.b.a(chaloAppFeatureHelperImpl$getCityAutoSelectionApplicability$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        LatLng latLng = ((ResolvedCitySelectionPolicy) objA).d;
        return latLng != null ? new CityAutoSelectionApplicable.Yes(latLng) : CityAutoSelectionApplicable.No.f999a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.helper.ChaloAppFeatureHelper
    public final Object i(String str, ContinuationImpl continuationImpl) {
        ChaloAppFeatureHelperImpl$hideCurrentCitySelectionItem$1 chaloAppFeatureHelperImpl$hideCurrentCitySelectionItem$1;
        String lowerCase;
        if (continuationImpl instanceof ChaloAppFeatureHelperImpl$hideCurrentCitySelectionItem$1) {
            chaloAppFeatureHelperImpl$hideCurrentCitySelectionItem$1 = (ChaloAppFeatureHelperImpl$hideCurrentCitySelectionItem$1) continuationImpl;
            int i = chaloAppFeatureHelperImpl$hideCurrentCitySelectionItem$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloAppFeatureHelperImpl$hideCurrentCitySelectionItem$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloAppFeatureHelperImpl$hideCurrentCitySelectionItem$1 = new ChaloAppFeatureHelperImpl$hideCurrentCitySelectionItem$1(this, continuationImpl);
            }
        } else {
            chaloAppFeatureHelperImpl$hideCurrentCitySelectionItem$1 = new ChaloAppFeatureHelperImpl$hideCurrentCitySelectionItem$1(this, continuationImpl);
        }
        Object objA = chaloAppFeatureHelperImpl$hideCurrentCitySelectionItem$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloAppFeatureHelperImpl$hideCurrentCitySelectionItem$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            chaloAppFeatureHelperImpl$hideCurrentCitySelectionItem$1.L$0 = str;
            chaloAppFeatureHelperImpl$hideCurrentCitySelectionItem$1.label = 1;
            objA = this.b.a(chaloAppFeatureHelperImpl$hideCurrentCitySelectionItem$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) chaloAppFeatureHelperImpl$hideCurrentCitySelectionItem$1.L$0;
            ResultKt.b(objA);
        }
        Set set = ((ResolvedCitySelectionPolicy) objA).f1070a;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        return Boolean.valueOf(CollectionsKt.w(set, lowerCase));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.helper.ChaloAppFeatureHelper
    public final Object j(ContinuationImpl continuationImpl) {
        ChaloAppFeatureHelperImpl$showSuperPassProofOverviewConsentCheckbox$1 chaloAppFeatureHelperImpl$showSuperPassProofOverviewConsentCheckbox$1;
        if (continuationImpl instanceof ChaloAppFeatureHelperImpl$showSuperPassProofOverviewConsentCheckbox$1) {
            chaloAppFeatureHelperImpl$showSuperPassProofOverviewConsentCheckbox$1 = (ChaloAppFeatureHelperImpl$showSuperPassProofOverviewConsentCheckbox$1) continuationImpl;
            int i = chaloAppFeatureHelperImpl$showSuperPassProofOverviewConsentCheckbox$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloAppFeatureHelperImpl$showSuperPassProofOverviewConsentCheckbox$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloAppFeatureHelperImpl$showSuperPassProofOverviewConsentCheckbox$1 = new ChaloAppFeatureHelperImpl$showSuperPassProofOverviewConsentCheckbox$1(this, continuationImpl);
            }
        } else {
            chaloAppFeatureHelperImpl$showSuperPassProofOverviewConsentCheckbox$1 = new ChaloAppFeatureHelperImpl$showSuperPassProofOverviewConsentCheckbox$1(this, continuationImpl);
        }
        Object objA = chaloAppFeatureHelperImpl$showSuperPassProofOverviewConsentCheckbox$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloAppFeatureHelperImpl$showSuperPassProofOverviewConsentCheckbox$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            chaloAppFeatureHelperImpl$showSuperPassProofOverviewConsentCheckbox$1.label = 1;
            objA = this.e.a(chaloAppFeatureHelperImpl$showSuperPassProofOverviewConsentCheckbox$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return Boolean.valueOf(((ProductPurchasePolicy) objA).f1026a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.helper.ChaloAppFeatureHelper
    public final Object k(ContinuationImpl continuationImpl) {
        ChaloAppFeatureHelperImpl$profileGenderOptions$1 chaloAppFeatureHelperImpl$profileGenderOptions$1;
        if (continuationImpl instanceof ChaloAppFeatureHelperImpl$profileGenderOptions$1) {
            chaloAppFeatureHelperImpl$profileGenderOptions$1 = (ChaloAppFeatureHelperImpl$profileGenderOptions$1) continuationImpl;
            int i = chaloAppFeatureHelperImpl$profileGenderOptions$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloAppFeatureHelperImpl$profileGenderOptions$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloAppFeatureHelperImpl$profileGenderOptions$1 = new ChaloAppFeatureHelperImpl$profileGenderOptions$1(this, continuationImpl);
            }
        } else {
            chaloAppFeatureHelperImpl$profileGenderOptions$1 = new ChaloAppFeatureHelperImpl$profileGenderOptions$1(this, continuationImpl);
        }
        Object objA = chaloAppFeatureHelperImpl$profileGenderOptions$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloAppFeatureHelperImpl$profileGenderOptions$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            chaloAppFeatureHelperImpl$profileGenderOptions$1.label = 1;
            objA = this.f.a(chaloAppFeatureHelperImpl$profileGenderOptions$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return ((ProfilePolicy) objA).g ? CollectionsKt.S(Gender.MALE, Gender.FEMALE, Gender.OTHER) : CollectionsKt.S(Gender.MALE, Gender.FEMALE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.helper.ChaloAppFeatureHelper
    public final Enum l(ContinuationImpl continuationImpl) {
        ChaloAppFeatureHelperImpl$ticketReceiptFormatConfig$1 chaloAppFeatureHelperImpl$ticketReceiptFormatConfig$1;
        if (continuationImpl instanceof ChaloAppFeatureHelperImpl$ticketReceiptFormatConfig$1) {
            chaloAppFeatureHelperImpl$ticketReceiptFormatConfig$1 = (ChaloAppFeatureHelperImpl$ticketReceiptFormatConfig$1) continuationImpl;
            int i = chaloAppFeatureHelperImpl$ticketReceiptFormatConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloAppFeatureHelperImpl$ticketReceiptFormatConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloAppFeatureHelperImpl$ticketReceiptFormatConfig$1 = new ChaloAppFeatureHelperImpl$ticketReceiptFormatConfig$1(this, continuationImpl);
            }
        } else {
            chaloAppFeatureHelperImpl$ticketReceiptFormatConfig$1 = new ChaloAppFeatureHelperImpl$ticketReceiptFormatConfig$1(this, continuationImpl);
        }
        Object objA = chaloAppFeatureHelperImpl$ticketReceiptFormatConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloAppFeatureHelperImpl$ticketReceiptFormatConfig$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            chaloAppFeatureHelperImpl$ticketReceiptFormatConfig$1.label = 1;
            objA = this.b.a(chaloAppFeatureHelperImpl$ticketReceiptFormatConfig$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return ((ResolvedCitySelectionPolicy) objA).g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.helper.ChaloAppFeatureHelper
    public final Object m(ContinuationImpl continuationImpl) {
        ChaloAppFeatureHelperImpl$hideValidationInfoTextWithExpirationInfo$1 chaloAppFeatureHelperImpl$hideValidationInfoTextWithExpirationInfo$1;
        if (continuationImpl instanceof ChaloAppFeatureHelperImpl$hideValidationInfoTextWithExpirationInfo$1) {
            chaloAppFeatureHelperImpl$hideValidationInfoTextWithExpirationInfo$1 = (ChaloAppFeatureHelperImpl$hideValidationInfoTextWithExpirationInfo$1) continuationImpl;
            int i = chaloAppFeatureHelperImpl$hideValidationInfoTextWithExpirationInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloAppFeatureHelperImpl$hideValidationInfoTextWithExpirationInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloAppFeatureHelperImpl$hideValidationInfoTextWithExpirationInfo$1 = new ChaloAppFeatureHelperImpl$hideValidationInfoTextWithExpirationInfo$1(this, continuationImpl);
            }
        } else {
            chaloAppFeatureHelperImpl$hideValidationInfoTextWithExpirationInfo$1 = new ChaloAppFeatureHelperImpl$hideValidationInfoTextWithExpirationInfo$1(this, continuationImpl);
        }
        Object objA = chaloAppFeatureHelperImpl$hideValidationInfoTextWithExpirationInfo$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloAppFeatureHelperImpl$hideValidationInfoTextWithExpirationInfo$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            chaloAppFeatureHelperImpl$hideValidationInfoTextWithExpirationInfo$1.label = 1;
            objA = this.e.a(chaloAppFeatureHelperImpl$hideValidationInfoTextWithExpirationInfo$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return Boolean.valueOf(((ProductPurchasePolicy) objA).b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.helper.ChaloAppFeatureHelper
    public final Object n(ContinuationImpl continuationImpl) {
        ChaloAppFeatureHelperImpl$disableAppOpenSplashAnimation$1 chaloAppFeatureHelperImpl$disableAppOpenSplashAnimation$1;
        if (continuationImpl instanceof ChaloAppFeatureHelperImpl$disableAppOpenSplashAnimation$1) {
            chaloAppFeatureHelperImpl$disableAppOpenSplashAnimation$1 = (ChaloAppFeatureHelperImpl$disableAppOpenSplashAnimation$1) continuationImpl;
            int i = chaloAppFeatureHelperImpl$disableAppOpenSplashAnimation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloAppFeatureHelperImpl$disableAppOpenSplashAnimation$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloAppFeatureHelperImpl$disableAppOpenSplashAnimation$1 = new ChaloAppFeatureHelperImpl$disableAppOpenSplashAnimation$1(this, continuationImpl);
            }
        } else {
            chaloAppFeatureHelperImpl$disableAppOpenSplashAnimation$1 = new ChaloAppFeatureHelperImpl$disableAppOpenSplashAnimation$1(this, continuationImpl);
        }
        Object objA = chaloAppFeatureHelperImpl$disableAppOpenSplashAnimation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloAppFeatureHelperImpl$disableAppOpenSplashAnimation$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            chaloAppFeatureHelperImpl$disableAppOpenSplashAnimation$1.label = 1;
            objA = this.f2827a.a(chaloAppFeatureHelperImpl$disableAppOpenSplashAnimation$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return Boolean.valueOf(((ResolvedSplashPolicy) objA).f1074a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.helper.ChaloAppFeatureHelper
    public final Object o(String str, ContinuationImpl continuationImpl) {
        ChaloAppFeatureHelperImpl$isCityChangeDisabled$1 chaloAppFeatureHelperImpl$isCityChangeDisabled$1;
        String lowerCase;
        if (continuationImpl instanceof ChaloAppFeatureHelperImpl$isCityChangeDisabled$1) {
            chaloAppFeatureHelperImpl$isCityChangeDisabled$1 = (ChaloAppFeatureHelperImpl$isCityChangeDisabled$1) continuationImpl;
            int i = chaloAppFeatureHelperImpl$isCityChangeDisabled$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloAppFeatureHelperImpl$isCityChangeDisabled$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloAppFeatureHelperImpl$isCityChangeDisabled$1 = new ChaloAppFeatureHelperImpl$isCityChangeDisabled$1(this, continuationImpl);
            }
        } else {
            chaloAppFeatureHelperImpl$isCityChangeDisabled$1 = new ChaloAppFeatureHelperImpl$isCityChangeDisabled$1(this, continuationImpl);
        }
        Object objA = chaloAppFeatureHelperImpl$isCityChangeDisabled$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloAppFeatureHelperImpl$isCityChangeDisabled$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            chaloAppFeatureHelperImpl$isCityChangeDisabled$1.L$0 = str;
            chaloAppFeatureHelperImpl$isCityChangeDisabled$1.label = 1;
            objA = this.b.a(chaloAppFeatureHelperImpl$isCityChangeDisabled$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) chaloAppFeatureHelperImpl$isCityChangeDisabled$1.L$0;
            ResultKt.b(objA);
        }
        Set set = ((ResolvedCitySelectionPolicy) objA).f1070a;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        return Boolean.valueOf(CollectionsKt.w(set, lowerCase));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.helper.ChaloAppFeatureHelper
    public final Object p(ContinuationImpl continuationImpl) {
        ChaloAppFeatureHelperImpl$showUpdatedProductPurchaseSection$1 chaloAppFeatureHelperImpl$showUpdatedProductPurchaseSection$1;
        if (continuationImpl instanceof ChaloAppFeatureHelperImpl$showUpdatedProductPurchaseSection$1) {
            chaloAppFeatureHelperImpl$showUpdatedProductPurchaseSection$1 = (ChaloAppFeatureHelperImpl$showUpdatedProductPurchaseSection$1) continuationImpl;
            int i = chaloAppFeatureHelperImpl$showUpdatedProductPurchaseSection$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloAppFeatureHelperImpl$showUpdatedProductPurchaseSection$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloAppFeatureHelperImpl$showUpdatedProductPurchaseSection$1 = new ChaloAppFeatureHelperImpl$showUpdatedProductPurchaseSection$1(this, continuationImpl);
            }
        } else {
            chaloAppFeatureHelperImpl$showUpdatedProductPurchaseSection$1 = new ChaloAppFeatureHelperImpl$showUpdatedProductPurchaseSection$1(this, continuationImpl);
        }
        Object objA = chaloAppFeatureHelperImpl$showUpdatedProductPurchaseSection$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloAppFeatureHelperImpl$showUpdatedProductPurchaseSection$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            chaloAppFeatureHelperImpl$showUpdatedProductPurchaseSection$1.label = 1;
            objA = this.b.a(chaloAppFeatureHelperImpl$showUpdatedProductPurchaseSection$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return Boolean.valueOf(((ResolvedCitySelectionPolicy) objA).f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.helper.ChaloAppFeatureHelper
    public final Object q(ContinuationImpl continuationImpl) {
        ChaloAppFeatureHelperImpl$shouldProactivelyRequestLocationPermissionOnHomeScreen$1 chaloAppFeatureHelperImpl$shouldProactivelyRequestLocationPermissionOnHomeScreen$1;
        if (continuationImpl instanceof ChaloAppFeatureHelperImpl$shouldProactivelyRequestLocationPermissionOnHomeScreen$1) {
            chaloAppFeatureHelperImpl$shouldProactivelyRequestLocationPermissionOnHomeScreen$1 = (ChaloAppFeatureHelperImpl$shouldProactivelyRequestLocationPermissionOnHomeScreen$1) continuationImpl;
            int i = chaloAppFeatureHelperImpl$shouldProactivelyRequestLocationPermissionOnHomeScreen$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloAppFeatureHelperImpl$shouldProactivelyRequestLocationPermissionOnHomeScreen$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloAppFeatureHelperImpl$shouldProactivelyRequestLocationPermissionOnHomeScreen$1 = new ChaloAppFeatureHelperImpl$shouldProactivelyRequestLocationPermissionOnHomeScreen$1(this, continuationImpl);
            }
        } else {
            chaloAppFeatureHelperImpl$shouldProactivelyRequestLocationPermissionOnHomeScreen$1 = new ChaloAppFeatureHelperImpl$shouldProactivelyRequestLocationPermissionOnHomeScreen$1(this, continuationImpl);
        }
        Object objA = chaloAppFeatureHelperImpl$shouldProactivelyRequestLocationPermissionOnHomeScreen$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloAppFeatureHelperImpl$shouldProactivelyRequestLocationPermissionOnHomeScreen$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            chaloAppFeatureHelperImpl$shouldProactivelyRequestLocationPermissionOnHomeScreen$1.label = 1;
            objA = this.g.a(chaloAppFeatureHelperImpl$shouldProactivelyRequestLocationPermissionOnHomeScreen$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return Boolean.valueOf(((LocationPermissionPolicy) objA).f1008a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.helper.ChaloAppFeatureHelper
    public final Enum r(ContinuationImpl continuationImpl) {
        ChaloAppFeatureHelperImpl$onBoardingStartScreen$1 chaloAppFeatureHelperImpl$onBoardingStartScreen$1;
        if (continuationImpl instanceof ChaloAppFeatureHelperImpl$onBoardingStartScreen$1) {
            chaloAppFeatureHelperImpl$onBoardingStartScreen$1 = (ChaloAppFeatureHelperImpl$onBoardingStartScreen$1) continuationImpl;
            int i = chaloAppFeatureHelperImpl$onBoardingStartScreen$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloAppFeatureHelperImpl$onBoardingStartScreen$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloAppFeatureHelperImpl$onBoardingStartScreen$1 = new ChaloAppFeatureHelperImpl$onBoardingStartScreen$1(this, continuationImpl);
            }
        } else {
            chaloAppFeatureHelperImpl$onBoardingStartScreen$1 = new ChaloAppFeatureHelperImpl$onBoardingStartScreen$1(this, continuationImpl);
        }
        Object objA = chaloAppFeatureHelperImpl$onBoardingStartScreen$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloAppFeatureHelperImpl$onBoardingStartScreen$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            chaloAppFeatureHelperImpl$onBoardingStartScreen$1.label = 1;
            objA = this.f2827a.a(chaloAppFeatureHelperImpl$onBoardingStartScreen$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return ((ResolvedSplashPolicy) objA).b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.helper.ChaloAppFeatureHelper
    public final Object s(ContinuationImpl continuationImpl) {
        ChaloAppFeatureHelperImpl$shouldShowReportProblemHook$1 chaloAppFeatureHelperImpl$shouldShowReportProblemHook$1;
        if (continuationImpl instanceof ChaloAppFeatureHelperImpl$shouldShowReportProblemHook$1) {
            chaloAppFeatureHelperImpl$shouldShowReportProblemHook$1 = (ChaloAppFeatureHelperImpl$shouldShowReportProblemHook$1) continuationImpl;
            int i = chaloAppFeatureHelperImpl$shouldShowReportProblemHook$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloAppFeatureHelperImpl$shouldShowReportProblemHook$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloAppFeatureHelperImpl$shouldShowReportProblemHook$1 = new ChaloAppFeatureHelperImpl$shouldShowReportProblemHook$1(this, continuationImpl);
            }
        } else {
            chaloAppFeatureHelperImpl$shouldShowReportProblemHook$1 = new ChaloAppFeatureHelperImpl$shouldShowReportProblemHook$1(this, continuationImpl);
        }
        Object objA = chaloAppFeatureHelperImpl$shouldShowReportProblemHook$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloAppFeatureHelperImpl$shouldShowReportProblemHook$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            chaloAppFeatureHelperImpl$shouldShowReportProblemHook$1.label = 1;
            objA = this.c.a(chaloAppFeatureHelperImpl$shouldShowReportProblemHook$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return Boolean.valueOf(((ResolvedSupportPolicy) objA).b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.helper.ChaloAppFeatureHelper
    public final Object t(ContinuationImpl continuationImpl) {
        ChaloAppFeatureHelperImpl$shouldCollectNameAlongWithDobInMinProfileUpdate$1 chaloAppFeatureHelperImpl$shouldCollectNameAlongWithDobInMinProfileUpdate$1;
        if (continuationImpl instanceof ChaloAppFeatureHelperImpl$shouldCollectNameAlongWithDobInMinProfileUpdate$1) {
            chaloAppFeatureHelperImpl$shouldCollectNameAlongWithDobInMinProfileUpdate$1 = (ChaloAppFeatureHelperImpl$shouldCollectNameAlongWithDobInMinProfileUpdate$1) continuationImpl;
            int i = chaloAppFeatureHelperImpl$shouldCollectNameAlongWithDobInMinProfileUpdate$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloAppFeatureHelperImpl$shouldCollectNameAlongWithDobInMinProfileUpdate$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloAppFeatureHelperImpl$shouldCollectNameAlongWithDobInMinProfileUpdate$1 = new ChaloAppFeatureHelperImpl$shouldCollectNameAlongWithDobInMinProfileUpdate$1(this, continuationImpl);
            }
        } else {
            chaloAppFeatureHelperImpl$shouldCollectNameAlongWithDobInMinProfileUpdate$1 = new ChaloAppFeatureHelperImpl$shouldCollectNameAlongWithDobInMinProfileUpdate$1(this, continuationImpl);
        }
        Object objA = chaloAppFeatureHelperImpl$shouldCollectNameAlongWithDobInMinProfileUpdate$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloAppFeatureHelperImpl$shouldCollectNameAlongWithDobInMinProfileUpdate$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            chaloAppFeatureHelperImpl$shouldCollectNameAlongWithDobInMinProfileUpdate$1.label = 1;
            objA = this.f.a(chaloAppFeatureHelperImpl$shouldCollectNameAlongWithDobInMinProfileUpdate$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return Boolean.valueOf(((ProfilePolicy) objA).c);
    }
}
