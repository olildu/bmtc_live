package app.chalo.walletframework.quickpay.domain;

import app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayAppModel;
import app.chalo.walletframework.quickpay.data.repository.QuickPayRepository;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import java.util.List;
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
@DebugMetadata(c = "app.chalo.walletframework.quickpay.domain.GetActiveQuickPaysUseCase", f = "GetActiveQuickPaysUseCase.kt", l = {20}, m = "invoke", v = 1)
final class GetActiveQuickPaysUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetActiveQuickPaysUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetActiveQuickPaysUseCase$invoke$1(GetActiveQuickPaysUseCase getActiveQuickPaysUseCase, Continuation continuation) {
        super(continuation);
        this.this$0 = getActiveQuickPaysUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GetActiveQuickPaysUseCase$invoke$1 getActiveQuickPaysUseCase$invoke$1;
        final WalletTypeIdentifier walletTypeIdentifier;
        final boolean z;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        final GetActiveQuickPaysUseCase getActiveQuickPaysUseCase = this.this$0;
        getActiveQuickPaysUseCase.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            getActiveQuickPaysUseCase$invoke$1 = this;
        } else {
            getActiveQuickPaysUseCase$invoke$1 = new GetActiveQuickPaysUseCase$invoke$1(getActiveQuickPaysUseCase, this);
        }
        Object objL = getActiveQuickPaysUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getActiveQuickPaysUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objL);
            QuickPayRepository quickPayRepository = getActiveQuickPaysUseCase.f10935a;
            getActiveQuickPaysUseCase$invoke$1.L$0 = null;
            getActiveQuickPaysUseCase$invoke$1.Z$0 = false;
            getActiveQuickPaysUseCase$invoke$1.label = 1;
            objL = quickPayRepository.l(getActiveQuickPaysUseCase$invoke$1);
            if (objL == coroutineSingletons) {
                return coroutineSingletons;
            }
            walletTypeIdentifier = null;
            z = false;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = getActiveQuickPaysUseCase$invoke$1.Z$0;
            walletTypeIdentifier = (WalletTypeIdentifier) getActiveQuickPaysUseCase$invoke$1.L$0;
            ResultKt.b(objL);
        }
        final Flow flow = (Flow) objL;
        return new Flow<List<? extends QuickPayAppModel>>() { // from class: app.chalo.walletframework.quickpay.domain.GetActiveQuickPaysUseCase$invoke$$inlined$filter$1

            /* JADX INFO: renamed from: app.chalo.walletframework.quickpay.domain.GetActiveQuickPaysUseCase$invoke$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f10937a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ GetActiveQuickPaysUseCase c;
                public final /* synthetic */ WalletTypeIdentifier d;

                /* JADX INFO: renamed from: app.chalo.walletframework.quickpay.domain.GetActiveQuickPaysUseCase$invoke$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.walletframework.quickpay.domain.GetActiveQuickPaysUseCase$invoke$$inlined$filter$1$2", f = "GetActiveQuickPaysUseCase.kt", l = {52, 50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(FlowCollector flowCollector, boolean z, GetActiveQuickPaysUseCase getActiveQuickPaysUseCase, WalletTypeIdentifier walletTypeIdentifier) {
                    this.f10937a = flowCollector;
                    this.b = z;
                    this.c = getActiveQuickPaysUseCase;
                    this.d = walletTypeIdentifier;
                }

                /* JADX WARN: Code duplicated, block: B:28:0x0070  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
                
                    if (r9 == r1) goto L30;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
                
                    if (r2.emit(r8, r0) == r1) goto L30;
                 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof app.chalo.walletframework.quickpay.domain.GetActiveQuickPaysUseCase$invoke$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        app.chalo.walletframework.quickpay.domain.GetActiveQuickPaysUseCase$invoke$$inlined$filter$1$2$1 r0 = (app.chalo.walletframework.quickpay.domain.GetActiveQuickPaysUseCase$invoke$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        app.chalo.walletframework.quickpay.domain.GetActiveQuickPaysUseCase$invoke$$inlined$filter$1$2$1 r0 = new app.chalo.walletframework.quickpay.domain.GetActiveQuickPaysUseCase$invoke$$inlined$filter$1$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.result
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3f
                        if (r2 == r4) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.ResultKt.b(r9)
                        goto L7e
                    L2a:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L32:
                        java.lang.Object r8 = r0.L$1
                        kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
                        java.lang.Object r2 = r0.L$0
                        kotlin.ResultKt.b(r9)
                        r6 = r2
                        r2 = r8
                        r8 = r6
                        goto L5e
                    L3f:
                        kotlin.ResultKt.b(r9)
                        r9 = r8
                        java.util.List r9 = (java.util.List) r9
                        boolean r9 = r7.b
                        kotlinx.coroutines.flow.FlowCollector r2 = r7.f10937a
                        if (r9 == 0) goto L6e
                        app.chalo.walletframework.quickpay.domain.GetActiveQuickPaysUseCase r9 = r7.c
                        app.chalo.walletframework.wallet.domain.GetWalletStatusWithoutSyncUseCase r9 = r9.b
                        r0.L$0 = r8
                        r0.L$1 = r2
                        r0.label = r4
                        app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r5 = r7.d
                        java.lang.Object r9 = r9.a(r5, r0)
                        if (r9 != r1) goto L5e
                        goto L7d
                    L5e:
                        app.chalo.utils.ChaloUseCaseResult r9 = (app.chalo.utils.ChaloUseCaseResult) r9
                        boolean r5 = r9 instanceof app.chalo.utils.ChaloUseCaseResult.Success
                        if (r5 == 0) goto L6d
                        app.chalo.utils.ChaloUseCaseResult$Success r9 = (app.chalo.utils.ChaloUseCaseResult.Success) r9
                        java.lang.Object r9 = r9.f10419a
                        app.chalo.walletframework.wallet.data.model.WalletStatus r5 = app.chalo.walletframework.wallet.data.model.WalletStatus.ACTIVE
                        if (r9 != r5) goto L6d
                        goto L6e
                    L6d:
                        r4 = 0
                    L6e:
                        if (r4 == 0) goto L7e
                        r9 = 0
                        r0.L$0 = r9
                        r0.L$1 = r9
                        r0.label = r3
                        java.lang.Object r8 = r2.emit(r8, r0)
                        if (r8 != r1) goto L7e
                    L7d:
                        return r1
                    L7e:
                        kotlin.Unit r8 = kotlin.Unit.f17538a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.quickpay.domain.GetActiveQuickPaysUseCase$invoke$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, z, getActiveQuickPaysUseCase, walletTypeIdentifier), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }
}
