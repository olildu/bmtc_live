package app.chalo.home.ui.home;

import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketAckType;
import app.chalo.premiumbus.prebookedtickets.domain.AcknowledgePremiumReserveTicketCancellationUseCase;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.home.HomeScreenComponent$handlePremiumBusAckBottomSheetNegativeCtaClickedIntent$1", f = "HomeScreenComponent.kt", l = {880}, m = "invokeSuspend", v = 1)
final class HomeScreenComponent$handlePremiumBusAckBottomSheetNegativeCtaClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumReserveTicketAckType $ackType;
    final /* synthetic */ HomeScreenViewIntent.PremiumBusAckBottomSheetNegativeCtaClickedIntent $intent;
    int label;
    final /* synthetic */ HomeScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenComponent$handlePremiumBusAckBottomSheetNegativeCtaClickedIntent$1(HomeScreenComponent homeScreenComponent, HomeScreenViewIntent.PremiumBusAckBottomSheetNegativeCtaClickedIntent premiumBusAckBottomSheetNegativeCtaClickedIntent, PremiumReserveTicketAckType premiumReserveTicketAckType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeScreenComponent;
        this.$intent = premiumBusAckBottomSheetNegativeCtaClickedIntent;
        this.$ackType = premiumReserveTicketAckType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeScreenComponent$handlePremiumBusAckBottomSheetNegativeCtaClickedIntent$1(this.this$0, this.$intent, this.$ackType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeScreenComponent$handlePremiumBusAckBottomSheetNegativeCtaClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            AcknowledgePremiumReserveTicketCancellationUseCase acknowledgePremiumReserveTicketCancellationUseCase = this.this$0.x;
            String f7358a = this.$intent.f3569a.getF7358a();
            PremiumReserveTicketAckType premiumReserveTicketAckType = this.$ackType;
            this.label = 1;
            if (acknowledgePremiumReserveTicketCancellationUseCase.a(f7358a, premiumReserveTicketAckType, this) == coroutineSingletons) {
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
