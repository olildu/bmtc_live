package app.chalo.wallet.ui.access;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.WebViewArgs;
import app.chalo.walletframework.wallet.domain.PostDeviceIdForWalletMigrationUseCase;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
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
@DebugMetadata(c = "app.chalo.wallet.ui.access.WalletAccessManagerImpl$handleBackendReclaimKnowMore$1", f = "WalletAccessManagerImpl.kt", l = {617, 628, 629, 641}, m = "invokeSuspend", v = 1)
final class WalletAccessManagerImpl$handleBackendReclaimKnowMore$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ WalletAccessManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAccessManagerImpl$handleBackendReclaimKnowMore$1(WalletAccessManagerImpl walletAccessManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = walletAccessManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalletAccessManagerImpl$handleBackendReclaimKnowMore$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WalletAccessManagerImpl$handleBackendReclaimKnowMore$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objB;
        KotlinToastManager kotlinToastManager;
        Object value;
        ChaloNavigationManager chaloNavigationManager;
        Object objE;
        String str;
        Object objB2;
        String str2;
        ChaloNavigationManager chaloNavigationManager2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PostDeviceIdForWalletMigrationUseCase postDeviceIdForWalletMigrationUseCase = this.this$0.g;
            this.label = 1;
            objA = postDeviceIdForWalletMigrationUseCase.a(this);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                ChaloNavigationManager chaloNavigationManager3 = (ChaloNavigationManager) this.L$0;
                ResultKt.b(obj);
                chaloNavigationManager = chaloNavigationManager3;
                objE = obj;
                str = (String) objE;
                this.L$0 = chaloNavigationManager;
                this.L$1 = str;
                this.label = 3;
                objB2 = this.this$0.h.b(StringEnum.APP_NAME, new Object[0], this);
                if (objB2 != coroutineSingletons) {
                    str2 = str;
                    chaloNavigationManager2 = chaloNavigationManager;
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlinToastManager = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                objB = obj;
                KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
                return Unit.f17538a;
            }
            str2 = (String) this.L$1;
            chaloNavigationManager2 = (ChaloNavigationManager) this.L$0;
            ResultKt.b(obj);
            objB2 = obj;
            chaloNavigationManager2.b(new ChaloNavigationRequest.Navigate(new WebViewArgs(str2, (String) objB2, false, false), null, null, 6));
            return Unit.f17538a;
        }
        ResultKt.b(obj);
        objA = obj;
        if (((Boolean) objA).booleanValue()) {
            WalletAccessManagerImpl walletAccessManagerImpl = this.this$0;
            AnalyticsContract.DefaultImpls.a(walletAccessManagerImpl.f, "post device id for wallet migration", walletAccessManagerImpl.w, MapsKt.h(new Pair("isSuccessful", Boolean.TRUE)), null, false, 24);
            this.this$0.f(WalletAccessSideEffect.CloseBottomSheet.f10808a);
            MutableStateFlow mutableStateFlow = this.this$0.r;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.c(value, WalletAccessState.a((WalletAccessState) value, null, null, false, false, null, null, 8063)));
            WalletAccessManagerImpl walletAccessManagerImpl2 = this.this$0;
            chaloNavigationManager = walletAccessManagerImpl2.i;
            this.L$0 = chaloNavigationManager;
            this.label = 2;
            objE = WalletAccessManagerImpl.e(walletAccessManagerImpl2, this);
            if (objE != coroutineSingletons) {
                str = (String) objE;
                this.L$0 = chaloNavigationManager;
                this.L$1 = str;
                this.label = 3;
                objB2 = this.this$0.h.b(StringEnum.APP_NAME, new Object[0], this);
                if (objB2 != coroutineSingletons) {
                    str2 = str;
                    chaloNavigationManager2 = chaloNavigationManager;
                    chaloNavigationManager2.b(new ChaloNavigationRequest.Navigate(new WebViewArgs(str2, (String) objB2, false, false), null, null, 6));
                    return Unit.f17538a;
                }
            }
        } else {
            WalletAccessManagerImpl walletAccessManagerImpl3 = this.this$0;
            AnalyticsContract.DefaultImpls.a(walletAccessManagerImpl3.f, "post device id for wallet migration", walletAccessManagerImpl3.w, MapsKt.h(new Pair("isSuccessful", Boolean.FALSE)), null, false, 24);
            WalletAccessManagerImpl walletAccessManagerImpl4 = this.this$0;
            KotlinToastManager kotlinToastManager2 = walletAccessManagerImpl4.m;
            this.L$0 = kotlinToastManager2;
            this.label = 4;
            objB = walletAccessManagerImpl4.h.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
            if (objB != coroutineSingletons) {
                kotlinToastManager = kotlinToastManager2;
                KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
                return Unit.f17538a;
            }
        }
        return coroutineSingletons;
    }
}
