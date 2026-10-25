package app.chalo.login.ui.options;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.config.CountryPhoneNumberConfig;
import app.chalo.constants.Source;
import app.chalo.login.phonenumberhint.PhoneNumberHintHandler;
import app.chalo.login.phonenumberhint.PhoneNumberHintResult;
import defpackage.n10;
import defpackage.vo1;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.login.ui.options.LoginOptionsComponent$requestPhoneNumberHint$1", f = "LoginOptionsComponent.kt", l = {887}, m = "invokeSuspend", v = 1)
final class LoginOptionsComponent$requestPhoneNumberHint$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LoginOptionsComponent this$0;

    /* JADX INFO: renamed from: app.chalo.login.ui.options.LoginOptionsComponent$requestPhoneNumberHint$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LoginOptionsComponent f5302a;

        public AnonymousClass1(LoginOptionsComponent loginOptionsComponent) {
            this.f5302a = loginOptionsComponent;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            PhoneNumberHintResult phoneNumberHintResult = (PhoneNumberHintResult) obj;
            boolean z = phoneNumberHintResult instanceof PhoneNumberHintResult.Success;
            LoginOptionsComponent loginOptionsComponent = this.f5302a;
            if (z) {
                AnalyticsContractImplKt.b(loginOptionsComponent.s, "phone number hint success", Source.LOGIN_OPTIONS_SCREEN, null, false, 28);
                String str = ((PhoneNumberHintResult.Success) phoneNumberHintResult).f5284a;
                CountryPhoneNumberConfig countryPhoneNumberConfig = ((LoginOptionsDataState) loginOptionsComponent.f.getValue()).b;
                if (countryPhoneNumberConfig != null) {
                    String strK0 = StringsKt.k0(countryPhoneNumberConfig.d, str);
                    loginOptionsComponent.E0(new n10(strK0, 24));
                    loginOptionsComponent.M0(strK0, true);
                }
            } else {
                boolean z2 = phoneNumberHintResult instanceof PhoneNumberHintResult.UnknownException;
                LoginOptionsSideEffect.BringFocusOnPhoneNumberField bringFocusOnPhoneNumberField = LoginOptionsSideEffect.BringFocusOnPhoneNumberField.f5317a;
                if (z2) {
                    AnalyticsContractImplKt.b(loginOptionsComponent.s, "phone number hint failed", Source.LOGIN_OPTIONS_SCREEN, vo1.s("error message", String.valueOf(((PhoneNumberHintResult.UnknownException) phoneNumberHintResult).f5285a.getMessage())), false, 24);
                    loginOptionsComponent.r0(bringFocusOnPhoneNumberField);
                } else {
                    if (!(phoneNumberHintResult instanceof PhoneNumberHintResult.NoValidPhoneNumber)) {
                        loginOptionsComponent.getClass();
                        throw new NoWhenBranchMatchedException();
                    }
                    AnalyticsContractImplKt.b(loginOptionsComponent.s, "phone number hint invalid number", Source.LOGIN_OPTIONS_SCREEN, vo1.s("error message", String.valueOf(((PhoneNumberHintResult.NoValidPhoneNumber) phoneNumberHintResult).f5283a)), false, 24);
                    loginOptionsComponent.r0(bringFocusOnPhoneNumberField);
                }
            }
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return Unit.f17538a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                return getFunctionDelegate().equals(((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return new AdaptedFunctionReference(2, this.f5302a, LoginOptionsComponent.class, "handlePhoneNumberHintResult", "handlePhoneNumberHintResult(Lapp/chalo/login/phonenumberhint/PhoneNumberHintResult;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginOptionsComponent$requestPhoneNumberHint$1(LoginOptionsComponent loginOptionsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = loginOptionsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoginOptionsComponent$requestPhoneNumberHint$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginOptionsComponent$requestPhoneNumberHint$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Flow flowA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PhoneNumberHintHandler phoneNumberHintHandlerC = this.this$0.A.c();
            if (phoneNumberHintHandlerC != null && (flowA = phoneNumberHintHandlerC.a()) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
                this.label = 1;
                if (flowA.collect(anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
