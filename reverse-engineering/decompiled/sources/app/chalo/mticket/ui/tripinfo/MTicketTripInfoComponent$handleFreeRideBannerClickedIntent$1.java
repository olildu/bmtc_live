package app.chalo.mticket.ui.tripinfo;

import app.chalo.mticket.domain.FreeRideHelpUrlUseCase;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.mticket.ui.tripinfo.MTicketTripInfoComponent$handleFreeRideBannerClickedIntent$1", f = "MTicketTripInfoComponent.kt", l = {369, 370}, m = "invokeSuspend", v = 1)
final class MTicketTripInfoComponent$handleFreeRideBannerClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MTicketTripInfoComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTicketTripInfoComponent$handleFreeRideBannerClickedIntent$1(MTicketTripInfoComponent mTicketTripInfoComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mTicketTripInfoComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MTicketTripInfoComponent$handleFreeRideBannerClickedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MTicketTripInfoComponent$handleFreeRideBannerClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChaloNavigationManager chaloNavigationManager;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            MTicketTripInfoComponent mTicketTripInfoComponent = this.this$0;
            chaloNavigationManager = mTicketTripInfoComponent.r;
            FreeRideHelpUrlUseCase freeRideHelpUrlUseCase = mTicketTripInfoComponent.t;
            this.L$0 = chaloNavigationManager;
            this.label = 1;
            obj = freeRideHelpUrlUseCase.a(this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
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
        ChaloNavigationManagerKt.e(chaloNavigationManager, new WebViewArgs(str, (String) obj, false, false), null, 6);
        return Unit.f17538a;
        String str2 = (String) obj;
        this.L$0 = chaloNavigationManager;
        this.L$1 = str2;
        this.label = 2;
        Object objB = this.this$0.p.b(StringEnum.FREE_BUS_RIDE_WEBVIEW_TITLE, new Object[0], this);
        if (objB != coroutineSingletons) {
            str = str2;
            obj = objB;
            ChaloNavigationManagerKt.e(chaloNavigationManager, new WebViewArgs(str, (String) obj, false, false), null, 6);
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }
}
