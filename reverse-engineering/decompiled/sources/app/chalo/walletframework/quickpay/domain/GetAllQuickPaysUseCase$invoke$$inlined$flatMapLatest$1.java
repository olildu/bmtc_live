package app.chalo.walletframework.quickpay.domain;

import androidx.media3.extractor.ts.PsExtractor;
import app.chalo.models.UserBookingsStatusType;
import app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayAppModel;
import app.chalo.walletframework.quickpay.data.repository.QuickPayRepositoryImpl$getAllQuickPaysAsFlow$$inlined$map$1;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.walletframework.quickpay.domain.GetAllQuickPaysUseCase$invoke$$inlined$flatMapLatest$1", f = "GetAllQuickPaysUseCase.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 1)
public final class GetAllQuickPaysUseCase$invoke$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super List<? extends QuickPayAppModel>>, WalletAppModel, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $onlyIfWalletActive$inlined;
    final /* synthetic */ UserBookingsStatusType $statusTypeToInclude$inlined;
    final /* synthetic */ WalletTypeIdentifier $walletTypeIdentifier$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ GetAllQuickPaysUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAllQuickPaysUseCase$invoke$$inlined$flatMapLatest$1(Continuation continuation, GetAllQuickPaysUseCase getAllQuickPaysUseCase, WalletTypeIdentifier walletTypeIdentifier, UserBookingsStatusType userBookingsStatusType, boolean z) {
        super(3, continuation);
        this.this$0 = getAllQuickPaysUseCase;
        this.$walletTypeIdentifier$inlined = walletTypeIdentifier;
        this.$statusTypeToInclude$inlined = userBookingsStatusType;
        this.$onlyIfWalletActive$inlined = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetAllQuickPaysUseCase$invoke$$inlined$flatMapLatest$1 getAllQuickPaysUseCase$invoke$$inlined$flatMapLatest$1 = new GetAllQuickPaysUseCase$invoke$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$walletTypeIdentifier$inlined, this.$statusTypeToInclude$inlined, this.$onlyIfWalletActive$inlined);
        getAllQuickPaysUseCase$invoke$$inlined$flatMapLatest$1.L$0 = (FlowCollector) obj;
        getAllQuickPaysUseCase$invoke$$inlined$flatMapLatest$1.L$1 = obj2;
        return getAllQuickPaysUseCase$invoke$$inlined$flatMapLatest$1.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Flow flowZ;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            final WalletAppModel walletAppModel = (WalletAppModel) this.L$1;
            if (walletAppModel == null) {
                flowZ = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(EmptyList.f17557a);
            } else {
                final GetAllQuickPaysUseCase getAllQuickPaysUseCase = this.this$0;
                final WalletTypeIdentifier walletTypeIdentifier = this.$walletTypeIdentifier$inlined;
                final UserBookingsStatusType userBookingsStatusType = this.$statusTypeToInclude$inlined;
                final boolean z = this.$onlyIfWalletActive$inlined;
                final QuickPayRepositoryImpl$getAllQuickPaysAsFlow$$inlined$map$1 quickPayRepositoryImpl$getAllQuickPaysAsFlow$$inlined$map$1A = getAllQuickPaysUseCase.f10938a.a();
                flowZ = FlowKt.z(new Flow<List<? extends QuickPayAppModel>>() { // from class: app.chalo.walletframework.quickpay.domain.GetAllQuickPaysUseCase$quickPaysForWallet$$inlined$map$1

                    /* JADX INFO: renamed from: app.chalo.walletframework.quickpay.domain.GetAllQuickPaysUseCase$quickPaysForWallet$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ FlowCollector f10941a;
                        public final /* synthetic */ boolean b;
                        public final /* synthetic */ GetAllQuickPaysUseCase c;
                        public final /* synthetic */ WalletTypeIdentifier d;
                        public final /* synthetic */ UserBookingsStatusType e;
                        public final /* synthetic */ WalletAppModel f;

                        /* JADX INFO: renamed from: app.chalo.walletframework.quickpay.domain.GetAllQuickPaysUseCase$quickPaysForWallet$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "app.chalo.walletframework.quickpay.domain.GetAllQuickPaysUseCase$quickPaysForWallet$$inlined$map$1$2", f = "GetAllQuickPaysUseCase.kt", l = {55, 63, 67, 50}, m = "emit", v = 1)
                        public final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            Object L$4;
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

                        public AnonymousClass2(FlowCollector flowCollector, boolean z, GetAllQuickPaysUseCase getAllQuickPaysUseCase, WalletTypeIdentifier walletTypeIdentifier, UserBookingsStatusType userBookingsStatusType, WalletAppModel walletAppModel) {
                            this.f10941a = flowCollector;
                            this.b = z;
                            this.c = getAllQuickPaysUseCase;
                            this.d = walletTypeIdentifier;
                            this.e = userBookingsStatusType;
                            this.f = walletAppModel;
                        }

                        /* JADX WARN: Code duplicated, block: B:38:0x00d6 A[DONT_INVERT] */
                        /* JADX WARN: Code duplicated, block: B:39:0x00d8 A[DONT_INVERT] */
                        /* JADX WARN: Code duplicated, block: B:40:0x00da  */
                        /* JADX WARN: Code duplicated, block: B:43:0x00ee  */
                        /* JADX WARN: Code duplicated, block: B:49:0x011b  */
                        /* JADX WARN: Code duplicated, block: B:51:0x0120  */
                        /* JADX WARN: Code duplicated, block: B:53:0x0126  */
                        /* JADX WARN: Code duplicated, block: B:56:0x013a  */
                        /* JADX WARN: Code duplicated, block: B:62:0x0166  */
                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        /* JADX WARN: Code restructure failed: missing block: B:44:0x0107, code lost:
                        
                            if (r15 == r1) goto L65;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:57:0x0153, code lost:
                        
                            if (r15 == r1) goto L65;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:64:0x017a, code lost:
                        
                            if (r2.emit(r15, r0) == r1) goto L65;
                         */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0107 -> B:46:0x010b). Please report as a decompilation issue!!! */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0153 -> B:59:0x0156). Please report as a decompilation issue!!! */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r14, kotlin.coroutines.Continuation r15) {
                            /*
                                Method dump skipped, instruction units count: 384
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.quickpay.domain.GetAllQuickPaysUseCase$quickPaysForWallet$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector2, Continuation continuation) {
                        Object objCollect = quickPayRepositoryImpl$getAllQuickPaysAsFlow$$inlined$map$1A.collect(new AnonymousClass2(flowCollector2, z, getAllQuickPaysUseCase, walletTypeIdentifier, userBookingsStatusType, walletAppModel), continuation);
                        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                    }
                }, getAllQuickPaysUseCase.d.getDefault());
            }
            this.label = 1;
            if (FlowKt.r(flowCollector, flowZ, this) == coroutineSingletons) {
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
