package app.chalo.premiumbus.prebookedtickets.domain;

import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketTripPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumStopDetailsAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.prebookedtickets.ui.cancellationack.PremiumBusInAppCommunicationBottomSheetData;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.domain.ProcessPremiumBusTicketForAckDataUseCase", f = "ProcessPremiumBusTicketForAckDataUseCase.kt", l = {26}, m = "invoke", v = 1)
final class ProcessPremiumBusTicketForAckDataUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProcessPremiumBusTicketForAckDataUseCase this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strE;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        TimeUtilsContract timeUtilsContract = this.this$0.f7319a;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 == 0) {
            ResultKt.b(obj);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str = (String) this.L$1;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) this.L$0;
        ResultKt.b(obj);
        PremiumReserveTicketAppModel premiumReserveTicketAppModel2 = (PremiumReserveTicketAppModel) obj;
        Long l = premiumReserveTicketAppModel2 != null ? new Long(premiumReserveTicketAppModel2.b.b) : null;
        PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel = premiumReserveTicketAppModel.f7113a;
        PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel = premiumReserveTicketAppModel.b;
        String str2 = premiumReserveTicketBookingPropertiesAppModel.f7114a;
        PremiumReserveTicketStatus premiumReserveTicketStatus = premiumReserveTicketBookingPropertiesAppModel.h;
        PremiumStopDetailsAppModel premiumStopDetailsAppModel = premiumReserveTicketTripPropertiesAppModel.g;
        long j = premiumReserveTicketTripPropertiesAppModel.b;
        String str3 = premiumStopDetailsAppModel.b;
        String strM = timeUtilsContract.m(j, timeUtilsContract.b());
        String strE2 = timeUtilsContract.e(j);
        if (l == null || (strE = timeUtilsContract.e(l.longValue())) == null) {
            strE = "";
        }
        return new PremiumBusInAppCommunicationBottomSheetData.SystemReschedule(str2, premiumReserveTicketStatus, str, str3, strM, strE2, strE);
    }
}
