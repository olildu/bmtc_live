package app.chalo.electricitybill.domain;

import app.chalo.electricitybill.data.repository.ElectricityBillRepository;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/domain/EBillFetchPaymentHistoryUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EBillFetchPaymentHistoryUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ElectricityBillRepository f2545a;
    public final CurrencyFeature b;
    public final TimeUtilsContract c;
    public final StringProvider d;

    public EBillFetchPaymentHistoryUseCase(ElectricityBillRepository electricityBillRepository, CurrencyFeature currencyFeature, TimeUtilsContract timeUtilsContract, StringProvider stringProvider) {
        this.f2545a = electricityBillRepository;
        this.b = currencyFeature;
        this.c = timeUtilsContract;
        this.d = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00af, code lost:
    
        if (r11 == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof app.chalo.electricitybill.domain.EBillFetchPaymentHistoryUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r11
            app.chalo.electricitybill.domain.EBillFetchPaymentHistoryUseCase$invoke$1 r0 = (app.chalo.electricitybill.domain.EBillFetchPaymentHistoryUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.electricitybill.domain.EBillFetchPaymentHistoryUseCase$invoke$1 r0 = new app.chalo.electricitybill.domain.EBillFetchPaymentHistoryUseCase$invoke$1
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            app.chalo.providers.stringprovider.StringProvider r4 = r10.d
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L41
            if (r2 == r7) goto L3d
            if (r2 == r6) goto L39
            if (r2 != r5) goto L31
            kotlin.ResultKt.b(r11)
            goto Lb2
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L39:
            kotlin.ResultKt.b(r11)     // Catch: java.lang.Throwable -> La5
            goto L92
        L3d:
            kotlin.ResultKt.b(r11)     // Catch: java.lang.Throwable -> La5
            goto L4f
        L41:
            kotlin.ResultKt.b(r11)
            app.chalo.electricitybill.data.repository.ElectricityBillRepository r11 = r10.f2545a     // Catch: java.lang.Throwable -> La5
            r0.label = r7     // Catch: java.lang.Throwable -> La5
            java.io.Serializable r11 = r11.a(r0)     // Catch: java.lang.Throwable -> La5
            if (r11 != r1) goto L4f
            goto Lb1
        L4f:
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch: java.lang.Throwable -> La5
            app.chalo.electricitybill.domain.EBillFetchPaymentHistoryUseCase$invoke$$inlined$sortedByDescending$1 r2 = new app.chalo.electricitybill.domain.EBillFetchPaymentHistoryUseCase$invoke$$inlined$sortedByDescending$1     // Catch: java.lang.Throwable -> La5
            r2.<init>()     // Catch: java.lang.Throwable -> La5
            java.util.List r11 = kotlin.collections.CollectionsKt.v0(r2, r11)     // Catch: java.lang.Throwable -> La5
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch: java.lang.Throwable -> La5
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La5
            r2.<init>()     // Catch: java.lang.Throwable -> La5
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> La5
        L65:
            boolean r7 = r11.hasNext()     // Catch: java.lang.Throwable -> La5
            if (r7 == 0) goto L7f
            java.lang.Object r7 = r11.next()     // Catch: java.lang.Throwable -> La5
            app.chalo.electricitybill.data.model.appmodel.ElectricityBillPaymentHistoryAppModel r7 = (app.chalo.electricitybill.data.model.appmodel.ElectricityBillPaymentHistoryAppModel) r7     // Catch: java.lang.Throwable -> La5
            app.chalo.features.wallet.CurrencyFeature r8 = r10.b     // Catch: java.lang.Throwable -> La5
            app.chalo.utils.timeutil.TimeUtilsContract r9 = r10.c     // Catch: java.lang.Throwable -> La5
            app.chalo.electricitybill.ui.paymenthistory.model.ElectricityBillPaymentHistoryUiModel r7 = app.chalo.electricitybill.ui.paymenthistory.model.ElectricityBillPaymentHistoryUiModelKt.a(r7, r8, r9)     // Catch: java.lang.Throwable -> La5
            if (r7 == 0) goto L65
            r2.add(r7)     // Catch: java.lang.Throwable -> La5
            goto L65
        L7f:
            boolean r11 = r2.isEmpty()     // Catch: java.lang.Throwable -> La5
            if (r11 == 0) goto L9f
            app.chalo.providers.stringprovider.StringEnum r11 = app.chalo.providers.stringprovider.StringEnum.EBILL_PAYMENT_HISTORY_EMPTY_MESSAGE     // Catch: java.lang.Throwable -> La5
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> La5
            r0.label = r6     // Catch: java.lang.Throwable -> La5
            java.lang.Object r11 = r4.b(r11, r2, r0)     // Catch: java.lang.Throwable -> La5
            if (r11 != r1) goto L92
            goto Lb1
        L92:
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> La5
            app.chalo.electricitybill.domain.EBillPaymentHistoryErrorState$EmptyList r2 = new app.chalo.electricitybill.domain.EBillPaymentHistoryErrorState$EmptyList     // Catch: java.lang.Throwable -> La5
            r2.<init>(r11)     // Catch: java.lang.Throwable -> La5
            app.chalo.utils.ChaloUseCaseResult$Failure r11 = new app.chalo.utils.ChaloUseCaseResult$Failure     // Catch: java.lang.Throwable -> La5
            r11.<init>(r2)     // Catch: java.lang.Throwable -> La5
            return r11
        L9f:
            app.chalo.utils.ChaloUseCaseResult$Success r11 = new app.chalo.utils.ChaloUseCaseResult$Success     // Catch: java.lang.Throwable -> La5
            r11.<init>(r2)     // Catch: java.lang.Throwable -> La5
            return r11
        La5:
            app.chalo.providers.stringprovider.StringEnum r11 = app.chalo.providers.stringprovider.StringEnum.EBILL_PAYMENT_HISTORY_ERROR
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r0.label = r5
            java.lang.Object r11 = r4.b(r11, r2, r0)
            if (r11 != r1) goto Lb2
        Lb1:
            return r1
        Lb2:
            java.lang.String r11 = (java.lang.String) r11
            app.chalo.electricitybill.domain.EBillPaymentHistoryErrorState$ApiFailedError r0 = new app.chalo.electricitybill.domain.EBillPaymentHistoryErrorState$ApiFailedError
            r0.<init>(r11)
            app.chalo.utils.ChaloUseCaseResult$Failure r11 = new app.chalo.utils.ChaloUseCaseResult$Failure
            r11.<init>(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.electricitybill.domain.EBillFetchPaymentHistoryUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
