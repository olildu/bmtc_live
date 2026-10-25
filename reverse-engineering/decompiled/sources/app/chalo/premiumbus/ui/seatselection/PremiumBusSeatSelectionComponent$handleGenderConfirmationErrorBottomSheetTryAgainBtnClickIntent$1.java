package app.chalo.premiumbus.ui.seatselection;

import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.userprofile.Gender;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionComponent$handleGenderConfirmationErrorBottomSheetTryAgainBtnClickIntent$1", f = "PremiumBusSeatSelectionComponent.kt", l = {353}, m = "invokeSuspend", v = 1)
final class PremiumBusSeatSelectionComponent$handleGenderConfirmationErrorBottomSheetTryAgainBtnClickIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ PremiumBusSeatSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSeatSelectionComponent$handleGenderConfirmationErrorBottomSheetTryAgainBtnClickIntent$1(PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusSeatSelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSeatSelectionComponent$handleGenderConfirmationErrorBottomSheetTryAgainBtnClickIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusSeatSelectionComponent$handleGenderConfirmationErrorBottomSheetTryAgainBtnClickIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KotlinToastManager kotlinToastManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Gender gender = ((PremiumBusSeatSelectionDataState) this.this$0.f.getValue()).m;
            if (gender != null) {
                PremiumBusSeatSelectionComponent.L0(this.this$0, gender);
            } else {
                PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent = this.this$0;
                KotlinToastManager kotlinToastManager2 = premiumBusSeatSelectionComponent.r;
                this.L$0 = kotlinToastManager2;
                this.label = 1;
                obj = premiumBusSeatSelectionComponent.n.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                kotlinToastManager = kotlinToastManager2;
            }
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlinToastManager = (KotlinToastManager) this.L$0;
        ResultKt.b(obj);
        KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
        return Unit.f17538a;
    }
}
