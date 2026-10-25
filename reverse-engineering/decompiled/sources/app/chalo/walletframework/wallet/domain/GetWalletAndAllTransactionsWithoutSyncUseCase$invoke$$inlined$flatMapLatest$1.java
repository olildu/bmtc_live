package app.chalo.walletframework.wallet.domain;

import androidx.media3.extractor.ts.PsExtractor;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$getWalletTransactionAppModelListAsFlow$$inlined$map$2;
import app.chalo.walletframework.wallet.domain.model.WalletAndAllTransactions;
import app.chalo.walletframework.wallet.domain.model.WalletAndAllTransactionsFailure;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.walletframework.wallet.domain.GetWalletAndAllTransactionsWithoutSyncUseCase$invoke$$inlined$flatMapLatest$1", f = "GetWalletAndAllTransactionsWithoutSyncUseCase.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 1)
public final class GetWalletAndAllTransactionsWithoutSyncUseCase$invoke$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super ChaloUseCaseResult.Success<WalletAndAllTransactions, WalletAndAllTransactionsFailure>>, WalletAppModel, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $userId$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ GetWalletAndAllTransactionsWithoutSyncUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetWalletAndAllTransactionsWithoutSyncUseCase$invoke$$inlined$flatMapLatest$1(Continuation continuation, GetWalletAndAllTransactionsWithoutSyncUseCase getWalletAndAllTransactionsWithoutSyncUseCase, String str) {
        super(3, continuation);
        this.this$0 = getWalletAndAllTransactionsWithoutSyncUseCase;
        this.$userId$inlined = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetWalletAndAllTransactionsWithoutSyncUseCase$invoke$$inlined$flatMapLatest$1 getWalletAndAllTransactionsWithoutSyncUseCase$invoke$$inlined$flatMapLatest$1 = new GetWalletAndAllTransactionsWithoutSyncUseCase$invoke$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$userId$inlined);
        getWalletAndAllTransactionsWithoutSyncUseCase$invoke$$inlined$flatMapLatest$1.L$0 = (FlowCollector) obj;
        getWalletAndAllTransactionsWithoutSyncUseCase$invoke$$inlined$flatMapLatest$1.L$1 = obj2;
        return getWalletAndAllTransactionsWithoutSyncUseCase$invoke$$inlined$flatMapLatest$1.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            final WalletAppModel walletAppModel = (WalletAppModel) this.L$1;
            final WalletRepositoryImpl$getWalletTransactionAppModelListAsFlow$$inlined$map$2 walletRepositoryImpl$getWalletTransactionAppModelListAsFlow$$inlined$map$2I = this.this$0.f11049a.I(this.$userId$inlined, walletAppModel.getF11008a());
            Flow<ChaloUseCaseResult.Success<WalletAndAllTransactions, WalletAndAllTransactionsFailure>> flow = new Flow<ChaloUseCaseResult.Success<WalletAndAllTransactions, WalletAndAllTransactionsFailure>>() { // from class: app.chalo.walletframework.wallet.domain.GetWalletAndAllTransactionsWithoutSyncUseCase$invoke$lambda$0$$inlined$map$1

                /* JADX INFO: renamed from: app.chalo.walletframework.wallet.domain.GetWalletAndAllTransactionsWithoutSyncUseCase$invoke$lambda$0$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f11051a;
                    public final /* synthetic */ WalletAppModel b;

                    /* JADX INFO: renamed from: app.chalo.walletframework.wallet.domain.GetWalletAndAllTransactionsWithoutSyncUseCase$invoke$lambda$0$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.walletframework.wallet.domain.GetWalletAndAllTransactionsWithoutSyncUseCase$invoke$lambda$0$$inlined$map$1$2", f = "GetWalletAndAllTransactionsWithoutSyncUseCase.kt", l = {50}, m = "emit", v = 1)
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

                    public AnonymousClass2(FlowCollector flowCollector, WalletAppModel walletAppModel) {
                        this.f11051a = flowCollector;
                        this.b = walletAppModel;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.b(obj2);
                            ChaloUseCaseResult.Success success = new ChaloUseCaseResult.Success(new WalletAndAllTransactions(this.b, (List) obj));
                            anonymousClass1.label = 1;
                            if (this.f11051a.emit(success, anonymousClass1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.b(obj2);
                        }
                        return Unit.f17538a;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector2, Continuation continuation) {
                    Object objCollect = walletRepositoryImpl$getWalletTransactionAppModelListAsFlow$$inlined$map$2I.collect(new AnonymousClass2(flowCollector2, walletAppModel), continuation);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                }
            };
            this.label = 1;
            if (FlowKt.r(flowCollector, flow, this) == coroutineSingletons) {
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
