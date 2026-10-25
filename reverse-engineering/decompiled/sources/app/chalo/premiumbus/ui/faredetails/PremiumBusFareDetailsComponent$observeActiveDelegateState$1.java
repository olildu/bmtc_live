package app.chalo.premiumbus.ui.faredetails;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsComponent$observeActiveDelegateState$1", f = "PremiumBusFareDetailsComponent.kt", l = {386}, m = "invokeSuspend", v = 1)
final class PremiumBusFareDetailsComponent$observeActiveDelegateState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusFareDetailsDelegate $delegate;
    int label;
    final /* synthetic */ PremiumBusFareDetailsComponent this$0;

    /* JADX INFO: renamed from: app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsComponent$observeActiveDelegateState$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PremiumBusFareDetailsComponent f7550a;

        public AnonymousClass1(PremiumBusFareDetailsComponent premiumBusFareDetailsComponent) {
            this.f7550a = premiumBusFareDetailsComponent;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0074  */
        /* JADX WARN: Code duplicated, block: B:19:0x0086  */
        /* JADX WARN: Code duplicated, block: B:20:0x008b  */
        /* JADX WARN: Code duplicated, block: B:23:0x00a2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a3 -> B:25:0x00a4). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsDataState r12, kotlin.coroutines.Continuation r13) {
            /*
                Method dump skipped, instruction units count: 201
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsComponent$observeActiveDelegateState$1.AnonymousClass1.emit(app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsDataState, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusFareDetailsComponent$observeActiveDelegateState$1(PremiumBusFareDetailsDelegate premiumBusFareDetailsDelegate, PremiumBusFareDetailsComponent premiumBusFareDetailsComponent, Continuation continuation) {
        super(2, continuation);
        this.$delegate = premiumBusFareDetailsDelegate;
        this.this$0 = premiumBusFareDetailsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusFareDetailsComponent$observeActiveDelegateState$1(this.$delegate, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusFareDetailsComponent$observeActiveDelegateState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow state = this.$delegate.getState();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (state.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
