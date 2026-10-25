package app.chalo.providers;

import app.chalo.config.CountryPhoneNumberConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.providers.UserProfileDetailsProviderKt", f = "UserProfileDetailsProvider.kt", l = {37}, m = "getCountryCodeWithoutPlusSymbol", v = 1)
final class UserProfileDetailsProviderKt$getCountryCodeWithoutPlusSymbol$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            ResultKt.b(obj);
            this.label = 1;
            obj = FlowKt.v(null, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        CountryPhoneNumberConfig countryPhoneNumberConfig = (CountryPhoneNumberConfig) obj;
        if (countryPhoneNumberConfig == null || (str = countryPhoneNumberConfig.c) == null) {
            str = "";
        }
        return StringsKt.R(str, "+", "");
    }
}
