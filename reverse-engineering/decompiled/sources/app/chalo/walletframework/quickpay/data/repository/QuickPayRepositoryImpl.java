package app.chalo.walletframework.quickpay.data.repository;

import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.walletframework.quickpay.data.local.QuickPayLocalDataSource;
import app.chalo.walletframework.quickpay.data.mapper.QuickPayModelsMapperKt;
import app.chalo.walletframework.quickpay.data.model.apimodel.QuickPayReceiptResponseModel;
import app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayAppModel;
import app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayReceiptAppModelKt;
import app.chalo.walletframework.quickpay.data.model.appmodel.WalletScopedQuickPay;
import app.chalo.walletframework.quickpay.data.remote.QuickPayRemoteDataSource;
import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayEntity;
import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayReceipt;
import app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource;
import app.chalo.walletframework.wallet.data.mapper.WalletEntityToAppModelMapperKt;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import app.chalo.walletframework.wallet.data.repository.entity.WalletEntity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/quickpay/data/repository/QuickPayRepositoryImpl;", "Lapp/chalo/walletframework/quickpay/data/repository/QuickPayRepository;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuickPayRepositoryImpl implements QuickPayRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QuickPayLocalDataSource f10922a;
    public final WalletLocalDataSource b;
    public final QuickPayRemoteDataSource c;
    public final BasicInfoContract d;
    public final UserProfileDetailsProvider e;
    public final CrashlyticsLogger f;

    public QuickPayRepositoryImpl(QuickPayLocalDataSource quickPayLocalDataSource, WalletLocalDataSource walletLocalDataSource, QuickPayRemoteDataSource quickPayRemoteDataSource, BasicInfoContract basicInfoContract, UserProfileDetailsProvider userProfileDetailsProvider, CrashlyticsLogger crashlyticsLogger) {
        this.f10922a = quickPayLocalDataSource;
        this.b = walletLocalDataSource;
        this.c = quickPayRemoteDataSource;
        this.d = basicInfoContract;
        this.e = userProfileDetailsProvider;
        this.f = crashlyticsLogger;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [app.chalo.walletframework.quickpay.data.repository.QuickPayRepositoryImpl$getAllQuickPaysAsFlow$$inlined$map$1] */
    @Override // app.chalo.walletframework.quickpay.data.repository.QuickPayRepository
    public final QuickPayRepositoryImpl$getAllQuickPaysAsFlow$$inlined$map$1 a() {
        final Flow flowA = this.f10922a.a();
        return new Flow<List<? extends QuickPayAppModel>>() { // from class: app.chalo.walletframework.quickpay.data.repository.QuickPayRepositoryImpl$getAllQuickPaysAsFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.walletframework.quickpay.data.repository.QuickPayRepositoryImpl$getAllQuickPaysAsFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f10926a;

                /* JADX INFO: renamed from: app.chalo.walletframework.quickpay.data.repository.QuickPayRepositoryImpl$getAllQuickPaysAsFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.walletframework.quickpay.data.repository.QuickPayRepositoryImpl$getAllQuickPaysAsFlow$$inlined$map$1$2", f = "QuickPayRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f10926a = flowCollector;
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
                        List list = (List) obj;
                        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(QuickPayModelsMapperKt.a((QuickPayEntity) it.next()));
                        }
                        anonymousClass1.label = 1;
                        if (this.f10926a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flowA.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    @Override // app.chalo.walletframework.quickpay.data.repository.QuickPayRepository
    public final Object b(QuickPayReceipt quickPayReceipt, Continuation continuation) {
        Object objB = this.f10922a.b(quickPayReceipt, continuation);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [app.chalo.walletframework.quickpay.data.repository.QuickPayRepositoryImpl$getQuickPayAsFlow$$inlined$map$1] */
    @Override // app.chalo.walletframework.quickpay.data.repository.QuickPayRepository
    public final QuickPayRepositoryImpl$getQuickPayAsFlow$$inlined$map$1 c(String orderId, String transactionId) {
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(transactionId, "transactionId");
        final Flow flowC = this.f10922a.c(orderId, transactionId);
        return new Flow<QuickPayAppModel>() { // from class: app.chalo.walletframework.quickpay.data.repository.QuickPayRepositoryImpl$getQuickPayAsFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.walletframework.quickpay.data.repository.QuickPayRepositoryImpl$getQuickPayAsFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f10928a;

                /* JADX INFO: renamed from: app.chalo.walletframework.quickpay.data.repository.QuickPayRepositoryImpl$getQuickPayAsFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.walletframework.quickpay.data.repository.QuickPayRepositoryImpl$getQuickPayAsFlow$$inlined$map$1$2", f = "QuickPayRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f10928a = flowCollector;
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
                        QuickPayEntity quickPayEntity = (QuickPayEntity) obj;
                        QuickPayAppModel quickPayAppModelA = quickPayEntity != null ? QuickPayModelsMapperKt.a(quickPayEntity) : null;
                        anonymousClass1.label = 1;
                        if (this.f10928a.emit(quickPayAppModelA, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flowC.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [app.chalo.walletframework.quickpay.data.repository.QuickPayRepositoryImpl$getQuickPaysForOrderIdAsFlow$$inlined$map$1] */
    @Override // app.chalo.walletframework.quickpay.data.repository.QuickPayRepository
    public final QuickPayRepositoryImpl$getQuickPaysForOrderIdAsFlow$$inlined$map$1 d(String orderId) {
        Intrinsics.i(orderId, "orderId");
        final Flow flowD = this.f10922a.d(orderId);
        return new Flow<List<? extends QuickPayAppModel>>() { // from class: app.chalo.walletframework.quickpay.data.repository.QuickPayRepositoryImpl$getQuickPaysForOrderIdAsFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.walletframework.quickpay.data.repository.QuickPayRepositoryImpl$getQuickPaysForOrderIdAsFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f10930a;

                /* JADX INFO: renamed from: app.chalo.walletframework.quickpay.data.repository.QuickPayRepositoryImpl$getQuickPaysForOrderIdAsFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.walletframework.quickpay.data.repository.QuickPayRepositoryImpl$getQuickPaysForOrderIdAsFlow$$inlined$map$1$2", f = "QuickPayRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f10930a = flowCollector;
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
                        List list = (List) obj;
                        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(QuickPayModelsMapperKt.a((QuickPayEntity) it.next()));
                        }
                        anonymousClass1.label = 1;
                        if (this.f10930a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flowD.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    @Override // app.chalo.walletframework.quickpay.data.repository.QuickPayRepository
    public final Object e(Continuation continuation) {
        Object objE = this.f10922a.e(continuation);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.quickpay.data.repository.QuickPayRepository
    public final Flow f(String transactionId) {
        Intrinsics.i(transactionId, "transactionId");
        return this.f10922a.f(transactionId);
    }

    @Override // app.chalo.walletframework.quickpay.data.repository.QuickPayRepository
    public final Object g(Continuation continuation) {
        Object objG = this.f10922a.g(continuation);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.quickpay.data.repository.QuickPayRepository
    public final Object h(String str, ContinuationImpl continuationImpl) {
        QuickPayRepositoryImpl$fetchClosedLoopQuickPayReceipt$1 quickPayRepositoryImpl$fetchClosedLoopQuickPayReceipt$1;
        if (continuationImpl instanceof QuickPayRepositoryImpl$fetchClosedLoopQuickPayReceipt$1) {
            quickPayRepositoryImpl$fetchClosedLoopQuickPayReceipt$1 = (QuickPayRepositoryImpl$fetchClosedLoopQuickPayReceipt$1) continuationImpl;
            int i = quickPayRepositoryImpl$fetchClosedLoopQuickPayReceipt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayRepositoryImpl$fetchClosedLoopQuickPayReceipt$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayRepositoryImpl$fetchClosedLoopQuickPayReceipt$1 = new QuickPayRepositoryImpl$fetchClosedLoopQuickPayReceipt$1(this, continuationImpl);
            }
        } else {
            quickPayRepositoryImpl$fetchClosedLoopQuickPayReceipt$1 = new QuickPayRepositoryImpl$fetchClosedLoopQuickPayReceipt$1(this, continuationImpl);
        }
        Object objH = quickPayRepositoryImpl$fetchClosedLoopQuickPayReceipt$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayRepositoryImpl$fetchClosedLoopQuickPayReceipt$1.label;
        if (i2 == 0) {
            ResultKt.b(objH);
            quickPayRepositoryImpl$fetchClosedLoopQuickPayReceipt$1.label = 1;
            objH = this.c.h(str, quickPayRepositoryImpl$fetchClosedLoopQuickPayReceipt$1);
            if (objH == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objH);
        }
        return QuickPayReceiptAppModelKt.b((QuickPayReceiptResponseModel) objH);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.quickpay.data.repository.QuickPayRepository
    public final Object i(String str, ContinuationImpl continuationImpl) {
        QuickPayRepositoryImpl$fetchQuickPayReceipt$1 quickPayRepositoryImpl$fetchQuickPayReceipt$1;
        if (continuationImpl instanceof QuickPayRepositoryImpl$fetchQuickPayReceipt$1) {
            quickPayRepositoryImpl$fetchQuickPayReceipt$1 = (QuickPayRepositoryImpl$fetchQuickPayReceipt$1) continuationImpl;
            int i = quickPayRepositoryImpl$fetchQuickPayReceipt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayRepositoryImpl$fetchQuickPayReceipt$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayRepositoryImpl$fetchQuickPayReceipt$1 = new QuickPayRepositoryImpl$fetchQuickPayReceipt$1(this, continuationImpl);
            }
        } else {
            quickPayRepositoryImpl$fetchQuickPayReceipt$1 = new QuickPayRepositoryImpl$fetchQuickPayReceipt$1(this, continuationImpl);
        }
        Object objI = quickPayRepositoryImpl$fetchQuickPayReceipt$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayRepositoryImpl$fetchQuickPayReceipt$1.label;
        if (i2 == 0) {
            ResultKt.b(objI);
            quickPayRepositoryImpl$fetchQuickPayReceipt$1.label = 1;
            objI = this.c.i(str, quickPayRepositoryImpl$fetchQuickPayReceipt$1);
            if (objI == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objI);
        }
        return QuickPayReceiptAppModelKt.b((QuickPayReceiptResponseModel) objI);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.quickpay.data.repository.QuickPayRepository
    public final Serializable j(String str, ContinuationImpl continuationImpl) {
        QuickPayRepositoryImpl$getQuickPaysForOrderId$1 quickPayRepositoryImpl$getQuickPaysForOrderId$1;
        if (continuationImpl instanceof QuickPayRepositoryImpl$getQuickPaysForOrderId$1) {
            quickPayRepositoryImpl$getQuickPaysForOrderId$1 = (QuickPayRepositoryImpl$getQuickPaysForOrderId$1) continuationImpl;
            int i = quickPayRepositoryImpl$getQuickPaysForOrderId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayRepositoryImpl$getQuickPaysForOrderId$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayRepositoryImpl$getQuickPaysForOrderId$1 = new QuickPayRepositoryImpl$getQuickPaysForOrderId$1(this, continuationImpl);
            }
        } else {
            quickPayRepositoryImpl$getQuickPaysForOrderId$1 = new QuickPayRepositoryImpl$getQuickPaysForOrderId$1(this, continuationImpl);
        }
        Object objJ = quickPayRepositoryImpl$getQuickPaysForOrderId$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayRepositoryImpl$getQuickPaysForOrderId$1.label;
        if (i2 == 0) {
            ResultKt.b(objJ);
            quickPayRepositoryImpl$getQuickPaysForOrderId$1.label = 1;
            objJ = this.f10922a.j(str, quickPayRepositoryImpl$getQuickPaysForOrderId$1);
            if (objJ == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objJ);
        }
        Iterable iterable = (Iterable) objJ;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(QuickPayModelsMapperKt.a((QuickPayEntity) it.next()));
        }
        return arrayList;
    }

    @Override // app.chalo.walletframework.quickpay.data.repository.QuickPayRepository
    public final Object k(List list, Continuation continuation) {
        Object objK = this.f10922a.k(list, continuation);
        return objK == CoroutineSingletons.COROUTINE_SUSPENDED ? objK : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.quickpay.data.repository.QuickPayRepository
    public final Object l(ContinuationImpl continuationImpl) {
        QuickPayRepositoryImpl$getActiveQuickPaysAsFlow$1 quickPayRepositoryImpl$getActiveQuickPaysAsFlow$1;
        if (continuationImpl instanceof QuickPayRepositoryImpl$getActiveQuickPaysAsFlow$1) {
            quickPayRepositoryImpl$getActiveQuickPaysAsFlow$1 = (QuickPayRepositoryImpl$getActiveQuickPaysAsFlow$1) continuationImpl;
            int i = quickPayRepositoryImpl$getActiveQuickPaysAsFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayRepositoryImpl$getActiveQuickPaysAsFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayRepositoryImpl$getActiveQuickPaysAsFlow$1 = new QuickPayRepositoryImpl$getActiveQuickPaysAsFlow$1(this, continuationImpl);
            }
        } else {
            quickPayRepositoryImpl$getActiveQuickPaysAsFlow$1 = new QuickPayRepositoryImpl$getActiveQuickPaysAsFlow$1(this, continuationImpl);
        }
        Object objC = quickPayRepositoryImpl$getActiveQuickPaysAsFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayRepositoryImpl$getActiveQuickPaysAsFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            quickPayRepositoryImpl$getActiveQuickPaysAsFlow$1.label = 1;
            objC = this.d.c(quickPayRepositoryImpl$getActiveQuickPaysAsFlow$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        final Flow flowH = this.f10922a.h(((Number) objC).longValue());
        return new Flow<List<? extends QuickPayAppModel>>() { // from class: app.chalo.walletframework.quickpay.data.repository.QuickPayRepositoryImpl$getActiveQuickPaysAsFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.walletframework.quickpay.data.repository.QuickPayRepositoryImpl$getActiveQuickPaysAsFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f10924a;

                /* JADX INFO: renamed from: app.chalo.walletframework.quickpay.data.repository.QuickPayRepositoryImpl$getActiveQuickPaysAsFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.walletframework.quickpay.data.repository.QuickPayRepositoryImpl$getActiveQuickPaysAsFlow$$inlined$map$1$2", f = "QuickPayRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f10924a = flowCollector;
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
                        List list = (List) obj;
                        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(QuickPayModelsMapperKt.a((QuickPayEntity) it.next()));
                        }
                        anonymousClass1.label = 1;
                        if (this.f10924a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flowH.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.quickpay.data.repository.QuickPayRepository
    public final Serializable m(ArrayList arrayList, ContinuationImpl continuationImpl) {
        QuickPayRepositoryImpl$getQuickPaysForOrderIds$1 quickPayRepositoryImpl$getQuickPaysForOrderIds$1;
        if (continuationImpl instanceof QuickPayRepositoryImpl$getQuickPaysForOrderIds$1) {
            quickPayRepositoryImpl$getQuickPaysForOrderIds$1 = (QuickPayRepositoryImpl$getQuickPaysForOrderIds$1) continuationImpl;
            int i = quickPayRepositoryImpl$getQuickPaysForOrderIds$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayRepositoryImpl$getQuickPaysForOrderIds$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayRepositoryImpl$getQuickPaysForOrderIds$1 = new QuickPayRepositoryImpl$getQuickPaysForOrderIds$1(this, continuationImpl);
            }
        } else {
            quickPayRepositoryImpl$getQuickPaysForOrderIds$1 = new QuickPayRepositoryImpl$getQuickPaysForOrderIds$1(this, continuationImpl);
        }
        Object objI = quickPayRepositoryImpl$getQuickPaysForOrderIds$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayRepositoryImpl$getQuickPaysForOrderIds$1.label;
        if (i2 == 0) {
            ResultKt.b(objI);
            quickPayRepositoryImpl$getQuickPaysForOrderIds$1.label = 1;
            objI = this.f10922a.i(arrayList, quickPayRepositoryImpl$getQuickPaysForOrderIds$1);
            if (objI == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objI);
        }
        Iterable iterable = (Iterable) objI;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(QuickPayModelsMapperKt.a((QuickPayEntity) it.next()));
        }
        return arrayList2;
    }

    @Override // app.chalo.walletframework.quickpay.data.repository.QuickPayRepository
    public final Object n(QuickPayAppModel quickPayAppModel, Continuation continuation) {
        Object objM = this.f10922a.m(QuickPayModelsMapperKt.b(quickPayAppModel), continuation);
        return objM == CoroutineSingletons.COROUTINE_SUSPENDED ? objM : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.quickpay.data.repository.QuickPayRepository
    public final Serializable o(String str, ContinuationImpl continuationImpl) {
        QuickPayRepositoryImpl$getQuickPayReceiptsList$1 quickPayRepositoryImpl$getQuickPayReceiptsList$1;
        if (continuationImpl instanceof QuickPayRepositoryImpl$getQuickPayReceiptsList$1) {
            quickPayRepositoryImpl$getQuickPayReceiptsList$1 = (QuickPayRepositoryImpl$getQuickPayReceiptsList$1) continuationImpl;
            int i = quickPayRepositoryImpl$getQuickPayReceiptsList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayRepositoryImpl$getQuickPayReceiptsList$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayRepositoryImpl$getQuickPayReceiptsList$1 = new QuickPayRepositoryImpl$getQuickPayReceiptsList$1(this, continuationImpl);
            }
        } else {
            quickPayRepositoryImpl$getQuickPayReceiptsList$1 = new QuickPayRepositoryImpl$getQuickPayReceiptsList$1(this, continuationImpl);
        }
        Object objJ = quickPayRepositoryImpl$getQuickPayReceiptsList$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayRepositoryImpl$getQuickPayReceiptsList$1.label;
        if (i2 == 0) {
            ResultKt.b(objJ);
            quickPayRepositoryImpl$getQuickPayReceiptsList$1.label = 1;
            objJ = this.c.j(str, quickPayRepositoryImpl$getQuickPayReceiptsList$1);
            if (objJ == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objJ);
        }
        Iterable iterable = (Iterable) objJ;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(QuickPayReceiptAppModelKt.b((QuickPayReceiptResponseModel) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.quickpay.data.repository.QuickPayRepository
    public final Object p(String str, String str2, ContinuationImpl continuationImpl) {
        QuickPayRepositoryImpl$getWalletScopedQuickPay$1 quickPayRepositoryImpl$getWalletScopedQuickPay$1;
        if (continuationImpl instanceof QuickPayRepositoryImpl$getWalletScopedQuickPay$1) {
            quickPayRepositoryImpl$getWalletScopedQuickPay$1 = (QuickPayRepositoryImpl$getWalletScopedQuickPay$1) continuationImpl;
            int i = quickPayRepositoryImpl$getWalletScopedQuickPay$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayRepositoryImpl$getWalletScopedQuickPay$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayRepositoryImpl$getWalletScopedQuickPay$1 = new QuickPayRepositoryImpl$getWalletScopedQuickPay$1(this, continuationImpl);
            }
        } else {
            quickPayRepositoryImpl$getWalletScopedQuickPay$1 = new QuickPayRepositoryImpl$getWalletScopedQuickPay$1(this, continuationImpl);
        }
        Object objN = quickPayRepositoryImpl$getWalletScopedQuickPay$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayRepositoryImpl$getWalletScopedQuickPay$1.label;
        if (i2 == 0) {
            ResultKt.b(objN);
            quickPayRepositoryImpl$getWalletScopedQuickPay$1.label = 1;
            objN = this.f10922a.n(str, str2, quickPayRepositoryImpl$getWalletScopedQuickPay$1);
            if (objN != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objN);
            return objN;
        }
        ResultKt.b(objN);
        QuickPayEntity quickPayEntity = (QuickPayEntity) objN;
        if (quickPayEntity == null) {
            return null;
        }
        QuickPayAppModel quickPayAppModelA = QuickPayModelsMapperKt.a(quickPayEntity);
        quickPayRepositoryImpl$getWalletScopedQuickPay$1.label = 2;
        Object objS = s(quickPayAppModelA, quickPayRepositoryImpl$getWalletScopedQuickPay$1);
        return objS == obj ? obj : objS;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.quickpay.data.repository.QuickPayRepository
    public final Object q(String str, ContinuationImpl continuationImpl) {
        QuickPayRepositoryImpl$getWalletScopedQuickPay$2 quickPayRepositoryImpl$getWalletScopedQuickPay$2;
        if (continuationImpl instanceof QuickPayRepositoryImpl$getWalletScopedQuickPay$2) {
            quickPayRepositoryImpl$getWalletScopedQuickPay$2 = (QuickPayRepositoryImpl$getWalletScopedQuickPay$2) continuationImpl;
            int i = quickPayRepositoryImpl$getWalletScopedQuickPay$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayRepositoryImpl$getWalletScopedQuickPay$2.label = i - Integer.MIN_VALUE;
            } else {
                quickPayRepositoryImpl$getWalletScopedQuickPay$2 = new QuickPayRepositoryImpl$getWalletScopedQuickPay$2(this, continuationImpl);
            }
        } else {
            quickPayRepositoryImpl$getWalletScopedQuickPay$2 = new QuickPayRepositoryImpl$getWalletScopedQuickPay$2(this, continuationImpl);
        }
        Object objO = quickPayRepositoryImpl$getWalletScopedQuickPay$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayRepositoryImpl$getWalletScopedQuickPay$2.label;
        if (i2 == 0) {
            ResultKt.b(objO);
            quickPayRepositoryImpl$getWalletScopedQuickPay$2.label = 1;
            objO = this.f10922a.o(str, quickPayRepositoryImpl$getWalletScopedQuickPay$2);
            if (objO != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objO);
            return objO;
        }
        ResultKt.b(objO);
        QuickPayEntity quickPayEntity = (QuickPayEntity) objO;
        if (quickPayEntity == null) {
            return null;
        }
        QuickPayAppModel quickPayAppModelA = QuickPayModelsMapperKt.a(quickPayEntity);
        quickPayRepositoryImpl$getWalletScopedQuickPay$2.label = 2;
        Object objS = s(quickPayAppModelA, quickPayRepositoryImpl$getWalletScopedQuickPay$2);
        return objS == obj ? obj : objS;
    }

    public final void r(String str, QuickPayAppModel quickPayAppModel) {
        String message = str + ". orderId=" + quickPayAppModel.i + ", transactionId=" + quickPayAppModel.b + ", walletId=" + quickPayAppModel.k;
        Intrinsics.i(message, "message");
        this.f.i(new QuickPayWalletScopeInvariantViolationException(message));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(QuickPayAppModel quickPayAppModel, ContinuationImpl continuationImpl) {
        QuickPayRepositoryImpl$resolveWalletScopedQuickPay$1 quickPayRepositoryImpl$resolveWalletScopedQuickPay$1;
        if (continuationImpl instanceof QuickPayRepositoryImpl$resolveWalletScopedQuickPay$1) {
            quickPayRepositoryImpl$resolveWalletScopedQuickPay$1 = (QuickPayRepositoryImpl$resolveWalletScopedQuickPay$1) continuationImpl;
            int i = quickPayRepositoryImpl$resolveWalletScopedQuickPay$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayRepositoryImpl$resolveWalletScopedQuickPay$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayRepositoryImpl$resolveWalletScopedQuickPay$1 = new QuickPayRepositoryImpl$resolveWalletScopedQuickPay$1(this, continuationImpl);
            }
        } else {
            quickPayRepositoryImpl$resolveWalletScopedQuickPay$1 = new QuickPayRepositoryImpl$resolveWalletScopedQuickPay$1(this, continuationImpl);
        }
        Object objR = quickPayRepositoryImpl$resolveWalletScopedQuickPay$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayRepositoryImpl$resolveWalletScopedQuickPay$1.label;
        if (i2 == 0) {
            ResultKt.b(objR);
            String str = quickPayAppModel.k;
            if (StringsKt.F(str)) {
                r("QuickPay exists with blank walletId", quickPayAppModel);
                return null;
            }
            String strM = this.e.m();
            if (strM == null || StringsKt.F(strM)) {
                r("QuickPay exists but userId is unavailable for wallet lookup", quickPayAppModel);
                return null;
            }
            quickPayRepositoryImpl$resolveWalletScopedQuickPay$1.L$0 = quickPayAppModel;
            quickPayRepositoryImpl$resolveWalletScopedQuickPay$1.label = 1;
            objR = this.b.r(strM, str, quickPayRepositoryImpl$resolveWalletScopedQuickPay$1);
            if (objR == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            quickPayAppModel = (QuickPayAppModel) quickPayRepositoryImpl$resolveWalletScopedQuickPay$1.L$0;
            ResultKt.b(objR);
        }
        WalletEntity walletEntity = (WalletEntity) objR;
        WalletAppModel walletAppModelA = walletEntity != null ? WalletEntityToAppModelMapperKt.a(walletEntity) : null;
        if (walletAppModelA != null) {
            return new WalletScopedQuickPay(quickPayAppModel, walletAppModelA);
        }
        r("QuickPay exists but cached wallet is missing", quickPayAppModel);
        return null;
    }
}
