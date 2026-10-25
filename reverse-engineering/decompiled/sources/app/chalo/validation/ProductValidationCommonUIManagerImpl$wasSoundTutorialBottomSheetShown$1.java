package app.chalo.validation;

import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.extensions.DataStoreExtensionsKt;
import app.chalo.extensions.DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validation.ProductValidationCommonUIManagerImpl", f = "ProductValidationCommonUIManagerImpl.kt", l = {20}, m = "wasSoundTutorialBottomSheetShown", v = 1)
final class ProductValidationCommonUIManagerImpl$wasSoundTutorialBottomSheetShown$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductValidationCommonUIManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductValidationCommonUIManagerImpl$wasSoundTutorialBottomSheetShown$1(ProductValidationCommonUIManagerImpl productValidationCommonUIManagerImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = productValidationCommonUIManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProductValidationCommonUIManagerImpl$wasSoundTutorialBottomSheetShown$1 productValidationCommonUIManagerImpl$wasSoundTutorialBottomSheetShown$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        ProductValidationCommonUIManagerImpl productValidationCommonUIManagerImpl = this.this$0;
        productValidationCommonUIManagerImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            productValidationCommonUIManagerImpl$wasSoundTutorialBottomSheetShown$1 = this;
        } else {
            productValidationCommonUIManagerImpl$wasSoundTutorialBottomSheetShown$1 = new ProductValidationCommonUIManagerImpl$wasSoundTutorialBottomSheetShown$1(productValidationCommonUIManagerImpl, this);
        }
        Object objV = productValidationCommonUIManagerImpl$wasSoundTutorialBottomSheetShown$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productValidationCommonUIManagerImpl$wasSoundTutorialBottomSheetShown$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1 dataStoreExtensionsKt$getValueAsFlow$$inlined$map$1A = DataStoreExtensionsKt.a(productValidationCommonUIManagerImpl.f10454a, PreferencesKeys.stringKey("keySoundFragmentTutorialShown"), "false");
            productValidationCommonUIManagerImpl$wasSoundTutorialBottomSheetShown$1.label = 1;
            objV = FlowKt.v(dataStoreExtensionsKt$getValueAsFlow$$inlined$map$1A, productValidationCommonUIManagerImpl$wasSoundTutorialBottomSheetShown$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        String str = (String) objV;
        return Boolean.valueOf(str != null ? Boolean.parseBoolean(str) : false);
    }
}
