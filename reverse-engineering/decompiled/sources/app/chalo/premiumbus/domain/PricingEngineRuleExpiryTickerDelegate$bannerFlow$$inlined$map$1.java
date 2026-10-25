package app.chalo.premiumbus.domain;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.UIShape;
import app.chalo.premiumbus.compose.PricingEngineRuleExpiryBannerUIState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PricingEngineRuleExpiryTickerDelegate$bannerFlow$$inlined$map$1 implements Flow<PricingEngineRuleExpiryBannerUIState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 f7230a;
    public final /* synthetic */ PricingEngineRuleExpiryTickerDelegate b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ChaloPadding d;
    public final /* synthetic */ UIShape e;

    /* JADX INFO: renamed from: app.chalo.premiumbus.domain.PricingEngineRuleExpiryTickerDelegate$bannerFlow$$inlined$map$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class AnonymousClass2<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FlowCollector f7231a;
        public final /* synthetic */ PricingEngineRuleExpiryTickerDelegate b;
        public final /* synthetic */ long c;
        public final /* synthetic */ ChaloPadding d;
        public final /* synthetic */ UIShape e;

        /* JADX INFO: renamed from: app.chalo.premiumbus.domain.PricingEngineRuleExpiryTickerDelegate$bannerFlow$$inlined$map$1$2$1, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.premiumbus.domain.PricingEngineRuleExpiryTickerDelegate$bannerFlow$$inlined$map$1$2", f = "PricingEngineRuleExpiryTickerDelegate.kt", l = {51, 50}, m = "emit", v = 1)
        public final class AnonymousClass1 extends ContinuationImpl {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(FlowCollector flowCollector, PricingEngineRuleExpiryTickerDelegate pricingEngineRuleExpiryTickerDelegate, long j, ChaloPadding chaloPadding, UIShape uIShape) {
            this.f7231a = flowCollector;
            this.b = pricingEngineRuleExpiryTickerDelegate;
            this.c = j;
            this.d = chaloPadding;
            this.e = uIShape;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
        
            if (r12.emit(r13, r9) == r0) goto L22;
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
            /*
                r11 = this;
                boolean r0 = r13 instanceof app.chalo.premiumbus.domain.PricingEngineRuleExpiryTickerDelegate$bannerFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L14
                r0 = r13
                app.chalo.premiumbus.domain.PricingEngineRuleExpiryTickerDelegate$bannerFlow$$inlined$map$1$2$1 r0 = (app.chalo.premiumbus.domain.PricingEngineRuleExpiryTickerDelegate$bannerFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L14
                int r1 = r1 - r2
                r0.label = r1
            L12:
                r9 = r0
                goto L1a
            L14:
                app.chalo.premiumbus.domain.PricingEngineRuleExpiryTickerDelegate$bannerFlow$$inlined$map$1$2$1 r0 = new app.chalo.premiumbus.domain.PricingEngineRuleExpiryTickerDelegate$bannerFlow$$inlined$map$1$2$1
                r0.<init>(r13)
                goto L12
            L1a:
                java.lang.Object r13 = r9.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r9.label
                r10 = 2
                r2 = 1
                if (r1 == 0) goto L3c
                if (r1 == r2) goto L34
                if (r1 != r10) goto L2c
                kotlin.ResultKt.b(r13)
                goto L6c
            L2c:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L34:
                java.lang.Object r12 = r9.L$0
                kotlinx.coroutines.flow.FlowCollector r12 = (kotlinx.coroutines.flow.FlowCollector) r12
                kotlin.ResultKt.b(r13)
                goto L60
            L3c:
                kotlin.ResultKt.b(r13)
                java.lang.Number r12 = (java.lang.Number) r12
                long r3 = r12.longValue()
                kotlinx.coroutines.flow.FlowCollector r12 = r11.f7231a
                r9.L$0 = r12
                r9.label = r2
                app.chalo.premiumbus.domain.PricingEngineRuleExpiryTickerDelegate r13 = r11.b
                app.chalo.premiumbus.domain.PricingEngineRuleExpiryBannerUIStateBuilder r13 = r13.b
                app.chalo.utils.timeutil.TimeUtilsContract r5 = r13.f7223a
                app.chalo.providers.stringprovider.StringProvider r6 = r13.b
                long r1 = r11.c
                app.chalo.compose.theme.ChaloPadding r7 = r11.d
                app.chalo.compose.theme.UIShape r8 = r11.e
                java.lang.Object r13 = app.chalo.premiumbus.domain.PricingEngineRuleExpiryBannerUIStateBuilderKt.a(r1, r3, r5, r6, r7, r8, r9)
                if (r13 != r0) goto L60
                goto L6b
            L60:
                r1 = 0
                r9.L$0 = r1
                r9.label = r10
                java.lang.Object r12 = r12.emit(r13, r9)
                if (r12 != r0) goto L6c
            L6b:
                return r0
            L6c:
                kotlin.Unit r12 = kotlin.Unit.f17538a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.domain.PricingEngineRuleExpiryTickerDelegate$bannerFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public PricingEngineRuleExpiryTickerDelegate$bannerFlow$$inlined$map$1(FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, PricingEngineRuleExpiryTickerDelegate pricingEngineRuleExpiryTickerDelegate, long j, ChaloPadding chaloPadding, UIShape uIShape) {
        this.f7230a = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
        this.b = pricingEngineRuleExpiryTickerDelegate;
        this.c = j;
        this.d = chaloPadding;
        this.e = uIShape;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f7230a.collect(new AnonymousClass2(flowCollector, this.b, this.c, this.d, this.e), continuation);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
    }
}
