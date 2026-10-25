package app.chalo.productpurchase.passpurchase.ui.verificationstatus;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.verificationstatus.SuperPassVerificationStatusComponent$handleReportProblemIntent$1", f = "SuperPassVerificationStatusComponent.kt", l = {128, 124}, m = "invokeSuspend", v = 1)
final class SuperPassVerificationStatusComponent$handleReportProblemIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ SuperPassVerificationStatusComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassVerificationStatusComponent$handleReportProblemIntent$1(SuperPassVerificationStatusComponent superPassVerificationStatusComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = superPassVerificationStatusComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperPassVerificationStatusComponent$handleReportProblemIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperPassVerificationStatusComponent$handleReportProblemIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bf, code lost:
    
        if (r3.b(r4, r5, r6, r7, null, r10) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            kotlin.ResultKt.b(r11)
            goto Lc2
        L11:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L19:
            java.lang.Object r1 = r10.L$3
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r3 = r10.L$2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r10.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r10.L$0
            app.chalo.features.reportproblem.IReportProblemFeature r5 = (app.chalo.features.reportproblem.IReportProblemFeature) r5
            kotlin.ResultKt.b(r11)
            r6 = r5
            r5 = r3
            r3 = r6
        L2f:
            r6 = r1
            goto La8
        L32:
            kotlin.ResultKt.b(r11)
            app.chalo.productpurchase.passpurchase.ui.verificationstatus.SuperPassVerificationStatusComponent r11 = r10.this$0
            app.chalo.features.reportproblem.IReportProblemFeature r5 = r11.s
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            app.chalo.providers.cityprovider.CityProvider r4 = r11.q
            java.lang.String r4 = app.chalo.providers.cityprovider.CityProviderKt.b(r4)
            app.chalo.providers.UserProfileDetailsProvider r11 = r11.r
            app.chalo.userprofile.UserProfileAppModel r11 = r11.f()
            if (r11 == 0) goto L7a
            java.lang.String r6 = "userPropertyPhoneNo"
            java.lang.String r7 = r11.e
            r1.put(r6, r7)
            java.lang.String r6 = "userPropertyUserID"
            java.lang.String r7 = r11.i
            r1.put(r6, r7)
            java.lang.String r6 = r11.f10305a
            java.lang.String r11 = r11.b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = " "
            r7.append(r6)
            r7.append(r11)
            java.lang.String r11 = r7.toString()
            java.lang.String r6 = "userPropertyUserName"
            r1.put(r6, r11)
        L7a:
            if (r4 == 0) goto L82
            java.lang.String r11 = "userPropertyCity"
            r1.put(r11, r4)
        L82:
            app.chalo.productpurchase.passpurchase.ui.verificationstatus.SuperPassVerificationStatusComponent r11 = r10.this$0
            app.chalo.domain.DoesUserHaveProductsOnMultipleDeviceUseCase r4 = r11.t
            app.chalo.providers.cityprovider.CityProvider r11 = r11.q
            java.lang.String r11 = app.chalo.providers.cityprovider.CityProviderKt.b(r11)
            if (r11 != 0) goto L90
            java.lang.String r11 = ""
        L90:
            r10.L$0 = r5
            java.lang.String r6 = "verificationScreen"
            r10.L$1 = r6
            r10.L$2 = r6
            r10.L$3 = r1
            r10.label = r3
            java.lang.Object r11 = r4.a(r11, r10)
            if (r11 != r0) goto La4
            goto Lc1
        La4:
            r3 = r5
            r4 = r6
            r5 = r4
            goto L2f
        La8:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r7 = r11.booleanValue()
            r11 = 0
            r10.L$0 = r11
            r10.L$1 = r11
            r10.L$2 = r11
            r10.L$3 = r11
            r10.label = r2
            r8 = 0
            r9 = r10
            java.lang.Object r11 = r3.b(r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto Lc2
        Lc1:
            return r0
        Lc2:
            kotlin.Unit r11 = kotlin.Unit.f17538a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.passpurchase.ui.verificationstatus.SuperPassVerificationStatusComponent$handleReportProblemIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
