package app.chalo.validationsdk.blevalidation.ui;

import app.chalo.validationsdk.blevalidation.helper.BleValidationProcessStatus;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessStatus;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$waitUntilTitoActivationSyncCompletion$2", f = "BleValidationFragmentComponent.android.kt", l = {}, m = "invokeSuspend", v = 1)
final class BleValidationFragmentComponentAndroid$waitUntilTitoActivationSyncCompletion$2 extends SuspendLambda implements Function2<BleValidationProcessStatus, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BleValidationFragmentComponentAndroid$waitUntilTitoActivationSyncCompletion$2 bleValidationFragmentComponentAndroid$waitUntilTitoActivationSyncCompletion$2 = new BleValidationFragmentComponentAndroid$waitUntilTitoActivationSyncCompletion$2(2, continuation);
        bleValidationFragmentComponentAndroid$waitUntilTitoActivationSyncCompletion$2.L$0 = obj;
        return bleValidationFragmentComponentAndroid$waitUntilTitoActivationSyncCompletion$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationFragmentComponentAndroid$waitUntilTitoActivationSyncCompletion$2) create((BleValidationProcessStatus) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        BleValidationProcessStatus bleValidationProcessStatus = (BleValidationProcessStatus) this.L$0;
        if ((bleValidationProcessStatus instanceof BleValidationProcessStatus.ConductorBasedValidationComplete) || Intrinsics.d(bleValidationProcessStatus, BleValidationProcessStatus.ConductorValidationPunchReceivedForSomeOtherProduct.f10541a) || Intrinsics.d(bleValidationProcessStatus, BleValidationProcessStatus.Initialized.f10542a) || Intrinsics.d(bleValidationProcessStatus, BleValidationProcessStatus.ReceiptDataParsingFailedForConductorValidation.f10543a) || (bleValidationProcessStatus instanceof BleValidationProcessStatus.TITOTapInComplete) || Intrinsics.d(bleValidationProcessStatus, BleValidationProcessStatus.TITOTapInReceivedForSomeOtherProduct.f10545a) || (bleValidationProcessStatus instanceof BleValidationProcessStatus.TITOTapOutNotificationProcessingFailed) || (bleValidationProcessStatus instanceof BleValidationProcessStatus.TITOTapOutReceivedForNoCorrespondingTitoEntryInTable) || Intrinsics.d(bleValidationProcessStatus, BleValidationProcessStatus.TITOTapOutReceivedForSomeOtherProduct.f10547a) || (bleValidationProcessStatus instanceof BleValidationProcessStatus.ValidTITOTapOutDataReceivedAndNowSyncingActivationsWithBackendForReceipt) || Intrinsics.d(bleValidationProcessStatus, BleValidationProcessStatus.ValidationProcessActive.f10549a)) {
            z = false;
        } else {
            if (!(bleValidationProcessStatus instanceof BleValidationProcessStatus.TITOTapOutCompleteAndActivationSyncDone)) {
                throw new NoWhenBranchMatchedException();
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
