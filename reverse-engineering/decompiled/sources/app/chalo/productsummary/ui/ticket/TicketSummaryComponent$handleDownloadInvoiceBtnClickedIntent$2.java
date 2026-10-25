package app.chalo.productsummary.ui.ticket;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.productsummary.domain.FetchProductInvoiceUseCase;
import app.chalo.productsummary.domain.ProductInvoiceFetchFailedError;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.hi1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productsummary.ui.ticket.TicketSummaryComponent$handleDownloadInvoiceBtnClickedIntent$2", f = "TicketSummaryComponent.kt", l = {157, 179, 199}, m = "invokeSuspend", v = 1)
final class TicketSummaryComponent$handleDownloadInvoiceBtnClickedIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TicketSummaryIntent.DownloadInvoiceBtnClickedIntent $intent;
    Object L$0;
    int label;
    final /* synthetic */ TicketSummaryComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketSummaryComponent$handleDownloadInvoiceBtnClickedIntent$2(TicketSummaryComponent ticketSummaryComponent, TicketSummaryIntent.DownloadInvoiceBtnClickedIntent downloadInvoiceBtnClickedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ticketSummaryComponent;
        this.$intent = downloadInvoiceBtnClickedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TicketSummaryComponent$handleDownloadInvoiceBtnClickedIntent$2(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TicketSummaryComponent$handleDownloadInvoiceBtnClickedIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KotlinToastManager kotlinToastManager;
        String str;
        KotlinToastManager kotlinToastManager2;
        KotlinToastManager kotlinToastManager3;
        String str2;
        KotlinToastManager kotlinToastManager4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FetchProductInvoiceUseCase fetchProductInvoiceUseCase = this.this$0.B;
            TicketSummaryIntent.DownloadInvoiceBtnClickedIntent downloadInvoiceBtnClickedIntent = this.$intent;
            String str3 = downloadInvoiceBtnClickedIntent.f8805a;
            String str4 = downloadInvoiceBtnClickedIntent.b;
            this.label = 1;
            obj = fetchProductInvoiceUseCase.a(str4, str3, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                kotlinToastManager4 = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                str2 = (String) obj;
                kotlinToastManager3 = kotlinToastManager4;
                KotlinToastManagerKt.a(kotlinToastManager3, str2, ToastLength.LONG);
                return Unit.f17538a;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager2 = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
            str = (String) obj;
            kotlinToastManager = kotlinToastManager2;
            KotlinToastManagerKt.a(kotlinToastManager, str, ToastLength.LONG);
            return Unit.f17538a;
        }
        ResultKt.b(obj);
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            AnalyticsContractImplKt.b(this.this$0.t, "invoice download success", Source.TICKET_SUMMARY_SCREEN, vo1.s("bookingId", this.$intent.f8805a), false, 24);
            this.this$0.E0(new hi1(25));
            ChaloUseCaseResult chaloUseCaseResultA = this.this$0.C.a(this.$intent.f8805a, (byte[]) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a);
            if (!(chaloUseCaseResultA instanceof ChaloUseCaseResult.Success)) {
                if (!(chaloUseCaseResultA instanceof ChaloUseCaseResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                TicketSummaryComponent ticketSummaryComponent = this.this$0;
                kotlinToastManager3 = ticketSummaryComponent.v;
                str2 = (String) ((ChaloUseCaseResult.Failure) chaloUseCaseResultA).f10418a;
                if (str2 == null) {
                    this.L$0 = kotlinToastManager3;
                    this.label = 2;
                    obj = ticketSummaryComponent.m.b(StringEnum.INVOICE_FETCH_FAILED_PLEASE_TRY_AGAIN_LATER, new Object[0], this);
                    if (obj != coroutineSingletons) {
                        kotlinToastManager4 = kotlinToastManager3;
                        str2 = (String) obj;
                        kotlinToastManager3 = kotlinToastManager4;
                    }
                }
                KotlinToastManagerKt.a(kotlinToastManager3, str2, ToastLength.LONG);
            }
            return Unit.f17538a;
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        AnalyticsContract analyticsContract = this.this$0.t;
        Source source = Source.TICKET_SUMMARY_SCREEN;
        Pair pair = new Pair("bookingId", this.$intent.f8805a);
        ProductInvoiceFetchFailedError productInvoiceFetchFailedError = (ProductInvoiceFetchFailedError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
        AnalyticsContractImplKt.b(analyticsContract, "invoice download failure", source, MapsKt.i(pair, new Pair("errorMessage", productInvoiceFetchFailedError.f8746a.name())), false, 24);
        this.this$0.E0(new hi1(26));
        TicketSummaryComponent ticketSummaryComponent2 = this.this$0;
        kotlinToastManager = ticketSummaryComponent2.v;
        str = productInvoiceFetchFailedError.b;
        if (str == null) {
            this.L$0 = kotlinToastManager;
            this.label = 3;
            obj = ticketSummaryComponent2.m.b(StringEnum.INVOICE_FETCH_FAILED_PLEASE_TRY_AGAIN_LATER, new Object[0], this);
            if (obj != coroutineSingletons) {
                kotlinToastManager2 = kotlinToastManager;
                str = (String) obj;
                kotlinToastManager = kotlinToastManager2;
            }
        }
        KotlinToastManagerKt.a(kotlinToastManager, str, ToastLength.LONG);
        return Unit.f17538a;
        return coroutineSingletons;
    }
}
