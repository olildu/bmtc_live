package app.chalo.ridehailing.feedback;

import app.chalo.ridefeedback.data.RideFeedbackRepository;
import app.chalo.ridefeedback.data.RideFeedbackRepositoryKt;
import app.chalo.ridefeedback.data.app.RideFeedbackRequestAppModel;
import app.chalo.ridefeedback.data.app.RideFeedbackResponseAppModel;
import app.chalo.ridefeedback.domain.SubmitRideFeedbackUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.NonCancellable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ridehailing.feedback.DefaultRideFeedbackDelegate$submitQueuedFeedbackBestEffort$2", f = "DefaultRideFeedbackDelegate.kt", l = {258, 265, 272}, m = "invokeSuspend", v = 1)
final class DefaultRideFeedbackDelegate$submitQueuedFeedbackBestEffort$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ RideFeedbackRequestAppModel $request;
    int label;
    final /* synthetic */ DefaultRideFeedbackDelegate this$0;

    /* JADX INFO: renamed from: app.chalo.ridehailing.feedback.DefaultRideFeedbackDelegate$submitQueuedFeedbackBestEffort$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.ridehailing.feedback.DefaultRideFeedbackDelegate$submitQueuedFeedbackBestEffort$2$1", f = "DefaultRideFeedbackDelegate.kt", l = {273}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RideFeedbackRequestAppModel $request;
        int label;
        final /* synthetic */ DefaultRideFeedbackDelegate this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DefaultRideFeedbackDelegate defaultRideFeedbackDelegate, RideFeedbackRequestAppModel rideFeedbackRequestAppModel, Continuation continuation) {
            super(2, continuation);
            this.this$0 = defaultRideFeedbackDelegate;
            this.$request = rideFeedbackRequestAppModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$request, continuation);
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
                RideFeedbackRepository rideFeedbackRepository = this.this$0.l;
                List listR = CollectionsKt.R(this.$request.f9069a);
                RideFeedbackRequestAppModel rideFeedbackRequestAppModel = this.$request;
                String str = rideFeedbackRequestAppModel.b;
                String str2 = rideFeedbackRequestAppModel.c;
                this.label = 1;
                if (rideFeedbackRepository.i(listR, str, str2, this) == coroutineSingletons) {
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
    public DefaultRideFeedbackDelegate$submitQueuedFeedbackBestEffort$2(DefaultRideFeedbackDelegate defaultRideFeedbackDelegate, RideFeedbackRequestAppModel rideFeedbackRequestAppModel, Continuation continuation) {
        super(1, continuation);
        this.this$0 = defaultRideFeedbackDelegate;
        this.$request = rideFeedbackRequestAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DefaultRideFeedbackDelegate$submitQueuedFeedbackBestEffort$2(this.this$0, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((DefaultRideFeedbackDelegate$submitQueuedFeedbackBestEffort$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0068 A[Catch: CancellationException -> 0x0015, all -> 0x00b1, TryCatch #2 {CancellationException -> 0x0015, all -> 0x00b1, blocks: (B:7:0x0011, B:13:0x0020, B:26:0x0061, B:28:0x0068, B:31:0x006e, B:33:0x0074, B:34:0x007c, B:36:0x0082, B:40:0x0095, B:42:0x0099, B:44:0x009d, B:14:0x0024, B:20:0x0041, B:23:0x004e, B:17:0x002b), top: B:50:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0082 A[Catch: CancellationException -> 0x0015, all -> 0x00b1, TryCatch #2 {CancellationException -> 0x0015, all -> 0x00b1, blocks: (B:7:0x0011, B:13:0x0020, B:26:0x0061, B:28:0x0068, B:31:0x006e, B:33:0x0074, B:34:0x007c, B:36:0x0082, B:40:0x0095, B:42:0x0099, B:44:0x009d, B:14:0x0024, B:20:0x0041, B:23:0x004e, B:17:0x002b), top: B:50:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0094 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChaloUseCaseResult chaloUseCaseResult;
        ChaloUseCaseResult.Success success;
        List list;
        RideFeedbackRequestAppModel rideFeedbackRequestAppModel;
        Iterator it;
        Object next;
        RideFeedbackResponseAppModel rideFeedbackResponseAppModel;
        NonCancellable nonCancellable;
        AnonymousClass1 anonymousClass1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                RideFeedbackRepository rideFeedbackRepository = this.this$0.l;
                RideFeedbackRequestAppModel rideFeedbackRequestAppModel2 = this.$request;
                String str = rideFeedbackRequestAppModel2.d;
                String str2 = rideFeedbackRequestAppModel2.e;
                String str3 = rideFeedbackRequestAppModel2.b;
                this.label = 1;
                obj = RideFeedbackRepositoryKt.a(rideFeedbackRepository, str, str2, str3, this);
                if (obj == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                ResultKt.b(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    return unit;
                }
                ResultKt.b(obj);
            }
            chaloUseCaseResult = (ChaloUseCaseResult) obj;
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                success = (ChaloUseCaseResult.Success) chaloUseCaseResult;
            } else {
                success = null;
            }
            if (success != null && (list = (List) success.f10419a) != null) {
                rideFeedbackRequestAppModel = this.$request;
                it = list.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.d(((RideFeedbackResponseAppModel) next).f9070a, rideFeedbackRequestAppModel.f9069a));
                rideFeedbackResponseAppModel = (RideFeedbackResponseAppModel) next;
                if (rideFeedbackResponseAppModel != null && rideFeedbackResponseAppModel.b) {
                    nonCancellable = NonCancellable.f17739a;
                    anonymousClass1 = new AnonymousClass1(this.this$0, this.$request, null);
                    this.label = 3;
                    if (BuildersKt.g(nonCancellable, anonymousClass1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return unit;
            if (((Set) obj).contains(this.$request.f9069a)) {
                SubmitRideFeedbackUseCase submitRideFeedbackUseCase = this.this$0.k;
                List listR = CollectionsKt.R(this.$request);
                this.label = 2;
                obj = submitRideFeedbackUseCase.a(listR, this);
                if (obj != coroutineSingletons) {
                    chaloUseCaseResult = (ChaloUseCaseResult) obj;
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                        success = (ChaloUseCaseResult.Success) chaloUseCaseResult;
                    } else {
                        success = null;
                    }
                    if (success != null) {
                        rideFeedbackRequestAppModel = this.$request;
                        it = list.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!Intrinsics.d(((RideFeedbackResponseAppModel) next).f9070a, rideFeedbackRequestAppModel.f9069a));
                        rideFeedbackResponseAppModel = (RideFeedbackResponseAppModel) next;
                        if (rideFeedbackResponseAppModel != null) {
                            nonCancellable = NonCancellable.f17739a;
                            anonymousClass1 = new AnonymousClass1(this.this$0, this.$request, null);
                            this.label = 3;
                            if (BuildersKt.g(nonCancellable, anonymousClass1, this) == coroutineSingletons) {
                            }
                        }
                    }
                }
                return coroutineSingletons;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        return unit;
    }
}
