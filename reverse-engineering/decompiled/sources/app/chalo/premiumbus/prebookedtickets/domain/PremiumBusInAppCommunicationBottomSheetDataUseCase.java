package app.chalo.premiumbus.prebookedtickets.domain;

import app.chalo.premiumbus.data.models.app.FirstBookingAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketTripPropertiesAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.prebookedtickets.ui.cancellationack.PremiumBusInAppCommunicationBottomSheetData;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/domain/PremiumBusInAppCommunicationBottomSheetDataUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusInAppCommunicationBottomSheetDataUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeUtilsContract f7317a;
    public final ShouldShowRescheduleAckForTicketUseCase b;

    public PremiumBusInAppCommunicationBottomSheetDataUseCase(TimeUtilsContract timeUtilsContract, ShouldShowRescheduleAckForTicketUseCase shouldShowRescheduleAckForTicketUseCase) {
        this.f7317a = timeUtilsContract;
        this.b = shouldShowRescheduleAckForTicketUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(PremiumReserveTicketAppModel premiumReserveTicketAppModel, ContinuationImpl continuationImpl) {
        PremiumBusInAppCommunicationBottomSheetDataUseCase$invoke$1 premiumBusInAppCommunicationBottomSheetDataUseCase$invoke$1;
        PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel;
        FirstBookingAppModel firstBookingAppModel;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel2 = premiumReserveTicketAppModel;
        if (continuationImpl instanceof PremiumBusInAppCommunicationBottomSheetDataUseCase$invoke$1) {
            premiumBusInAppCommunicationBottomSheetDataUseCase$invoke$1 = (PremiumBusInAppCommunicationBottomSheetDataUseCase$invoke$1) continuationImpl;
            int i = premiumBusInAppCommunicationBottomSheetDataUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusInAppCommunicationBottomSheetDataUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusInAppCommunicationBottomSheetDataUseCase$invoke$1 = new PremiumBusInAppCommunicationBottomSheetDataUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            premiumBusInAppCommunicationBottomSheetDataUseCase$invoke$1 = new PremiumBusInAppCommunicationBottomSheetDataUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = premiumBusInAppCommunicationBottomSheetDataUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusInAppCommunicationBottomSheetDataUseCase$invoke$1.label;
        TimeUtilsContract timeUtilsContract = this.f7317a;
        if (i2 == 0) {
            ResultKt.b(objA);
            if (premiumReserveTicketAppModel2.d()) {
                PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel2 = premiumReserveTicketAppModel2.f7113a;
                String str = premiumReserveTicketBookingPropertiesAppModel2.f7114a;
                PremiumReserveTicketStatus premiumReserveTicketStatus = premiumReserveTicketBookingPropertiesAppModel2.h;
                PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel = premiumReserveTicketAppModel2.b;
                return new PremiumBusInAppCommunicationBottomSheetData.SystemCancellation(str, premiumReserveTicketStatus, premiumReserveTicketTripPropertiesAppModel, timeUtilsContract.e(premiumReserveTicketTripPropertiesAppModel.b));
            }
            premiumBusInAppCommunicationBottomSheetDataUseCase$invoke$1.L$0 = premiumReserveTicketAppModel2;
            premiumBusInAppCommunicationBottomSheetDataUseCase$invoke$1.label = 1;
            objA = this.b.a(premiumReserveTicketAppModel2, premiumBusInAppCommunicationBottomSheetDataUseCase$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            premiumReserveTicketAppModel2 = (PremiumReserveTicketAppModel) premiumBusInAppCommunicationBottomSheetDataUseCase$invoke$1.L$0;
            ResultKt.b(objA);
        }
        if (!((Boolean) objA).booleanValue() || (firstBookingAppModel = (premiumReserveTicketBookingPropertiesAppModel = premiumReserveTicketAppModel2.f7113a).l) == null) {
            return null;
        }
        long j = firstBookingAppModel.c;
        return new PremiumBusInAppCommunicationBottomSheetData.SystemReschedule(premiumReserveTicketBookingPropertiesAppModel.f7114a, premiumReserveTicketBookingPropertiesAppModel.h, firstBookingAppModel.f7082a, firstBookingAppModel.e.b, timeUtilsContract.m(j, timeUtilsContract.b()), timeUtilsContract.e(j), timeUtilsContract.e(premiumReserveTicketAppModel2.b.b));
    }
}
