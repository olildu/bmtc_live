package app.chalo.premiumbus.prebookedtickets.productmodification;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.bookingsuccessproducttype.BookingSuccessProductType;
import app.chalo.constants.Source;
import app.chalo.data.PremiumBusProductModificationReasonAppModel;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.domain.ReschedulePremiumReserveTicketResult;
import app.chalo.premiumbus.domain.ReschedulePremiumReserveTicketUseCase;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.BookingSuccessArgs;
import defpackage.du0;
import defpackage.et0;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$3", f = "PremiumBusProductModificationReasonsComponent.kt", l = {TypedValues.Custom.TYPE_REFERENCE, 937, 957}, m = "invokeSuspend", v = 1)
final class PremiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bookingIdToReschedule;
    final /* synthetic */ PBAvailableSlotsTripAppModel $newSlotSelectedForReschedule;
    final /* synthetic */ PremiumBusProductModificationReasonAppModel $reason;
    Object L$0;
    int label;
    final /* synthetic */ PremiumBusProductModificationReasonsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$3(PremiumBusProductModificationReasonsComponent premiumBusProductModificationReasonsComponent, String str, PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel, PremiumBusProductModificationReasonAppModel premiumBusProductModificationReasonAppModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusProductModificationReasonsComponent;
        this.$bookingIdToReschedule = str;
        this.$newSlotSelectedForReschedule = pBAvailableSlotsTripAppModel;
        this.$reason = premiumBusProductModificationReasonAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$3(this.this$0, this.$bookingIdToReschedule, this.$newSlotSelectedForReschedule, this.$reason, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PremiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$3 premiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$3;
        KotlinToastManager kotlinToastManager;
        KotlinToastManager kotlinToastManager2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PremiumBusProductModificationReasonsComponent premiumBusProductModificationReasonsComponent = this.this$0;
            ReschedulePremiumReserveTicketUseCase reschedulePremiumReserveTicketUseCase = premiumBusProductModificationReasonsComponent.t;
            String str = this.$bookingIdToReschedule;
            PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel = this.$newSlotSelectedForReschedule;
            String str2 = pBAvailableSlotsTripAppModel.f;
            String str3 = pBAvailableSlotsTripAppModel.b;
            PremiumBusProductModificationReasonAppModel premiumBusProductModificationReasonAppModel = this.$reason;
            List list = ((PremiumBusProductModificationReasonsViewState) premiumBusProductModificationReasonsComponent.f.getValue()).p;
            this.label = 1;
            premiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$3 = this;
            obj = reschedulePremiumReserveTicketUseCase.a(str, str2, str3, premiumBusProductModificationReasonAppModel, list, premiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$3);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                kotlinToastManager2 = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                KotlinToastManagerKt.a(kotlinToastManager2, (String) obj, ToastLength.LONG);
                return Unit.f17538a;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
            KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
            return Unit.f17538a;
        }
        ResultKt.b(obj);
        premiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$3 = this;
        ReschedulePremiumReserveTicketResult reschedulePremiumReserveTicketResult = (ReschedulePremiumReserveTicketResult) obj;
        premiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$3.this$0.E0(new du0(6));
        if (!(reschedulePremiumReserveTicketResult instanceof ReschedulePremiumReserveTicketResult.Success)) {
            if (reschedulePremiumReserveTicketResult instanceof ReschedulePremiumReserveTicketResult.ServerError) {
                ReschedulePremiumReserveTicketResult.ServerError serverError = (ReschedulePremiumReserveTicketResult.ServerError) reschedulePremiumReserveTicketResult;
                String str4 = serverError.f7238a;
                if (str4 == null || str4.length() == 0) {
                    PremiumBusProductModificationReasonsComponent premiumBusProductModificationReasonsComponent2 = premiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$3.this$0;
                    KotlinToastManager kotlinToastManager3 = premiumBusProductModificationReasonsComponent2.u;
                    StringProvider stringProvider = premiumBusProductModificationReasonsComponent2.o;
                    StringEnum stringEnum = StringEnum.SOMETHING_WENT_WRONG_WITH_ERROR_CODE;
                    Object[] objArr = {new Integer(reschedulePremiumReserveTicketResult.a())};
                    premiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$3.L$0 = kotlinToastManager3;
                    premiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$3.label = 2;
                    obj = stringProvider.b(stringEnum, objArr, this);
                    if (obj != coroutineSingletons) {
                        kotlinToastManager2 = kotlinToastManager3;
                        KotlinToastManagerKt.a(kotlinToastManager2, (String) obj, ToastLength.LONG);
                    }
                } else {
                    premiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$3.this$0.E0(new et0(serverError, 12));
                }
            } else {
                if (!Intrinsics.d(reschedulePremiumReserveTicketResult, ReschedulePremiumReserveTicketResult.LocalError.f7236a) && !Intrinsics.d(reschedulePremiumReserveTicketResult, ReschedulePremiumReserveTicketResult.ParsingError.f7237a) && !Intrinsics.d(reschedulePremiumReserveTicketResult, ReschedulePremiumReserveTicketResult.TicketSyncFailedError.f7240a) && !Intrinsics.d(reschedulePremiumReserveTicketResult, ReschedulePremiumReserveTicketResult.UnknownError.f7241a)) {
                    throw new NoWhenBranchMatchedException();
                }
                PremiumBusProductModificationReasonsComponent premiumBusProductModificationReasonsComponent3 = premiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$3.this$0;
                KotlinToastManager kotlinToastManager4 = premiumBusProductModificationReasonsComponent3.u;
                StringProvider stringProvider2 = premiumBusProductModificationReasonsComponent3.o;
                StringEnum stringEnum2 = StringEnum.SOMETHING_WENT_WRONG_WITH_ERROR_CODE;
                Object[] objArr2 = {new Integer(reschedulePremiumReserveTicketResult.a())};
                premiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$3.L$0 = kotlinToastManager4;
                premiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$3.label = 3;
                obj = stringProvider2.b(stringEnum2, objArr2, this);
                if (obj != coroutineSingletons) {
                    kotlinToastManager = kotlinToastManager4;
                    KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
                }
            }
            return coroutineSingletons;
        }
        PremiumBusProductModificationReasonsComponent premiumBusProductModificationReasonsComponent4 = premiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$3.this$0;
        String str5 = ((ReschedulePremiumReserveTicketResult.Success) reschedulePremiumReserveTicketResult).f7239a;
        premiumBusProductModificationReasonsComponent4.A = str5;
        ChaloNavigationManager chaloNavigationManager = premiumBusProductModificationReasonsComponent4.v;
        PremiumBusProductModificationReasonsComponent premiumBusProductModificationReasonsComponent5 = premiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$3.this$0;
        String str6 = premiumBusProductModificationReasonsComponent5.B;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = premiumBusProductModificationReasonsComponent5.C;
        ChaloNavigationManagerKt.e(chaloNavigationManager, new BookingSuccessArgs.ProductSuccessScreen(new BookingSuccessProductType.PremiumBusReschedule(str5, str6, str7 != null ? str7 : ""), Source.PREMIUM_PRODUCT_BOOKING_MODIFICATION_FRAGMENT), null, 6);
        return Unit.f17538a;
    }
}
