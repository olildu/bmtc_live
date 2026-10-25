package app.chalo.walletframework.wallet.domain;

import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import app.chalo.walletframework.wallet.domain.model.WalletAndAllTransactions;
import app.chalo.walletframework.wallet.domain.model.WalletAndAllTransactionsFailure;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/GetWalletAndAllTransactionsUseCase;", "", "Companion", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetWalletAndAllTransactionsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletRepository f11044a;
    public final UserProfileDetailsProvider b;
    public final WalletSyncOrchestrator c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/GetWalletAndAllTransactionsUseCase$Companion;", "", "", "WALLET_SYNC_FAILED", "Ljava/lang/String;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public GetWalletAndAllTransactionsUseCase(WalletRepository walletRepository, UserProfileDetailsProvider userProfileDetailsProvider, WalletSyncOrchestrator walletSyncOrchestrator) {
        this.f11044a = walletRepository;
        this.b = userProfileDetailsProvider;
        this.c = walletSyncOrchestrator;
    }

    public final Flow a(WalletTypeIdentifier walletTypeIdentifier) {
        String strM = this.b.m();
        if (strM == null) {
            return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(new ChaloUseCaseResult.Failure(new WalletAndAllTransactionsFailure(new Throwable("User not logged in"))));
        }
        final Flow flowM = FlowKt.m(FlowKt.B(FlowKt.H(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(this.f11044a.y(strM, walletTypeIdentifier)), new GetWalletAndAllTransactionsUseCase$invoke$$inlined$flatMapLatest$1(null, this, strM)), FlowKt.y(new GetWalletAndAllTransactionsUseCase$invoke$syncHistoryFlow$1(this, walletTypeIdentifier, null))));
        return new Flow<ChaloUseCaseResult<WalletAndAllTransactions, WalletAndAllTransactionsFailure>>() { // from class: app.chalo.walletframework.wallet.domain.GetWalletAndAllTransactionsUseCase$invoke$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.walletframework.wallet.domain.GetWalletAndAllTransactionsUseCase$invoke$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f11046a;

                /* JADX INFO: renamed from: app.chalo.walletframework.wallet.domain.GetWalletAndAllTransactionsUseCase$invoke$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.walletframework.wallet.domain.GetWalletAndAllTransactionsUseCase$invoke$$inlined$map$1$2", f = "GetWalletAndAllTransactionsUseCase.kt", l = {50}, m = "emit", v = 1)
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f11046a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    WalletAndAllTransactions walletAndAllTransactions;
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
                        Object success = (ChaloUseCaseResult) obj;
                        ChaloUseCaseResult.Success success2 = success instanceof ChaloUseCaseResult.Success ? (ChaloUseCaseResult.Success) success : null;
                        if (success2 != null && (walletAndAllTransactions = (WalletAndAllTransactions) success2.f10419a) != null) {
                            success = new ChaloUseCaseResult.Success(new WalletAndAllTransactions(walletAndAllTransactions.f11093a, CollectionsKt.v0(new GetWalletAndAllTransactionsUseCase$invoke$lambda$1$0$$inlined$sortedByDescending$1(), walletAndAllTransactions.b)));
                        }
                        anonymousClass1.label = 1;
                        if (this.f11046a.emit(success, anonymousClass1) == coroutineSingletons) {
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
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowM.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }
}
