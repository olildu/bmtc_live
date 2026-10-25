package app.chalo.providers;

import app.chalo.config.CountryPhoneNumberConfig;
import app.chalo.login.manager.UserProfileDetailsProviderImpl$getUserProfileDetailsAsFlow$$inlined$map$1;
import app.chalo.userprofile.UserProfileAppModel;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/providers/UserProfileDetailsProvider;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface UserProfileDetailsProvider {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    Object d(CountryPhoneNumberConfig countryPhoneNumberConfig, Continuation continuation);

    UserProfileDetailsProviderImpl$getUserProfileDetailsAsFlow$$inlined$map$1 e();

    UserProfileAppModel f();

    StateFlow g();

    Serializable h(ContinuationImpl continuationImpl);

    Object i(ContinuationImpl continuationImpl);

    Object j(ContinuationImpl continuationImpl);

    Object k(ContinuationImpl continuationImpl);

    Object l(Continuation continuation);

    String m();
}
