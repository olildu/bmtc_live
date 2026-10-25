package app.chalo.home.ui.home;

import app.chalo.constants.Source;
import app.chalo.data.BookingsRequestType;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.domain.GetLatestPremiumReserveTicketFromFirstBookingIdUseCase;
import app.chalo.premiumbus.prebookedtickets.ui.cancellationack.PremiumBusInAppCommunicationBottomSheetData;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.PremiumBusActivationArgs;
import app.chalo.scenes.args.TripSummaryArgs;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/premiumbus/prebookedtickets/ui/cancellationack/PremiumBusInAppCommunicationBottomSheetData$SystemReschedule;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.home.HomeScreenComponent$handlePremiumBusAckBottomSheetCtaClick$clickForSystemReschedule$1", f = "HomeScreenComponent.kt", l = {1008}, m = "invokeSuspend", v = 1)
final class HomeScreenComponent$handlePremiumBusAckBottomSheetCtaClick$clickForSystemReschedule$1 extends SuspendLambda implements Function2<PremiumBusInAppCommunicationBottomSheetData.SystemReschedule, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusInAppCommunicationBottomSheetData $data;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HomeScreenComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3537a;

        static {
            int[] iArr = new int[PremiumReserveTicketStatus.values().length];
            try {
                iArr[PremiumReserveTicketStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f3537a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenComponent$handlePremiumBusAckBottomSheetCtaClick$clickForSystemReschedule$1(HomeScreenComponent homeScreenComponent, PremiumBusInAppCommunicationBottomSheetData premiumBusInAppCommunicationBottomSheetData, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeScreenComponent;
        this.$data = premiumBusInAppCommunicationBottomSheetData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HomeScreenComponent$handlePremiumBusAckBottomSheetCtaClick$clickForSystemReschedule$1 homeScreenComponent$handlePremiumBusAckBottomSheetCtaClick$clickForSystemReschedule$1 = new HomeScreenComponent$handlePremiumBusAckBottomSheetCtaClick$clickForSystemReschedule$1(this.this$0, this.$data, continuation);
        homeScreenComponent$handlePremiumBusAckBottomSheetCtaClick$clickForSystemReschedule$1.L$0 = obj;
        return homeScreenComponent$handlePremiumBusAckBottomSheetCtaClick$clickForSystemReschedule$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeScreenComponent$handlePremiumBusAckBottomSheetCtaClick$clickForSystemReschedule$1) create((PremiumBusInAppCommunicationBottomSheetData.SystemReschedule) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PremiumBusInAppCommunicationBottomSheetData.SystemReschedule systemReschedule = (PremiumBusInAppCommunicationBottomSheetData.SystemReschedule) this.L$0;
            GetLatestPremiumReserveTicketFromFirstBookingIdUseCase getLatestPremiumReserveTicketFromFirstBookingIdUseCase = this.this$0.s;
            String str = systemReschedule.e;
            this.label = 1;
            obj = getLatestPremiumReserveTicketFromFirstBookingIdUseCase.a(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        PremiumReserveTicketAppModel premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) obj;
        PremiumReserveTicketStatus premiumReserveTicketStatus = premiumReserveTicketAppModel != null ? premiumReserveTicketAppModel.f7113a.h : null;
        if ((premiumReserveTicketStatus == null ? -1 : WhenMappings.f3537a[premiumReserveTicketStatus.ordinal()]) == 1) {
            ChaloNavigationManager chaloNavigationManager = this.this$0.G;
            PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel = premiumReserveTicketAppModel.f7113a;
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new PremiumBusActivationArgs(Source.HOME_SCREEN_TAB, premiumReserveTicketBookingPropertiesAppModel.f7114a, premiumReserveTicketBookingPropertiesAppModel.d, premiumReserveTicketBookingPropertiesAppModel.e, false), null, null, 6));
        } else {
            this.this$0.G.b(new ChaloNavigationRequest.Navigate(new TripSummaryArgs.TicketSummaryScreen(Source.HOME_SCREEN_TAB, new BookingsRequestType.PremiumBusTicketType(premiumReserveTicketAppModel != null ? premiumReserveTicketAppModel.f7113a.f7114a : this.$data.getF7358a())), null, null, 6));
        }
        return Unit.f17538a;
    }
}
