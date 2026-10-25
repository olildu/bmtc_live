package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.ads.BindNativeAdResult;
import app.chalo.contract.BasicInfoContract;
import app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$handleNativeAdLoadFailed$1", f = "RouteDetailsComponent.kt", l = {2826, 2828}, m = "invokeSuspend", v = 1)
final class RouteDetailsComponent$handleNativeAdLoadFailed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $errorCode;
    final /* synthetic */ BindNativeAdResult.Failed $failedResult;
    final /* synthetic */ String $stopId;
    Object L$0;
    int label;
    final /* synthetic */ RouteDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDetailsComponent$handleNativeAdLoadFailed$1(RouteDetailsComponent routeDetailsComponent, String str, int i, BindNativeAdResult.Failed failed, Continuation continuation) {
        super(2, continuation);
        this.this$0 = routeDetailsComponent;
        this.$stopId = str;
        this.$errorCode = i;
        this.$failedResult = failed;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteDetailsComponent$handleNativeAdLoadFailed$1(this.this$0, this.$stopId, this.$errorCode, this.$failedResult, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteDetailsComponent$handleNativeAdLoadFailed$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0092  */
    /* JADX WARN: Code duplicated, block: B:25:0x009c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RouteDetailsComponent routeDetailsComponent;
        BindNativeAdResult.Failed failed;
        String str;
        LinkedHashMap linkedHashMapK;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            RouteDetailsComponent routeDetailsComponent2 = this.this$0;
            this.label = 1;
            obj = RouteDetailsComponent.N0(routeDetailsComponent2, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            routeDetailsComponent = (RouteDetailsComponent) this.L$0;
            ResultKt.b(obj);
        }
        routeDetailsComponent.y0 = ((Number) obj).longValue();
        RouteDetailsAnalyticsHelper routeDetailsAnalyticsHelper = this.this$0.z;
        Pair pair = new Pair("stop id", this.$stopId);
        Pair pair2 = new Pair("adSdk", "gam");
        Pair pair3 = new Pair("adType", "native");
        Pair pair4 = new Pair("errorCode", new Integer(this.$errorCode));
        Pair pair5 = new Pair("errorCode", new Integer(this.$errorCode));
        failed = this.$failedResult;
        if (failed != null) {
            str = failed.f753a;
        } else {
            str = "null";
        }
        linkedHashMapK = MapsKt.k(pair, pair2, pair3, pair4, pair5, new Pair("error message", str), new Pair("errorMessage", failed != null ? failed.f753a : "null"));
        if (this.$failedResult instanceof BindNativeAdResult.Failed.UnsupportedAspectRatio) {
            linkedHashMapK.put("nativeAdAspectRatio", String.valueOf(0.0f));
        }
        RouteDetailsAnalyticsHelper.DefaultImpls.a(routeDetailsAnalyticsHelper, "route details native ad load failed", linkedHashMapK, 12);
        return Unit.f17538a;
        if (((Boolean) obj).booleanValue()) {
            RouteDetailsComponent routeDetailsComponent3 = this.this$0;
            BasicInfoContract basicInfoContract = routeDetailsComponent3.l;
            this.L$0 = routeDetailsComponent3;
            this.label = 2;
            Object objC = basicInfoContract.c(this);
            if (objC != coroutineSingletons) {
                routeDetailsComponent = routeDetailsComponent3;
                obj = objC;
                routeDetailsComponent.y0 = ((Number) obj).longValue();
                RouteDetailsAnalyticsHelper routeDetailsAnalyticsHelper2 = this.this$0.z;
                Pair pair6 = new Pair("stop id", this.$stopId);
                Pair pair7 = new Pair("adSdk", "gam");
                Pair pair8 = new Pair("adType", "native");
                Pair pair9 = new Pair("errorCode", new Integer(this.$errorCode));
                Pair pair10 = new Pair("errorCode", new Integer(this.$errorCode));
                failed = this.$failedResult;
                if (failed != null) {
                    str = failed.f753a;
                } else {
                    str = "null";
                }
                linkedHashMapK = MapsKt.k(pair6, pair7, pair8, pair9, pair10, new Pair("error message", str), new Pair("errorMessage", failed != null ? failed.f753a : "null"));
                if (this.$failedResult instanceof BindNativeAdResult.Failed.UnsupportedAspectRatio) {
                    linkedHashMapK.put("nativeAdAspectRatio", String.valueOf(0.0f));
                }
                RouteDetailsAnalyticsHelper.DefaultImpls.a(routeDetailsAnalyticsHelper2, "route details native ad load failed", linkedHashMapK, 12);
            }
            return coroutineSingletons;
        }
        return Unit.f17538a;
    }
}
