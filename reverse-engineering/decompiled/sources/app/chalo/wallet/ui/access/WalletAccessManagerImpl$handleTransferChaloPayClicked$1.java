package app.chalo.wallet.ui.access;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.domain.WalletAutoReclaimUseCase;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.wallet.ui.access.WalletAccessManagerImpl$handleTransferChaloPayClicked$1", f = "WalletAccessManagerImpl.kt", l = {199, 222}, m = "invokeSuspend", v = 1)
final class WalletAccessManagerImpl$handleTransferChaloPayClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WalletTypeIdentifier $walletTypeIdentifier;
    Object L$0;
    int label;
    final /* synthetic */ WalletAccessManagerImpl this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10804a;

        static {
            int[] iArr = new int[WalletAutoReclaimUseCase.WalletAutoReclaimFailureReason.values().length];
            try {
                iArr[WalletAutoReclaimUseCase.WalletAutoReclaimFailureReason.USER_NOT_LOGGED_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletAutoReclaimUseCase.WalletAutoReclaimFailureReason.USER_ID_MISMATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletAutoReclaimUseCase.WalletAutoReclaimFailureReason.SERVER_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletAutoReclaimUseCase.WalletAutoReclaimFailureReason.LOCAL_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletAutoReclaimUseCase.WalletAutoReclaimFailureReason.PARSE_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WalletAutoReclaimUseCase.WalletAutoReclaimFailureReason.WALLET_NOT_CACHED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[WalletAutoReclaimUseCase.WalletAutoReclaimFailureReason.AUTO_RECLAIM_REQUEST_EXCEEDED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f10804a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAccessManagerImpl$handleTransferChaloPayClicked$1(WalletAccessManagerImpl walletAccessManagerImpl, WalletTypeIdentifier walletTypeIdentifier, Continuation continuation) {
        super(2, continuation);
        this.this$0 = walletAccessManagerImpl;
        this.$walletTypeIdentifier = walletTypeIdentifier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalletAccessManagerImpl$handleTransferChaloPayClicked$1(this.this$0, this.$walletTypeIdentifier, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WalletAccessManagerImpl$handleTransferChaloPayClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        WalletAccessState it;
        Object value2;
        Object objB;
        KotlinToastManager kotlinToastManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            WalletAutoReclaimUseCase walletAutoReclaimUseCase = this.this$0.n;
            WalletTypeIdentifier walletTypeIdentifier = this.$walletTypeIdentifier;
            this.label = 1;
            objA = walletAutoReclaimUseCase.a(walletTypeIdentifier, this);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
            objA = obj;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
            objB = obj;
        }
        KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
        this.this$0.g();
        return Unit.f17538a;
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            WalletAutoReclaimUseCase.WalletAutoReclaimFailureReason walletAutoReclaimFailureReason = (WalletAutoReclaimUseCase.WalletAutoReclaimFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
            switch (WhenMappings.f10804a[walletAutoReclaimFailureReason.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    WalletAccessManagerImpl walletAccessManagerImpl = this.this$0;
                    AnalyticsContract.DefaultImpls.a(walletAccessManagerImpl.f, "auto reclaim for wallet migration", walletAccessManagerImpl.w, MapsKt.i(new Pair("isSuccessful", Boolean.FALSE), new Pair("error name", walletAutoReclaimFailureReason.name())), null, false, 24);
                    MutableStateFlow mutableStateFlow = this.this$0.r;
                    do {
                        value2 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.c(value2, WalletAccessState.a((WalletAccessState) value2, null, null, false, false, null, null, 8127)));
                    WalletAccessManagerImpl walletAccessManagerImpl2 = this.this$0;
                    KotlinToastManager kotlinToastManager2 = walletAccessManagerImpl2.m;
                    this.L$0 = kotlinToastManager2;
                    this.label = 2;
                    objB = walletAccessManagerImpl2.h.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                    if (objB != coroutineSingletons) {
                        kotlinToastManager = kotlinToastManager2;
                        KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
                        this.this$0.g();
                        break;
                    }
                    return coroutineSingletons;
                case 7:
                    WalletAccessManagerImpl walletAccessManagerImpl3 = this.this$0;
                    AnalyticsContract.DefaultImpls.a(walletAccessManagerImpl3.f, "auto reclaim for wallet migration", walletAccessManagerImpl3.w, MapsKt.i(new Pair("isSuccessful", Boolean.FALSE), new Pair("error name", walletAutoReclaimFailureReason.name())), null, false, 24);
                    WalletAccessManagerImpl walletAccessManagerImpl4 = this.this$0;
                    BuildersKt.d(walletAccessManagerImpl4.f10802a, null, null, new WalletAccessManagerImpl$proceedToBackendReclaimRequest$1(walletAccessManagerImpl4, null), 3);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            WalletAccessManagerImpl walletAccessManagerImpl5 = this.this$0;
            AnalyticsContract.DefaultImpls.a(walletAccessManagerImpl5.f, "auto reclaim for wallet migration", walletAccessManagerImpl5.w, MapsKt.h(new Pair("isSuccessful", Boolean.TRUE)), null, false, 24);
            WalletAccessManagerImpl walletAccessManagerImpl6 = this.this$0;
            MutableStateFlow mutableStateFlow2 = walletAccessManagerImpl6.r;
            do {
                value = mutableStateFlow2.getValue();
                it = (WalletAccessState) value;
                Intrinsics.i(it, "it");
            } while (!mutableStateFlow2.c(value, WalletAccessState.a(it, null, null, false, true, null, null, 8127)));
            WalletTypeIdentifier walletTypeIdentifier2 = ((WalletAccessState) walletAccessManagerImpl6.t.getValue()).b;
            if (walletTypeIdentifier2 != null) {
                BuildersKt.d(walletAccessManagerImpl6.f10802a, null, null, new WalletAccessManagerImpl$syncWalletAndFetchReclaimTime$2(walletAccessManagerImpl6, walletTypeIdentifier2, null), 3);
            }
        }
        return Unit.f17538a;
    }
}
