package app.chalo.userprofile;

import app.chalo.config.CountryPhoneNumberConfig;
import app.chalo.login.manager.UserProfileAndAuthStoreManagerImpl$getCurrentCountryPhoneNumberConfig$$inlined$map$1;
import app.chalo.login.manager.UserProfileAndAuthStoreManagerImpl$getUserProfileDetails$$inlined$map$1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/UserProfileAndAuthStoreManager;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface UserProfileAndAuthStoreManager {
    Object a(boolean z, ContinuationImpl continuationImpl);

    Object b(ContinuationImpl continuationImpl);

    Object c(Continuation continuation);

    Object d(CountryPhoneNumberConfig countryPhoneNumberConfig, Continuation continuation);

    UserProfileAndAuthStoreManagerImpl$getCurrentCountryPhoneNumberConfig$$inlined$map$1 e();

    UserProfileAndAuthStoreManagerImpl$getUserProfileDetails$$inlined$map$1 f();

    Object g(ContinuationImpl continuationImpl);

    Object h(Continuation continuation);

    Object i(Continuation continuation);

    Object j(long j, String str, ContinuationImpl continuationImpl);

    Object k(String str, String str2, long j, long j2, Continuation continuation);

    Object l(UserProfileLocalInfoModel userProfileLocalInfoModel, ContinuationImpl continuationImpl);
}
