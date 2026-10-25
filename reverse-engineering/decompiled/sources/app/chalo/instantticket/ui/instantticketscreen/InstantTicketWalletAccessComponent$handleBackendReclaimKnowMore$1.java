package app.chalo.instantticket.ui.instantticketscreen;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.WebViewArgs;
import app.chalo.walletframework.wallet.domain.PostDeviceIdForWalletMigrationUseCase;
import defpackage.hq0;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessComponent$handleBackendReclaimKnowMore$1", f = "InstantTicketWalletAccessComponent.kt", l = {350, 360, 361, 375}, m = "invokeSuspend", v = 1)
final class InstantTicketWalletAccessComponent$handleBackendReclaimKnowMore$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InstantTicketWalletAccessComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantTicketWalletAccessComponent$handleBackendReclaimKnowMore$1(InstantTicketWalletAccessComponent instantTicketWalletAccessComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = instantTicketWalletAccessComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstantTicketWalletAccessComponent$handleBackendReclaimKnowMore$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstantTicketWalletAccessComponent$handleBackendReclaimKnowMore$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KotlinToastManager kotlinToastManager;
        ChaloNavigationManager chaloNavigationManager;
        String str;
        Object objB;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PostDeviceIdForWalletMigrationUseCase postDeviceIdForWalletMigrationUseCase = this.this$0.o;
            this.label = 1;
            obj = postDeviceIdForWalletMigrationUseCase.a(this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                chaloNavigationManager = (ChaloNavigationManager) this.L$0;
                ResultKt.b(obj);
                str = (String) obj;
                this.L$0 = chaloNavigationManager;
                this.L$1 = str;
                this.label = 3;
                objB = this.this$0.v.b(StringEnum.WALLET, new Object[0], this);
                if (objB != coroutineSingletons) {
                    str2 = str;
                    obj = objB;
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlinToastManager = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                hq0.s(kotlinToastManager, (String) obj);
                return Unit.f17538a;
            }
            str2 = (String) this.L$1;
            chaloNavigationManager = (ChaloNavigationManager) this.L$0;
            ResultKt.b(obj);
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new WebViewArgs(str2, (String) obj, false, false), null, null, 6));
            return Unit.f17538a;
        }
        ResultKt.b(obj);
        if (((Boolean) obj).booleanValue()) {
            AnalyticsContract.DefaultImpls.a(this.this$0.n, "post device id for wallet migration", "new pay for ticket bottom sheet", MapsKt.h(new Pair("isSuccessful", Boolean.TRUE)), null, false, 24);
            this.this$0.r0(InstantTicketWalletAccessSideEffect.CloseBottomSheet.f3957a);
            InstantTicketWalletAccessComponent instantTicketWalletAccessComponent = this.this$0;
            chaloNavigationManager = instantTicketWalletAccessComponent.A;
            this.L$0 = chaloNavigationManager;
            this.label = 2;
            obj = InstantTicketWalletAccessComponent.F0(instantTicketWalletAccessComponent, this);
            if (obj != coroutineSingletons) {
                str = (String) obj;
                this.L$0 = chaloNavigationManager;
                this.L$1 = str;
                this.label = 3;
                objB = this.this$0.v.b(StringEnum.WALLET, new Object[0], this);
                if (objB != coroutineSingletons) {
                    str2 = str;
                    obj = objB;
                    chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new WebViewArgs(str2, (String) obj, false, false), null, null, 6));
                    return Unit.f17538a;
                }
            }
        } else {
            AnalyticsContract.DefaultImpls.a(this.this$0.n, "post device id for wallet migration", "new pay for ticket bottom sheet", MapsKt.h(new Pair("isSuccessful", Boolean.FALSE)), null, false, 24);
            InstantTicketWalletAccessComponent instantTicketWalletAccessComponent2 = this.this$0;
            KotlinToastManager kotlinToastManager2 = instantTicketWalletAccessComponent2.B;
            this.L$0 = kotlinToastManager2;
            this.label = 4;
            obj = instantTicketWalletAccessComponent2.v.b(StringEnum.TOAST_GENERIC_ERROR_MESSAGE, new Object[0], this);
            if (obj != coroutineSingletons) {
                kotlinToastManager = kotlinToastManager2;
                hq0.s(kotlinToastManager, (String) obj);
                return Unit.f17538a;
            }
        }
        return coroutineSingletons;
    }
}
