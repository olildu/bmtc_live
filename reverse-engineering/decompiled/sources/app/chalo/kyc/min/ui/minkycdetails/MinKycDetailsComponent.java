package app.chalo.kyc.min.ui.minkycdetails;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.MinKycOtpArgs;
import com.arkivanov.decompose.ComponentContext;
import defpackage.gd0;
import defpackage.vo1;
import defpackage.wi0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsIntent;", "Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsDataState;", "Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsUIState;", "Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsSideEffect;", "Companion", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MinKycDetailsComponent extends ChaloBaseStateMviComponent<MinKycDetailsIntent, MinKycDetailsDataState, MinKycDetailsUIState, MinKycDetailsSideEffect> {
    public final AnalyticsContract k;
    public final ChaloNavigationManager l;
    public final CoroutineContextProvider m;
    public final UserProfileDetailsProvider n;
    public final MinKycDetailsUIStateFactory o;
    public MinKycDetailsRestoredDataState p;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsComponent$Companion;", "", "", "MIN_KYC_DETAILS_RESTORE_KEY", "Ljava/lang/String;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public MinKycDetailsComponent(ComponentContext componentContext, AnalyticsContract analyticsContract, ChaloNavigationManager chaloNavigationManager, CoroutineContextProvider coroutineContextProvider, UserProfileDetailsProvider userProfileDetailsProvider, MinKycDetailsUIStateFactory minKycDetailsUIStateFactory) {
        super(componentContext);
        this.k = analyticsContract;
        this.l = chaloNavigationManager;
        this.m = coroutineContextProvider;
        this.n = userProfileDetailsProvider;
        this.o = minKycDetailsUIStateFactory;
        componentContext.getB().d("min_kyc_details_restore_key", MinKycDetailsRestoredDataState.INSTANCE.serializer(), new gd0(this, 13));
        F0(MinKycDetailsIntent.InitializationIntent.f4122a);
    }

    public final void F0(MinKycDetailsIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        if (intent instanceof MinKycDetailsIntent.InitializationIntent) {
            if (this.d) {
                return;
            }
            this.d = true;
            String strF = Reflection.a(MinKycDetailsComponent.class).f();
            AnalyticsContract.DefaultImpls.a(this.k, "min kyc detail opened", strF == null ? "MinKycDetailsViewModel" : strF, null, null, false, 28);
            BuildersKt.d(this.j, this.m.getDefault(), null, new MinKycDetailsComponent$handleInitializationIntent$1(this, null), 2);
            return;
        }
        if (intent instanceof MinKycDetailsIntent.FocusChanged) {
            E0(new wi0((MinKycDetailsIntent.FocusChanged) intent, 1));
            return;
        }
        if (intent instanceof MinKycDetailsIntent.FullNameEnteredIntent) {
            E0(new wi0((MinKycDetailsIntent.FullNameEnteredIntent) intent, 2));
            return;
        }
        if (!(intent instanceof MinKycDetailsIntent.ProceedButtonClickedIntent)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((MinKycDetailsIntent.ProceedButtonClickedIntent) intent).f4123a;
        String strF2 = Reflection.a(MinKycDetailsComponent.class).f();
        AnalyticsContract.DefaultImpls.a(this.k, "min kyc detail proceed button clicked", strF2 == null ? "MinKycDetailsViewModel" : strF2, vo1.s("min kyc name", str), null, false, 24);
        this.l.b(new ChaloNavigationRequest.Navigate(new MinKycOtpArgs(str), null, null, 6));
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        MinKycDetailsComponent$convertToUiState$2 minKycDetailsComponent$convertToUiState$2 = new MinKycDetailsComponent$convertToUiState$2(1, this, MinKycDetailsComponent.class, "processIntent", "processIntent(Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsIntent;)V", 0);
        MinKycDetailsComponent$convertToUiState$3 minKycDetailsComponent$convertToUiState$3 = new MinKycDetailsComponent$convertToUiState$3(1, this, MinKycDetailsComponent.class, "emitSideEffect", "emitSideEffect(Ljava/lang/Object;)V", 0);
        return this.o.a((MinKycDetailsDataState) obj, minKycDetailsComponent$convertToUiState$2, minKycDetailsComponent$convertToUiState$3, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        if (this.p == null) {
            this.p = (MinKycDetailsRestoredDataState) this.f5983a.getB().a("min_kyc_details_restore_key", MinKycDetailsRestoredDataState.INSTANCE.serializer());
        }
        MinKycDetailsRestoredDataState minKycDetailsRestoredDataState = this.p;
        return minKycDetailsRestoredDataState != null ? new MinKycDetailsDataState(minKycDetailsRestoredDataState.f4124a, 12, minKycDetailsRestoredDataState.b, minKycDetailsRestoredDataState.c) : new MinKycDetailsDataState(null, 31, false, false);
    }
}
