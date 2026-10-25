package app.chalo.premiumbus.domain;

import app.chalo.contract.BasicInfoContract;
import defpackage.vw0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/PricingEngineRuleExpiryTickerDelegate;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PricingEngineRuleExpiryTickerDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingEngineRuleExpiryCountdownController f7229a;
    public final PricingEngineRuleExpiryBannerUIStateBuilder b;
    public final BasicInfoContract c;
    public final MutableStateFlow d = StateFlowKt.a(null);

    public PricingEngineRuleExpiryTickerDelegate(PricingEngineRuleExpiryCountdownController pricingEngineRuleExpiryCountdownController, PricingEngineRuleExpiryBannerUIStateBuilder pricingEngineRuleExpiryBannerUIStateBuilder, BasicInfoContract basicInfoContract) {
        this.f7229a = pricingEngineRuleExpiryCountdownController;
        this.b = pricingEngineRuleExpiryBannerUIStateBuilder;
        this.c = basicInfoContract;
    }

    public final void a(ContextScope scope, Function1 function1, Function1 function2) {
        Intrinsics.i(scope, "scope");
        PricingEngineRuleExpiryTickerDelegate$sync$1 pricingEngineRuleExpiryTickerDelegate$sync$1 = new PricingEngineRuleExpiryTickerDelegate$sync$1(0, this.c, BasicInfoContract.class, "getTrueTimeBlocking", "getTrueTimeBlocking()J", 0);
        vw0 vw0Var = new vw0(this, 1);
        long jLongValue = ((Number) pricingEngineRuleExpiryTickerDelegate$sync$1.invoke()).longValue();
        vw0Var.invoke(Long.valueOf(jLongValue));
        boolean zA = PricingEngineRuleExpiryCountdownController.a((List) function1.invoke(Long.valueOf(jLongValue)));
        PricingEngineRuleExpiryCountdownController pricingEngineRuleExpiryCountdownController = this.f7229a;
        if (!zA) {
            Job job = pricingEngineRuleExpiryCountdownController.b;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            pricingEngineRuleExpiryCountdownController.b = null;
            return;
        }
        Job job2 = pricingEngineRuleExpiryCountdownController.b;
        if (job2 == null || !((AbstractCoroutine) job2).isActive()) {
            pricingEngineRuleExpiryCountdownController.b = BuildersKt.d(scope, pricingEngineRuleExpiryCountdownController.f7224a.getDefault(), null, new PricingEngineRuleExpiryCountdownController$sync$1(pricingEngineRuleExpiryTickerDelegate$sync$1, vw0Var, function1, pricingEngineRuleExpiryCountdownController, function2, null), 2);
        }
    }
}
