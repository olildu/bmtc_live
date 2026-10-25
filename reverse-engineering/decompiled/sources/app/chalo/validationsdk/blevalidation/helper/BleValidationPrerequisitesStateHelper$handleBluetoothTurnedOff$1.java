package app.chalo.validationsdk.blevalidation.helper;

import androidx.media3.extractor.ts.PsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.helper.BleValidationPrerequisitesStateHelper", f = "BleValidationPrerequisitesStateHelper.kt", l = {173, 181, ModuleDescriptor.MODULE_VERSION, PsExtractor.PRIVATE_STREAM_1, 193}, m = "handleBluetoothTurnedOff", v = 1)
final class BleValidationPrerequisitesStateHelper$handleBluetoothTurnedOff$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BleValidationPrerequisitesStateHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationPrerequisitesStateHelper$handleBluetoothTurnedOff$1(BleValidationPrerequisitesStateHelper bleValidationPrerequisitesStateHelper, Continuation continuation) {
        super(continuation);
        this.this$0 = bleValidationPrerequisitesStateHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(this);
    }
}
