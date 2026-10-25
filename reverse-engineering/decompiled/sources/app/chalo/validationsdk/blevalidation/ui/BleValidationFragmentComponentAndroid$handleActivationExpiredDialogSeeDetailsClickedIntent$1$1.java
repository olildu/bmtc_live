package app.chalo.validationsdk.blevalidation.ui;

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
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$handleActivationExpiredDialogSeeDetailsClickedIntent$1$1", f = "BleValidationFragmentComponent.android.kt", l = {764, 770}, m = "invokeSuspend", v = 1)
final class BleValidationFragmentComponentAndroid$handleActivationExpiredDialogSeeDetailsClickedIntent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BleValidationMetaData $metaData;
    int label;
    final /* synthetic */ BleValidationFragmentComponentAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationFragmentComponentAndroid$handleActivationExpiredDialogSeeDetailsClickedIntent$1$1(BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid, BleValidationMetaData bleValidationMetaData, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bleValidationFragmentComponentAndroid;
        this.$metaData = bleValidationMetaData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BleValidationFragmentComponentAndroid$handleActivationExpiredDialogSeeDetailsClickedIntent$1$1(this.this$0, this.$metaData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationFragmentComponentAndroid$handleActivationExpiredDialogSeeDetailsClickedIntent$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager.DefaultImpls.a(r3, "activation duration expired dialog view summary clicked", r5, r6, null, r10, 24) == r0) goto L17;
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
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r11)
            goto L77
        L10:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L18:
            kotlin.ResultKt.b(r11)
            goto L58
        L1c:
            kotlin.ResultKt.b(r11)
            app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid r11 = r10.this$0
            app.chalo.validationsdk.blevalidation.config.ProductValidationConfigProvider r1 = r11.l
            app.chalo.scenes.args.ValidationArgs$BleValidationScreenArgs r11 = r11.k
            app.chalo.models.validation.BleValidationArgs r11 = r11.b
            app.chalo.models.validation.ValidationProduct r11 = r11.b
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.i(r1, r4)
            java.lang.String r4 = "validationProduct"
            kotlin.jvm.internal.Intrinsics.i(r11, r4)
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig r11 = r1.a(r11)
            app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager r11 = r11.getC()
            app.chalo.validationsdk.blevalidation.ui.BleValidationMetaData r1 = r10.$metaData
            app.chalo.validationsdk.legacy.Product r1 = r1.c
            app.chalo.constants.Source r4 = app.chalo.constants.Source.BLE_VALIDATION_ACTIVITY
            java.lang.String r4 = r4.getSourceName()
            app.chalo.scenes.PopUpToConfig$Finish r5 = new app.chalo.scenes.PopUpToConfig$Finish
            app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid r6 = r10.this$0
            app.chalo.scenes.args.ValidationArgs$BleValidationScreenArgs r6 = r6.k
            r5.<init>(r6)
            r10.label = r3
            java.lang.Object r11 = r11.e(r1, r4, r5, r10)
            if (r11 != r0) goto L58
            goto L76
        L58:
            app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid r11 = r10.this$0
            app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager r3 = r11.J
            if (r3 == 0) goto L77
            app.chalo.validationsdk.blevalidation.ui.BleValidationMetaData r11 = r10.$metaData
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r5 = r11.b
            app.chalo.constants.Source r11 = app.chalo.constants.Source.BLE_VALIDATION_ACTIVITY
            java.lang.String r6 = r11.getSourceName()
            r10.label = r2
            java.lang.String r4 = "activation duration expired dialog view summary clicked"
            r7 = 0
            r9 = 24
            r8 = r10
            java.lang.Object r11 = app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager.DefaultImpls.a(r3, r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L77
        L76:
            return r0
        L77:
            kotlin.Unit r11 = kotlin.Unit.f17538a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$handleActivationExpiredDialogSeeDetailsClickedIntent$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
