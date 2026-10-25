package app.chalo.instantticket.ui.faredetails;

import app.chalo.config.CountryPhoneNumberConfig;
import app.chalo.domain.GetCurrentCityPhoneNumberConfigUseCase;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsSideEffect;
import app.chalo.instantticket.ui.faredetails.contract.UserBillingDataState;
import app.chalo.instantticket.ui.faredetails.contract.UserBillingInfoBottomSheetState;
import app.chalo.userprofile.UserProfileAppModel;
import defpackage.qp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.instantticket.ui.faredetails.FareDetailsComponent$showUserBillingDetails$1", f = "FareDetailsComponent.kt", l = {949}, m = "invokeSuspend", v = 1)
final class FareDetailsComponent$showUserBillingDetails$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ FareDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FareDetailsComponent$showUserBillingDetails$1(FareDetailsComponent fareDetailsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fareDetailsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FareDetailsComponent$showUserBillingDetails$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FareDetailsComponent$showUserBillingDetails$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UserProfileAppModel userProfileAppModel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            UserProfileAppModel userProfileAppModelF = this.this$0.t.f();
            GetCurrentCityPhoneNumberConfigUseCase getCurrentCityPhoneNumberConfigUseCase = this.this$0.w;
            this.L$0 = userProfileAppModelF;
            this.label = 1;
            Object objA = getCurrentCityPhoneNumberConfigUseCase.a(this);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            userProfileAppModel = userProfileAppModelF;
            obj = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userProfileAppModel = (UserProfileAppModel) this.L$0;
            ResultKt.b(obj);
        }
        int i2 = ((CountryPhoneNumberConfig) obj).d;
        if (userProfileAppModel != null) {
            FareDetailsComponent fareDetailsComponent = this.this$0;
            String str = userProfileAppModel.f10305a;
            UserBillingDataState userBillingDataState = new UserBillingDataState(str, !StringsKt.F(str));
            UserBillingDataState userBillingDataState2 = new UserBillingDataState(userProfileAppModel.e, true);
            String str2 = userProfileAppModel.h;
            if (str2.length() == 0) {
                str2 = null;
            }
            fareDetailsComponent.E0(new qp(new UserBillingInfoBottomSheetState(userBillingDataState, userBillingDataState2, str2 != null ? new UserBillingDataState(str2, true) : null, i2), 27));
            fareDetailsComponent.r0(FareDetailsSideEffect.ShowBottomSheet.f3949a);
        }
        return Unit.f17538a;
    }
}
