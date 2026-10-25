package app.chalo.ncmc.ui.landing;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.Source;
import app.chalo.models.ChaloCardOptions;
import app.chalo.ncmc.domain.GetAvailableChaloCardOptionsUseCase;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ncmc.ui.landing.ChaloCardInfoComponent$handleBuyNewClickedIntent$1", f = "ChaloCardInfoComponent.kt", l = {569, 574}, m = "invokeSuspend", v = 1)
final class ChaloCardInfoComponent$handleBuyNewClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ChaloCardInfoComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloCardInfoComponent$handleBuyNewClickedIntent$1(ChaloCardInfoComponent chaloCardInfoComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloCardInfoComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloCardInfoComponent$handleBuyNewClickedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloCardInfoComponent$handleBuyNewClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        ChaloNavigationManager chaloNavigationManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.b(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                chaloNavigationManager = (ChaloNavigationManager) this.L$1;
                str = (String) this.L$0;
                ResultKt.b(obj);
            }
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new WebViewArgs(str, (String) obj, false, false), null, null, 6));
            return Unit.f17538a;
        }
        ResultKt.b(obj);
        ChaloCardInfoComponent chaloCardInfoComponent = this.this$0;
        AnalyticsContractImplKt.b(chaloCardInfoComponent.q, "chalo card buy new card btn clicked", Source.CHALO_CARD_INFO_SCREEN, ChaloCardInfoContractKt.a((ChaloCardInfoViewState) chaloCardInfoComponent.f.getValue(), null), false, 24);
        ChaloCardInfoComponent chaloCardInfoComponent2 = this.this$0;
        chaloCardInfoComponent2.I = true;
        GetAvailableChaloCardOptionsUseCase getAvailableChaloCardOptionsUseCase = chaloCardInfoComponent2.r;
        this.label = 1;
        obj = getAvailableChaloCardOptionsUseCase.a(this);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
        ChaloCardOptions chaloCardOptions = (ChaloCardOptions) obj;
        if (chaloCardOptions != null && (str = chaloCardOptions.b) != null) {
            ChaloCardInfoComponent chaloCardInfoComponent3 = this.this$0;
            ChaloNavigationManager chaloNavigationManager2 = chaloCardInfoComponent3.D;
            this.L$0 = str;
            this.L$1 = chaloNavigationManager2;
            this.label = 2;
            obj = chaloCardInfoComponent3.y.b(StringEnum.BUY_CARD, new Object[0], this);
            if (obj != coroutineSingletons) {
                chaloNavigationManager = chaloNavigationManager2;
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new WebViewArgs(str, (String) obj, false, false), null, null, 6));
            }
            return coroutineSingletons;
        }
        return Unit.f17538a;
    }
}
