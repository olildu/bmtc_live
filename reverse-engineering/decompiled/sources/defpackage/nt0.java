package defpackage;

import app.chalo.constants.Source;
import app.chalo.data.PassSavingFaqs$$serializer;
import app.chalo.data.PremiumBusNativeCityWiseConfigAppModel;
import app.chalo.data.PremiumBusNativeCityWiseConfigAppModel$$serializer;
import app.chalo.data.PremiumBusNativeConfigAppModel;
import app.chalo.data.PremiumReserveTicketOptionAction;
import app.chalo.home.data.model.api.response.PremiumBusContentConfigApiResponseModel;
import app.chalo.home.data.model.api.response.PremiumBusTutorialConfigApiResponseModel$$serializer;
import app.chalo.home.data.model.app.response.PremiumBusContentConfigAppResponseModel;
import app.chalo.home.data.model.app.response.PremiumBusTutorialConfigAppResponseModel$$serializer;
import app.chalo.models.SuperPassSubTypes;
import app.chalo.premiumbus.PremiumBusJourneyEntry;
import app.chalo.premiumbus.PremiumBusJourneyEntry$NavigateToPassPurchaseLandingScreen$$serializer;
import app.chalo.premiumbus.PremiumBusJourneyEntry$NavigateToProductSelectionScreen$$serializer;
import app.chalo.premiumbus.PremiumBusJourneyEntry$NavigateToSeatSelectionScreen$$serializer;
import app.chalo.premiumbus.PremiumBusJourneyEntry$NavigateToSlotSelectionScreen$$serializer;
import app.chalo.premiumbus.PremiumBusJourneyEntry$NavigateToStopDetailsScreen$$serializer;
import app.chalo.premiumbus.PremiumBusJourneyEntry$NavigateToStopSelectionScreen$$serializer;
import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType;
import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType$FreshPurchase$$serializer;
import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType$RePurchaseTicket$$serializer;
import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType$RescheduleTicket$$serializer;
import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType$TicketPurchaseThroughPass$$serializer;
import app.chalo.premiumbus.data.PremiumBusSlotListScreenData;
import app.chalo.premiumbus.data.models.api.request.PremiumBusSeatSelectionLayoutForBulkBookingRequestApiModel;
import app.chalo.premiumbus.data.models.api.request.PremiumBusSeatSelectionLayoutRequestApiModel;
import app.chalo.premiumbus.data.models.api.response.PremiumBusSeatSelectionLayoutResponseApiModel;
import app.chalo.premiumbus.data.models.api.response.SeatInfoApiModel$$serializer;
import app.chalo.premiumbus.data.models.app.PremiumBusSelectedLocationType;
import app.chalo.premiumbus.data.models.app.PremiumBusUpsellRideOutcome;
import app.chalo.premiumbus.data.models.app.PremiumBusUpsellRideOutcome$Booked$$serializer;
import app.chalo.premiumbus.data.models.app.PremiumBusUpsellRideOutcome$Failed$$serializer;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel$$serializer;
import app.chalo.premiumbus.managers.PremiumBusSharedRestoredState;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsFlowType;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsFlowType$FreshPurchase$$serializer;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsFlowType$PassUpsellNudge$$serializer;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsFlowType$PurchaseThroughPass$$serializer;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionFlowType;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionFlowType$BulkBooking$$serializer;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionFlowType$ChangeSeat$$serializer;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionFlowType$FreshPurchase$$serializer;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionFlowType$FreshPurchaseThroughPass$$serializer;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionFlowType$Reschedule$$serializer;
import app.chalo.premiumbus.ui.slotselection.DateAndSlotSelectedForBulkBooking$$serializer;
import app.chalo.premiumbus.ui.slotselection.SlotsAvailableForSelection$$serializer;
import app.chalo.scenes.args.PassLandingFlowType;
import app.chalo.scenes.args.PremiumBusChangeStopArgs;
import app.chalo.scenes.args.PremiumBusNotificationArgs;
import app.chalo.scenes.args.PremiumBusProductModificationArgs;
import java.lang.annotation.Annotation;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nt0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18543a;

    public /* synthetic */ nt0(int i) {
        this.f18543a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18543a) {
            case 0:
                PremiumBusChangeStopArgs.Companion companion = PremiumBusChangeStopArgs.INSTANCE;
                return Source.INSTANCE.serializer();
            case 1:
                PremiumBusContentConfigApiResponseModel.Companion companion2 = PremiumBusContentConfigApiResponseModel.INSTANCE;
                return new ArrayListSerializer(PremiumBusTutorialConfigApiResponseModel$$serializer.f2939a);
            case 2:
                PremiumBusContentConfigAppResponseModel.Companion companion3 = PremiumBusContentConfigAppResponseModel.INSTANCE;
                return new ArrayListSerializer(PremiumBusTutorialConfigAppResponseModel$$serializer.f2970a);
            case 3:
                PremiumBusFareDetailsFlowType.Companion companion4 = PremiumBusFareDetailsFlowType.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsFlowType", Reflection.a(PremiumBusFareDetailsFlowType.class), new KClass[]{Reflection.a(PremiumBusFareDetailsFlowType.FreshPurchase.class), Reflection.a(PremiumBusFareDetailsFlowType.PassUpsellNudge.class), Reflection.a(PremiumBusFareDetailsFlowType.PurchaseThroughPass.class)}, new KSerializer[]{PremiumBusFareDetailsFlowType$FreshPurchase$$serializer.f7552a, PremiumBusFareDetailsFlowType$PassUpsellNudge$$serializer.f7553a, PremiumBusFareDetailsFlowType$PurchaseThroughPass$$serializer.f7554a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 4:
                PremiumBusFareDetailsFlowType.PurchaseThroughPass.Companion companion5 = PremiumBusFareDetailsFlowType.PurchaseThroughPass.INSTANCE;
                return SuperPassSubTypes.INSTANCE.serializer();
            case 5:
                PremiumBusJourneyEntry.Companion companion6 = PremiumBusJourneyEntry.Companion;
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("app.chalo.premiumbus.PremiumBusJourneyEntry", Reflection.a(PremiumBusJourneyEntry.class), new KClass[]{Reflection.a(PremiumBusJourneyEntry.NavigateToPassPurchaseLandingScreen.class), Reflection.a(PremiumBusJourneyEntry.NavigateToProductSelectionScreen.class), Reflection.a(PremiumBusJourneyEntry.NavigateToSeatSelectionScreen.class), Reflection.a(PremiumBusJourneyEntry.NavigateToSlotSelectionScreen.class), Reflection.a(PremiumBusJourneyEntry.NavigateToStopDetailsScreen.class), Reflection.a(PremiumBusJourneyEntry.NavigateToStopSelectionScreen.class)}, new KSerializer[]{PremiumBusJourneyEntry$NavigateToPassPurchaseLandingScreen$$serializer.f6852a, PremiumBusJourneyEntry$NavigateToProductSelectionScreen$$serializer.f6853a, PremiumBusJourneyEntry$NavigateToSeatSelectionScreen$$serializer.f6854a, PremiumBusJourneyEntry$NavigateToSlotSelectionScreen$$serializer.f6855a, PremiumBusJourneyEntry$NavigateToStopDetailsScreen$$serializer.f6856a, PremiumBusJourneyEntry$NavigateToStopSelectionScreen$$serializer.f6857a});
                sealedClassSerializer2.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer2;
            case 6:
                PremiumBusJourneyEntry.NavigateToPassPurchaseLandingScreen.Companion companion7 = PremiumBusJourneyEntry.NavigateToPassPurchaseLandingScreen.Companion;
                return PassLandingFlowType.INSTANCE.serializer();
            case 7:
                PremiumBusJourneyEntry.NavigateToPassPurchaseLandingScreen.Companion companion8 = PremiumBusJourneyEntry.NavigateToPassPurchaseLandingScreen.Companion;
                return Source.INSTANCE.serializer();
            case 8:
                PremiumBusJourneyEntry.NavigateToProductSelectionScreen.Companion companion9 = PremiumBusJourneyEntry.NavigateToProductSelectionScreen.Companion;
                return PremiumBusProductPurchaseFlowType.INSTANCE.serializer();
            case 9:
                PremiumBusJourneyEntry.NavigateToSeatSelectionScreen.Companion companion10 = PremiumBusJourneyEntry.NavigateToSeatSelectionScreen.Companion;
                return PremiumBusSeatSelectionFlowType.INSTANCE.serializer();
            case 10:
                PremiumBusJourneyEntry.NavigateToSlotSelectionScreen.Companion companion11 = PremiumBusJourneyEntry.NavigateToSlotSelectionScreen.Companion;
                return PremiumBusProductPurchaseFlowType.INSTANCE.serializer();
            case 11:
                PremiumBusNativeCityWiseConfigAppModel.Companion companion12 = PremiumBusNativeCityWiseConfigAppModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 12:
                PremiumBusNativeCityWiseConfigAppModel.Companion companion13 = PremiumBusNativeCityWiseConfigAppModel.INSTANCE;
                return new ArrayListSerializer(PassSavingFaqs$$serializer.f2370a);
            case 13:
                PremiumBusNativeConfigAppModel.Companion companion14 = PremiumBusNativeConfigAppModel.INSTANCE;
                return new ArrayListSerializer(PremiumBusNativeCityWiseConfigAppModel$$serializer.f2379a);
            case 14:
                return new ObjectSerializer("app.chalo.scenes.args.PremiumBusNotificationArgs", PremiumBusNotificationArgs.INSTANCE, new Annotation[0]);
            case 15:
                PremiumBusProductModificationArgs.Companion companion15 = PremiumBusProductModificationArgs.Companion;
                return EnumsKt.b("app.chalo.data.PremiumReserveTicketOptionAction", PremiumReserveTicketOptionAction.values());
            case 16:
                PremiumBusProductPurchaseFlowType.Companion companion16 = PremiumBusProductPurchaseFlowType.INSTANCE;
                SealedClassSerializer sealedClassSerializer3 = new SealedClassSerializer("app.chalo.premiumbus.PremiumBusProductPurchaseFlowType", Reflection.a(PremiumBusProductPurchaseFlowType.class), new KClass[]{Reflection.a(PremiumBusProductPurchaseFlowType.FreshPurchase.class), Reflection.a(PremiumBusProductPurchaseFlowType.RePurchaseTicket.class), Reflection.a(PremiumBusProductPurchaseFlowType.RescheduleTicket.class), Reflection.a(PremiumBusProductPurchaseFlowType.TicketPurchaseThroughPass.class)}, new KSerializer[]{PremiumBusProductPurchaseFlowType$FreshPurchase$$serializer.f6859a, PremiumBusProductPurchaseFlowType$RePurchaseTicket$$serializer.f6860a, PremiumBusProductPurchaseFlowType$RescheduleTicket$$serializer.f6861a, PremiumBusProductPurchaseFlowType$TicketPurchaseThroughPass$$serializer.f6862a});
                sealedClassSerializer3.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer3;
            case 17:
                PremiumBusSeatSelectionFlowType.Companion companion17 = PremiumBusSeatSelectionFlowType.INSTANCE;
                SealedClassSerializer sealedClassSerializer4 = new SealedClassSerializer("app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionFlowType", Reflection.a(PremiumBusSeatSelectionFlowType.class), new KClass[]{Reflection.a(PremiumBusSeatSelectionFlowType.BulkBooking.class), Reflection.a(PremiumBusSeatSelectionFlowType.ChangeSeat.class), Reflection.a(PremiumBusSeatSelectionFlowType.FreshPurchase.class), Reflection.a(PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass.class), Reflection.a(PremiumBusSeatSelectionFlowType.Reschedule.class)}, new KSerializer[]{PremiumBusSeatSelectionFlowType$BulkBooking$$serializer.f7726a, PremiumBusSeatSelectionFlowType$ChangeSeat$$serializer.f7727a, PremiumBusSeatSelectionFlowType$FreshPurchase$$serializer.f7728a, PremiumBusSeatSelectionFlowType$FreshPurchaseThroughPass$$serializer.f7729a, PremiumBusSeatSelectionFlowType$Reschedule$$serializer.f7730a});
                sealedClassSerializer4.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer4;
            case 18:
                PremiumBusSeatSelectionFlowType.BulkBooking.Companion companion18 = PremiumBusSeatSelectionFlowType.BulkBooking.INSTANCE;
                return new ArrayListSerializer(DateAndSlotSelectedForBulkBooking$$serializer.f7796a);
            case 19:
                PremiumBusSeatSelectionFlowType.BulkBooking.Companion companion19 = PremiumBusSeatSelectionFlowType.BulkBooking.INSTANCE;
                return new ArrayListSerializer(SeatInfoAppModel$$serializer.f7123a);
            case 20:
                PremiumBusSeatSelectionFlowType.ChangeSeat.Companion companion20 = PremiumBusSeatSelectionFlowType.ChangeSeat.INSTANCE;
                return new ArrayListSerializer(SeatInfoAppModel$$serializer.f7123a);
            case 21:
                PremiumBusSeatSelectionLayoutForBulkBookingRequestApiModel.Companion companion21 = PremiumBusSeatSelectionLayoutForBulkBookingRequestApiModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 22:
                PremiumBusSeatSelectionLayoutRequestApiModel.Companion companion22 = PremiumBusSeatSelectionLayoutRequestApiModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 23:
                PremiumBusSeatSelectionLayoutResponseApiModel.Companion companion23 = PremiumBusSeatSelectionLayoutResponseApiModel.Companion;
                return new ArrayListSerializer(IntSerializer.f18146a);
            case 24:
                PremiumBusSeatSelectionLayoutResponseApiModel.Companion companion24 = PremiumBusSeatSelectionLayoutResponseApiModel.Companion;
                return new ArrayListSerializer(SeatInfoApiModel$$serializer.f7063a);
            case 25:
                return PremiumBusSelectedLocationType._init_$_anonymous_();
            case 26:
                PremiumBusSharedRestoredState.Companion companion25 = PremiumBusSharedRestoredState.Companion;
                return PremiumBusProductPurchaseFlowType.INSTANCE.serializer();
            case 27:
                PremiumBusSlotListScreenData.Companion companion26 = PremiumBusSlotListScreenData.INSTANCE;
                return new ArrayListSerializer(SlotsAvailableForSelection$$serializer.f7903a);
            case 28:
                PremiumBusUpsellRideOutcome.Companion companion27 = PremiumBusUpsellRideOutcome.INSTANCE;
                SealedClassSerializer sealedClassSerializer5 = new SealedClassSerializer("app.chalo.premiumbus.data.models.app.PremiumBusUpsellRideOutcome", Reflection.a(PremiumBusUpsellRideOutcome.class), new KClass[]{Reflection.a(PremiumBusUpsellRideOutcome.Booked.class), Reflection.a(PremiumBusUpsellRideOutcome.BookedButUnconfirmed.class), Reflection.a(PremiumBusUpsellRideOutcome.Failed.class)}, new KSerializer[]{PremiumBusUpsellRideOutcome$Booked$$serializer.f7109a, new ObjectSerializer("app.chalo.premiumbus.data.models.app.PremiumBusUpsellRideOutcome.BookedButUnconfirmed", PremiumBusUpsellRideOutcome.BookedButUnconfirmed.INSTANCE, new Annotation[0]), PremiumBusUpsellRideOutcome$Failed$$serializer.f7110a});
                sealedClassSerializer5.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer5;
            default:
                return new ObjectSerializer("app.chalo.premiumbus.data.models.app.PremiumBusUpsellRideOutcome.BookedButUnconfirmed", PremiumBusUpsellRideOutcome.BookedButUnconfirmed.INSTANCE, new Annotation[0]);
        }
    }
}
