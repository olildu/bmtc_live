package app.chalo.premiumbus.ui.faredetails;

import androidx.media3.extractor.ts.PsExtractor;
import app.chalo.crashlytics.CrashlyticsLog;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.crashlytics.CrashlyticsLoggingException;
import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo;
import app.chalo.premiumbus.data.PassUpsellOfferError;
import app.chalo.premiumbus.data.PassUpsellPurchaseOffer;
import app.chalo.premiumbus.data.PassUpsellPurchaseWrapper;
import app.chalo.premiumbus.data.models.app.PremiumBusPassUpsellAppModel;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsDataState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSharedContext;
import app.chalo.productbooking.common.domain.CompleteProductConfigFetchFailedReason;
import app.chalo.utils.ChaloUseCaseResult;
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
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.faredetails.TicketPurchaseWithPassUpsellNudgeDelegate$resolvePassOffer$2", f = "TicketPurchaseWithPassUpsellNudgeDelegate.kt", l = {PsExtractor.VIDEO_STREAM_MASK, 246, 259}, m = "invokeSuspend", v = 1)
final class TicketPurchaseWithPassUpsellNudgeDelegate$resolvePassOffer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusFareDetailsSharedContext $context;
    int label;
    final /* synthetic */ TicketPurchaseWithPassUpsellNudgeDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketPurchaseWithPassUpsellNudgeDelegate$resolvePassOffer$2(TicketPurchaseWithPassUpsellNudgeDelegate ticketPurchaseWithPassUpsellNudgeDelegate, PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ticketPurchaseWithPassUpsellNudgeDelegate;
        this.$context = premiumBusFareDetailsSharedContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TicketPurchaseWithPassUpsellNudgeDelegate$resolvePassOffer$2(this.this$0, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TicketPurchaseWithPassUpsellNudgeDelegate$resolvePassOffer$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0107 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        boolean z = true;
        if (i == 0) {
            ResultKt.b(obj);
            TicketPurchaseWithPassUpsellNudgeDelegate ticketPurchaseWithPassUpsellNudgeDelegate = this.this$0;
            PassUpsellPurchaseWrapper passUpsellPurchaseWrapper = ticketPurchaseWithPassUpsellNudgeDelegate.c;
            PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel = ticketPurchaseWithPassUpsellNudgeDelegate.b.e;
            String str = premiumBusPassUpsellAppModel.b;
            int i2 = premiumBusPassUpsellAppModel.c;
            SuperPassPurchaseStopsInfo superPassPurchaseStopsInfoE = PremiumBusFareDetailsDelegateSharedActionsKt.e(this.$context.c);
            this.label = 1;
            objA = passUpsellPurchaseWrapper.a(str, i2, superPassPurchaseStopsInfoE, this);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                ResultKt.b(obj);
                return unit;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        objA = obj;
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            TicketPurchaseWithPassUpsellNudgeDelegate ticketPurchaseWithPassUpsellNudgeDelegate2 = this.this$0;
            PassUpsellOfferError passUpsellOfferError = (PassUpsellOfferError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
            ticketPurchaseWithPassUpsellNudgeDelegate2.getClass();
            if (Intrinsics.d(passUpsellOfferError, PassUpsellOfferError.NothingBookable.f6952a)) {
                z = false;
            } else if (!Intrinsics.d(passUpsellOfferError, PassUpsellOfferError.CachingFailed.f6950a)) {
                if (!(passUpsellOfferError instanceof PassUpsellOfferError.FetchFailed)) {
                    throw new NoWhenBranchMatchedException();
                }
                CompleteProductConfigFetchFailedReason completeProductConfigFetchFailedReason = ((PassUpsellOfferError.FetchFailed) passUpsellOfferError).f6951a;
                if (!(completeProductConfigFetchFailedReason instanceof CompleteProductConfigFetchFailedReason.ServerError) && !Intrinsics.d(completeProductConfigFetchFailedReason, CompleteProductConfigFetchFailedReason.LocalError.f8254a) && !Intrinsics.d(completeProductConfigFetchFailedReason, CompleteProductConfigFetchFailedReason.UnknownError.f8258a)) {
                    if (!Intrinsics.d(completeProductConfigFetchFailedReason, CompleteProductConfigFetchFailedReason.ApiToAppMappingError.f8253a) && !Intrinsics.d(completeProductConfigFetchFailedReason, CompleteProductConfigFetchFailedReason.ParseError.f8256a) && !Intrinsics.d(completeProductConfigFetchFailedReason, CompleteProductConfigFetchFailedReason.NoAdultFareFound.f8255a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = false;
                }
            }
            this.label = 2;
            if (TicketPurchaseWithPassUpsellNudgeDelegate.h(ticketPurchaseWithPassUpsellNudgeDelegate2, z, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return unit;
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        PassUpsellPurchaseOffer passUpsellPurchaseOffer = (PassUpsellPurchaseOffer) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
        if (passUpsellPurchaseOffer.g) {
            CrashlyticsLogger crashlyticsLogger = this.this$0.n;
            CrashlyticsLoggingException crashlyticsLoggingException = new CrashlyticsLoggingException("Pass upsell offered a verification-required pass");
            PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel2 = this.this$0.b.e;
            crashlyticsLogger.f(crashlyticsLoggingException, new CrashlyticsLog("TicketPurchaseWithPassUpsellNudgeDelegate", "configId=" + premiumBusPassUpsellAppModel2.b + " fmId=" + premiumBusPassUpsellAppModel2.c));
            TicketPurchaseWithPassUpsellNudgeDelegate ticketPurchaseWithPassUpsellNudgeDelegate3 = this.this$0;
            this.label = 3;
            if (TicketPurchaseWithPassUpsellNudgeDelegate.h(ticketPurchaseWithPassUpsellNudgeDelegate3, false, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            TicketPurchaseWithPassUpsellNudgeDelegate ticketPurchaseWithPassUpsellNudgeDelegate4 = this.this$0;
            ticketPurchaseWithPassUpsellNudgeDelegate4.t = passUpsellPurchaseOffer;
            MutableStateFlow mutableStateFlow = ticketPurchaseWithPassUpsellNudgeDelegate4.p;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.c(value, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value, false, null, ticketPurchaseWithPassUpsellNudgeDelegate4.k.b(String.valueOf(passUpsellPurchaseOffer.d)), null, false, false, false, null, null, null, null, null, null, 0, ticketPurchaseWithPassUpsellNudgeDelegate4.b.e, null, null, false, null, 950096)));
        }
        return unit;
    }
}
