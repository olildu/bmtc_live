package app.chalo.premiumbus.domain;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.domain.PricingEngineRuleExpiryCountdownController$sync$1", f = "PricingEngineRuleExpiryCountdownController.kt", l = {34, 39}, m = "invokeSuspend", v = 1)
final class PricingEngineRuleExpiryCountdownController$sync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Long, List<PricingEngineRuleExpiryDisplayState>> $currentStates;
    final /* synthetic */ Function0<Long> $nowProvider;
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $onExpired;
    final /* synthetic */ Function1<Long, Unit> $onNow;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PricingEngineRuleExpiryCountdownController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PricingEngineRuleExpiryCountdownController$sync$1(Function0 function0, Function1 function1, Function1 function2, PricingEngineRuleExpiryCountdownController pricingEngineRuleExpiryCountdownController, Function1 function3, Continuation continuation) {
        super(2, continuation);
        this.$nowProvider = function0;
        this.$onNow = function1;
        this.$currentStates = function2;
        this.this$0 = pricingEngineRuleExpiryCountdownController;
        this.$onExpired = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PricingEngineRuleExpiryCountdownController$sync$1 pricingEngineRuleExpiryCountdownController$sync$1 = new PricingEngineRuleExpiryCountdownController$sync$1(this.$nowProvider, this.$onNow, this.$currentStates, this.this$0, this.$onExpired, continuation);
        pricingEngineRuleExpiryCountdownController$sync$1.L$0 = obj;
        return pricingEngineRuleExpiryCountdownController$sync$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PricingEngineRuleExpiryCountdownController$sync$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a A[PHI: r1
      0x002a: PHI (r1v2 kotlinx.coroutines.CoroutineScope) = (r1v1 kotlinx.coroutines.CoroutineScope), (r1v3 kotlinx.coroutines.CoroutineScope) binds: [B:11:0x0022, B:31:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d A[PHI: r1
      0x003d: PHI (r1v3 kotlinx.coroutines.CoroutineScope) = (r1v2 kotlinx.coroutines.CoroutineScope), (r1v6 kotlinx.coroutines.CoroutineScope) binds: [B:15:0x003a, B:10:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    /* JADX WARN: Code duplicated, block: B:34:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[LOOP:0: B:23:0x007a->B:35:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Path cross not found for [B:19:0x006c, B:22:0x0076], limit reached: 34 */
    /* JADX WARN: Path cross not found for [B:22:0x0076, B:30:0x0098], limit reached: 34 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003a -> B:17:0x003d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 2
            r3 = 1
            kotlin.Unit r4 = kotlin.Unit.f17538a
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.b(r9)
            return r4
        L12:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1a:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r9)
            goto L3d
        L22:
            kotlin.ResultKt.b(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            r1 = r9
        L2a:
            boolean r9 = kotlinx.coroutines.CoroutineScopeKt.e(r1)
            if (r9 == 0) goto La3
            r8.L$0 = r1
            r8.label = r3
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.b(r5, r8)
            if (r9 != r0) goto L3d
            goto L97
        L3d:
            kotlin.jvm.functions.Function0<java.lang.Long> r9 = r8.$nowProvider
            java.lang.Object r9 = r9.invoke()
            java.lang.Number r9 = (java.lang.Number) r9
            long r5 = r9.longValue()
            kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> r9 = r8.$onNow
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r5)
            r9.invoke(r7)
            kotlin.jvm.functions.Function1<java.lang.Long, java.util.List<app.chalo.premiumbus.domain.PricingEngineRuleExpiryDisplayState>> r9 = r8.$currentStates
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r5)
            java.lang.Object r9 = r9.invoke(r7)
            java.util.List r9 = (java.util.List) r9
            app.chalo.premiumbus.domain.PricingEngineRuleExpiryCountdownController r5 = r8.this$0
            r5.getClass()
            r5 = r9
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r6 = r5 instanceof java.util.Collection
            if (r6 == 0) goto L76
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L76
            goto L98
        L76:
            java.util.Iterator r5 = r5.iterator()
        L7a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L98
            java.lang.Object r6 = r5.next()
            app.chalo.premiumbus.domain.PricingEngineRuleExpiryDisplayState r6 = (app.chalo.premiumbus.domain.PricingEngineRuleExpiryDisplayState) r6
            boolean r6 = r6 instanceof app.chalo.premiumbus.domain.PricingEngineRuleExpiryDisplayState.Expired
            if (r6 == 0) goto L7a
            kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r9 = r8.$onExpired
            r1 = 0
            r8.L$0 = r1
            r8.label = r2
            java.lang.Object r9 = r9.invoke(r8)
            if (r9 != r0) goto La3
        L97:
            return r0
        L98:
            app.chalo.premiumbus.domain.PricingEngineRuleExpiryCountdownController r5 = r8.this$0
            r5.getClass()
            boolean r9 = app.chalo.premiumbus.domain.PricingEngineRuleExpiryCountdownController.a(r9)
            if (r9 != 0) goto L2a
        La3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.domain.PricingEngineRuleExpiryCountdownController$sync$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
