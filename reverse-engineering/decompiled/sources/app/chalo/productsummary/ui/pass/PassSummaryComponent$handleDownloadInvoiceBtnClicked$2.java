package app.chalo.productsummary.ui.pass;

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
import defpackage.do0;
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
@DebugMetadata(c = "app.chalo.productsummary.ui.pass.PassSummaryComponent$handleDownloadInvoiceBtnClicked$2", f = "PassSummaryComponent.kt", l = {100, 121, 140}, m = "invokeSuspend", v = 1)
final class PassSummaryComponent$handleDownloadInvoiceBtnClicked$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PassSummaryIntent.DownloadInvoiceBtnClicked $intent;
    Object L$0;
    int label;
    final /* synthetic */ PassSummaryComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassSummaryComponent$handleDownloadInvoiceBtnClicked$2(PassSummaryComponent passSummaryComponent, PassSummaryIntent.DownloadInvoiceBtnClicked downloadInvoiceBtnClicked, Continuation continuation) {
        super(2, continuation);
        this.this$0 = passSummaryComponent;
        this.$intent = downloadInvoiceBtnClicked;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PassSummaryComponent$handleDownloadInvoiceBtnClicked$2(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PassSummaryComponent$handleDownloadInvoiceBtnClicked$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
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
            FetchProductInvoiceUseCase fetchProductInvoiceUseCase = this.this$0.u;
            String str3 = this.$intent.f8769a;
            this.label = 1;
            obj = fetchProductInvoiceUseCase.a(str3, null, this);
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
            AnalyticsContractImplKt.b(this.this$0.p, "invoice download success", Source.PASS_SUMMARY_SCREEN, vo1.s("passId", this.$intent.f8769a), false, 24);
            this.this$0.E0(new do0(21));
            ChaloUseCaseResult chaloUseCaseResultA = this.this$0.v.a(this.$intent.f8769a, (byte[]) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a);
            if (!(chaloUseCaseResultA instanceof ChaloUseCaseResult.Success)) {
                if (!(chaloUseCaseResultA instanceof ChaloUseCaseResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                PassSummaryComponent passSummaryComponent = this.this$0;
                kotlinToastManager3 = passSummaryComponent.s;
                str2 = (String) ((ChaloUseCaseResult.Failure) chaloUseCaseResultA).f10418a;
                if (str2 == null) {
                    this.L$0 = kotlinToastManager3;
                    this.label = 2;
                    obj = passSummaryComponent.m.b(StringEnum.INVOICE_FETCH_FAILED_PLEASE_TRY_AGAIN_LATER, new Object[0], this);
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
        AnalyticsContract analyticsContract = this.this$0.p;
        Source source = Source.PASS_SUMMARY_SCREEN;
        Pair pair = new Pair("passId", this.$intent.f8769a);
        ProductInvoiceFetchFailedError productInvoiceFetchFailedError = (ProductInvoiceFetchFailedError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
        AnalyticsContractImplKt.b(analyticsContract, "invoice download failure", source, MapsKt.i(pair, new Pair("errorMessage", productInvoiceFetchFailedError.f8746a.name())), false, 24);
        this.this$0.E0(new do0(22));
        PassSummaryComponent passSummaryComponent2 = this.this$0;
        kotlinToastManager = passSummaryComponent2.s;
        str = productInvoiceFetchFailedError.b;
        if (str == null) {
            this.L$0 = kotlinToastManager;
            this.label = 3;
            obj = passSummaryComponent2.m.b(StringEnum.INVOICE_FETCH_FAILED_PLEASE_TRY_AGAIN_LATER, new Object[0], this);
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
