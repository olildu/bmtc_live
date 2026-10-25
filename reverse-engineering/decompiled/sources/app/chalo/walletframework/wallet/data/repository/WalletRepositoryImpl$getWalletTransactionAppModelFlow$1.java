package app.chalo.walletframework.wallet.data.repository;

import app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource;
import app.chalo.walletframework.wallet.data.mapper.WalletEntityToAppModelMapperKt;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletTransactionAppModel;
import app.chalo.walletframework.wallet.data.repository.entity.WalletTransactionEntity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl", f = "WalletRepositoryImpl.kt", l = {165}, m = "getWalletTransactionAppModelFlow", v = 1)
final class WalletRepositoryImpl$getWalletTransactionAppModelFlow$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WalletRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletRepositoryImpl$getWalletTransactionAppModelFlow$1(WalletRepositoryImpl walletRepositoryImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = walletRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WalletRepositoryImpl$getWalletTransactionAppModelFlow$1 walletRepositoryImpl$getWalletTransactionAppModelFlow$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        WalletRepositoryImpl walletRepositoryImpl = this.this$0;
        walletRepositoryImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            walletRepositoryImpl$getWalletTransactionAppModelFlow$1 = this;
        } else {
            walletRepositoryImpl$getWalletTransactionAppModelFlow$1 = new WalletRepositoryImpl$getWalletTransactionAppModelFlow$1(walletRepositoryImpl, this);
        }
        Object objZ = walletRepositoryImpl$getWalletTransactionAppModelFlow$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletRepositoryImpl$getWalletTransactionAppModelFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objZ);
            WalletLocalDataSource walletLocalDataSource = walletRepositoryImpl.f11019a;
            walletRepositoryImpl$getWalletTransactionAppModelFlow$1.label = 1;
            objZ = walletLocalDataSource.z();
            if (objZ == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objZ);
        }
        final Flow flow = (Flow) objZ;
        return new Flow<WalletTransactionAppModel>() { // from class: app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$getWalletTransactionAppModelFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$getWalletTransactionAppModelFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f11025a;

                /* JADX INFO: renamed from: app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$getWalletTransactionAppModelFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$getWalletTransactionAppModelFlow$$inlined$map$1$2", f = "WalletRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f11025a = flowCollector;
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
                        WalletTransactionAppModel walletTransactionAppModelB = WalletEntityToAppModelMapperKt.b((WalletTransactionEntity) obj);
                        anonymousClass1.label = 1;
                        if (this.f11025a.emit(walletTransactionAppModelB, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }
}
