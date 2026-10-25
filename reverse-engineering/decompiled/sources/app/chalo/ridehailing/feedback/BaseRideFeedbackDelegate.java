package app.chalo.ridehailing.feedback;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.HomeArgs;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/BaseRideFeedbackDelegate;", "Lapp/chalo/ridehailing/feedback/RideFeedbackFlowDelegate;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseRideFeedbackDelegate implements RideFeedbackFlowDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f9129a;
    public final KotlinToastManager b;
    public final ChaloNavigationManager c;
    public final AnalyticsContract d;
    public final Source e;
    public final MutableStateFlow f;
    public final StateFlow g;

    public BaseRideFeedbackDelegate(StringProvider stringProvider, KotlinToastManager kotlinToastManager, ChaloNavigationManager chaloNavigationManager, AnalyticsContract analyticsContract, Source analyticsSource) {
        Intrinsics.i(analyticsSource, "analyticsSource");
        this.f9129a = stringProvider;
        this.b = kotlinToastManager;
        this.c = chaloNavigationManager;
        this.d = analyticsContract;
        this.e = analyticsSource;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new RideFeedbackDataState(null, null, 63));
        this.f = mutableStateFlowA;
        this.g = FlowKt.c(mutableStateFlowA);
    }

    public static void h(BaseRideFeedbackDelegate baseRideFeedbackDelegate, String str) {
        AnalyticsContractImplKt.b(baseRideFeedbackDelegate.d, str, baseRideFeedbackDelegate.e, null, false, 24);
    }

    public abstract Object d(RideFeedbackDataState rideFeedbackDataState, Function1 function1, ContinuationImpl continuationImpl);

    public final void e() {
        boolean zF = f();
        ChaloNavigationManager chaloNavigationManager = this.c;
        if (zF) {
            ChaloNavigationManagerKt.c(chaloNavigationManager);
        } else {
            ChaloNavigationManagerKt.f(chaloNavigationManager, new HomeArgs((String) null, (String) null, 7));
        }
    }

    public boolean f() {
        return false;
    }

    public abstract Object g(ContinuationImpl continuationImpl);

    public Map i() {
        return null;
    }

    public abstract Object j(RideFeedbackDataState rideFeedbackDataState, CoroutineScope coroutineScope, ContinuationImpl continuationImpl);

    public final void k(RideFeedbackDataState dataState) {
        Intrinsics.i(dataState, "dataState");
        this.f.setValue(dataState);
    }
}
