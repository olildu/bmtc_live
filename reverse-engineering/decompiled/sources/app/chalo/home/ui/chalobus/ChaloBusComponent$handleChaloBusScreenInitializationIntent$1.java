package app.chalo.home.ui.chalobus;

import app.chalo.premiumbus.domain.GetRecentAndFlippedOriginDestinationPairsUseCase;
import app.chalo.utils.CollectionUtilsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.chalobus.ChaloBusComponent$handleChaloBusScreenInitializationIntent$1", f = "ChaloBusComponent.kt", l = {794, 797}, m = "invokeSuspend", v = 1)
final class ChaloBusComponent$handleChaloBusScreenInitializationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChaloBusComponent this$0;

    /* JADX INFO: renamed from: app.chalo.home.ui.chalobus.ChaloBusComponent$handleChaloBusScreenInitializationIntent$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.chalobus.ChaloBusComponent$handleChaloBusScreenInitializationIntent$1$1", f = "ChaloBusComponent.kt", l = {800}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ChaloBusComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChaloBusComponent chaloBusComponent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = chaloBusComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                ChaloBusComponent chaloBusComponent = this.this$0;
                this.label = 1;
                if (ChaloBusComponent.F0(chaloBusComponent, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusComponent$handleChaloBusScreenInitializationIntent$1(ChaloBusComponent chaloBusComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloBusComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChaloBusComponent$handleChaloBusScreenInitializationIntent$1 chaloBusComponent$handleChaloBusScreenInitializationIntent$1 = new ChaloBusComponent$handleChaloBusScreenInitializationIntent$1(this.this$0, continuation);
        chaloBusComponent$handleChaloBusScreenInitializationIntent$1.L$0 = obj;
        return chaloBusComponent$handleChaloBusScreenInitializationIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBusComponent$handleChaloBusScreenInitializationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        CoroutineScope coroutineScope2;
        Job job;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            GetRecentAndFlippedOriginDestinationPairsUseCase getRecentAndFlippedOriginDestinationPairsUseCase = this.this$0.m;
            this.L$0 = coroutineScope3;
            this.label = 1;
            Object objA = getRecentAndFlippedOriginDestinationPairsUseCase.a(this);
            if (objA != coroutineSingletons) {
                coroutineScope = coroutineScope3;
                obj = objA;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.b(obj);
        }
        job = this.this$0.Y;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        ChaloBusComponent chaloBusComponent = this.this$0;
        chaloBusComponent.Y = BuildersKt.d(coroutineScope2, null, null, new AnonymousClass1(chaloBusComponent, null), 3);
        return Unit.f17538a;
        List listB = CollectionUtilsKt.b(3, (List) obj);
        ChaloBusComponent chaloBusComponent2 = this.this$0;
        this.L$0 = coroutineScope;
        this.label = 2;
        if (ChaloBusComponent.O0(chaloBusComponent2, listB, this) != coroutineSingletons) {
            coroutineScope2 = coroutineScope;
            job = this.this$0.Y;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            ChaloBusComponent chaloBusComponent3 = this.this$0;
            chaloBusComponent3.Y = BuildersKt.d(coroutineScope2, null, null, new AnonymousClass1(chaloBusComponent3, null), 3);
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }
}
