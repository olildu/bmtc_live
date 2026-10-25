package app.chalo.home.ui.home;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.constants.Source;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketTripPropertiesAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketAckType;
import app.chalo.premiumbus.prebookedtickets.domain.AcknowledgePremiumReserveTicketCancellationUseCase;
import app.chalo.premiumbus.prebookedtickets.ui.cancellationack.PremiumBusInAppCommunicationBottomSheetData;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.PremiumBusArgs;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.home.HomeScreenComponent$handlePremiumBusAckBottomSheetPositiveCtaClickedIntent$1", f = "HomeScreenComponent.kt", l = {900, TypedValues.Custom.TYPE_REFERENCE}, m = "invokeSuspend", v = 1)
final class HomeScreenComponent$handlePremiumBusAckBottomSheetPositiveCtaClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HomeScreenViewIntent.PremiumBusAckBottomSheetPositiveCtaClickedIntent $intent;
    int label;
    final /* synthetic */ HomeScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenComponent$handlePremiumBusAckBottomSheetPositiveCtaClickedIntent$1(HomeScreenComponent homeScreenComponent, HomeScreenViewIntent.PremiumBusAckBottomSheetPositiveCtaClickedIntent premiumBusAckBottomSheetPositiveCtaClickedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeScreenComponent;
        this.$intent = premiumBusAckBottomSheetPositiveCtaClickedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeScreenComponent$handlePremiumBusAckBottomSheetPositiveCtaClickedIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeScreenComponent$handlePremiumBusAckBottomSheetPositiveCtaClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objInvoke;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            HomeScreenComponent homeScreenComponent = this.this$0;
            PremiumBusInAppCommunicationBottomSheetData premiumBusInAppCommunicationBottomSheetData = this.$intent.f3570a;
            this.label = 1;
            homeScreenComponent.getClass();
            HomeScreenComponent$handlePremiumBusAckBottomSheetCtaClick$clickForSystemReschedule$1 homeScreenComponent$handlePremiumBusAckBottomSheetCtaClick$clickForSystemReschedule$1 = new HomeScreenComponent$handlePremiumBusAckBottomSheetCtaClick$clickForSystemReschedule$1(homeScreenComponent, premiumBusInAppCommunicationBottomSheetData, null);
            if (!(premiumBusInAppCommunicationBottomSheetData instanceof PremiumBusInAppCommunicationBottomSheetData.SystemCancellation)) {
                if (!(premiumBusInAppCommunicationBottomSheetData instanceof PremiumBusInAppCommunicationBottomSheetData.SystemReschedule)) {
                    throw new NoWhenBranchMatchedException();
                }
                objInvoke = homeScreenComponent$handlePremiumBusAckBottomSheetCtaClick$clickForSystemReschedule$1.invoke(premiumBusInAppCommunicationBottomSheetData, this);
                if (objInvoke != coroutineSingletons) {
                }
                if (objInvoke != coroutineSingletons) {
                }
            }
            PBOriginDestinationAppModel.Companion companion = PBOriginDestinationAppModel.INSTANCE;
            PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel = ((PremiumBusInAppCommunicationBottomSheetData.SystemCancellation) premiumBusInAppCommunicationBottomSheetData).e;
            companion.getClass();
            PremiumBusProductPurchaseFlowType.RePurchaseTicket rePurchaseTicket = new PremiumBusProductPurchaseFlowType.RePurchaseTicket(PBOriginDestinationAppModel.Companion.a(premiumReserveTicketTripPropertiesAppModel), premiumReserveTicketTripPropertiesAppModel.b);
            ChaloNavigationManager chaloNavigationManager = homeScreenComponent.G;
            Source source = Source.HOME_SCREEN_MAIN_FRAGMENT;
            Json json = ChaloJson.b;
            json.getClass();
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new PremiumBusArgs.SlotSelectionArgs(source, json.a(PremiumBusProductPurchaseFlowType.INSTANCE.serializer(), rePurchaseTicket), null), null, null, 6));
            objInvoke = unit;
            if (objInvoke != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        PremiumBusInAppCommunicationBottomSheetData premiumBusInAppCommunicationBottomSheetData2 = this.$intent.f3570a;
        PremiumReserveTicketAckType premiumReserveTicketAckType = premiumBusInAppCommunicationBottomSheetData2 instanceof PremiumBusInAppCommunicationBottomSheetData.SystemCancellation ? PremiumReserveTicketAckType.SYSTEM_CANCELLED : PremiumReserveTicketAckType.SYSTEM_RESCHEDULED;
        AcknowledgePremiumReserveTicketCancellationUseCase acknowledgePremiumReserveTicketCancellationUseCase = this.this$0.x;
        String f7358a = premiumBusInAppCommunicationBottomSheetData2.getF7358a();
        this.label = 2;
        return acknowledgePremiumReserveTicketCancellationUseCase.a(f7358a, premiumReserveTicketAckType, this) == coroutineSingletons ? coroutineSingletons : unit;
    }
}
