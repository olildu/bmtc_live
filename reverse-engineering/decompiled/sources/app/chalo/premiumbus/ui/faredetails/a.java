package app.chalo.premiumbus.ui.faredetails;

import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsDataState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSwitchRequest;
import app.chalo.utils.chalologger.ChaloLog;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7559a;
    public final /* synthetic */ PremiumBusFareDetailsComponent b;
    public final /* synthetic */ PremiumBusFareDetailsDelegate c;

    public /* synthetic */ a(PremiumBusFareDetailsComponent premiumBusFareDetailsComponent, PremiumBusFareDetailsDelegate premiumBusFareDetailsDelegate, int i) {
        this.f7559a = i;
        this.b = premiumBusFareDetailsComponent;
        this.c = premiumBusFareDetailsDelegate;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PremiumBusFareDetailsFlowType passUpsellNudge;
        int i = this.f7559a;
        Unit unit = Unit.f17538a;
        PremiumBusFareDetailsDelegate premiumBusFareDetailsDelegate = this.c;
        PremiumBusFareDetailsComponent premiumBusFareDetailsComponent = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                LinkedHashMap linkedHashMap = premiumBusFareDetailsComponent.w;
                if (premiumBusFareDetailsComponent.r != premiumBusFareDetailsDelegate) {
                    Job job = (Job) linkedHashMap.remove(premiumBusFareDetailsDelegate);
                    if (job != null) {
                        job.cancel(null);
                    }
                } else {
                    premiumBusFareDetailsComponent.x = str;
                    Job job2 = (Job) linkedHashMap.remove(premiumBusFareDetailsDelegate);
                    if (job2 != null) {
                        job2.cancel(null);
                    }
                    if (str != null) {
                        linkedHashMap.put(premiumBusFareDetailsDelegate, BuildersKt.d(premiumBusFareDetailsComponent.j, null, null, new PremiumBusFareDetailsComponent$handleCheckoutRequestIdUpdate$1(premiumBusFareDetailsComponent, str, premiumBusFareDetailsDelegate, null), 3));
                    }
                }
                return unit;
            default:
                PremiumBusFareDetailsSwitchRequest request = (PremiumBusFareDetailsSwitchRequest) obj;
                PremiumBusFareDetailsFlowType.FreshPurchase freshPurchase = PremiumBusFareDetailsComponent.z;
                Intrinsics.i(request, "request");
                PremiumBusFareDetailsFlowType.FreshPurchase freshPurchase2 = premiumBusFareDetailsComponent.y;
                if (premiumBusFareDetailsComponent.r == premiumBusFareDetailsDelegate && premiumBusFareDetailsComponent.x == null && !((PremiumBusFareDetailsDataState) premiumBusFareDetailsDelegate.getL().getValue()).c()) {
                    if (request instanceof PremiumBusFareDetailsSwitchRequest.ToPassUpsellNudge) {
                        passUpsellNudge = freshPurchase2 == null ? null : new PremiumBusFareDetailsFlowType.PassUpsellNudge(freshPurchase2.b, freshPurchase2.c, freshPurchase2.d, ((PremiumBusFareDetailsSwitchRequest.ToPassUpsellNudge) request).f7611a);
                    } else if (!request.equals(PremiumBusFareDetailsSwitchRequest.ToFreshPurchase.f7610a)) {
                        passUpsellNudge = freshPurchase2;
                        throw new NoWhenBranchMatchedException();
                    }
                    if (passUpsellNudge == null) {
                        ChaloLog.c("PremiumBusFareDetails", "switch request " + request + " has no target flow type", null);
                    } else {
                        premiumBusFareDetailsComponent.t = BuildersKt.d(premiumBusFareDetailsComponent.j, null, null, new PremiumBusFareDetailsComponent$switchTo$1(premiumBusFareDetailsComponent, passUpsellNudge, premiumBusFareDetailsComponent.t, null), 3);
                    }
                }
                return unit;
        }
    }
}
