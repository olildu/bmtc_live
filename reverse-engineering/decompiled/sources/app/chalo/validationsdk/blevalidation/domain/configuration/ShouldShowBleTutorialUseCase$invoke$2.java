package app.chalo.validationsdk.blevalidation.domain.configuration;

import app.chalo.models.validation.RegularBusProductAndValidationMethod;
import app.chalo.models.validation.RegularBusSlBleConfig;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.validationsdk.blevalidation.data.local.ProductValidationsDataStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.domain.configuration.ShouldShowBleTutorialUseCase$invoke$2", f = "ShouldShowBleTutorialUseCase.kt", l = {20, 22}, m = "invokeSuspend", v = 1)
final class ShouldShowBleTutorialUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ ValidationProduct $validationProduct;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ShouldShowBleTutorialUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShouldShowBleTutorialUseCase$invoke$2(ShouldShowBleTutorialUseCase shouldShowBleTutorialUseCase, ValidationProduct validationProduct, Continuation continuation) {
        super(2, continuation);
        this.this$0 = shouldShowBleTutorialUseCase;
        this.$validationProduct = validationProduct;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShouldShowBleTutorialUseCase$invoke$2(this.this$0, this.$validationProduct, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShouldShowBleTutorialUseCase$invoke$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strM;
        ShouldShowBleTutorialUseCase shouldShowBleTutorialUseCase;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        boolean z = false;
        if (i2 != 0) {
            if (i2 == 1) {
                strM = (String) this.L$1;
                shouldShowBleTutorialUseCase = (ShouldShowBleTutorialUseCase) this.L$0;
                ResultKt.b(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                ResultKt.b(obj);
            }
            if (((Number) obj).intValue() < i) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        ResultKt.b(obj);
        strM = this.this$0.f10514a.m();
        if (strM != null) {
            shouldShowBleTutorialUseCase = this.this$0;
            ValidationProduct validationProduct = this.$validationProduct;
            GetRegularBusProductValidationMethodUseCase getRegularBusProductValidationMethodUseCase = shouldShowBleTutorialUseCase.c;
            this.L$0 = shouldShowBleTutorialUseCase;
            this.L$1 = strM;
            this.label = 1;
            obj = getRegularBusProductValidationMethodUseCase.b(validationProduct, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        return Boolean.valueOf(z);
        RegularBusSlBleConfig regularBusSlBleConfig = ((RegularBusProductAndValidationMethod) obj).b;
        int i3 = regularBusSlBleConfig != null ? regularBusSlBleConfig.i : 2;
        ProductValidationsDataStore productValidationsDataStore = shouldShowBleTutorialUseCase.b;
        this.L$0 = null;
        this.L$1 = null;
        this.I$0 = i3;
        this.label = 2;
        Object objB = productValidationsDataStore.b(strM, this);
        if (objB != coroutineSingletons) {
            i = i3;
            obj = objB;
            if (((Number) obj).intValue() < i) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return coroutineSingletons;
    }
}
