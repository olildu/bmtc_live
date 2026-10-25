package app.chalo.login.ui.userconsent;

import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.login.data.models.app.DpdpaConsentStatus;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.userprofile.UserProfileAppModel;
import java.util.ArrayList;
import java.util.List;
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
@DebugMetadata(c = "app.chalo.login.ui.userconsent.UserConsentComponent$handleAcceptConsentIntent$1", f = "UserConsentComponent.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4, 180}, m = "invokeSuspend", v = 1)
final class UserConsentComponent$handleAcceptConsentIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ UserConsentComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserConsentComponent$handleAcceptConsentIntent$1(UserConsentComponent userConsentComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = userConsentComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserConsentComponent$handleAcceptConsentIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UserConsentComponent$handleAcceptConsentIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            list = ((UserConsentDataState) this.this$0.f.getValue()).b;
            UserProfileDetailsProvider userProfileDetailsProvider = this.this$0.m;
            this.L$0 = list;
            this.label = 1;
            obj = userProfileDetailsProvider.l(this);
            if (obj != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        list = (List) this.L$0;
        ResultKt.b(obj);
        UserProfileAppModel userProfileAppModel = (UserProfileAppModel) obj;
        if (list != null && userProfileAppModel != null) {
            UserConsentComponent userConsentComponent = this.this$0;
            ArrayList arrayListG0 = UserConsentComponent.G0(userConsentComponent, list, DpdpaConsentStatus.GRANTED);
            this.L$0 = null;
            this.label = 2;
            return UserConsentComponent.H0(userConsentComponent, userProfileAppModel, arrayListG0, this) == coroutineSingletons ? coroutineSingletons : unit;
        }
        this.this$0.r0(UserConsentSideEffect.UpdateWebPageToStopLoading.f5364a);
        this.this$0.J0("Consent: " + list + " -- profile: " + userProfileAppModel + " - shouldn't be null");
        return unit;
    }
}
