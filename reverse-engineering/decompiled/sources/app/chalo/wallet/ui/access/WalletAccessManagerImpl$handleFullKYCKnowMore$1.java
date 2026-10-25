package app.chalo.wallet.ui.access;

import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.WebViewArgs;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.wallet.ui.access.WalletAccessManagerImpl$handleFullKYCKnowMore$1", f = "WalletAccessManagerImpl.kt", l = {665, 666}, m = "invokeSuspend", v = 1)
final class WalletAccessManagerImpl$handleFullKYCKnowMore$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ WalletAccessManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAccessManagerImpl$handleFullKYCKnowMore$1(WalletAccessManagerImpl walletAccessManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = walletAccessManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalletAccessManagerImpl$handleFullKYCKnowMore$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WalletAccessManagerImpl$handleFullKYCKnowMore$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        ChaloNavigationManager chaloNavigationManager;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                chaloNavigationManager = (ChaloNavigationManager) this.L$0;
                ResultKt.b(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$1;
                chaloNavigationManager = (ChaloNavigationManager) this.L$0;
                ResultKt.b(obj);
            }
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new WebViewArgs(str, (String) obj, false, false), null, null, 6));
            return Unit.f17538a;
        }
        ResultKt.b(obj);
        this.this$0.f(WalletAccessSideEffect.CloseBottomSheet.f10808a);
        MutableStateFlow mutableStateFlow = this.this$0.r;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, WalletAccessState.a((WalletAccessState) value, null, null, false, false, null, null, 8063)));
        WalletAccessManagerImpl walletAccessManagerImpl = this.this$0;
        chaloNavigationManager = walletAccessManagerImpl.i;
        ChaloConfigFeature chaloConfigFeature = walletAccessManagerImpl.j;
        this.L$0 = chaloNavigationManager;
        this.label = 1;
        obj = chaloConfigFeature.a("fullKycSolutionCentersURL", this);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
        String str2 = (String) obj;
        this.L$0 = chaloNavigationManager;
        this.L$1 = str2;
        this.label = 2;
        Object objB = this.this$0.h.b(StringEnum.APP_NAME, new Object[0], this);
        if (objB != coroutineSingletons) {
            str = str2;
            obj = objB;
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new WebViewArgs(str, (String) obj, false, false), null, null, 6));
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }
}
