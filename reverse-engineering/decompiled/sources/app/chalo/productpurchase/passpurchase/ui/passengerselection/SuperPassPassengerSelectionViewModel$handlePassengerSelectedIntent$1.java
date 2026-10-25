package app.chalo.productpurchase.passpurchase.ui.passengerselection;

import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState;
import app.chalo.productpurchase.passpurchase.utils.SmartSuperPassPassengerSelectionHelper;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.SuperPassBasicUserPurpose;
import app.chalo.scenes.args.SuperPassPurchaseArgs;
import app.chalo.superpass.data.models.entities.SuperPass;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import defpackage.gf;
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
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionViewModel$handlePassengerSelectedIntent$1", f = "SuperPassPassengerSelectionViewModel.kt", l = {137}, m = "invokeSuspend", v = 1)
final class SuperPassPassengerSelectionViewModel$handlePassengerSelectedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SuperPassPassengerSelectionIntent.PassengerSelectedIntent $intent;
    int label;
    final /* synthetic */ SuperPassPassengerSelectionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassPassengerSelectionViewModel$handlePassengerSelectedIntent$1(SuperPassPassengerSelectionViewModel superPassPassengerSelectionViewModel, SuperPassPassengerSelectionIntent.PassengerSelectedIntent passengerSelectedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = superPassPassengerSelectionViewModel;
        this.$intent = passengerSelectedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperPassPassengerSelectionViewModel$handlePassengerSelectedIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperPassPassengerSelectionViewModel$handlePassengerSelectedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            BookableSuperPassConfiguration bookableSuperPassConfiguration = ((SuperPassPurchaseSharedState) this.this$0.k.getF().getValue()).i;
            if (bookableSuperPassConfiguration == null) {
                gf.u(null, this.this$0.n);
                return unit;
            }
            SmartSuperPassPassengerSelectionHelper smartSuperPassPassengerSelectionHelper = this.this$0.o;
            SuperPassUserDetails superPassUserDetails = this.$intent.f8448a;
            this.label = 1;
            obj = smartSuperPassPassengerSelectionHelper.a(bookableSuperPassConfiguration, superPassUserDetails, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        SuperPass superPass = (SuperPass) obj;
        if (superPass == null) {
            SuperPassPassengerSelectionViewModel.q(this.this$0, this.$intent.f8448a, false);
            this.this$0.k.F(this.$intent.f8448a);
            this.this$0.n.b(new ChaloNavigationRequest.Navigate(new SuperPassPurchaseArgs.EnterUserDetailsArgs.InternalArgs(SuperPassBasicUserPurpose.COMPLETE_DETAILS), null, null, 6));
            return unit;
        }
        SuperPassPassengerSelectionViewModel.q(this.this$0, this.$intent.f8448a, true);
        this.this$0.k.D(superPass.f9560a.f9566a, superPass.d.d, this.$intent.f8448a);
        this.this$0.n.b(new ChaloNavigationRequest.Navigate(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.InternalArgs.INSTANCE, null, null, 6));
        return unit;
    }
}
